package name.niu.guitar.ui.handlers;

import java.util.concurrent.Semaphore;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.services.ISourceProviderService;

import name.niu.guitar.scriptengine.ScriptEngine;
import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDoneSubscriber;
import name.niu.guitar.ui.sourceProviders.CommandState;
import name.niu.guitar.uisut.*;
import name.niu.guitar.uisut.diagram.part.UisutDiagramEditor;
import name.niu.guitar.uisut.tcgen.*;
import name.niu.guitar.uitf.scriptgen.ScriptGen;
import name.niu.guitar.uitf.xlsgen.XlsGen;

public class TCgenOnlineAction extends AbstractHandler {
	
	
	private Shell shell = null ;
	private String genAndExe = CommandState.GEN_AND_EXE_IN_IDLE ;
	// sync variable for access genAndExe
	private Object genAndExeSync = new String[0] ;
	// semaphore for user click
	private Semaphore click = new Semaphore(1) ;
	
	
	private CommandState commandStateService = null ;
	private Job job;
	
	public void ChangeGenAndExe(String cur) {
		synchronized (genAndExeSync) {
			if (cur != null && !cur.equals(genAndExe)) {
				genAndExe = cur;
				// Set Button				
				commandStateService.toogleGenAndExeStatus(genAndExe);
			}
		}
	}

	private Object doStart( ExecutionEvent event) throws ExecutionException 
	{
		click = new Semaphore(1) ;
		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPPING) ;
		try {
			click.acquire() ;
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		final IEditorInput editorInput = HandlerUtil.getActiveEditorChecked(event).getEditorInput();
		// set uisutFilePath
		final String uisutFilePath = TCgenOfflineAction.getCurrentInputString(event);
		
		// set stm	
		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event) ;
		if ( editorPart instanceof UisutDiagramEditor == false ) {			
			ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE) ;
			return null ;
		}
		final UIStatemachine stm = (UIStatemachine ) 
			((UisutDiagramEditor)editorPart ).getDiagram().getElement();
		
		final TransactionalEditingDomain editingDomain = ((UisutDiagramEditor)editorPart).getEditingDomain() ;
		
		
		// set maxLoop
		final int maxLoop = 2;
		
		// set maxStep
		final int maxStep = 20;
		
		// set start and end
		final AbstractUIState astStart = null;
		final AbstractUIState astEnd = null;
		
		// add addSubscriber
		final TestCaseGen 	tcgen 	= new TestCaseGen();
		
		ScriptGen 		sptgen 	= new ScriptGen();		
		XlsGen 			xlsgen 	= new XlsGen();
		ScriptEngine	scriptEngine = new ScriptEngine();
		
		tcgen.addSubscriber(sptgen);
		tcgen.addSubscriber(xlsgen);
		tcgen.addSubscriber(scriptEngine);
		
		scriptEngine.addSubscriber( new ITargetScriptExeDoneSubscriber() {

			@Override
			public void OnTargetStatementDone(String[] executedUUID) {
				
				for ( String uuid : executedUUID ) {
					final EObject o = stm.eResource().getEObject( uuid ) ;
					if ( o instanceof AbstractUIState || o instanceof UITransition ){
						// set color
						editingDomain.getCommandStack().execute( new RecordingCommand(editingDomain) {

							@Override
							protected void doExecute() {
								((UIElement)o).setHighlight("bold_red");
							}							
						});
					}else {
						assert(false):"model changed?";
					}
					
					// change state
					ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPED ) ;
					
					// wait for button clicked
					try {
						click.acquire() ;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		});
		
		job = new Job("GenAndExe") {
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Gen And Exe!!!",IProgressMonitor.UNKNOWN );
				
				tcgen.generateTestCase(uisutFilePath, stm, maxLoop, maxStep, astStart, astEnd);
				
				monitor.done();
				if (monitor.isCanceled()) {
					return org.eclipse.core.runtime.Status.CANCEL_STATUS;
				}
				return org.eclipse.core.runtime.Status.OK_STATUS;
			}
		};
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					// end GenAndExe 	
					job = null ;
					doExternalStop(true) ;	
					
				} else {
					job = null ;
					doExternalStop(false) ;					
				}
			}
		});	
		job.setPriority(Job.INTERACTIVE);
		job.setUser(true);
		job.schedule();
		
		return null;
	}

	private Object doContinue()
	{
		click.release() ;
		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPPING );
		return null ;
	}
	
	private Object doStop()   
	{
		click.release();
		if ( job != null){
			job.cancel();
			job = null ;
		}
		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE) ;
		return null ;
	}
	
	private void doExternalStop(boolean isNormallyCompleted )   
	{
		if ( isNormallyCompleted ){
			//MessageDialog.openInformation(shell,"Guitar","Completed!");
		} else {
			//MessageDialog.openInformation(shell,"Guitar","Canceled or Failed");
		}
		doStop() ;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		shell = HandlerUtil.getActiveShell(event);
		if ( commandStateService == null ) {
			ISourceProviderService sourceProviderService = (ISourceProviderService) HandlerUtil
					.getActiveWorkbenchWindow(event).getService(
							ISourceProviderService.class);
			commandStateService = (CommandState) sourceProviderService
					.getSourceProvider(CommandState.GEN_AND_EXE_STATUS);
		}

		String subCmd = event.getParameter("name.niu.guitar.ui.commands.GenOnline.subCmd") ;
		if ( subCmd.equals("START")){
			if ( !genAndExe.equals(CommandState.GEN_AND_EXE_IN_IDLE)){ 
				MessageDialog.openInformation(
					HandlerUtil.getActiveShell(event),
					"Guitar",
					"Already Started");
			} else {
				return doStart( event ) ;
			}
		} else if (subCmd.equals("CONTINUE")){
			return doContinue() ;
		} else if (subCmd.equals("STOP")) {
			return doStop() ;
		} else {
			assert(false);
		}		
		return null ;
	}
}
