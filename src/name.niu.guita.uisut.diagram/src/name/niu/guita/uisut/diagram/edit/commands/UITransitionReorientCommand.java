package name.niu.guita.uisut.diagram.edit.commands;

import name.niu.guita.uisut.AbstractState;
import name.niu.guita.uisut.UIStatemachine;
import name.niu.guita.uisut.UITransition;
import name.niu.guita.uisut.diagram.edit.policies.UISUTBaseItemSemanticEditPolicy;

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
		if (!(oldEnd instanceof AbstractState && newEnd instanceof AbstractState)) {
			return false;
		}
		AbstractState target = getLink().getItsTrgtState();
		if (!(getLink().eContainer() instanceof UIStatemachine)) {
			return false;
		}
		UIStatemachine container = (UIStatemachine) getLink().eContainer();
		return UISUTBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistUITransition_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AbstractState && newEnd instanceof AbstractState)) {
			return false;
		}
		AbstractState source = getLink().getItsSrcState();
		if (!(getLink().eContainer() instanceof UIStatemachine)) {
			return false;
		}
		UIStatemachine container = (UIStatemachine) getLink().eContainer();
		return UISUTBaseItemSemanticEditPolicy.getLinkConstraints()
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
		getLink().setItsTrgtState(getNewTarget());
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
	protected AbstractState getOldSource() {
		return (AbstractState) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractState getNewSource() {
		return (AbstractState) newEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractState getOldTarget() {
		return (AbstractState) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractState getNewTarget() {
		return (AbstractState) newEnd;
	}
}
