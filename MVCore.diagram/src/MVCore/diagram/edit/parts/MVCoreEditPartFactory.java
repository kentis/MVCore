package MVCore.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MVCoreEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MVCore.diagram.part.MVCoreVisualIDRegistry
					.getVisualID(view)) {

			case MVCore.diagram.edit.parts.PackageEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.PackageEditPart(view);

			case MVCore.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.ControllerEditPart(view);

			case MVCore.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.ControllerNameEditPart(
						view);

			case MVCore.diagram.edit.parts.DomainEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.DomainEditPart(view);

			case MVCore.diagram.edit.parts.DomainNameEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.DomainNameEditPart(view);

			case MVCore.diagram.edit.parts.Package2EditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.Package2EditPart(view);

			case MVCore.diagram.edit.parts.PackageNameEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.PackageNameEditPart(view);

			case MVCore.diagram.edit.parts.RoundedRectangleEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.RoundedRectangleEditPart(
						view);

			case MVCore.diagram.edit.parts.ActionEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.ActionEditPart(view);

			case MVCore.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.AttributeEditPart(view);

			case MVCore.diagram.edit.parts.MVCoreClassEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.MVCoreClassEditPart(view);

			case MVCore.diagram.edit.parts.Package3EditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.Package3EditPart(view);

			case MVCore.diagram.edit.parts.ReferenceEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.ReferenceEditPart(view);

			case MVCore.diagram.edit.parts.ReferenceLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new MVCore.diagram.edit.parts.ReferenceLowerBoundUpperBoundEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
