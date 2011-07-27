package name.niu.guitar.scriptengine;

import java.lang.Runtime;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import name.niu.guitar.scriptengine.config.Config;
import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDonePublisher;
import name.niu.guitar.scriptengine.interfaces.impl.TargetScriptExeDonePublisherImpl;
import name.niu.guitar.uitf.*;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDonePublisher;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;

public class ScriptEngine 
	extends TargetScriptExeDonePublisherImpl
	implements ITCDoneSubscriber
{
	/**
	 * queue of statement
	 */
	LinkedList<Object> statementQueue = new LinkedList<Object>();
	private synchronized void addStatementQueue( TestCase tc ) {
		statementQueue.addAll(tc.getItsStatement());
		statementQueue.add( tc );
	}
	private synchronized Statement pollStatementQueue () {
		Object obj = statementQueue.poll() ;
		while ( obj instanceof TestCase ) {
			this.notifyTestCaseDone((TestCase)obj);
			obj = statementQueue.poll() ;
		} 
		Statement statement = (Statement) obj ;
		return statement;
	}

	/**
	 * event queue of the onlien thread 
	 * contains start, stop, step
	 */
	Queue<String> smEventQueue = new LinkedList<String>();
	
	// start in continue mode
	static final private String SM_TRIGGER_START 	= "SM_TRIGGER_START" ;
	static final private String SM_TRIGGER_STOP 	= "SM_TRIGGER_STOP" ; 
	static final private String SM_TRIGGER_STEP 	= "SM_TRIGGER_STEP" ; 
	
	private void addEvent( String event ) {
		smEventQueue.add(event);
		smEventSemaphore.release() ;
	}
	private String pollEvent () {
		try {
			smEventSemaphore.acquire() ;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String str = smEventQueue.poll() ;
		if (str == null )
			smEventSemaphore.release();
		return str ;
	}
	private String peekEvent() {
		String str = smEventQueue.peek() ;
		return str ;
	}
	private Semaphore smEventSemaphore = new Semaphore(0) ;
	/**
	 * status of engine
	 */
	private String smStatus = SM_STATUS_IDLE ;
	static final public String SM_STATUS_IDLE = "IDLE" ;
	static final public String SM_STATUS_RUNNING = "RUNNING" ; 
	static final public String SM_STATUS_STOPPING = "STOPPING" ; 
	static final public String SM_STATUS_STOPPED = "STOPPED" ; 	
	public String getStatus() {
		return smStatus;
	}
	private synchronized void setStatus(String status) {
		this.smStatus = status;
	}
	
	/**
	 * stepMode
	 */
	boolean stepMode = true ;
	private boolean getStepMode() {
		return stepMode;
	}
	public void setStepMode ( boolean stepMode ) {
		this.stepMode = stepMode ;
//		if( this.stepMode == false ){
//			down.release();
//		} 
	}
	
	/**
	 * step semaphore
	 */
//	private Semaphore down = new Semaphore(1) ;
	
	
	public ScriptEngine() {		
		super();
		setStatus(SM_STATUS_IDLE);
	}
		
	static private String scriptInterpreter_scriptFile ;
	static private String scriptInterpreter_commandLine ;

	private Thread scriptExeThread = null;
	static {
		Properties property = new Properties();
		String installLoc = Platform.getInstallLocation().getURL().getPath();
		//String installLoc = Platform.getInstanceLocation().getURL().getPath();

		try {			
			property.load(new FileInputStream( installLoc + "\\scriptengine.properties"));
			scriptInterpreter_scriptFile = property.getProperty("scriptInterpreter_scriptFile");
			scriptInterpreter_commandLine = property.getProperty("scriptInterpreter_commandLine");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public synchronized void OnTestCaseDone(TestCase tc) {
		if ( getStatus().equals(SM_STATUS_IDLE)){
			start() ;
		}
		this.addStatementQueue(tc);
	}

	public void stop () {
//		setStatus(SM_STATUS_STOPPING);
		addEvent( SM_TRIGGER_STOP ) ;
	}
	
	public void step(int step ) {
//		down.release(step);
		addEvent( SM_TRIGGER_STEP ) ;
	}
	
	public void start() {
		// if already started, return.
		if (! getStatus().equals(SM_STATUS_IDLE)){
			return ;
		}
		addEvent(SM_TRIGGER_START);
		if (scriptExeThread == null ) {
			scriptExeThread = new Thread("Guitar Thread: Script Engine Thread") {
				@Override
				public void run() {
					smEventLoop();						
					setStatus(SM_STATUS_IDLE);				
				}
			};
			try{
				scriptExeThread.start() ;
			}finally{
				
			}
		}		
	}
	
	private void smEventLoop() {
		System.out.println("Begin:\tScriptEngine smEventLoop");
		while ( true ) 
		{
			if ( getStepMode() == false ) {
				try {
					Thread.sleep( Config.getAnimationInterval() );
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//Statement statement = pollStatementQueue() ;
				// if ( statement != null )
				if ( peekEvent() == null )
					addEvent(SM_TRIGGER_STEP) ;
			}
			String event = pollEvent();
			if ( event != null ) {
				if ( getStatus().equals(SM_STATUS_IDLE) ) {
					if (event.equals(SM_TRIGGER_START)) {							
						setStatus(SM_STATUS_RUNNING);						
					} 
				} else if ( getStatus().equals(SM_STATUS_RUNNING) ) {
					if ( event.equals(SM_TRIGGER_STEP )){
						Statement statement = pollStatementQueue() ;
						if ( statement != null ){
							smActionProcessStatement(statement);
						} else {
							addEvent(SM_TRIGGER_STOP);
						}
					} else if (event.equals(SM_TRIGGER_STOP)) {
						notifyTEStoped();
						setStatus(SM_STATUS_STOPPED);	
						break ;
					} 
				} else {
					assert(false):"add more status?";
				}
			} 
		}
		System.out.println("End:\tScriptEngine smEventLoop");
	}
	
	private void smActionProcessStatement ( Statement statement ) {
		assert( statement != null );
//		if ( stepMode ) {
//			try {
//				down.acquire();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		// exe script
		if(statement.getScriptStr() != null){							
			// convert state to string
			String generatedScriptStatement = convertTargetScript(statement);
			// write file
			String targetScriptFile = writeTargetScripToFile(generatedScriptStatement);
			// sent to engine
			doExecuteTargetScrip(statement, targetScriptFile);					
		} 	
		// fire target statement down
		if ( statement.getTrackbackID() != null ) {
			String [] trackbackIds = {statement.getTrackbackID()};
			notifyTargetStatementDone(trackbackIds);
		}	
	}
	
	
	private String convertTargetScript(Statement statement) {
		String generatedScriptStatement = null ;
		StringBuffer target_sb = new StringBuffer();
		StringTokenizer strtoktt = new StringTokenizer(statement.getScriptStr(),";");
		for(; strtoktt.hasMoreTokens(); ){
			target_sb.append( strtoktt.nextToken() + "\r\n");
		}
		generatedScriptStatement = target_sb.toString() ;
		return generatedScriptStatement;
	}
	
	private String writeTargetScripToFile(String generatedScriptStatement) {
		String tempFilePath = Config.getScriptFile() ;//replace scriptInterpreter_scriptFile ;
		OutputStream os;
		
		try {
			os = new FileOutputStream(tempFilePath);
			os.write(generatedScriptStatement.getBytes( "utf8"));
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return tempFilePath ;
	}

	private void doExecuteTargetScrip(Statement statement, String targetScripFile) {
		try {
			Process p = null;
			int p_r = 0 ;
			p = Runtime.getRuntime().exec( Config.getScriptCommandLine() + " " + Config.getScriptFile() );

			OutputStreamWriter osw2StdInput = new OutputStreamWriter( p.getOutputStream() ) ;
			BufferedWriter bw2StdInput = new BufferedWriter( osw2StdInput ) ;
			InputStreamReader isr4StdOutput = new InputStreamReader(p.getInputStream());
			final BufferedReader br4StdOutput = new BufferedReader(isr4StdOutput) ;
			InputStreamReader isr4ErrOutput = new InputStreamReader(p.getErrorStream());
			final BufferedReader br4ErrOutput = new BufferedReader(isr4ErrOutput) ;
			new Thread(new Runnable() {  
			    public void run() {  
			        try {
						String s;
						while( ( s=br4StdOutput.readLine() ) != null) 
						{
							System.out.println("Output:" + s);
						};
					} catch (IOException e) {
						e.printStackTrace();
					}  
			    }  
			}).start(); 
			new Thread(new Runnable() {  
			    public void run() {  
			        try {
						String s;
						while( ( s=br4ErrOutput.readLine() ) != null) 
						{
							System.out.println("Error:" + s);
						};
					} catch (IOException e) {
						e.printStackTrace();
					}  
			    }  
			}).start(); 
			
			p_r = p.waitFor();
			if ( p_r != 0 ) {
				System.out.println("exe failed!");				
			}
			
//			if ( statement.getTrackbackID() != null ) {
//				String [] trackbackIds = {statement.getTrackbackID()};
//				this.notifyTargetStatementDone(trackbackIds);
//			}			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void OnUtifFileDone(String uitfFileParth) {		
	}
	@Override
	public void OnTCGStoped(ITCDonePublisher tcg, String reason) {		
	}
		

}
