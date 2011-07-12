package name.niu.guitar.uisut.diagram.edit.policies;

import name.niu.guitar.uisut.diagram.edit.commands.CommonStateCreateCommand;
import name.niu.guitar.uisut.diagram.edit.commands.FinalStateCreateCommand;
import name.niu.guitar.uisut.diagram.edit.commands.InitialStateCreateCommand;
import name.niu.guitar.uisut.diagram.edit.commands.StateshortcutCreateCommand;
import name.niu.guitar.uisut.diagram.edit.commands.UIStatemachineCreateCommand;
import name.niu.guitar.uisut.diagram.providers.UisutElementTypes;

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
		UisutBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UIStatemachineItemSemanticEditPolicy() {
		super(UisutElementTypes.UIStatemachine_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UisutElementTypes.CommonState_2001 == req.getElementType()) {
			return getGEFWrapper(new CommonStateCreateCommand(req));
		}
		if (UisutElementTypes.InitialState_2002 == req.getElementType()) {
			return getGEFWrapper(new InitialStateCreateCommand(req));
		}
		if (UisutElementTypes.FinalState_2003 == req.getElementType()) {
			return getGEFWrapper(new FinalStateCreateCommand(req));
		}
		if (UisutElementTypes.UIStatemachine_2004 == req.getElementType()) {
			return getGEFWrapper(new UIStatemachineCreateCommand(req));
		}
		if (UisutElementTypes.Stateshortcut_2005 == req.getElementType()) {
			return getGEFWrapper(new StateshortcutCreateCommand(req));
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
