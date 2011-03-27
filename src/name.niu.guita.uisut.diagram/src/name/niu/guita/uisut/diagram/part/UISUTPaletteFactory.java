package name.niu.guita.uisut.diagram.part;

import java.util.Collections;
import java.util.List;

import name.niu.guita.uisut.diagram.providers.UISUTElementTypes;

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
public class UISUTPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createUISUTModel1Group());
	}

	/**
	 * Creates "UISUTModel" palette tool group
	 * @generated
	 */
	private PaletteContainer createUISUTModel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.UISUTModel1Group_title);
		paletteContainer.setId("createUISUTModel1Group"); //$NON-NLS-1$
		paletteContainer.add(createUIState1CreationTool());
		paletteContainer.add(createUITransition2CreationTool());
		paletteContainer.add(createInitialState3CreationTool());
		paletteContainer.add(createFinalState4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUIState1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.UIState1CreationTool_title,
				Messages.UIState1CreationTool_desc,
				Collections.singletonList(UISUTElementTypes.UIState_2001));
		entry.setId("createUIState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UISUTDiagramEditorPlugin
				.findImageDescriptor("/name.niu.guita.uisut.model.edit/icons/niu/State16.png")); //$NON-NLS-1$
		entry.setLargeIcon(UISUTDiagramEditorPlugin
				.findImageDescriptor("/name.niu.guita.uisut.model.edit/icons/niu/State32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUITransition2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.UITransition2CreationTool_title,
				Messages.UITransition2CreationTool_desc,
				Collections.singletonList(UISUTElementTypes.UITransition_4001));
		entry.setId("createUITransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UISUTDiagramEditorPlugin
				.findImageDescriptor("/name.niu.guita.uisut.model.edit/icons/niu/Tran16.png")); //$NON-NLS-1$
		entry.setLargeIcon(UISUTDiagramEditorPlugin
				.findImageDescriptor("/name.niu.guita.uisut.model.edit/icons/niu/Tran32.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialState3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InitialState3CreationTool_title,
				Messages.InitialState3CreationTool_desc,
				Collections.singletonList(UISUTElementTypes.InitialState_2002));
		entry.setId("createInitialState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UISUTElementTypes
				.getImageDescriptor(UISUTElementTypes.InitialState_2002));
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
				Collections.singletonList(UISUTElementTypes.FinalState_2003));
		entry.setId("createFinalState4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UISUTElementTypes
				.getImageDescriptor(UISUTElementTypes.FinalState_2003));
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
