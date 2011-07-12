package name.niu.guitar.ui.handlers;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.IMarkSelection;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.ui.progress.UIJob;

public class DemoHandler extends AbstractHandler {

	private IEditorPart editPart;
	private IWorkbenchPage page;
	
	
	private ISelection selection;
	private IStructuredSelection aIStructuredSelection;
	private ITextSelection aITextSelection;
	private IMarkSelection aIMarkSelection;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get contexes
		page 			= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
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
		
		
		
		Command command = event.getCommand() ;
		if ( command.getId().equals("name.niu.guitar.ui.commands.demo1") ) 
		{
			demo1(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo2")) {
			demo2(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo3")) {
			demo3(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo4")) {
			demo4(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo5")) {
			demo5(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo6")) {
			demo6(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo7")) {
			demo7(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo8")) {
			demo8(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo9")) {
			demo9(event);
		} else if (command.getId().equals("name.niu.guitar.ui.commands.demo10")) {
			demo10(event);
		} else {
			
		}
		return null;
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
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
	}
	
	private void demo7(ExecutionEvent event) {
		
	}
	
	private void demo8(ExecutionEvent event) {
		
	}
	
	private void demo9(ExecutionEvent event) {
		
	}
	
	private void demo10(ExecutionEvent event) {
		
	}
	
	private void demo11(ExecutionEvent event) {
		
	}
	
	private void demo12(ExecutionEvent event) {
		
	}

}
