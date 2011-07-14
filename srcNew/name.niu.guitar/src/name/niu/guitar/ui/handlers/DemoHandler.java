package name.niu.guitar.ui.handlers;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import name.niu.guitar.ui.sourceProviders.CommandState;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.IMarkSelection;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.menus.AbstractContributionFactory;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.menus.UIElement;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.services.IServiceLocator;
import org.eclipse.ui.services.ISourceProviderService;

/**
 * @author Ray
 *
 */
public class DemoHandler extends AbstractHandler 
	implements
		IElementUpdater 
{

	private IEditorPart editPart;
	private IWorkbenchPage page;
	private IWorkbench workbench ;
	private IWorkbenchWindow workbenchwindow ;
	
	
	private ISelection selection;
	private IStructuredSelection aIStructuredSelection;
	private ITextSelection aITextSelection;
	private IMarkSelection aIMarkSelection;
	private IWorkspace ws;
	private Command command;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get contexes
		
		workbench 		= PlatformUI.getWorkbench() ;
		workbenchwindow	= PlatformUI.getWorkbench().getActiveWorkbenchWindow() ;
		page 			= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ws 				= ResourcesPlugin.getWorkspace();
		try{
			
			editPart 		= HandlerUtil.getActiveEditorChecked(event);			
		} catch (Exception e ) {
			e.printStackTrace() ;
		}
		selection = HandlerUtil.getCurrentSelectionChecked(event);
		if ( selection instanceof IStructuredSelection ) {
			aIStructuredSelection = (IStructuredSelection) selection;			
		} else if ( selection instanceof ITextSelection ) {
			aITextSelection = (ITextSelection) selection;			
		} else if ( selection instanceof IMarkSelection ) {
			aIMarkSelection = (IMarkSelection) selection;
		}
		
		
		
		command = event.getCommand();
		String [] idSegs = command.getId().split("\\.") ;
		String lastSeg = idSegs[idSegs.length - 1] ;
		Method method;
		try {
			method = this.getClass().getDeclaredMethod(lastSeg, ExecutionEvent.class );
			method.invoke(this,event);
		} catch (SecurityException e) {			
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null ;
		
//		if ( command.getId().equals("name.niu.guitar.ui.commands.demo1") ) 
//		{
//			demo1(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo2")) {
//			demo2(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo3")) {
//			demo3(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo4")) {
//			demo4(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo5")) {
//			demo5(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo6")) {
//			demo6(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo7")) {
//			demo7(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo8")) {
//			demo8(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo9")) {
//			demo9(event);
//		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo10")) {
//			demo10(event);
//		} else {
//			
//		}
//		return null;
	}



	private void demo1(ExecutionEvent event) throws ExecutionException {
		HandlerUtil.getActiveEditorChecked(event).doSave( new NullProgressMonitor() ) ;
	}
	
	private void demo2(ExecutionEvent event)  {
		new UIJob("demo2: UIJob") {  
			public IStatus runInUIThread(IProgressMonitor monitor) {
				return Status.OK_STATUS;						
			}
		}.schedule();
	}

	private void demo3(ExecutionEvent event) {
		IRunnableWithProgress operation = new IRunnableWithProgress() {

			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				monitor.beginTask("Looooooong time op",
						IProgressMonitor.UNKNOWN);

				for (int i = 0; i < 30 && !monitor.isCanceled(); i++) {
					Thread.sleep(1000);
					monitor.worked(1);
				}
				monitor.done();
				if (monitor.isCanceled()) {
					System.out.print(" end by cancled!");
				}
			}

		};
		try {
			// Style1
			new ProgressMonitorDialog(HandlerUtil.getActiveShell(event)).run(
					true, true, operation);
			// Style2
			HandlerUtil.getActiveWorkbenchWindow(event).run(true, true,
					operation);
			// Style3
			IWorkbench wb = PlatformUI.getWorkbench();
			IProgressService ps = wb.getProgressService();
			ps.run(true, true, operation);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void demo4(ExecutionEvent event) {
		Job job = new Job("hahaha job") {
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Looooooong time op", 30);

				for (int i = 0; i < 30 && !monitor.isCanceled(); i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					monitor.worked(1);
				}
				monitor.done();
				if (monitor.isCanceled()) {
					System.out.print(" end by cancled!");
					return org.eclipse.core.runtime.Status.CANCEL_STATUS;
				}
				System.out.println("hello hahaha");
				return org.eclipse.core.runtime.Status.OK_STATUS;
			}
		};
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					System.out.println("Job completed successfully");
				} else {
					System.out.println("Job did not complete successfully");
				}
			}
		});
		job.setPriority(Job.SHORT);
		job.setUser(true);
		job.schedule();

	}
	
	private void demo5(ExecutionEvent event) {
		File fileToOpen = new File("C:\\a.txt");		 
		if (fileToOpen.exists() && fileToOpen.isFile()) {
		    IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
		    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		 
		    try {
		        IDE.openEditorOnFileStore( page, fileStore );
		    } catch ( PartInitException e ) {
		        e.printStackTrace() ;
		    }
		} else {
		    //Do something if the file does not exist
		}
	}
	
	// open selected file in navitation view
	private void demo6(ExecutionEvent event) {
		
		IFile file = null ;
		
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		if ( this.selection instanceof IStructuredSelection ) {
			Object s = this.aIStructuredSelection.getFirstElement() ;
			if ( s instanceof IResource ) {
				if ( s instanceof IFile ) {
					file = (IFile) s ;
				}
			}
		}
		
		IEditorDescriptor desc = PlatformUI.getWorkbench().
		        getEditorRegistry().getDefaultEditor(file.getName());
		

		try {
			
			page.openEditor(new FileEditorInput(file), desc.getId());
			// the same
			IDE.openEditor(page, new FileEditorInput(file), desc.getId() );
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
	}
	
	// create project and open a a file by file dialog
	private void demo7(ExecutionEvent event)  {
		try {
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			IProject project = ws.getRoot().getProject("External Files");
			if (!project.exists())
			    project.create(null);
			if (!project.isOpen())
			    project.open(null);
			Shell shell = HandlerUtil.getActiveShellChecked(event) ;
			String name = new FileDialog(shell, SWT.OPEN).open();
			if (name == null)
			    return;
			IPath location = new Path(name);
			IFile file = project.getFile(location.lastSegment());
			file.createLink(location, IResource.NONE, null);
			IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage();
			if (page != null)
			    IDE.openEditor(page, file);
		} catch (PartInitException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	// open file dialog
	private void demo8(ExecutionEvent event) {
		try {
			Shell shell = HandlerUtil.getActiveShellChecked(event) ;
			String name = new FileDialog(shell, SWT.OPEN).open();
			System.out.println(name);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	private void demo9(ExecutionEvent event) {
		PlatformUI.getWorkbench().getHelpSystem().setHelp( (Composite)null/*some control*/, 
        "org.eclipse.faq.examples.books_view");
	}
	
	
	/**
	 * 
	 */
	private void demo10(ExecutionEvent event) {
		Command command = event.getCommand();
		try {
			boolean oldVal = HandlerUtil.toggleCommandState(command);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	private void demo11(ExecutionEvent event) {
		IMenuService menuService 
			= (IMenuService) PlatformUI.getWorkbench().getService(IMenuService.class);	
		
		
		ICommandService commandService 
			= (ICommandService) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(ICommandService.class);
		Command command = commandService.getCommand("z.ex.dropdown.radio");
		
		IHandlerService handlerService 
			= (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
		IHandler handler = new AbstractHandler() {
			  public Object execute(ExecutionEvent event)
			          throws ExecutionException {
				  		
				  System.out.println("Eat that Taco");			    
				  return null;
			  }
			};
		handlerService.activateHandler("z.ex.view.keybindings.eatTaco", handler);
		try {
			handlerService.executeCommand("z.ex.view.keybindings.eatTaco", null);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	private void demo12(ExecutionEvent event) {
		System.out.println(EcoreUtil.generateUUID());
	}

	// enable demo14
	private void demo13(ExecutionEvent event) {
		ISourceProviderService sourceProviderService = (ISourceProviderService) HandlerUtil
				.getActiveWorkbenchWindow(event).getService(
						ISourceProviderService.class);
		CommandState commandStateService = (CommandState) sourceProviderService
				.getSourceProvider(CommandState.GEN_AND_EXE_STATUS);
		commandStateService.toogleGenAndExeStatus(CommandState.GEN_AND_EXE_IN_STEPED);
	}

	private void demo14(ExecutionEvent event) {
		MessageDialog.openInformation(
				HandlerUtil.getActiveShell(event), "Guitar", "MessageDialog.openInformation");
		JOptionPane.showMessageDialog(null, "JOptionPane.showMessageDialog");
	}
	
	
	
	@Override
	public void updateElement(UIElement element, Map parameters) {
		element.setChecked( true );		
	}

}
