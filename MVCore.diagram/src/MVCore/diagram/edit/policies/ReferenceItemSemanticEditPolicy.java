package MVCore.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ReferenceItemSemanticEditPolicy extends
		MVCore.diagram.edit.policies.MVCoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ReferenceItemSemanticEditPolicy() {
		super(MVCore.diagram.providers.MVCoreElementTypes.Reference_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
