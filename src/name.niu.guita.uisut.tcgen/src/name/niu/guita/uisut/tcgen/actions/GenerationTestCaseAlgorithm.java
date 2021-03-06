package name.niu.guita.uisut.tcgen.actions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import name.niu.guita.uisut.*;
import name.niu.guita.uitf.uitf.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GenerationTestCaseAlgorithm {
	
	static int flushSize = 10000;
	
	int iMaxLoop;
	int iMaxStep;
	int iUserStart;
	int iUserEnd;
	int iTCounter;
	
	String trgtFile ;
	int flushCount = 0 ;
	
	private void checkAndFlush( TestSuite ts, boolean forceFlush ){
		// set target resource
		if ( forceFlush == false && ts.getItsTestCase().size() <= GenerationTestCaseAlgorithm.flushSize ) {
			return ;
		}
		flushCount ++ ;
		ResourceSet trgtResourceSet = new ResourceSetImpl();
		trgtResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
			put("uitf", new XMIResourceFactoryImpl());
		URI trgtURI = URI.createFileURI(trgtFile.replace(".uitf", "_" + String.format("%03d", flushCount) + ".uitf" ) );
		Resource trgtResource = trgtResourceSet.createResource(trgtURI);
			
		trgtResource.getContents().add(ts);
		try {
			trgtResource.save(null);
			ts.getItsTestCase().clear() ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}
	
	public GenerationTestCaseAlgorithm() {
		
	}
	
	HashMap<AbstractState, Integer> hashUserState = new HashMap<AbstractState, Integer>();
	HashMap<UITransition, Integer> hashUserTransition = new HashMap<UITransition, Integer>();
	HashMap<UIDataVariable, Integer> hashUserSystemVar = new HashMap<UIDataVariable, Integer>();
	
	ArrayList<UIDataVariable> arrCurCondition = new ArrayList<UIDataVariable>();
	ArrayList<UIDataVariable> arrPreCondition = new ArrayList<UIDataVariable>();
	ArrayList<UIDataVariable> arrNeedCondition = new ArrayList<UIDataVariable>();
	
	ArrayList<Integer> arrTranOccur = new ArrayList<Integer>();
	ArrayDeque<Integer> qTranPath = new ArrayDeque<Integer>();
	
	public static void genAlgorithm(String srcFile , String trgtFile, 
									int maxLoop, int maxStep, 
									String userStartName, String userEndName, 
									ArrayList<String> userScopeNames){
		
		GenerationTestCaseAlgorithm alg = new GenerationTestCaseAlgorithm() ;
		alg.trgtFile = trgtFile ;
		
		// set source resource
		ResourceSet srcResourceSet = new ResourceSetImpl();
		srcResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
			put("uisut", new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI(srcFile);
		Resource srcResource = srcResourceSet.createResource(srcURI);
		
		TestSuite ts = null ;
		try{
			// load source resource and get root element of UIStatemachine
			srcResource.load(null);
			UIStatemachine stm = (UIStatemachine)srcResource.getContents().get(0);

			// create target resource and set root element of TestSuit
			ts = UitfFactory.eINSTANCE.createTestSuite();
			ts.setId("TS_001");
			
			
			// get start time
			long startTime = System.currentTimeMillis();
			
			// initial variables
			alg.initialVariables();
			
			// set iMaxLoop
			if(maxLoop<0 || maxLoop>10){
				JOptionPane.showMessageDialog(null, "max cycle count is between 0-10!");
				return;
			}
			alg.iMaxLoop = maxLoop;
			
			
			// set iMaxStep
			if(maxStep<5 || maxStep>1000){
				JOptionPane.showMessageDialog(null, "max step is between 5-1000!");
				return;
			}
			alg.iMaxStep = maxStep;
			
			// create userstm
			UIStatemachine userstm = alg.createUserSTM(stm, userScopeNames);
			
			// set hash maps of userstm
			alg.setUserHashMaps(userstm);
			
			for(int i = 0; i < userstm.getItsState().size(); i++){
				AbstractState ast = userstm.getItsState().get(i);
				
				// set iUserStart
				if(userStartName == null && ast instanceof InitialState){
					alg.iUserStart = i;
					continue;
				}else if(userStartName != null && userStartName.equals(ast.getName())){
					alg.iUserStart = i;
					continue;
				}
				
				// set iUserEnd
				if(userEndName == null && ast instanceof FinalState){
					alg.iUserEnd = i;
					continue;
				}
				else if(userEndName != null && userEndName.equals(ast.getName())){
					alg.iUserEnd = i;
					continue;
				}
			}
			
			// isolated validate for userstm
			ArrayDeque<Integer> qState = new ArrayDeque<Integer>();
			HashSet<Integer> qStateAdded = new HashSet<Integer>();
			
			String strNotReachStart = "";
			String strNotReachEnd = "";
			String strerr = "";
			
			if(alg.iUserStart == -1){
				JOptionPane.showMessageDialog(null, "Start state is not in the selected scope!");
				return;
			}
			if(alg.iUserEnd == -1){
				JOptionPane.showMessageDialog(null, "End state is not in the selected scope!");
				return;
			}
			
			qState.add(alg.iUserStart);
			qStateAdded.add(alg.iUserStart);
			for(;!qState.isEmpty();){
				int icurState = qState.remove();
				AbstractState ast = userstm.getItsState().get(icurState);

				for(int i = 0; i < ast.getItsOutTransition().size(); i++){
					UITransition tran = ast.getItsOutTransition().get(i);
					int iState = alg.hashUserState.get(tran.getItsTrgtState());
					
					// leaf node
					if(qStateAdded.contains(iState)){
						continue;
					} 
					// UserEnd node
					else if (iState == alg.iUserEnd){
						qStateAdded.add(iState);
					}
					// common node
					else{
						qState.add(iState);
						qStateAdded.add(iState);
					}
				}
			}
			for(int i = 0; i < userstm.getItsState().size(); i++){
				AbstractState ast = userstm.getItsState().get(i);
				// the state cannot be reached from Start
				if(!qStateAdded.contains(i)){
					strNotReachStart += ast.getName() + "   ";
				}
			}
			
			qState.clear();
			qStateAdded.clear();
			qState.add(alg.iUserEnd);
			qStateAdded.add(alg.iUserEnd);
			for(;!qState.isEmpty();){
				int icurState = qState.remove();
				AbstractState ast = userstm.getItsState().get(icurState);

				for(int i = 0; i < ast.getItsInTransition().size(); i++){
					UITransition tran = ast.getItsInTransition().get(i);
					int iState = alg.hashUserState.get(tran.getItsSrcState());
					
					// leaf node
					if(qStateAdded.contains(iState)){
						continue;
					}
					// UserStart node
					else if (iState == alg.iUserStart){
						qStateAdded.add(iState);
					}
					// common node
					else{
						qState.add(iState);
						qStateAdded.add(iState);
					}
				}
			}
			for(int i = 0; i < userstm.getItsState().size(); i++){
				AbstractState ast = userstm.getItsState().get(i);
				// the state cannot reach End
				if(!qStateAdded.contains(i)){
					strNotReachEnd += ast.getName() + "   ";
				}
			}
			
			if(strNotReachStart!="" || strNotReachEnd!=""){
				strerr += "Error\n";
				if(strNotReachStart!=""){
					strerr += "These states cannot be reached from Start:\n" + strNotReachStart + "\n";
				}
				
				if(strNotReachEnd!=""){
					strerr += "These states cannot reach End:\n" + strNotReachEnd + "\n";
				}
				
				JOptionPane.showMessageDialog(null, strerr);
				return;
			}
			
			JOptionPane.showMessageDialog(null, "Validation passed.");
			
			// find PreCondition
			alg.arrPreCondition = alg.findPreCondition(userstm);
			
			// initial arrTranOccur
			for(int i = 0; i < userstm.getItsTransition().size(); i++){
				alg.arrTranOccur.add(0);
			}
			
			// enumerate path
			alg.enumeratePath(userstm, ts, alg.iUserStart);
			
			// save target resource
			alg.checkAndFlush(ts, true);
			
			// get end time
			long endTime = System.currentTimeMillis();
			String generationTime = String.format("cost time:%s ms", endTime - startTime);

			// show message
			JOptionPane.showMessageDialog(null, "Generate Test Case Model Successfully!\n"+generationTime);
		
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	void initialVariables(){
		
		iMaxLoop = -1;
		iMaxStep = -1;
		iUserStart = -1;
		iUserEnd = -1;
		iTCounter = 0;
		
		hashUserState.clear();
		hashUserTransition.clear();
		hashUserSystemVar.clear();
		
		arrCurCondition.clear();
		arrPreCondition.clear();
		arrNeedCondition.clear();
		
		arrTranOccur.clear();
		qTranPath.clear();
		
	}
	
	UIStatemachine createUserSTM(UIStatemachine stm, ArrayList<String> userScopeNames){
		
		// parameter validation
		if(stm == null){
			throw new IllegalArgumentException("stm must not null!");
		}
		if(userScopeNames == null){
			return stm;
		}

		UIStatemachine target = null;
		
		// set resource 
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
			put("uisut", new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI("C:/a.uisut");
		URI targetURI = URI.createFileURI("C:/b.uisut");
		Resource resource1 = resourceSet.createResource(srcURI);
		Resource resource2 = resourceSet.createResource(targetURI);
		
		// copy stm to x
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		resource1.getContents().add(stm);
		try{
			resource1.save(os, null);
			ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
			resource2.load(is, null);
			target = (UIStatemachine) resource2.getContents().get(0);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		if(target != null){
			ArrayList<AbstractState> removeCandidate = new ArrayList<AbstractState>();
			ArrayList<UITransition> removeTranCandidate = new ArrayList<UITransition>();
			for(AbstractState s : target.getItsState()){
//				if( s instanceof InitialState || s instanceof FinalState ){
//					continue ;
//				}
				boolean found = false;
				for(String name : userScopeNames){
					if((s.getName() != null && s.getName().equals(name))
						|| (s.getName() == null && name == null)
						|| (s.getName() == null && name == ""))
					{
						found = true;
						break;
					}
				}
				if(!found){
					removeCandidate.add(s);					
				}
			}
			for(AbstractState si : removeCandidate){
				target.getItsState().remove(si);
				for(UITransition t1 : si.getItsInTransition()){
					removeTranCandidate.add(t1);
				}				
				for(UITransition t2 : si.getItsOutTransition()){
					removeTranCandidate.add(t2);
				}
			}
			for(AbstractState si : removeCandidate){
				target.getItsState().remove(si);
				si.getItsInTransition().clear();
				si.getItsOutTransition().clear();
			}
			for(UITransition t : removeTranCandidate){
				target.getItsTransition().remove(t);
				t.setItsSrcState(null);
				t.setItsTrgtState(null);
			}
			return target;
		}
		
		return null;
	}
	
	void setUserHashMaps(UIStatemachine userstm){
		
		// fill hashUserState
		for(int i = 0; i < userstm.getItsState().size(); i++){
			AbstractState ast = userstm.getItsState().get(i);
			hashUserState.put(ast, i);
		}
		
		// fill hashUserTransition
		for(int i = 0; i < userstm.getItsTransition().size(); i++){
			UITransition tran = userstm.getItsTransition().get(i);
			hashUserTransition.put(tran, i);
		}
		
		// fill hashUserSystemVar
		for(int i = 0; i < userstm.getItsDataVariable().size(); i++){
			hashUserSystemVar.put(userstm.getItsDataVariable().get(i), i);
		}
	}
	
	ArrayList<UIDataVariable> findPreCondition(UIStatemachine userstm){
		
		HashSet<UIDataVariable> addedByStates = new HashSet<UIDataVariable>();
		HashSet<UIDataVariable> needByTransitions = new HashSet<UIDataVariable>();
		
		for(AbstractState s : userstm.getItsState()){
			if(s instanceof UIState){
				for(UIDataVariable dv : ((UIState)s).getAddedDataVariable()){
					addedByStates.add(dv);
				}
			}
		}
		
		for(UITransition t : userstm.getItsTransition()){
			for(UIDataVariable dv : t.getGuardedDataVariable()){
				needByTransitions.add(dv);
			}
		}
		
		needByTransitions.removeAll(addedByStates);
		return new ArrayList(needByTransitions);
	}
	
	void enumeratePath(UIStatemachine userstm, TestSuite ts, int icurast){
		
		AbstractState curast = userstm.getItsState().get(icurast);
		
		// save arrCurCondition
		ArrayList<UIDataVariable> arrLastCondition = (ArrayList<UIDataVariable>) arrCurCondition.clone();
		
		// add and delete system variables to arrCurCondition
		if (curast instanceof UIState){

			UIState curst = (UIState)curast;
			
			for(int i = 0; i < curst.getAddedDataVariable().size(); i++){
				
				UIDataVariable addSysVar = curst.getAddedDataVariable().get(i);
				if(!arrCurCondition.contains(addSysVar)){
					arrCurCondition.add(addSysVar);
				}
			}
			
			for(int i = 0; i < curst.getDeletedDataVariable().size(); i++){
				
				UIDataVariable delSysVar = curst.getDeletedDataVariable().get(i);
				if(arrCurCondition.contains(delSysVar)){
					arrCurCondition.remove(delSysVar);
				}
			}
		}
		
		for(int i = 0; i < curast.getItsOutTransition().size(); i++){
			
			UITransition curtran = curast.getItsOutTransition().get(i);
			int icurtran = hashUserTransition.get(curtran);
			
			// judge the condition
			int flag = 0;
			for(int ii = 0; ii < curtran.getGuardedDataVariable().size(); ii++){
				
				UIDataVariable tranSysVar = curtran.getGuardedDataVariable().get(ii);
				if(arrCurCondition.contains(tranSysVar)){
					continue;
				}
				else if(arrPreCondition.contains(tranSysVar)){
					if(!arrNeedCondition.contains(tranSysVar)){
						arrNeedCondition.add(tranSysVar);
					}
				}
				else{
					flag = 1;
					break;
				}
			}
			
			// condition is disabled
			if(flag == 1){
				continue;
			}
			
			// out of loop
			if(arrTranOccur.get(icurtran) >= iMaxLoop){
				continue;
			}
			
			// out of step
			if(qTranPath.size() >= iMaxStep){
				continue;
			}
			
			// add icurtran to qTranPath
			qTranPath.addLast(icurtran);
			arrTranOccur.set(icurtran, arrTranOccur.get(icurtran)+1);
			
			AbstractState nextast = curtran.getItsTrgtState();
			int inextast = hashUserState.get(nextast);
			
			// output path
			if(inextast == iUserEnd){
				
				TestCase tc = UitfFactory.eINSTANCE.createTestCase();
				iTCounter++;
				tc.setId(String.format("TC_%03d", iTCounter));
				ts.getItsTestCase().add(tc);
				
				AbstractState tempst = userstm.getItsState().get(iUserStart);
				Statement preStatement = UitfFactory.eINSTANCE.createStatement();
				preStatement.setDescription(String.format("[Preconditions]\n Current Position: %s\n Need Condition:\n",tempst.getDescription()));
				tc.getItsStatement().add(preStatement);
				
				for(int ii = 0; ii < arrNeedCondition.size(); ii++){
					Statement needCondition = UitfFactory.eINSTANCE.createStatement();
					needCondition.setDescription(String.format("%s\n", arrNeedCondition.get(ii).getName()));
					tc.getItsStatement().add(needCondition);
				}
				
				Statement tchead = UitfFactory.eINSTANCE.createStatement();
				tchead.setDescription(String.format("test case head\n"));
				tc.getItsStatement().add(tchead);
				
				ArrayDeque<Integer> tempqTranPath = qTranPath.clone();
				for(int ii = 1; !tempqTranPath.isEmpty(); ii++){
					// add statement of action
					UITransition temptran = userstm.getItsTransition().get(tempqTranPath.remove());
					TriggeredTransition stepStatement = UitfFactory.eINSTANCE.createTriggeredTransition();
					stepStatement.setDescription( String.format("%d.%s\n", ii, temptran.getDescription()));
					stepStatement.setScriptStr( temptran.getScriptStr());
					tc.getItsStatement().add(stepStatement);
					
					// add statement of expect
					AssertInState stepAsrStatement = UitfFactory.eINSTANCE.createAssertInState();
					stepAsrStatement.setDescription( String.format("%d.Enter: %s\n", ii, temptran.getItsTrgtState().getDescription()));
					tc.getItsStatement().add(stepAsrStatement);
				}
				// TODO: here, a new tc added to ts, try check the size of ts, if >= 10000, output to a file
				// TODO: a implementation may be:
				// make all field and function not static,
				// add a field named targetFile, flushCount,
				// add a function named checkAndFlush(ts)
				// rename genAlgorithm to createAndRun
				// client call createAndRun to instantiate and run.
				checkAndFlush(ts, false);
				
				// clear arrNeedCondition
				arrNeedCondition.clear();
			}
			
			// recursion nextast
			enumeratePath(userstm, ts, inextast);
		}
		
		if(!qTranPath.isEmpty()){
			int temptran = qTranPath.removeLast();
			arrTranOccur.set(temptran, arrTranOccur.get(temptran)-1);
		}
		
		// rollback arrCurCondition
		if (curast instanceof UIState){
			arrCurCondition.clear();
			arrCurCondition = (ArrayList<UIDataVariable>) arrLastCondition.clone();
		}
	}
	
}
