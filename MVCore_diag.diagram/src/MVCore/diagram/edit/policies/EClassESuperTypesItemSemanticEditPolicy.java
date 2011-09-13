package MVCore.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class EClassESuperTypesItemSemanticEditPolicy extends
		MVCore.diagram.edit.policies.MVCoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EClassESuperTypesItemSemanticEditPolicy() {
		super(
				MVCore.diagram.providers.MVCoreElementTypes.EClassESuperTypes_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
