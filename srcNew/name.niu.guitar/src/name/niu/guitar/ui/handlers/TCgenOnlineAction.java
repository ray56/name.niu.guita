package name.niu.guitar.ui.handlers;

import java.nio.channels.ClosedByInterruptException;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.CoolBarManager;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.services.ISourceProviderService;

import name.niu.guitar.scriptengine.ScriptEngine;
import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDonePublisher;
import name.niu.guitar.scriptengine.interfaces.ITargetScriptExeDoneSubscriber;
import name.niu.guitar.ui.sourceProviders.CommandState;
import name.niu.guitar.ui.wizards.TestCaseGenWizard;
import name.niu.guitar.uisut.*;
import name.niu.guitar.uisut.diagram.edit.parts.CommonStateEditPart;
import name.niu.guitar.uisut.diagram.part.UisutDiagramEditor;
import name.niu.guitar.uisut.tcgen.*;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDonePublisher;
import name.niu.guitar.uisut.tcgen.interfaces.ITCDoneSubscriber;
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
	private TestCaseGen tcgen = null ;
	private ScriptEngine scriptEngine = null ;
	private Workbench workbench;
	private WorkbenchWindow workbenchWindown;
	private AbstractUIState selectTo = null ;
	private AbstractUIState selectFrom = null ;
	
	public void ChangeGenAndExe(String cur) {
		synchronized (genAndExeSync) {
			if (cur != null && !cur.equals(genAndExe)) {
				genAndExe = cur;
				// Set Button Visibility				
				commandStateService.toogleGenAndExeStatus(genAndExe);
				if ( genAndExe.equals(CommandState.GEN_AND_EXE_IN_STEPED)) {
					// Set Button Enableness
					IWorkbenchWindow iww = PlatformUI.getWorkbench().getActiveWorkbenchWindow() ;
					assert ( iww instanceof WorkbenchWindow ); 
					WorkbenchWindow ww = (WorkbenchWindow) iww ;
					assert ( iww == workbenchWindown );
					CoolBarManager cbm  = workbenchWindown.getCoolBarManager() ;	
					
					// set enable 
					IContributionItem demoGroup1 = cbm.find("name.niu.guitar.ui.toolbars.GuitarMainToolBar") ;	
					final CoolBar guitarCoolBar = cbm.getControl() ;
					Display.getDefault().syncExec(new Runnable() {
					    public void run() {
					    	guitarCoolBar.getItem(1).getControl().setEnabled(true);
					    	}
					    }); 
					
					
					
					IContributionItem continueButton = cbm.find(
							"name.niu.guitar.ui.toolbars.GuitarMainToolBar/continue") ;
					if ( continueButton instanceof CommandContributionItem) {
						((CommandContributionItem)continueButton).getCommand().getCommand().setHandler(null) ;
					}
				} else if ( genAndExe.equals(CommandState.GEN_AND_EXE_IN_STEPPING)) {
					// Set Button Enableness
					CoolBarManager cbm  = workbenchWindown.getCoolBarManager() ;						
					// set disable
					IContributionItem demoGroup1 = cbm.find("name.niu.guitar.ui.toolbars.GuitarMainToolBar") ;	//ToolBarContributionItem2
					final CoolBar guitarCoolBar = cbm.getControl() ;
					
					Display.getDefault().syncExec(new Runnable() {
					    public void run() {
					    	guitarCoolBar.getItem(1).getControl().setEnabled(false);
					    	}
					    }); 
					
					IContributionItem continueButton = cbm.find(
							"continue") ;
					if ( continueButton instanceof CommandContributionItem) {
						((CommandContributionItem)continueButton).getCommand().getCommand().setHandler(this) ;
					}
				} else {
					// Set Button Enableness
					CoolBarManager cbm  = workbenchWindown.getCoolBarManager() ;						
					// set disable
					IContributionItem demoGroup1 = cbm.find("name.niu.guitar.ui.toolbars.GuitarMainToolBar") ;	//ToolBarContributionItem2
					final CoolBar guitarCoolBar = cbm.getControl() ;
					
					Display.getDefault().syncExec(new Runnable() {
					    public void run() {
					    	guitarCoolBar.getItem(1).getControl().setEnabled(true);
					    	}
					    }); 					
				}

			}
		}
	}

	private Object doStart( ExecutionEvent event) throws ExecutionException 
	{
		click = new Semaphore(0) ;
			
		
		final IEditorInput editorInput = HandlerUtil.getActiveEditorChecked(event).getEditorInput();
		// set uisutFilePath
		final String uisutFilePath = TCgenOfflineAction.getCurrentInputString(event);
		
		// set stm	
		IEditorPart editorPart = HandlerUtil.getActiveEditorChecked(event) ;
		if ( editorPart instanceof UisutDiagramEditor == false ) {			
			ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE) ;
			return null ;
		}
		
		
		final TransactionalEditingDomain editingDomain = ((UisutDiagramEditor)editorPart).getEditingDomain() ;
		
		// set maxLoop and max Step
		TestCaseGenWizard wizard = new TestCaseGenWizard();
		WizardDialog wizardDialog = new WizardDialog(shell, wizard);
		int wizardResult = wizardDialog.open();
		if ( wizardResult == Window.CANCEL ) {
			return null ;
		}
		final int maxLoop = wizard.getMaxLoopCount();
		final int maxStep = wizard.getMaxStepCount();
		
		// set start and end
		final AbstractUIState astStart = this.selectFrom;
		final AbstractUIState astEnd = this.selectTo;
		final UIStatemachine stm ;
		if( astStart == null && astEnd == null ) {
			stm = (UIStatemachine ) ((UisutDiagramEditor)editorPart ).getDiagram().getElement();
		} else if ( astStart == null ){
			assert( astEnd.eContainer() instanceof UIStatemachine );
			stm = (UIStatemachine)astEnd.eContainer() ;
		} else if ( astEnd == null ){
			assert( astStart.eContainer() instanceof UIStatemachine );
			stm = (UIStatemachine)astStart.eContainer() ;
		} else if ( astStart.eContainer().equals( astEnd.eContainer()) ){
				stm = (UIStatemachine)astEnd.eContainer() ;
		} else {
			return null ;
		}
		
		tcgen = new TestCaseGen();
		
		ScriptGen 		sptgen 	= new ScriptGen();		
		XlsGen 			xlsgen 	= new XlsGen();
		scriptEngine = new ScriptEngine();
		
		tcgen.addSubscriber(sptgen);
		tcgen.addSubscriber(xlsgen);
		tcgen.addSubscriber(scriptEngine);
		

		
		job = new Job("GenAndExe") {
			protected IStatus run(IProgressMonitor monitor) {
				final IProgressMonitor m = monitor ;
				// add listener to scritpEngine				
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
							
							//
							if( m.isCanceled()) {
								scriptEngine.stop() ;
								tcgen.stopGen() ;
							}							
							// wait for button clicked
							try {
								// change state
								ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPED ) ;
								click.acquire() ;
							} catch (InterruptedException e) {
								e.printStackTrace();
							} 
						}
					}

					@Override
					public void OnSEStoped(ITargetScriptExeDonePublisher p) {
						ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE ) ;						
					}					
				});		
				
				tcgen.addSubscriber(  new ITCDoneSubscriber() {

					@Override
					public void OnUtifFileDone(String uitfFileParth) {};
					@Override
					public void OnTestCaseDone(name.niu.guitar.uitf.TestCase tc) {
						// set color
						editingDomain.getCommandStack().execute( new RecordingCommand(editingDomain) {
							@Override
							protected void doExecute() {
								Iterator<EObject> it = stm.eAllContents() ;
								while( it.hasNext()){
									EObject eo = it.next() ;
									if ( eo instanceof UIElement ) {
										((UIElement)eo).setHighlight("none");
									}									
								}								
							}				
						});
					}
					@Override
					public void OnTCGStoped(ITCDonePublisher tcg) {
						ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE ) ;
					}					
				});
				
				monitor.beginTask("Gen And Exe!!!",IProgressMonitor.UNKNOWN );
				tcgen.generateTestCase(uisutFilePath, stm, maxLoop, maxStep, astStart, astEnd);	
				
				// check running or monitor cancelling
				while ( tcgen.getStatus().equals( TestCaseGen.STATUS_RUNNING ) && 
						! monitor.isCanceled()) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE) ;
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
		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPPING) ;	
		job.schedule(500);
		
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
		click.release(3) ;		
		scriptEngine.stop() ;
		tcgen.stopGen() ;
		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE );
		//click.release();
