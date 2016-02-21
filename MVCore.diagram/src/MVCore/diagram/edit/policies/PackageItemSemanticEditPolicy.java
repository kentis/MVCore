package MVCore.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class PackageItemSemanticEditPolicy extends
		MVCore.diagram.edit.policies.MVCoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PackageItemSemanticEditPolicy() {
		super(MVCore.diagram.providers.MVCoreElementTypes.Package_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MVCore.diagram.providers.MVCoreElementTypes.Controller_2005 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.ControllerCreateCommand(
					req));
		}
		if (MVCore.diagram.providers.MVCoreElementTypes.Domain_2006 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.DomainCreateCommand(
					req));
		}
		if (MVCore.diagram.providers.MVCoreElementTypes.Package_2007 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.PackageCreateCommand(
					req));
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
