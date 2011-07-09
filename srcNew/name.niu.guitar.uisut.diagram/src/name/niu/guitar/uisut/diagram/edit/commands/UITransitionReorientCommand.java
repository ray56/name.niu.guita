package name.niu.guitar.uisut.diagram.edit.commands;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.diagram.edit.policies.UisutBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class UITransitionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public UITransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof UITransition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof AbstractUIState && newEnd instanceof AbstractUIState)) {
			return false;
		}
		AbstractUIState target = getLink().getItsTarState();
		if (!(getLink().eContainer() instanceof UIStatemachine)) {
			return false;
		}
		UIStatemachine container = (UIStatemachine) getLink().eContainer();
		return UisutBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistUITransition_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AbstractUIState && newEnd instanceof AbstractUIState)) {
			return false;
		}
		AbstractUIState source = getLink().getItsSrcState();
		if (!(getLink().eContainer() instanceof UIStatemachine)) {
			return false;
		}
		UIStatemachine container = (UIStatemachine) getLink().eContainer();
		return UisutBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistUITransition_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setItsSrcState(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setItsTarState(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected UITransition getLink() {
		return (UITransition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected AbstractUIState getOldSource() {
		return (AbstractUIState) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractUIState getNewSource() {
		return (AbstractUIState) newEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractUIState getOldTarget() {
		return (AbstractUIState) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractUIState getNewTarget() {
		return (AbstractUIState) newEnd;
	}
}