//		if ( job != null){
//			job.cancel();
//			job = null ;
//		}		
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

		workbench = (Workbench)PlatformUI.getWorkbench() ;
		if ( workbenchWindown instanceof WorkbenchWindow == false ){
			System.out.println( "not WorkbenchWindwo!") ;
		}
		workbenchWindown = (WorkbenchWindow)workbench.getActiveWorkbenchWindow() ;

		//
		
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
		} else if (subCmd.equals("SELECTFROM")) {
			ISelection selection = HandlerUtil.getCurrentSelection(event);
			if ( selection instanceof IStructuredSelection){
				IStructuredSelection ss = (IStructuredSelection)selection ;
				Object selObj = ss.getFirstElement();
				if ( selObj instanceof GraphicalEditPart ){
					CommonStateEditPart ep = (CommonStateEditPart)selObj;
					return doSelectFrom ( ep );
				}
			}
			return null ;
		} else if (subCmd.equals("SELECTTO")) {
			ISelection selection = HandlerUtil.getCurrentSelection(event);
			if ( selection instanceof IStructuredSelection){
				IStructuredSelection ss = (IStructuredSelection)selection ;
				Object selObj = ss.getFirstElement();
				if ( selObj instanceof GraphicalEditPart){
					CommonStateEditPart ep = (CommonStateEditPart)selObj;
					return doSelectTo ( ep );
				}
			}
			return null ;
		} else {
			assert(false);
		}		
		return null ;
	}

	private Object doSelectTo( GraphicalEditPart to ) {
		
		EObject o =  ((View)to.getModel()).getElement();
		if ( o instanceof AbstractUIState ){
			final AbstractUIState s = (AbstractUIState)o ;
			final AbstractUIState oldTo = this.selectTo ;
			this.selectTo = s ;
			to.getEditingDomain().getCommandStack().execute( new RecordingCommand(to.getEditingDomain()) {
				@Override
				protected void doExecute() {
					if( oldTo != null ) {
						oldTo.setHighlight("to=false");
					}
					s.setHighlight("to=true");
				}				
			});
		}
		return null;
	}

	private Object doSelectFrom( GraphicalEditPart from ) {
		EObject o =  ((View)from.getModel()).getElement();
		if ( o instanceof AbstractUIState ){
			final AbstractUIState s = (AbstractUIState)o ;
			final AbstractUIState oldFrom = this.selectFrom ;
			this.selectFrom = s ;
			from.getEditingDomain().getCommandStack().execute( new RecordingCommand(from.getEditingDomain()) {
				@Override
				protected void doExecute() {
					if( oldFrom != null ) {
						oldFrom.setHighlight("from=false");
					}
					s.setHighlight("from=true");
				}				
			});
		}
		return null;
	}
}
