package name.niu.guitar.uisut.tcgen;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import name.niu.guitar.uisut.*;
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

	HashMap<AbstractUIState, Integer> hmState = new HashMap<AbstractUIState, Integer>();
	HashMap<UITransition, Integer> hmTransition = new HashMap<UITransition, Integer>();
	HashMap<UISystemVariable, Integer> hmSystemVar = new HashMap<UISystemVariable, Integer>();
	
	ArrayList<UISystemVariable> alCurSystemVar = new ArrayList<UISystemVariable>();
	ArrayList<UISystemVariable> alPreSystemVar = new ArrayList<UISystemVariable>();
	
	ArrayList<Integer> alTranOccur = new ArrayList<Integer>();
	ArrayDeque<Integer> aqTranPath = new ArrayDeque<Integer>();
	
	public void generateTestCase(String uisutFilePath, UIStatemachine stm, int maxLoop, int maxStep, AbstractUIState start, AbstractUIState end) {
		
		// get start time
		long startTime = System.currentTimeMillis();
		
		// initial variables
		this.initialVariables(stm);
		
		// validate stm
		Validator vali = new Validator();
		if(vali.validateStm(stm) == 0){
			return;
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
		for(int i = 0; i < stm.getItsUITransition().size(); i++){
			this.alTranOccur.add(0);
		}
		
	} 

	private void setHashMaps(UIStatemachine stm){
		
		// fill hmState
		for(int i = 0; i < stm.getItsUIState().size(); i++){
			AbstractUIState ast = stm.getItsUIState().get(i);
			this.hmState.put(ast, i);
		}
		
		// fill hmTransition
		for(int i = 0; i < stm.getItsUITransition().size(); i++){
			UITransition tran = stm.getItsUITransition().get(i);
			this.hmTransition.put(tran, i);
		}
		
		// fill hmSystemVar
		for(int i = 0; i < stm.getItsUISystemVariable().size(); i++){
			this.hmSystemVar.put(stm.getItsUISystemVariable().get(i), i);
		}
		
	}
	
	private int checksetInput(String uisutFilePath, UIStatemachine stm, int maxLoop, int maxStep, AbstractUIState start, AbstractUIState end){
		
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
		
		for(int i = 0; i < stm.getItsUIState().size(); i++){
			
			AbstractUIState ast = stm.getItsUIState().get(i);
			
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
		
		for(AbstractUIState s : stm.getItsUIState()){
			for(UISystemVariable dv : s.getAddedSystemVariable()){
				addedByStates.add(dv);
			}
		}
		
		for(UITransition t : stm.getItsUITransition()){
			for(UISystemVariable dv : t.getGuardedSystemVariable()){
				needByTransitions.add(dv);
			}
		}
		
		needByTransitions.removeAll(addedByStates);
		return new ArrayList<UISystemVariable>(needByTransitions);
		
		// output warning log
		// ......
	}
	
	private void enumeratePath(UIStatemachine stm, TestSuite ts, int icurast){
		
		AbstractUIState curast = stm.getItsUIState().get(icurast);
		
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
				continue;
			}
			
			// out of step
			if(this.aqTranPath.size() >= this.maxStep){
				continue;
			}
			
			// add icurtran to alTranPath
			this.aqTranPath.addLast(icurtran);
			alTranOccur.set(icurtran, alTranOccur.get(icurtran)+1);
			
			AbstractUIState nextast = curtran.getItsExpandedTarState();
			int inextast = this.hmState.get(nextast);
			
			// output path
			if(inextast == this.iEnd){
				
				TestCase tc = UitfFactory.eINSTANCE.createTestCase();
				this.tcCount++;
				tc.setId(String.format("TC_%03d", this.tcCount));
				ts.getItsTestCase().add(tc);
				
				AbstractUIState tempst = stm.getItsUIState().get(this.iStart);
				Statement preStatement = UitfFactory.eINSTANCE.createStatement();
				preStatement.setDescription(String.format("[Preconditions]\n Current Position: %s\n Need Condition:\n",tempst.getDescription()));
				tc.getItsStatement().add(preStatement);
				
				Statement tchead = UitfFactory.eINSTANCE.createStatement();
				tchead.setDescription(String.format("test case head\n"));
				tc.getItsStatement().add(tchead);
				
				Statement start = UitfFactory.eINSTANCE.createStatement();
				start.setDescription(stm.getItsUIState().get(iStart).getDescription());
				start.setScriptStr(stm.getItsUIState().get(iStart).getScriptStr());
				tc.getItsStatement().add(start);
				
				ArrayDeque<Integer> tempqTranPath = this.aqTranPath.clone();
				for(int ii = 1; !tempqTranPath.isEmpty(); ii++){
					// add statement of action
					UITransition temptran = stm.getItsUITransition().get(tempqTranPath.remove());
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
				
				// check the size of ts, if >= 10000, output to a uitf file
				this.checkAndFlush(ts, false);
				
			}
			
			// recursion nextast
			this.enumeratePath(stm, ts, inextast);
		}
		
		if(!this.aqTranPath.isEmpty()){
			int temptran = this.aqTranPath.removeLast();
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
		if(forceFlush == false && ts.getItsTestCase().size() <= TestCaseGen.flushSize ){
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
			ts.getItsTestCase().clear() ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// notify UitfFileDone
		this.notifyUitfFileDone(uitfFilePath);
		
		return;
	}
	
}
