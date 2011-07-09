package name.niu.guitar.uisut.diagram.edit.policies;

import name.niu.guitar.uisut.diagram.providers.UisutElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class UITransitionItemSemanticEditPolicy extends
		UisutBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UITransitionItemSemanticEditPolicy() {
		super(UisutElementTypes.UITransition_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
