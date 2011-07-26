package name.niu.guitar.ui.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import name.niu.guitar.scriptengine.ScriptEngine;
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
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IContributionItem;
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
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
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
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.WorkbenchWindow;
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
			//e.printStackTrace() ;
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
		commandStateService.toogleGenAndExeStatus("XXXXXX");
	}

	private void demo14(ExecutionEvent event) {
		MessageDialog.openInformation(
				HandlerUtil.getActiveShell(event), "Guitar", "MessageDialog.openInformation");
		JOptionPane.showMessageDialog(null, "JOptionPane.showMessageDialog");
	}
	
	private void demo15(ExecutionEvent event) {
		//IMenuManager mm = 
			IWorkbenchWindow iww = PlatformUI.getWorkbench().getActiveWorkbenchWindow() ;
			Workbench.getInstance().getActiveWorkbenchWindow() ;
			
			if ( iww instanceof WorkbenchWindow ) {
				WorkbenchWindow ww = (WorkbenchWindow) iww ;
				MenuManager mm = ww.getMenuBarManager() ;
				
				ww.getToolBarManager() ;
				ww.getToolBarManager2() ;
				ww.getCoolBarManager();
				ww.getCoolBarManager2();				
				ww.getMenuManager() ;
				ww.getMenuBarManager() ;				
				ww.getStatusLineManager();
				
				mm.getMenu();
				mm.find("name.niu.guitar.ui.menus.demo");// org.eclipse.jface.action.MenuManager
				mm.findUsingPath("name.niu.guitar.ui.menus.demo");
				mm.findMenuUsingPath("name.niu.guitar.ui.menus.demo");
				
				mm.findUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1");//org.eclipse.jface.action.MenuManager
				mm.findMenuUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1");
				
				mm.findUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1/demo1"); //org.eclipse.ui.menus.CommandContributionItem
				mm.findMenuUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1/demo1");//null
				
				mm.find("demoGroup1"); // null
				mm.findUsingPath("demoGroup1");
				mm.findMenuUsingPath("demoGroup1");
				
				MenuManager mm2 = (MenuManager ) mm.find("name.niu.guitar.ui.menus.demo") ;
				mm2.find("demoGroup1") ; // org.eclipse.jface.action.MenuManager
				
				
				IContributionItem demo1 = mm.findUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1/demo1") ;
				IContributionItem demoGroup1 = mm.findUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1") ;				

			}
			
	}
	
	// enable/disable/show/hide menu and menu item
	private void demo16(ExecutionEvent event) {
		IWorkbenchWindow iww = PlatformUI.getWorkbench().getActiveWorkbenchWindow() ;
		assert ( iww instanceof WorkbenchWindow ); 
		WorkbenchWindow ww = (WorkbenchWindow) iww ;
		MenuManager mm = ww.getMenuBarManager() ;		
		
		IContributionItem demoGroup1 = mm.findUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1") ;				
		if ( demoGroup1 instanceof MenuManager ) {
			int demo1_index = ((MenuManager)demoGroup1).indexOf("demo1") ;
			Menu menu_demoGroup1 = ((MenuManager)demoGroup1).getMenu() ;			
			//menu_demoGroup1.setEnabled( ! menu_demoGroup1.isEnabled());
//			MenuItem mi = menu_demoGroup1.getItem(1) ;
//			menu_demoGroup1.getItems()[1];
//			mi.setEnabled(!mi.getEnabled());
		}
		IContributionItem demo2 = mm.findUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1/demo2") ;
		demo2.setVisible(!demo2.isVisible());

		IContributionItem demo3 = mm.findUsingPath("name.niu.guitar.ui.menus.demo/demoGroup1/demo3") ;
		if( demo3 instanceof CommandContributionItem) {
			// cannot get MenuItem to disable , cannot set Command disabled,
			// so set Handler to null to disable the menu item.
			((CommandContributionItem)demo3).getCommand().getCommand().setHandler( null );
		}
//		demo3.update();
//		demo2.update();
//		demoGroup1.update() ;
//		mm.updateAll(true);
	}
	
	private void demo17(ExecutionEvent event) {
			Properties property = new Properties();
			// read from outside
			try {			
				property.load(new FileInputStream("C:\\scriptengine.properties"));
				property.getProperty("scriptInterpreter_scriptFile");
				property.getProperty("scriptInterpreter_commandLine");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// read by ResourceBundle
			ResourceBundle rb = ResourceBundle.getBundle("config/scriptengine");
			rb.getString("scriptInterpreter_scriptFile");
			rb.getString("scriptInterpreter_commandLine");
			
			// read by class
			InputStream in1 = ScriptEngine.class.getResourceAsStream("/config/scriptengine.properties");
			try {
				property.load(in1);
				property.getProperty("scriptInterpreter_scriptFile");
				property.getProperty("scriptInterpreter_commandLine");
			} catch (IOException e) {
				e.printStackTrace();
			}
			// read by classLoader
			InputStream in2 = ScriptEngine.class.getClassLoader().getResourceAsStream("config/scriptengine.properties");
			try {
				property.load(in2);
				property.getProperty("scriptInterpreter_scriptFile");
				property.getProperty("scriptInterpreter_commandLine");
			} catch (IOException e) {
				e.printStackTrace();
			}		
	}
	private void demo18(ExecutionEvent event) {
		Platform.getInstallLocation();
		Platform.getInstanceLocation();
		ResourcesPlugin.getWorkspace().getRoot().
			findMember("platform:/resource/SandBox1/RGB.uisut").
				getLocation().toOSString();
		
	}
	// how many URI
	private void demo19(ExecutionEvent event) {
		URI uri1 = URI.createURI("schema://username:password@hostname:portnumber/path1/path2/path3/file1.2.3.extension#fragment1");
		String [] uri1_item = { 
				uri1.device() , uri1.devicePath(), uri1.fileExtension(),
				uri1.fragment(),uri1.lastSegment(),uri1.path(),uri1.port(),uri1.query()};
		System.out.println(uri1_item ) ;
		
		org.eclipse.emf.common.util.URI
			uri2 = URI.createURI( "/C:/a/") ;
		String [] uri2_item = { 
				uri2.device() , uri2.devicePath(), uri2.fileExtension(),
				uri2.fragment(),uri2.lastSegment(),uri2.path(),uri2.port(),uri2.query()};
		System.out.println(uri2_item ) ;
		
		URI uri3 = uri2.resolve(uri2) ;
		String [] uri3_item = { 
				uri3.device() , uri3.devicePath(), uri3.fileExtension(),
				uri3.fragment(),uri3.lastSegment(),uri3.path(),uri3.port(),uri3.query()};
		System.out.println(uri3_item ) ;
		
		
	}
	// how many Resource
	private void demo20(ExecutionEvent event) {
		
		// convert emf resource to eclipse resource 
		org.eclipse.emf.ecore.resource.Resource 
			emfResource = null ;
		org.eclipse.emf.common.util.URI
			emfURI = emfResource.getURI();
		String path = emfURI.toPlatformString(false);
		org.eclipse.core.resources.IResource 
			coreResource = ResourcesPlugin.getWorkspace().getRoot().findMember(path);
		// convert eclipse resource to emf resource
		String uri2 = coreResource.getFullPath().toOSString() ;		
		org.eclipse.emf.common.util.URI
			emfURI2 =  URI.createPlatformResourceURI(uri2,false);
		org.eclipse.emf.ecore.resource.Resource
			emfResource2 = new ResourceSetImpl().getResource(emfURI2, false);
		

		
	}
	
	
	private void demo21(ExecutionEvent event) {
		//
		ResourceSet trgtResourceSet = new ResourceSetImpl();
		// register extension style 1
		trgtResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uitf", new XMIResourceFactoryImpl());
		// register extension style 2
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uift", new XMIResourceFactoryImpl());
		// retister extension style 3 : extension point = "org.eclipse.emf.ecore.extension_parser"
		
		URI trgtURI = URI.createURI("");
		org.eclipse.emf.ecore.resource.Resource
			trgtResource = trgtResourceSet.createResource(trgtURI);
	}
		
	// how manu commands
	private void demo22(ExecutionEvent event) {
		// eclipse ui command
		org.eclipse.core.commands.Command 
			coreCommand ;		
		
		// emf common command
		//org.eclipse.emf.common.command.Command
		//org.eclipse.emf.common.command.AbstractCommand
		//org.eclipse.emf.common.command.CompoundCommand
		org.eclipse.emf.common.command.Command
			emfCommand ; 
		
		// emf eit command		
		//org.eclipse.emf.edit.command.CopyCommand, AddCommand,DeleteCommand,RemoveCommand,SetCommand...
		
		// emf edit domain
		EditingDomain editingDomain = null ;
		editingDomain.getCommandStack().execute(   
				 SetCommand.create(editingDomain, null, null,null ));  
		
		
		//org.eclipse.emf.common.command.CommandStack
		
		// gef also have  command and commandStack, maybe proxy/delegate of emf command
		// gef's commands are related to edit pollicies. there's a little of trouble with emf and gef commands' coexist. 
		//org.eclipse.gef.commands.CommandStack
		
		// gef and gmf request
		//org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest
		//org.eclipse.gef.requests.CreateRequest
		//org.eclipse.gef.Request
		
		// gmf commands
		//org.eclipse.gmf.runtime.common.core.command.ICommand
		//org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand
		
		
	}
	
	// eclipse adapter and emf adapter
	private void demo23(ExecutionEvent event) {

//		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
//		factories.add(new UisutItemProviderAdapterFactory());
//		factories.add(new ResourceItemProviderAdapterFactory());
//		factories.add(new ReflectiveItemProviderAdapterFactory());
//		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(factories);
//
//IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(item, IItemLabelProvider.class);
//labelProvider.getImage(item)
//
//=============================================
//
//public class List implements IAdaptable { 
//	public Object getAdapter(Class adapter) { 
//    		return Platform.getAdapterManager().getAdapter(this, adapter); 
//	} 
//}
//// or List extends PlatformObject
//
//
//public class NodeListFactory implements IAdapterFactory {
//	public Object getAdapter(Object list, Class clazz) { 
//		if (clazz == Node.class && list instanceof List) { 
//		...
//		return new Node();
//	}
//}
//Platform.getAdapterManager().registerAdapters(   new NodeListFactory(), List.class );
//
//List list = new List();
//...
//Node node = (Node) list.getAdapter(Node.class)
	}
	@Override
	public void updateElement(UIElement element, Map parameters) {
		element.setChecked( true );		
	}

}
