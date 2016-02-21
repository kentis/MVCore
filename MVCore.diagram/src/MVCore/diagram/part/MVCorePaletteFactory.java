package MVCore.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

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
		paletteContainer.add(createPackage5CreationTool());
		paletteContainer.add(createView6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MVCore.diagram.part.Messages.Domain1CreationTool_title,
				MVCore.diagram.part.Messages.Domain1CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.Domain_2006));
		entry.setId("createDomain1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Domain_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MVCore.diagram.part.Messages.Controller2CreationTool_title,
				MVCore.diagram.part.Messages.Controller2CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.Controller_2005));
		entry.setId("createController2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Controller_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MVCore.diagram.part.Messages.Action3CreationTool_title,
				MVCore.diagram.part.Messages.Action3CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.Action_3005));
		entry.setId("createAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Action_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MVCore.diagram.part.Messages.Attribute4CreationTool_title,
				MVCore.diagram.part.Messages.Attribute4CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.Attribute_3006));
		entry.setId("createAttribute4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Attribute_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage5CreationTool() {
		ToolEntry entry = new ToolEntry(
				MVCore.diagram.part.Messages.Package5CreationTool_title,
				MVCore.diagram.part.Messages.Package5CreationTool_desc, null,
				null) {
		};
		entry.setId("createPackage5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createView6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Package_2007);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Package_3008);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.Node_2008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MVCore.diagram.part.Messages.View6CreationTool_title,
				MVCore.diagram.part.Messages.View6CreationTool_desc, types);
		entry.setId("createView6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.Package_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
