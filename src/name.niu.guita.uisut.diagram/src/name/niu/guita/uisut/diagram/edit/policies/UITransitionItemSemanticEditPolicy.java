package name.niu.guita.uisut.diagram.edit.policies;

import name.niu.guita.uisut.diagram.providers.UISUTElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class UITransitionItemSemanticEditPolicy extends
		UISUTBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UITransitionItemSemanticEditPolicy() {
		super(UISUTElementTypes.UITransition_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
