package MVCore.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
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
		paletteRoot.add(createCreate1Group());
		paletteRoot.add(createMisreferencedtools2Group());
	}

	/**
	 * Creates "Create" palette tool group
	 * @generated
	 */
	private PaletteContainer createCreate1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				MVCore.diagram.part.Messages.Create1Group_title);
		paletteContainer.setId("createCreate1Group"); //$NON-NLS-1$
		paletteContainer.add(createController1CreationTool());
		paletteContainer.add(createDomainclass2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "-- Mis-referenced tools --" palette tool group
	 * @generated
	 */
	private PaletteContainer createMisreferencedtools2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				MVCore.diagram.part.Messages.Misreferencedtools2Group_title);
		paletteContainer.setId("createMisreferencedtools2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(MVCore.diagram.part.Messages.Misreferencedtools2Group_desc);
		paletteContainer.add(createEPackage1CreationTool());
		paletteContainer.add(createEClass2CreationTool());
		paletteContainer.add(createEAnnotationreference3CreationTool());
		paletteContainer.add(createAssociation4CreationTool());
		paletteContainer.add(createAggregation5CreationTool());
		paletteContainer.add(createGeneralization6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.Controller1CreationTool_title,
				null,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.EControllerClass_2001));
		entry.setId("createController1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.EControllerClass_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainclass2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.Domainclass2CreationTool_title,
				null,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.EDomainClass_2003));
		entry.setId("createDomainclass2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.EDomainClass_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEPackage1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.EPackage_2004);
		types.add(MVCore.diagram.providers.MVCoreElementTypes.EPackage_3007);
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.EPackage1CreationTool_title,
				MVCore.diagram.part.Messages.EPackage1CreationTool_desc, types);
		entry.setId("createEPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.EPackage_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEClass2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				MVCore.diagram.part.Messages.EClass2CreationTool_title,
				MVCore.diagram.part.Messages.EClass2CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.EClass_3006));
		entry.setId("createEClass2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.EClass_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEAnnotationreference3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				MVCore.diagram.part.Messages.EAnnotationreference3CreationTool_title,
				MVCore.diagram.part.Messages.EAnnotationreference3CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.EAnnotationReferences_4002));
		entry.setId("createEAnnotationreference3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.EAnnotationReferences_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				MVCore.diagram.part.Messages.Association4CreationTool_title,
				MVCore.diagram.part.Messages.Association4CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.EReference_4001));
		entry.setId("createAssociation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.EReference_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregation5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				MVCore.diagram.part.Messages.Aggregation5CreationTool_title,
				MVCore.diagram.part.Messages.Aggregation5CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.EReference_4003));
		entry.setId("createAggregation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.EReference_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				MVCore.diagram.part.Messages.Generalization6CreationTool_title,
				MVCore.diagram.part.Messages.Generalization6CreationTool_desc,
				Collections
						.singletonList(MVCore.diagram.providers.MVCoreElementTypes.EClassESuperTypes_4004));
		entry.setId("createGeneralization6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MVCore.diagram.providers.MVCoreElementTypes
				.getImageDescriptor(MVCore.diagram.providers.MVCoreElementTypes.EClassESuperTypes_4004));
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

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
