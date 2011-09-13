package MVCore.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EDomainClassItemSemanticEditPolicy extends
		MVCore.diagram.edit.policies.MVCoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EDomainClassItemSemanticEditPolicy() {
		super(MVCore.diagram.providers.MVCoreElementTypes.EDomainClass_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MVCore.diagram.providers.MVCoreElementTypes.EMVCAttribute_3005 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.EMVCAttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(incomingLink) == MVCore.diagram.edit.parts.EAnnotationReferencesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(incomingLink) == MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(incomingLink) == MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(incomingLink) == MVCore.diagram.edit.parts.EClassESuperTypesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(outgoingLink) == MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(outgoingLink) == MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(outgoingLink) == MVCore.diagram.edit.parts.EClassESuperTypesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(node)) {
			case MVCore.diagram.edit.parts.EMVCAttributeEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MVCore.diagram.providers.MVCoreElementTypes.EAnnotationReferences_4002 == req
				.getElementType()) {
			return null;
		}
		if (MVCore.diagram.providers.MVCoreElementTypes.EReference_4001 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.EReferenceCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MVCore.diagram.providers.MVCoreElementTypes.EReference_4003 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.EReference2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MVCore.diagram.providers.MVCoreElementTypes.EClassESuperTypes_4004 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.EClassESuperTypesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MVCore.diagram.providers.MVCoreElementTypes.EAnnotationReferences_4002 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.EAnnotationReferencesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MVCore.diagram.providers.MVCoreElementTypes.EReference_4001 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.EReferenceCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MVCore.diagram.providers.MVCoreElementTypes.EReference_4003 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.EReference2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (MVCore.diagram.providers.MVCoreElementTypes.EClassESuperTypes_4004 == req
				.getElementType()) {
			return getGEFWrapper(new MVCore.diagram.edit.commands.EClassESuperTypesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MVCore.diagram.edit.parts.EReferenceEditPart.VISUAL_ID:
			return getGEFWrapper(new MVCore.diagram.edit.commands.EReferenceReorientCommand(
					req));
		case MVCore.diagram.edit.parts.EReference2EditPart.VISUAL_ID:
			return getGEFWrapper(new MVCore.diagram.edit.commands.EReference2ReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MVCore.diagram.edit.parts.EAnnotationReferencesEditPart.VISUAL_ID:
			return getGEFWrapper(new MVCore.diagram.edit.commands.EAnnotationReferencesReorientCommand(
					req));
		case MVCore.diagram.edit.parts.EClassESuperTypesEditPart.VISUAL_ID:
			return getGEFWrapper(new MVCore.diagram.edit.commands.EClassESuperTypesReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
