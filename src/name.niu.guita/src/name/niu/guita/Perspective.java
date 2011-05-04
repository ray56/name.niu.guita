package name.niu.guita;


import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ApplicationWorkbenchAdvisor.PERSPECTIVE_ID);
		
		// add navigation windows
		IFolderLayout left = layout.createFolder(
				"left", IPageLayout.LEFT, 0.2f, layout.getEditorArea());
		left.addView( "name.niu.guita.guitaNavigatorView") ;
		
		
		
		IFolderLayout right = layout.createFolder(
				"right", IPageLayout.RIGHT, 0.6f, layout.getEditorArea()); //$NON-NLS-1$
		right.addView(IPageLayout.ID_OUTLINE);
		
		IFolderLayout bottomRight = layout.createFolder(
				"bottomRight", IPageLayout.BOTTOM, 0.6f, "right"); //$NON-NLS-1$	 //$NON-NLS-2$
		bottomRight.addView(IPageLayout.ID_PROP_SHEET);
		

		
		
		// Add "new wizards".
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder") ;
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");
		
		// Add "show views".
		layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
	}

}
