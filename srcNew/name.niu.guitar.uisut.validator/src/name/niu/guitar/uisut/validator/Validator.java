package name.niu.guitar.uisut.validator;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JOptionPane;

import name.niu.guitar.uisut.*;

public class Validator {

	private int noNameCount = 0;
	private int initialCount = 0;
	private int finalCount = 0;
	private ArrayList<String> noUniqueName = new ArrayList<String>();
	private ArrayList<AbstractUIState> cannotIn = new ArrayList<AbstractUIState>();
	private ArrayList<AbstractUIState> cannotOut = new ArrayList<AbstractUIState>();
	
	public int validateStm(UIStatemachine stm) {
		
		int valiFlag = 1;
		String noEmptyNameStr = "";
		String uniqueInitFinlStr = "";
		String isolatedStr = "";
		
		// validate EmptyName
		this.noEmptyNameConstraint(stm);
		if(this.noNameCount != 0){
			valiFlag = 0;
			noEmptyNameStr = "Validation Error: " + this.noNameCount + " states with empty name!\n";
			JOptionPane.showMessageDialog(null, noEmptyNameStr);
			return valiFlag;
		}
		
		// validate unique Initial and Final
		this.uniqueInitFinlConstraint(stm);
		if(this.initialCount >1){
			valiFlag = 0;
			uniqueInitFinlStr += "Validation Error: " + this.initialCount + " initial states!\n";
		}
		if(this.finalCount >1){
			valiFlag = 0;
			uniqueInitFinlStr += "Validation Error: " + this.finalCount + " final states!\n";
		}
		if(valiFlag == 0){
			JOptionPane.showMessageDialog(null, uniqueInitFinlStr);
			return valiFlag;
		}
		
		// validate isolated states
		this.isolatedConstraint(stm);
		if(!this.cannotIn.isEmpty()){
			valiFlag = 0;
			for(AbstractUIState ast : this.cannotIn){
				isolatedStr += "Validation Error: " + ast.getName() + " is unreachable from initial state!\n";
			}
		}
		if(!this.cannotOut.isEmpty()){
			valiFlag = 0;
			for(AbstractUIState ast : this.cannotOut){
				isolatedStr += "Validation Error: " + ast.getName() + " cannot reach final state!\n";
			}
		}
		if(valiFlag == 0){
			JOptionPane.showMessageDialog(null, isolatedStr);
			return valiFlag;
		}
		
		return valiFlag;
	}
	
	private void noEmptyNameConstraint(UIStatemachine stm){
		
		for(AbstractUIState ast : stm.getItsUIState()){
			if(ast.getName() == null || ast.getName().length() == 0){
				this.noNameCount++;
			}
		}
		return;
	}
	
	private void uniqueNameConstraint(UIStatemachine stm){
		
		HashMap<String, AbstractUIState> 
		for(AbstractUIState ast : stm.getItsUIState()){
			if(ast instanceof InitialState){
				this.initialCount++;
			}
			else if(ast instanceof FinalState){
				this.finalCount++;
			}
		}
		return;
	}
	
	private void uniqueInitFinlConstraint(UIStatemachine stm){
	
		for(AbstractUIState ast : stm.getItsUIState()){
			if(ast instanceof InitialState){
				this.initialCount++;
			}
			else if(ast instanceof FinalState){
				this.finalCount++;
			}
		}
		return;
	}
	
	private  void isolatedConstraint(UIStatemachine stm){
	
		int iInitial = 0;
		int iFinal = 0;
		
		HashMap<AbstractUIState, Integer> hashSUTState = new HashMap<AbstractUIState, Integer>();
		ArrayDeque<Integer> State = new ArrayDeque<Integer>();
		HashSet<Integer> StateAdded = new HashSet<Integer>();
		
		for(int i = 0; i < stm.getItsUIState().size(); i++){
			AbstractUIState ast = stm.getItsUIState().get(i);
			hashSUTState.put(ast, i);
			if(ast instanceof InitialState){
				iInitial = i;
			}
			else if(ast instanceof FinalState){
				iFinal = i;
			}
		}
		
		State.add(iInitial);
		StateAdded.add(iInitial);
		for(;!State.isEmpty();){
			int icurState = State.remove();
			AbstractUIState ast = stm.getItsUIState().get(icurState);
			
			for(int i = 0; i < ast.getItsOutTrantion().size(); i++){
				int iState = hashSUTState.get(ast.getItsOutTrantion().get(i).getItsTarState());
				
				// leaf node
				if(StateAdded.contains(iState)){
					continue;
				}
				// Final node
				else if(iState == iFinal){
					StateAdded.add(iState);
				}
				// common node
				else{
					State.add(iState);
					StateAdded.add(iState);
				}
			}
		}
		for(int i = 0; i < stm.getItsUIState().size(); i++){
			AbstractUIState ast = stm.getItsUIState().get(i);
			// the state cannot be reached from initial state
			if(!StateAdded.contains(i)){
				this.cannotIn.add(ast);
			}
		}
		
		State.clear();
		StateAdded.clear();
		State.add(iFinal);
		StateAdded.add(iFinal);
		for(;!State.isEmpty();){
			int icurState = State.remove();
			AbstractUIState ast = stm.getItsUIState().get(icurState);
			
			for(int i = 0; i < ast.getItsInTransition().size(); i++){
				int iState = hashSUTState.get(ast.getItsInTransition().get(i).getItsSrcState());
				
				// leaf node
				if(StateAdded.contains(iState)){
					continue;
				}
				// Initial node
				else if(iState == iInitial){
					StateAdded.add(iState);
				}
				// common node
				else{
					State.add(iState);
					StateAdded.add(iState);
				}
			}
		}
		for(int i = 0; i < stm.getItsUIState().size(); i++){
			AbstractUIState ast = stm.getItsUIState().get(i);
			// the state cannot reach final state
			if(!StateAdded.contains(i)){
				this.cannotOut.add(ast);
			}
		}
		return;
	}
}
