package name.niu.guita;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective2 implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ApplicationWorkbenchAdvisor.PERSPECTIVE2_ID);

		IFolderLayout right = layout.createFolder(
				"right", IPageLayout.RIGHT, 0.2f, layout.getEditorArea());
		right.addView( "name.niu.guita.guitaNavigatorView") ;



	}

}
