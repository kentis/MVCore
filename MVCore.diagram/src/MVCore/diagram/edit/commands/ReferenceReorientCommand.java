package MVCore.diagram.edit.commands;

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
public class ReferenceReorientCommand extends EditElementCommand {

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
	public ReferenceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof MVCore.Reference) {
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
		if (!(oldEnd instanceof MVCore.Domain && newEnd instanceof MVCore.Domain)) {
			return false;
		}
		MVCore.Domain target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof MVCore.Domain)) {
			return false;
		}
		MVCore.Domain container = (MVCore.Domain) getLink().eContainer();
		return MVCore.diagram.edit.policies.MVCoreBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistReference_4002(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MVCore.Domain && newEnd instanceof MVCore.Domain)) {
			return false;
		}
		MVCore.Domain source = getLink().getSrc();
		if (!(getLink().eContainer() instanceof MVCore.Domain)) {
			return false;
		}
		MVCore.Domain container = (MVCore.Domain) getLink().eContainer();
		return MVCore.diagram.edit.policies.MVCoreBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistReference_4002(container,
						getLink(), source, getNewTarget());
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
		getLink().setSrc(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected MVCore.Reference getLink() {
		return (MVCore.Reference) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected MVCore.Domain getOldSource() {
		return (MVCore.Domain) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MVCore.Domain getNewSource() {
		return (MVCore.Domain) newEnd;
	}

	/**
	 * @generated
	 */
	protected MVCore.Domain getOldTarget() {
		return (MVCore.Domain) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MVCore.Domain getNewTarget() {
		return (MVCore.Domain) newEnd;
	}
}
