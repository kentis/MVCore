package MVCore.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MVCorePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMVCore1Group());
	}

	/**
	 * Creates "MVCore" palette tool group
	 * @generated
	 */
	private PaletteContainer createMVCore1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				MVCore.diagram.part.Messages.MVCore1Group_title);
		paletteContainer.setId("createMVCore1Group"); //$NON-NLS-1$
		paletteContainer.add(createDomain1CreationTool());
		paletteContainer.add(createController2CreationTool());
		paletteContainer.add(createAction3CreationTool());
		paletteContainer.add(createAttribute4CreationTool());
		paletteContainer.add(createMVCoreClass5CreationTool());
		paletteContainer.add(createPackage6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.Domain1CreationTool_title,
				MVCore.diagram.part.Messages.Domain1CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.Domain_2003));
		entry.setId("createDomain1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Domain_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.Controller2CreationTool_title,
				MVCore.diagram.part.Messages.Controller2CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.Controller_2002));
		entry.setId("createController2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Controller_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.Action3CreationTool_title,
				MVCore.diagram.part.Messages.Action3CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.Action_3001));
		entry.setId("createAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Action_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.Attribute4CreationTool_title,
				MVCore.diagram.part.Messages.Attribute4CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.Attribute_3002));
		entry.setId("createAttribute4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Attribute_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMVCoreClass5CreationTool() {
		ToolEntry entry = new ToolEntry(
				MVCore.diagram.part.Messages.MVCoreClass5CreationTool_title,
				MVCore.diagram.part.Messages.MVCoreClass5CreationTool_desc,
				null, null) {
		};
		entry.setId("createMVCoreClass5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Package_2004);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Package_3004);
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.Package6CreationTool_title,
				MVCore.diagram.part.Messages.Package6CreationTool_desc, types);
		entry.setId("createPackage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Package_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
