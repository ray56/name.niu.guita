package name.niu.guita.uisut.validation.constraints;

import name.niu.guita.uisut.*;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

public class UniqueInitFinlConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			if (eObj instanceof UIStatemachine) {
				UIStatemachine stm = (UIStatemachine)eObj;
				
				int initialCounter = 0;
				int finalCounter = 0;
				for(int i = 0; i < stm.getItsState().size(); i++){
					AbstractState ast = stm.getItsState().get(i);
					
					if(ast instanceof InitialState){
						initialCounter++;
					}
					else if(ast instanceof FinalState){
						finalCounter++;
					}
				}
				
				if(initialCounter == 1 && finalCounter == 1){
					return ctx.createSuccessStatus();
				}else{
					return ctx.createFailureStatus("There are " + initialCounter + " initial states and " + finalCounter + " final states!\n");
				}
			}
		}
		return ctx.createSuccessStatus();
	}
}
