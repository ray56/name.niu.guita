package name.niu.guita.uisut.diagram.application;

import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * @generated
 */
public class DiagramEditorWorkbenchAdvisor extends WorkbenchAdvisor {
	/**
	 * @generated
	 */
	public static final String PERSPECTIVE_ID = "name.niu.guita.uisut.diagram.UISUTPerspective"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

	/**
	 * @generated
	 */
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);
	}

	/**
	 * @generated
	 */
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		return new DiagramEditorWorkbenchWindowAdvisor(configurer);
	}

}
