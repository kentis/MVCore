package MVCore.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

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
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
