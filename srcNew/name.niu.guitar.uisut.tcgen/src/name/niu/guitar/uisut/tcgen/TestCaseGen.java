package name.niu.guitar.uisut.tcgen;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

import javax.swing.JOptionPane;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import name.niu.guitar.log.GuitarLog;
import name.niu.guitar.uisut.*;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;
import name.niu.guitar.uisut.tcgen.interfaces.impl.TCDonePublisherImpl;
import name.niu.guitar.uisut.validator.*;
import name.niu.guitar.uitf.*;

public class TestCaseGen extends TCDonePublisherImpl{
	
	static int flushSize = 10000;
	int flushCount;
	int tcCount;
	
	String uisutFilePath;
	int maxLoop;
	int maxStep;
	int iStart;
	int iEnd;
	
	/**
	 * event queue of the onlien thread 
	 * contains start, stop, step
	 */
	Queue<String> smEventQueue = new LinkedList<String>();
	
	private void addEvent( String event ) {
		//synchronized(smEventQueue)
		{
			smEventQueue.add(event);
			smEventSemaphore.release() ;	
		}
	}
	private String pollEvent () {
		//synchronized(smEventQueue)
		{
			try {
				smEventSemaphore.acquire() ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String str = smEventQueue.poll();
			if ( str == null)
				smEventSemaphore.release();
			return str ;		
		}

	}
	static final private String SM_TRIGGER_START 			= "SM_TRIGGER_START" ;	
	static final private String SM_TRIGGER_STOP 					= "SM_TRIGGER_STOP" ; 
	static final private String SM_TRIGGER_STEP 					= "SM_TRIGGER_STEP" ; 
	
	private Semaphore smEventSemaphore = new Semaphore(0) ;
	
	
	// status of test case gen
	private String smStatus = SM_STATUS_IDLE ;
	static final public String SM_STATUS_IDLE = "IDLE" ;
	static final public String SM_STATUS_RUNNING = "RUNNING" ; // closed by stop
	static final public String SM_STATUS_STOPPING = "STOP" ; 
	static final public String SM_STATUS_STOPPED = "STOPPED" ; // closed by stop
	static final public String STATUS_END_OK = "OK" ; // closed by stop
	public String getStatus() {
		return smStatus;
	}
	private void setStatus(String status) {
		this.smStatus = status;
	}
	
	private void smEventLoop() {
		GuitarLog.getInstance().info("Begin");
		while ( true ) 
		{
			String event = pollEvent();
			if ( getStatus().equals(SM_STATUS_IDLE) ) {
				if (event.equals(SM_TRIGGER_START)) {						
					try {
						doGenerateTestCase(par_uisutFilePath, par_stm, par_maxLoop, par_maxStep,
								par_start, par_end);
					} catch (StopGenExecption e) {
//						setStatus(SM_STATUS_STOPPED);
						notifyTCGStoped(ITCDoneSubscriber.Stop_Reason_Cancellation);
						return ;
					} 
//					setStatus(STATUS_END_OK);
					notifyTCGStoped(ITCDoneSubscriber.Stop_Reason_Completion);
					setStatus(SM_STATUS_RUNNING);
				} 
			} else if ( getStatus().equals(SM_STATUS_RUNNING) ) {
				if (event.equals(SM_TRIGGER_STOP)) {					
					setStatus(SM_STATUS_STOPPED);
					break ;
				} 
			} else if ( getStatus().equals(SM_STATUS_STOPPING) ) {
				
			} else if ( getStatus().equals(SM_STATUS_STOPPED) ) {
				
			} else {
				assert(false):"add more status?";
			}
		}
		GuitarLog.getInstance().info("End");
	}
	public TestCaseGen() {
		super() ;
	}
	

	HashMap<AbstractUIState, Integer> hmState = new HashMap<AbstractUIState, Integer>();
	HashMap<UITransition, Integer> hmTransition = new HashMap<UITransition, Integer>();
	HashMap<UISystemVariable, Integer> hmSystemVar = new HashMap<UISystemVariable, Integer>();
	
	ArrayList<UISystemVariable> alCurSystemVar = new ArrayList<UISystemVariable>();
	ArrayList<UISystemVariable> alPreSystemVar = new ArrayList<UISystemVariable>();
	
	ArrayList<Integer> alTranOccur = new ArrayList<Integer>();
	ArrayDeque<Integer> aqTranPath = new ArrayDeque<Integer>();
	
	PathCycleDynamicCalcutor pcdc = null ;
	
	private String par_uisutFilePath;
	private UIStatemachine par_stm;
	private int par_maxLoop;
	private int par_maxStep;
	private AbstractUIState par_start;
	private AbstractUIState par_end;
	
	private void doGenerateTestCase(
			String uisutFilePath, UIStatemachine stm, 
			int maxLoop, int maxStep, AbstractUIState start, 
			AbstractUIState end) throws StopGenExecption
	{
		// get start time
		long startTime = System.currentTimeMillis();
		
		this.pcdc = new PathCycleDynamicCalcutor( stm , start ) ;
		pcdc.initialize() ;
		GuitarLog.debug(pcdc.toString());
		
		// initial variables
		this.initialVariables(stm);
		
		
		// validate stm
		Validator vali = new Validator();
		if(vali.validateStm(stm) == 0){
			int r = JOptionPane.showConfirmDialog(null, "OK to ignore erroes and go on?");
			if ( r == JOptionPane.CANCEL_OPTION || r == JOptionPane.NO_OPTION )
				return ;
		}
		
		// set hash maps of stm
		this.setHashMaps(stm);
		
		// check and set input
		checksetInput(uisutFilePath, stm, maxLoop, maxStep, start, end);
		
		// find PreSystemVar
		this.alPreSystemVar = this.findPreSystemVar(stm);
		
		// create target resource and set root element of TestSuite
		TestSuite ts = UitfFactory.eINSTANCE.createTestSuite();
		ts.setId("TestSuite");
		
		// enumerate path
		this.alTranOccur.add(0);
		this.enumeratePath(stm, ts, this.iStart);
		
		// save target resource
		this.checkAndFlush(ts, true);
		
		// get end time
		long endTime = System.currentTimeMillis();
		String generationTime = String.format("cost time:%s ms", endTime - startTime);
		
		// show message
		JOptionPane.showMessageDialog(null, "Generate Test Case Successfully!\n"+generationTime);
	}
	
	public void generateTestCase(
			final String uisutFilePath, 
			final UIStatemachine stm, 
			final int maxLoop, 
			final int maxStep, 
			final AbstractUIState start, 
			final AbstractUIState end) 
	{
		if (! getStatus().equals(SM_STATUS_IDLE)){
			GuitarLog.getInstance().warn("in running or already run");
			return ;
		}
		addEvent(SM_TRIGGER_START);
		this.par_uisutFilePath = uisutFilePath ;
		this.par_stm = stm ;
		this.par_maxLoop = maxLoop ;
		this.par_maxStep = maxStep ;
		this.par_start = start ;
		this.par_end = end ;
		
		//setStatus(SM_STATUS_RUNNING);
		final TestCaseGen tcg = this ;
		Thread gen = new Thread("Guitar Thread: TestCaseGen Thread") {
			public void run() {
				GuitarLog.getInstance().info("Thread Begin");
				smEventLoop() ;
				setStatus(SM_STATUS_IDLE);
				GuitarLog.getInstance().info("Thread End");
			}
		};
		gen.start();

	}
	
	public void stopGen () {
		addEvent(SM_TRIGGER_STOP);
	}
	
	private void initialVariables(UIStatemachine stm){ 
		
		this.flushCount = 0;
		this.tcCount = 0;
		
		this.uisutFilePath = "";
		this.maxLoop = -1;
		this.maxStep = -1;
		this.iStart = -1;
		this.iEnd = -1;
		
		this.hmState.clear();
		this.hmTransition.clear();
		this.hmSystemVar.clear();
		
		this.alCurSystemVar.clear();
		this.alPreSystemVar.clear();
		
		this.alTranOccur.clear();
		this.aqTranPath.clear();
		
		// fill alTranOccur with 0
		for(int i = 0; i < stm.getItsExpandedUITransition().size(); i++){
			this.alTranOccur.add(0);
		}
		
	} 

	private void setHashMaps(UIStatemachine stm){
		
		// fill hmState
		// 2011-07-17
		for(int i = 0; i < stm.getItsExpandedUIState().size(); i++){
			AbstractUIState ast = stm.getItsExpandedUIState().get(i);
			this.hmState.put(ast, i);
		}
		
		// fill hmTransition
		for(int i = 0; i < stm.getItsExpandedUITransition().size(); i++){
			UITransition tran = stm.getItsExpandedUITransition().get(i);
			this.hmTransition.put(tran, i);
		}
		
		// fill hmSystemVar
		for(int i = 0; i < stm.getItsUISystemVariable().size(); i++){
			this.hmSystemVar.put(stm.getItsUISystemVariable().get(i), i);
		}
		
	}
	
	private int checksetInput(
			String uisutFilePath, 
			UIStatemachine stm, 
			int maxLoop, 
			int maxStep, 
			AbstractUIState start, 
			AbstractUIState end)
	{		
		// set uisutFilePath
		if(uisutFilePath == null || uisutFilePath == ""){
			JOptionPane.showMessageDialog(null, "File Error: the uisut file path is null!");
			return 0;
		}
		this.uisutFilePath = uisutFilePath;
		
		// set maxLoop
		if(maxLoop<0 || maxLoop>10){
			JOptionPane.showMessageDialog(null, "Input Error: max cycle count is between 0-10!");
			return 0;
		}
		this.maxLoop = maxLoop;
		
		// set maxStep
		if(maxStep<5 || maxStep>1000){
			JOptionPane.showMessageDialog(null, "Input Error: max step is between 5-1000!");
			return 0;
		}
		this.maxStep = maxStep;
		
		// check abd set start and end
		int startInFlag = 0;
		int endInFlag = 0;
		
		//2011-07-17
		for(int i = 0; i < stm.getItsExpandedUIState().size(); i++){
			
			AbstractUIState ast = stm.getItsExpandedUIState().get(i);
			
			// set userStart
			if(start == null && ast instanceof InitialState){
				startInFlag = 1;
				this.iStart = i;
				continue;
			}else if(start != null && start.equals(ast)){
				startInFlag = 1;
				this.iStart = i;
				continue;
			}
			
			// set userEnd
			if(end == null && ast instanceof FinalState){
				endInFlag = 1;
				this.iEnd = i;
				continue;
			}
			else if(end != null && end.equals(ast)){
				endInFlag = 1;
				this.iEnd = i;
				continue;
			}
		}
		if(startInFlag == 0){
			JOptionPane.showMessageDialog(null, "Input Error: start state is not in the selected states!");
			return 0;
		}
		if(endInFlag == 0){
			JOptionPane.showMessageDialog(null, "Input Error: end state is not in the selected states!");
			return 0;
		}
		
		return 0;
	}
	
	private ArrayList<UISystemVariable> findPreSystemVar(UIStatemachine stm){
		
		HashSet<UISystemVariable> addedByStates = new HashSet<UISystemVariable>();
		HashSet<UISystemVariable> needByTransitions = new HashSet<UISystemVariable>();
		
		// 2011-07-17
		for(AbstractUIState s : stm.getItsExpandedUIState()){
			for(UISystemVariable dv : s.getAddedSystemVariable()){
				addedByStates.add(dv);
			}
		}
		
		for(UITransition t : stm.getItsExpandedUITransition()){
			for(UISystemVariable dv : t.getGuardedSystemVariable()){
				needByTransitions.add(dv);
			}
		}
		
		needByTransitions.removeAll(addedByStates);
		return new ArrayList<UISystemVariable>(needByTransitions);
		
		// output warning log
		// ......
	}
	
	private void enumeratePath(UIStatemachine stm, TestSuite ts, int icurast) throws StopGenExecption{
		
		// 2011-07-17
		AbstractUIState curast = stm.getItsExpandedUIState().get(icurast);
		
		// save alCurSystemVar
		ArrayList<UISystemVariable> alLastSystemVar = (ArrayList<UISystemVariable>) this.alCurSystemVar.clone();
		
		// add and delete system variables to alCurSystemVar
		for(int i = 0; i < curast.getAddedSystemVariable().size(); i++){
			
			UISystemVariable addSysVar = curast.getAddedSystemVariable().get(i);
			if(!this.alCurSystemVar.contains(addSysVar)){
				this.alCurSystemVar.add(addSysVar);
			}
		}
		for(int i = 0; i < curast.getDeletedSystemVariable().size(); i++){
			
			UISystemVariable delSysVar = curast.getDeletedSystemVariable().get(i);
			if(this.alCurSystemVar.contains(delSysVar)){
				this.alCurSystemVar.remove(delSysVar);
			}
		}
		
		for(int i = 0; i < curast.getItsExpandedOutTransition().size(); i++){
			
			UITransition curtran = curast.getItsExpandedOutTransition().get(i);
			int icurtran = this.hmTransition.get(curtran);
			
			// judge the SystemVar on transition
			int flag = 0;
			for(int ii = 0; ii < curtran.getGuardedSystemVariable().size(); ii++){
				
				UISystemVariable tranSysVar = curtran.getGuardedSystemVariable().get(ii);
				if(this.alCurSystemVar.contains(tranSysVar)){
					continue;
				}
				else{
					flag = 1;
					break;
				}
			}
			
			// SystemVar is not enable
			if(flag == 1){
				continue;
			}
			
			// out of loop
			if(this.alTranOccur.get(icurtran) >= this.maxLoop){
				//TODO : "aqTranPath's max cycle counter > this.maxLoop"
				UITransition transition2add = stm.getItsExpandedUITransition().get( icurtran );
				this.pcdc.addPathHead( transition2add );
				GuitarLog.debug( pcdc.toString() ) ;
				int maxCycleCounter = this.pcdc.getMaxCycleCounter() ;
				this.pcdc.rollbackPathHead() ;
				GuitarLog.debug( pcdc.toString() ) ;
				if( maxCycleCounter > this.maxLoop ) {
					continue ;
				} 
			}
			
			// out of step
			if(this.aqTranPath.size() >= this.maxStep){
				continue;
			}
			
			// add icurtran to alTranPath
			this.aqTranPath.addLast(icurtran);
			UITransition transition2add = stm.getItsExpandedUITransition().get( icurtran);
			// add current transition to path
			this.pcdc.addPathHead( transition2add );
			GuitarLog.debug(pcdc.toString());
			alTranOccur.set(icurtran, alTranOccur.get(icurtran)+1);
			
			AbstractUIState nextast = curtran.getItsExpandedTarState();
			int inextast = this.hmState.get(nextast);
			
			// output path
			if(inextast == this.iEnd){
				// 
				GuitarLog.debug( "Output Path:" + this.pcdc.getPath().toString() ) ;
				TestCase tc = UitfFactory.eINSTANCE.createTestCase();
				this.tcCount++;
				tc.setId(String.format("TC_%03d", this.tcCount));
				ts.getItsTestCase().add(tc);
				
				AbstractUIState tempst = stm.getItsExpandedUIState().get(this.iStart);
				Statement preStatement = UitfFactory.eINSTANCE.createStatement();
				preStatement.setDescription(String.format("[Preconditions]\n Current Position: %s\n Need Condition:\n",tempst.getDescription()));
				tc.getItsStatement().add(preStatement);
				
				Statement tchead = UitfFactory.eINSTANCE.createStatement();
				tchead.setDescription(String.format("test case head\n"));
				tc.getItsStatement().add(tchead);
				
				Statement start = UitfFactory.eINSTANCE.createStatement();
				start.setDescription(stm.getItsExpandedUIState().get(iStart).getDescription());
				start.setScriptStr(stm.getItsExpandedUIState().get(iStart).getScriptStr());
				start.setTrackbackID( stm.getItsExpandedUIState().get(iStart).eResource().getURIFragment(stm.getItsExpandedUIState().get(iStart)));
				tc.getItsStatement().add(start);
				
				ArrayDeque<Integer> tempqTranPath = this.aqTranPath.clone();
				for(int ii = 1; !tempqTranPath.isEmpty(); ii++){
					// add statement of action
					UITransition temptran = stm.getItsExpandedUITransition().get(tempqTranPath.remove());
					Statement stepStatement = UitfFactory.eINSTANCE.createStatement();
					stepStatement.setDescription(String.format("%d.%s\n", ii, temptran.getDescription()));
					stepStatement.setScriptStr(temptran.getScriptStr());
					// set trackbackId as eObject's URIFragment
					stepStatement.setTrackbackID( temptran.eResource().getURIFragment(temptran));
					tc.getItsStatement().add(stepStatement);
					
					// add statement of expect
					Statement stepExpStatement = UitfFactory.eINSTANCE.createStatement();
					stepExpStatement.setDescription( String.format("%d.Enter: %s\n", ii, temptran.getItsExpandedTarState().getDescription()));
					stepExpStatement.setScriptStr( temptran.getItsExpandedTarState().getScriptStr());
					// set trackbackId as eObject's URIFragment
					stepExpStatement.setTrackbackID(temptran.eResource().getURIFragment(temptran.getItsExpandedTarState()));

					tc.getItsStatement().add(stepExpStatement);
				}
				
				// notify TestCaseDone
				this.notifyTestCaseDone(tc);
				
				// HERE is a interrupt point
				if( smStatus.equals(SM_STATUS_STOPPING) ) {
					throw new StopGenExecption() ;
				}
				
				// check the size of ts, if >= 10000, output to a uitf file
				this.checkAndFlush(ts, false);
				
			}
			
			// recursion nextast
			this.enumeratePath(stm, ts, inextast);
		}
		
		if(!this.aqTranPath.isEmpty()){
			int temptran = this.aqTranPath.removeLast();
			assert( this.pcdc.getPath().getEdgeSize() != 0 ) ;
			this.pcdc.rollbackPathHead() ;
			GuitarLog.debug(pcdc.toString()) ;
			this.alTranOccur.set(temptran, this.alTranOccur.get(temptran)-1);
		}
		
		// rollback arrCurCondition
		if (curast instanceof AbstractUIState){
			this.alCurSystemVar.clear();
			this.alCurSystemVar = (ArrayList<UISystemVariable>) alLastSystemVar.clone();
		}
	}
	
	private void checkAndFlush(TestSuite ts, boolean forceFlush){

		// set target resource
		if(forceFlush == false && ts.getItsTestCase().size() < TestCaseGen.flushSize ){
			return;
		}
		this.flushCount++;
		ResourceSet trgtResourceSet = new ResourceSetImpl();
		trgtResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uitf", new XMIResourceFactoryImpl());
		
		String uitfFilePath = this.uisutFilePath.substring(0, this.uisutFilePath.length() - ".uisut".length()).concat(String.format("_%03d.uitf", this.flushCount));
		URI trgtURI = URI.createFileURI(uitfFilePath);
		Resource trgtResource = trgtResourceSet.createResource(trgtURI);
		
		trgtResource.getContents().add(ts);
		
		try {
			trgtResource.save(null);
			GuitarLog.getInstance().info("itf saved:" + uitfFilePath);
			ts.getItsTestCase().clear() ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// notify UitfFileDone
		this.notifyUitfFileDone(uitfFilePath);
		
		return;
	}
	
	class StopGenExecption extends Exception {
		
	}
	
}
