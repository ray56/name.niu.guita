package name.niu.guita.project;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.jface.action.MenuManager;  

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private ActionFactory.IWorkbenchAction lockToolBarAction;
	private ActionFactory.IWorkbenchAction toggleCoolbarAction;
	
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }
    
    protected void makeActions(IWorkbenchWindow window) {
		toggleCoolbarAction = ActionFactory.TOGGLE_COOLBAR.create(window);
		register(toggleCoolbarAction);
		lockToolBarAction = ActionFactory.LOCK_TOOL_BAR.create(window);
		register(lockToolBarAction);
		
		register(ActionFactory.CLOSE.create(window));
		register(ActionFactory.CLOSE_ALL.create(window));
		register(ActionFactory.SAVE.create(window));
		register(ActionFactory.SAVE_AS.create(window));
		register(ActionFactory.SAVE_ALL.create(window));
		register(ActionFactory.QUIT.create(window));
		register(ActionFactory.UNDO.create(window));
		register(ActionFactory.REDO.create(window));
		register(ActionFactory.CUT.create(window));
		register(ActionFactory.COPY.create(window));
		register(ActionFactory.PASTE.create(window));
		register(ActionFactory.DELETE.create(window));
		register(ActionFactory.SELECT_ALL.create(window));
		register(ActionFactory.OPEN_NEW_WINDOW.create(window));
		register(ActionFactory.PRINT.create(window)); 	
		register(ActionFactory.NEW.create(window));
    }

    protected void fillMenuBar(IMenuManager menuBar) {
		
    	{
			IMenuManager menuX = new MenuManager( Messages.ApplicationMenuName_File, IWorkbenchActionConstants.M_FILE);

			menuX.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
			
			menuX.add(getAction(ActionFactory.NEW.getId()));
			
			{
				IMenuManager menuXX = new MenuManager( Messages.ApplicationMenuName_New, "new");
				
				menuXX.add(new GroupMarker(	IWorkbenchActionConstants.MB_ADDITIONS));
				
				menuX.add(menuXX);
			}

			menuX.add(new Separator());

			menuX.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));

			menuX.add(new Separator());

			menuX.add(getAction(ActionFactory.CLOSE.getId()));

			menuX.add(getAction(ActionFactory.CLOSE_ALL.getId()));

			menuX.add(new Separator());

			menuX.add(getAction(ActionFactory.SAVE.getId()));

			menuX.add(getAction(ActionFactory.SAVE_AS.getId()));

			menuX.add(getAction(ActionFactory.SAVE_ALL.getId()));

			menuX.add(new Separator());

			menuX.add(getAction(ActionFactory.QUIT.getId()));

			menuX.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
			menuBar.add(menuX);
		}
    }
}
