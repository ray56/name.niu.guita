package name.niu.guitar.uisut.diagram.part;

import java.util.Collections;
import java.util.List;

import name.niu.guitar.uisut.diagram.providers.UisutElementTypes;

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
public class UisutPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createUisut1Group());
	}

	/**
	 * Creates "uisut" palette tool group
	 * @generated
	 */
	private PaletteContainer createUisut1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Uisut1Group_title);
		paletteContainer.setId("createUisut1Group"); //$NON-NLS-1$
		paletteContainer.add(createStateMachine1CreationTool());
		paletteContainer.add(createCommonState2CreationTool());
		paletteContainer.add(createInitialState3CreationTool());
		paletteContainer.add(createFinalState4CreationTool());
		paletteContainer.add(createUITransition5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateMachine1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.StateMachine1CreationTool_title,
				Messages.StateMachine1CreationTool_desc,
				Collections
						.singletonList(UisutElementTypes.UIStatemachine_2004));
		entry.setId("createStateMachine1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UisutElementTypes
				.getImageDescriptor(UisutElementTypes.UIStatemachine_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCommonState2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CommonState2CreationTool_title,
				Messages.CommonState2CreationTool_desc,
				Collections.singletonList(UisutElementTypes.CommonState_2001));
		entry.setId("createCommonState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UisutElementTypes
				.getImageDescriptor(UisutElementTypes.CommonState_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialState3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InitialState3CreationTool_title,
				Messages.InitialState3CreationTool_desc,
				Collections.singletonList(UisutElementTypes.InitialState_2002));
		entry.setId("createInitialState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UisutElementTypes
				.getImageDescriptor(UisutElementTypes.InitialState_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalState4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FinalState4CreationTool_title,
				Messages.FinalState4CreationTool_desc,
				Collections.singletonList(UisutElementTypes.FinalState_2003));
		entry.setId("createFinalState4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UisutElementTypes
				.getImageDescriptor(UisutElementTypes.FinalState_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUITransition5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.UITransition5CreationTool_title,
				Messages.UITransition5CreationTool_desc,
				Collections.singletonList(UisutElementTypes.UITransition_4001));
		entry.setId("createUITransition5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UisutElementTypes
				.getImageDescriptor(UisutElementTypes.UITransition_4001));
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
