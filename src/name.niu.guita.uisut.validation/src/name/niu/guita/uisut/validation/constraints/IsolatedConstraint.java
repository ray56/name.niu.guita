package name.niu.guita.uisut.validation.constraints;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

import name.niu.guita.uisut.*;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

public class IsolatedConstraint extends AbstractModelConstraint {

	static HashSet<AbstractState> Cannotin = new HashSet<AbstractState>();
	static HashSet<AbstractState> Cannotout = new HashSet<AbstractState>();
	
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			if (eObj instanceof AbstractState) {
				AbstractState st = (AbstractState)eObj;
				if(Cannotin.contains(st) && Cannotout.contains(st)){
					return (ctx.createFailureStatus("The state " + st.getName() + " is isolated!\n"));
				}
				if(Cannotin.contains(st)){
					return (ctx.createFailureStatus("The state " + st.getName() + " is unreachable from initial state!\n"));
				}
				if(Cannotout.contains(st)){
					return (ctx.createFailureStatus("The state " + st.getName() + " cannot reach final state!\n"));
				}
			}
		}
		
		return ctx.createSuccessStatus();
	}

	
	public static void stmValidate(UIStatemachine stm) {
		
		// Isolated validate
		int iInitial = 0;
		int iFinal = 0;
		
		HashMap<AbstractState, Integer> hashSUTState = new HashMap<AbstractState, Integer>();
		ArrayDeque<Integer> State = new ArrayDeque<Integer>();
		HashSet<Integer> StateAdded = new HashSet<Integer>();
		
		Cannotin.clear();
		Cannotout.clear();
		
		for(int i = 0; i < stm.getItsState().size(); i++){
			AbstractState ast = stm.getItsState().get(i);
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
			AbstractState ast = stm.getItsState().get(icurState);
			
			for(int i = 0; i < ast.getItsOutTransition().size(); i++){
				int iState = hashSUTState.get(ast.getItsOutTransition().get(i).getItsTrgtState());
				
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
		for(int i = 0; i < stm.getItsState().size(); i++){
			AbstractState ast = stm.getItsState().get(i);
			// the state cannot be reached from initial state
			if(!StateAdded.contains(i)){
				Cannotin.add(ast);
			}
		}
		
		State.clear();
		StateAdded.clear();
		State.add(iFinal);
		StateAdded.add(iFinal);
		for(;!State.isEmpty();){
			int icurState = State.remove();
			AbstractState ast = stm.getItsState().get(icurState);
			
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
		for(int i = 0; i < stm.getItsState().size(); i++){
			AbstractState ast = stm.getItsState().get(i);
			// the state cannot reach final state
			if(!StateAdded.contains(i)){
				Cannotout.add(ast);
			}
		}
	}
}
