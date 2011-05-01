package name.niu.guita.uisut.tcgen.actions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import name.niu.guita.uisut.*;
import name.niu.guita.uisut.impl.AbstractStateImpl;
import name.niu.guita.uisut.tcgen.config.Configuration;
import name.niu.guita.uitf.uitf.*;
import name.niu.guita.uitf.uitf.impl.UitfPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GenerationTestCaseAlgorithm {
	
	static int[] arrSUTStateAddVar;
	static int[] arrSUTStateDelVar;
	static int[] arrSUTStateInTran;
	static int[] arrSUTTrnsVar;
	static int[] arrSUTTrnsable;
	static int[] arrSUTTrnsableInit;
	static int[][] arrSUTRelation;
	static int iInitial = 0;
	static int iFinal = 0;
	
	static HashMap<AbstractState, Integer> hashSUTState = new HashMap<AbstractState, Integer>();
	static HashMap<UITransition, Integer> hashSUTTransition = new HashMap<UITransition, Integer>();
	static HashMap<UIDataVariable, Integer> hashSUTDataVar = new HashMap<UIDataVariable, Integer>();
	
	static ArrayDeque<Integer> qState = new ArrayDeque<Integer>();
	static ArrayDeque<Integer> qStateAdded = new ArrayDeque<Integer>();
	static ArrayDeque<Integer> qTranPath = new ArrayDeque<Integer>();
	
	public static void genAlgorithm(String srcFile , String trgtFile){
		
		// set source resource
		ResourceSet srcResourceSet = new ResourceSetImpl();
		srcResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
			put("uisut", new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI(srcFile);
		Resource srcResource = srcResourceSet.createResource(srcURI);
		
		// set target resource
		ResourceSet trgtResourceSet = new ResourceSetImpl();
		trgtResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().
			put("uitf", new XMIResourceFactoryImpl());
		URI trgtURI = URI.createFileURI(trgtFile);
		Resource trgtResource = trgtResourceSet.createResource(trgtURI);

		TraverseWithNoCircle(srcResource, trgtResource);
	}
			
	static void TraverseWithNoCircle(Resource srcResource, Resource trgtResource){
		try{
			// load source resource and get root element of UIStatemachine
			srcResource.load(null);
			UIStatemachine stm = (UIStatemachine)srcResource.getContents().get(0);

			// create target resource and set root element of TestSuit
			TestSuite ts = UitfFactory.eINSTANCE.createTestSuite();
			ts.setId("TS_001");
			trgtResource.getContents().add(ts);
			
			// initial Arrays of SUTRelation
			arrSUTStateAddVar = new int[stm.getItsState().size()];
			arrSUTStateDelVar = new int[stm.getItsState().size()];
			arrSUTStateInTran = new int[stm.getItsState().size()];
			arrSUTTrnsVar = new int[stm.getItsTransition().size()];
			arrSUTTrnsable = new int[stm.getItsTransition().size()];
			arrSUTTrnsableInit = new int[stm.getItsTransition().size()];
			arrSUTRelation = new int[stm.getItsState().size()][stm.getItsState().size()];
			iInitial = 0;
			iFinal = 0;
			
			// initial
			for(int i = 0; i < stm.getItsState().size(); i++){
				arrSUTStateAddVar[i] = -1;
				arrSUTStateDelVar[i] = -1;
			}
			
			for(int i = 0; i < stm.getItsTransition().size(); i++){
				arrSUTTrnsVar[i] = -1;
			}
			
			// fill HashMap of SUTState
			for(int i = 0; i < stm.getItsState().size(); i++){
				AbstractState ast = stm.getItsState().get(i);
				hashSUTState.put(ast, i);
			}
			
			// fill HashMap of SUTTransition
			for(int i = 0; i < stm.getItsTransition().size(); i++){
				UITransition tran = stm.getItsTransition().get(i);
				hashSUTTransition.put(tran, i);
			}
			
			// fill HashMap of SUTDataVar
			for(int i = 0; i < stm.getItsDataVariable().size(); i++){
				hashSUTDataVar.put(stm.getItsDataVariable().get(i), i);
			}
			
			for(int i = 0; i < stm.getItsState().size(); i++){
				AbstractState ast = stm.getItsState().get(i);
				if (ast instanceof UIState){
					UIState st = (UIState)ast;
					
					// fill arrSUTStateAddVar
					for(int ii = 0; ii < st.getAddedDataVariable().size(); ii++){
						int iadd = hashSUTDataVar.get(st.getAddedDataVariable().get(ii));
						arrSUTStateAddVar[i] = iadd;
					}
					
					// fill arrSUTStateDelVar
					for(int ii = 0; ii < st.getDeletedDataVariable().size(); ii++){
						int idel = hashSUTDataVar.get(st.getDeletedDataVariable().get(ii));
						arrSUTStateDelVar[i] = idel;
					}
				}
				else if(ast instanceof InitialState){
					iInitial = hashSUTState.get(ast);
				}
				else if(ast instanceof FinalState){
					iFinal = hashSUTState.get(ast);
				}
				// fill arrSUTRelation
				for(int ii = 0; ii < ast.getItsOutTransition().size(); ii++){
					UITransition tran = ast.getItsOutTransition().get(ii);
					int j = hashSUTState.get(tran.getItsTrgtState());
					arrSUTRelation[i][j] = hashSUTTransition.get(tran);
				}
			}
			// fill arrSUTTrnsVar and arrSUTTrnsable
			for(int i = 0; i < stm.getItsTransition().size(); i++){
				UITransition tran = stm.getItsTransition().get(i);
				
				int iguard = -1;
				for(int ii = 0; ii < tran.getGuardedDataVariable().size(); ii++){
					iguard = hashSUTDataVar.get(tran.getGuardedDataVariable().get(ii));
				}
				
				arrSUTTrnsVar[i] = iguard;
				if(iguard < 0){
					arrSUTTrnsableInit[i] = 1;
					arrSUTTrnsable[i] = 1;
				}
				else{
					arrSUTTrnsableInit[i] = -1;
					arrSUTTrnsable[i] = -1;
				}
			}
			
			// find a way from SUT start to user start
			// TBD.
			
			// enumerate the path
			qState.add(iInitial);
			qStateAdded.add(iInitial);
			
			int tcCounter = 0;
			
			for(;!qState.isEmpty();){
				int curState = qState.remove();
				AbstractState ast = stm.getItsState().get(curState);
				for(int i = 0; i < ast.getItsOutTransition().size(); i++){
					int iTran = hashSUTTransition.get(ast.getItsOutTransition().get(i));
					int iState = hashSUTState.get(ast.getItsOutTransition().get(i).getItsTrgtState());
					
					// leaf node
					if(qStateAdded.contains(iState) || (iState == iFinal)){
						int tempiTran = iTran;
						int tempiState = hashSUTState.get(stm.getItsTransition().get(iTran).getItsSrcState());
						for(; tempiState!=iInitial; ){
							// the transition is disable
							if(arrSUTTrnsable[tempiTran] == -1){
								findWay(stm, tempiState, hashSUTState.get(stm.getItsTransition().get(tempiTran).getItsTrgtState()), -1);
							}
							// the transition is enable
							else{
								qTranPath.addFirst(tempiTran);
							}
							
							tempiTran = arrSUTStateInTran[tempiState];
							tempiState = hashSUTState.get(stm.getItsTransition().get(tempiTran).getItsSrcState());
						}
						
						// add first path
						qTranPath.addFirst(tempiTran);

						// find a way from leaf to final state
						findWay(stm, iState, iFinal, 1);
						
						// write test case to test case model
						TestCase tc = UitfFactory.eINSTANCE.createTestCase();
						tcCounter++;
						tc.setId(String.format("TC_%03d", tcCounter));
						ts.getItsTestCase().add(tc);
						AbstractState tempst = stm.getItsState().get(iInitial);
						Statement preStatement = UitfFactory.eINSTANCE.createStatement();
						preStatement.setDescription(String.format("[Preconditions]\n Current Position: %s\n",tempst.getDescription()));
						tc.getItsStatement().add(preStatement);
						
						for(; !qTranPath.isEmpty(); ){
							// add statement of TriggeredTransition
							UITransition temptran = stm.getItsTransition().get(qTranPath.remove());
							TriggeredTransition stepStatement = UitfFactory.eINSTANCE.createTriggeredTransition();
							stepStatement.setDescription( String.format("%s\n", temptran.getDescription()));
							stepStatement.setScriptStr( temptran.getScriptStr());
							tc.getItsStatement().add(stepStatement);
							// add statement of 
							
							AssertInState stepAsrStatement = UitfFactory.eINSTANCE.createAssertInState();
							stepAsrStatement.setDescription( String.format("Enter: %s\n", temptran.getItsTrgtState().getDescription()));
							tc.getItsStatement().add(stepAsrStatement);
						}
						
						// initial arrSUTTrnsable
						for(int ii = 0; ii < stm.getItsTransition().size(); ii++){
							arrSUTTrnsable[ii] = arrSUTTrnsableInit[ii];
						}
						
					}
					else{
						qState.add(iState);
						qStateAdded.add(iState);
						arrSUTStateInTran[iState] = iTran;
					}
				}
			}
			
			// save target resource
			trgtResource.save(null);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	static void findWay(UIStatemachine stm, int iStart, int iFinal, int direction){
		int[] arrSUTTranWeight = new int[stm.getItsTransition().size()];
		int iCurState = iStart;
		int flag = 0;
		
		ArrayDeque<Integer> tempqTranPath = new ArrayDeque<Integer>();
		
		if(iStart == iFinal){
			return;
		}
		
		// finding way
		for(; ; ){
			
			AbstractState curast = stm.getItsState().get(iCurState);
			int iminWeight = -1;
			int iminTran = -1;
			
			for(int ii = 0; ii < curast.getItsOutTransition().size(); ii++){
				
				UITransition curtran = curast.getItsOutTransition().get(ii);
				int icurtran = hashSUTTransition.get(curtran);
				
				// the transition is disable
				if(arrSUTTrnsable[icurtran] == -1){
					continue;
				}
				
				// find final state
				if(hashSUTState.get(curtran.getItsTrgtState()) == iFinal){
					flag = 1;
					tempqTranPath.add(hashSUTTransition.get(curtran));
					break;
				}
				
				// record minimum weight
				if((iminWeight < 0) || (iminWeight > arrSUTTranWeight[icurtran])){
					iminWeight = arrSUTTranWeight[icurtran];
					iminTran = icurtran;
				}
			}
			
			if(flag == 1){
				break;
			}
			else{
				tempqTranPath.add(iminTran);
				arrSUTTranWeight[iminTran]++;
				// change from source state to target state of the minimum transition
				UITransition mintran = stm.getItsTransition().get(iminTran);
				iCurState = hashSUTState.get(mintran.getItsTrgtState());
			
				// update arrSUTTrnsable
				if(arrSUTStateAddVar[iCurState]!= -1){
					int icurvar = arrSUTStateAddVar[iCurState];
					for(int ii = 0; ii < stm.getItsTransition().size(); ii++){
						if(arrSUTTrnsVar[ii] == icurvar){
							arrSUTTrnsable[ii] = 1;
						}
					}
				}
				if(arrSUTStateDelVar[iCurState]!= -1){
					int icurvar = arrSUTStateDelVar[iCurState];
					for(int ii = 0; ii < stm.getItsTransition().size(); ii++){
						if(arrSUTTrnsVar[ii] == icurvar){
							arrSUTTrnsable[ii] = -1;
						}
					}
				}
			}
		}

		// add transition to qTranPath
		for(; !tempqTranPath.isEmpty(); ){
			if(direction == -1){
				qTranPath.addFirst(tempqTranPath.removeLast());
			}
			else{
				qTranPath.addLast(tempqTranPath.removeFirst());
			}
		}
		
		return;
	}
	
}
