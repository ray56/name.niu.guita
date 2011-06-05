package name.niu.guita.uisut.validation.constraints;

import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.UIStatemachine;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;

public class NonEmptyNamesConstraint extends AbstractModelConstraint {



	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			String name = null;
			if (eObj instanceof UIState) {
				name = ((UIState)eObj).getName();
			} else if (eObj instanceof UIStatemachine) {
				//name = ((UIStatemachine)eObj).getName();
			}
			
			if (name == null || name.length() == 0) {
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		// In the case of live mode.
		} else {
			Object newValue = ctx.getFeatureNewValue();
			
			if (newValue == null
				|| ((String)newValue).length() == 0) {
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		}
		
		return ctx.createSuccessStatus();
	}

}
