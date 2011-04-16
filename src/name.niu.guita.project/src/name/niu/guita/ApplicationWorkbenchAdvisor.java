package name.niu.guita;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;



public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	public static final String PERSPECTIVE_ID = "name.niu.guita.guitaPerspective1"; //$NON-NLS-1$
	public static final String PERSPECTIVE2_ID= "name.niu.guita.guitaPerspective2";

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }
    
	@Override
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
	
	// add this for ncf work
	public IAdaptable getDefaultPageInput(){
		return ResourcesPlugin.getWorkspace().getRoot();		
	}
	
	// add this for ncf work
	public void initialize(IWorkbenchConfigurer configurer) 
	{
		IDE.registerAdapters();
	}

}
