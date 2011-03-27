package name.niu.guita.uisut.diagram.edit.policies;

import name.niu.guita.uisut.diagram.edit.commands.FinalStateCreateCommand;
import name.niu.guita.uisut.diagram.edit.commands.InitialStateCreateCommand;
import name.niu.guita.uisut.diagram.edit.commands.UIStateCreateCommand;
import name.niu.guita.uisut.diagram.providers.UISUTElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class UIStatemachineItemSemanticEditPolicy extends
		UISUTBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UIStatemachineItemSemanticEditPolicy() {
		super(UISUTElementTypes.UIStatemachine_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UISUTElementTypes.UIState_2001 == req.getElementType()) {
			return getGEFWrapper(new UIStateCreateCommand(req));
		}
		if (UISUTElementTypes.InitialState_2002 == req.getElementType()) {
			return getGEFWrapper(new InitialStateCreateCommand(req));
		}
		if (UISUTElementTypes.FinalState_2003 == req.getElementType()) {
			return getGEFWrapper(new FinalStateCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
