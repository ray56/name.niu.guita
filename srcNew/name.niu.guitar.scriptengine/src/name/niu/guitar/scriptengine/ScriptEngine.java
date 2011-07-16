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
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.concurrent.Semaphore;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDonePublisher;
import name.niu.guitar.scriptengine.interfaces.impl.TargetScriptExeDonePublisherImpl;
import name.niu.guitar.uitf.*;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDonePublisher;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;

public class ScriptEngine 
	extends TargetScriptExeDonePublisherImpl
	implements ITCDoneSubscriber
{

	static private String scriptInterpreter_scriptFile ;
	static private String scriptInterpreter_commandLine ;
	static {
		ResourceBundle rb = ResourceBundle.getBundle("config/scriptengine");
		scriptInterpreter_scriptFile = rb.getString("scriptInterpreter_scriptFile");
		scriptInterpreter_commandLine = rb.getString("scriptInterpreter_commandLine");	
	}
	
	private String status = null ;
	static final public String STATUS_END_OK = "OK" ; // normally closed ;
	static final public String STATUS_END_STOPED = "STOPED" ; // closed by stop
	static final public String STATUS_RUNNING = "RUNNING" ; // closed by stop
	private Semaphore down = new Semaphore(0) ;
	
	public String getStatus() {
		return status;
	}
	private synchronized void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public void OnUtifFileDone(String uitfFileParth) {
		
	}

	@Override
	public void OnTestCaseDone(TestCase tc) {
		for(Statement statement : tc.getItsStatement()){			
			if(statement.getScriptStr() != null){
				
				// convert state to string
				String generatedScriptStatement = convertTargetScript(statement);
				
				// write file
				String targetScriptFile = writeTargetScripToFile(generatedScriptStatement);
				
				// sent to engine
				executeTargetScrip(statement, targetScriptFile);
			} else {
				if ( statement.getTrackbackID() != null ) {
					String [] trackbackIds = {statement.getTrackbackID()};
					this.notifyTargetStatementDone(trackbackIds);
				}
			}
		}
	}

	public void stop () {
		down.release() ;// when let stop ,fist let thread go on.
		this.setStatus(STATUS_END_STOPED);
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
		String tempFilePath = scriptInterpreter_scriptFile ;
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

	private void doExecuteTargetScrip(Statement statement, String targetScripFile) throws StopScriptExecption {
		try {
			Process p = null;
			int p_r = 0 ;
			p = Runtime.getRuntime().exec(scriptInterpreter_commandLine + " " + scriptInterpreter_scriptFile );

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
			
			if ( statement.getTrackbackID() != null ) {
				String [] trackbackIds = {statement.getTrackbackID()};
				this.notifyTargetStatementDone(trackbackIds);
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if ( this.getStatus().equals(STATUS_END_STOPED ) ){
				throw new StopScriptExecption() ;
			}
		}
	}

	private void executeTargetScrip(final Statement statement, final String targetScripFile) {

		setStatus(STATUS_RUNNING);
		Thread scriptExe = new Thread() {
			public void run() {
				try {
					doExecuteTargetScrip(statement, targetScripFile);					
				} catch (StopScriptExecption e) {
					setStatus(STATUS_END_STOPED);
					return ;
				} finally {
					down.release();
				}
				setStatus(STATUS_END_OK);				
			}
		};
		
		try{
			scriptExe.start() ;
		}finally{
			try {
				down.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	
	class StopScriptExecption extends Exception {
		
	}

	@Override
	public void OnTCGStoped(ITCDonePublisher tcg) {
		// TODO Auto-generated method stub
		
	}
		

}
