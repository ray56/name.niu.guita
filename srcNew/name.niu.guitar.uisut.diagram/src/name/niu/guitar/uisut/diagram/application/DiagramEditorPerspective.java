package name.niu.guitar.uisut.diagram.application;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @generated
 */
public class DiagramEditorPerspective implements IPerspectiveFactory {
	/**
	 * @generated NOT
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(DiagramEditorWorkbenchAdvisor.PERSPECTIVE_ID);
		
		// left: add navigation windows
		IFolderLayout left = layout.createFolder(
				"left", IPageLayout.LEFT, 0.2f, layout.getEditorArea());
		left.addView( IPageLayout.ID_RES_NAV) ;
		// leftBottom: outline
		IFolderLayout right = layout.createFolder(
				"leftBottom", IPageLayout.BOTTOM, 0.6f, "left"); //$NON-NLS-1$
		right.addView(IPageLayout.ID_OUTLINE);
		// editor bottom: property
		IFolderLayout bottomRight = layout.createFolder(
				"bottomRight", IPageLayout.BOTTOM, 0.6f, layout.getEditorArea()); //$NON-NLS-1$	 //$NON-NLS-2$
		bottomRight.addView(IPageLayout.ID_PROP_SHEET);

		// Add "new wizards".
		/*
		layout.addNewWizardShortcut("name.niu.guitar.ui.wizards.NewGuitarProject");
		layout.addNewWizardShortcut("name.niu.guita.ui.wizards.NewUISUTDiagramWizardID");		
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder") ;
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");
		*/
		

		// Add "show views".
		layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
	}
}
