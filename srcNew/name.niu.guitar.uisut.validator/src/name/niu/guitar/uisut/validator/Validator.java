package name.niu.guitar.uisut.validator;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JOptionPane;

import name.niu.guitar.uisut.*;

public class Validator {

	private int emptyNameCount = 0;
	private int initialCount = 0;
	private int finalCount = 0;
	private ArrayList<String> alSameName = new ArrayList<String>();
	private ArrayList<AbstractUIState> alCannotIn = new ArrayList<AbstractUIState>();
	private ArrayList<AbstractUIState> alCannotOut = new ArrayList<AbstractUIState>();
	
	public int validateStm(UIStatemachine stm) {
		
		int valiFlag = 1;
		String emptyNameStr = "";
		String uniqueNameStr = "";
		String uniqueInitFinlStr = "";
		String isolatedStr = "";
		
		// validate EmptyName
		this.emptyNameConstraint(stm);
		if(this.emptyNameCount != 0){
			valiFlag = 0;
			emptyNameStr = "Validation Error: " + this.emptyNameCount + " states with empty name!\n";
			JOptionPane.showMessageDialog(null, emptyNameStr);
			return valiFlag;
		}
		
		// validate UniqueName
		this.uniqueNameConstraint(stm);
		if(!this.alSameName.isEmpty()){
			valiFlag = 0;
			for(String astName : this.alSameName){
				uniqueNameStr += "Validation Error: " + astName + " is not unique!\n";
			}
		}
		if(valiFlag == 0){
			JOptionPane.showMessageDialog(null, uniqueNameStr);
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
		if(!this.alCannotIn.isEmpty()){
			valiFlag = 0;
			for(AbstractUIState ast : this.alCannotIn){
				isolatedStr += "Validation Error: " + ast.getName() + " is unreachable from initial state!\n";
			}
		}
		if(!this.alCannotOut.isEmpty()){
			valiFlag = 0;
			for(AbstractUIState ast : this.alCannotOut){
				isolatedStr += "Validation Error: " + ast.getName() + " cannot reach final state!\n";
			}
		}
		if(valiFlag == 0){
			JOptionPane.showMessageDialog(null, isolatedStr);
			return valiFlag;
		}
		
		return valiFlag;
	}
	
	private void emptyNameConstraint(UIStatemachine stm){
		
		for(AbstractUIState ast : stm.getItsExpandedUIState()){
			if(ast.getName() == null || ast.getName().length() == 0){
				this.emptyNameCount++;
			}
		}
		
		return;
	}
	
	private void uniqueNameConstraint(UIStatemachine stm){
		
		ArrayList<String> alUniqueName = new ArrayList<String>();
		
		for(AbstractUIState ast : stm.getItsExpandedUIState()){
			if(alUniqueName.contains(ast.getName())){
				if(!this.alSameName.contains(ast.getName())){
					this.alSameName.add(ast.getName());
				}
			}
			else{
				alUniqueName.add(ast.getName());
			}
		}
		
		return;
	}
	
	private void uniqueInitFinlConstraint(UIStatemachine stm){
	
		for(AbstractUIState ast : stm.getItsExpandedUIState()){
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
		
		for(int i = 0; i < stm.getItsExpandedUIState().size(); i++){
			AbstractUIState ast = stm.getItsExpandedUIState().get(i);
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
			AbstractUIState ast = stm.getItsExpandedUIState().get(icurState);
			
			for(int i = 0; i < ast.getItsExpandedOutTransition().size(); i++){
				int iState = hashSUTState.get(ast.getItsExpandedOutTransition().get(i).getItsExpandedTarState());
				
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
		for(int i = 0; i < stm.getItsExpandedUIState().size(); i++){
			AbstractUIState ast = stm.getItsExpandedUIState().get(i);
			// the state cannot be reached from initial state
			if(!StateAdded.contains(i)){
				this.alCannotIn.add(ast);
			}
		}
		
		State.clear();
		StateAdded.clear();
		State.add(iFinal);
		StateAdded.add(iFinal);
		for(;!State.isEmpty();){
			int icurState = State.remove();
			AbstractUIState ast = stm.getItsExpandedUIState().get(icurState);
			
			for(int i = 0; i < ast.getItsExpandedInTransition().size(); i++){
				if ( ast.getItsExpandedInTransition() == null
						|| ast.getItsExpandedInTransition().get(i) == null  ) {
					assert(false);
				}
				AbstractUIState  tempS =      ast.getItsExpandedInTransition().get(i).getItsExpandedSrcState() ;
				int iState;
				try {
					iState = hashSUTState.get(tempS);
				}catch(NullPointerException e) {
					e.printStackTrace() ;
					continue;
				}
				
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
		for(int i = 0; i < stm.getItsExpandedUIState().size(); i++){
			AbstractUIState ast = stm.getItsExpandedUIState().get(i);
			// the state cannot reach final state
			if(!StateAdded.contains(i)){
				this.alCannotOut.add(ast);
			}
		}
		
		return;
	}
}
