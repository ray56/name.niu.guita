package name.niu.guitar.ui.handlers;

import java.nio.channels.ClosedByInterruptException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
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

import name.niu.guitar.config.Config;
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
import name.niu.guitar.uitf.Statement;
import name.niu.guitar.uitf.TestCase;
import name.niu.guitar.uitf.scriptgen.ScriptGen;
import name.niu.guitar.uitf.xlsgen.XlsGen;

public class TCgenOnlineAction extends AbstractHandler {
	
	
	/**
	 * event queue of the onlien thread 
	 * contains start, stop, step
	 */
	Queue<String> smEventQueue = new LinkedList<String>();
	
	private void addEvent( String event ) {
		//synchronized(smEventQueue)
		{
			smEventQueue.add(event);
			smEventSemaphore.release() ;	
		}
	}
	private String pollEvent () {
		//synchronized(smEventQueue)
		{
			try {
				smEventSemaphore.acquire() ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String str = smEventQueue.poll();
			if ( str == null)
				smEventSemaphore.release();
			return str ;		
		}

	}
	// start in continue mode
	static final private String SM_TRIGGER_START_ONLINE_CONTINUOUS_MODE 	= "TRIGGER_START_IN_CONTINUOUS_MODE" ;
	// start in step mode
	static final private String SM_TRIGGER_START_ONLINE_STEP_MODE 			= "TRIGGER_START_IN_STEP_MODE" ;	
	// start in step mode
	static final private String SM_TRIGGER_START_OFFLINE 			= "TRIGGER_START_OFFLINE" ;	
	// stop
	static final private String SM_TRIGGER_STOP 					= "TRIGGER_STOP" ; 
	// pause
	static final private String SM_TRIGGER_PAUSE 					= "TRIGGER_PAUSE" ; 
	// switch to step mode
	static final private String SM_TRIGGER_SWITCHTOSTEPMODE 		= "TRIGGER_SWITCH_TO_STEP_MODE" ; 	
	// switch to continuous mode
	static final private String SM_TRIGGER_SWITCHTOCONTINUOUSMODE 	= "TRIGGER_SWITCH_TO_CONTINUOUS_MODE" ; 	
	// step
	static final private String SM_TRIGGER_STEP 					= "TRIGGER_STEP" ; 
	
	private Semaphore smEventSemaphore = new Semaphore(0) ;

	/**
	 * status of the online thread
	 * trigger by event in eventQueue
	 */
	private String smStatus = SM_STATUS_IDLE ;
	static final private String SM_STATUS_IDLE = "IDLE" ;
	static final private String SM_STATUS_RUNNING = "RUNNING" ; 
	static final private String SM_STATUS_STOPING = "STOPING" ; 
	static final private String SM_STATUS_STOPPED = "STOPPED" ; 
	private String getStatus() {
		return smStatus;
	}
	private  void setStatus(String status) {
		synchronized(smStatus){
			this.smStatus = status;
			commandStateService.toogleGenAndExeStatus(status);		
		}
	}
	/**
	 * config of the online thread
	 */
	private boolean onlineStepMode = true ;
	private boolean getStepMode() {
		return onlineStepMode;
	}
	private void setStepMode(boolean step) {
		this.onlineStepMode = step;
	}
	
	
	/**
	 * prepared parameter for online/offline
	 */
	private Shell shell = null ;
	private Workbench workbench;
	private WorkbenchWindow workbenchWindown;
	private CommandState commandStateService = null ;
	private IEditorPart editorPart;
	private TransactionalEditingDomain editingDomain;
	
	/**
	 * parameter when start online/offline
	 */
	private Job job;
	private IProgressMonitor monitor ;
	
	private TestCaseGen tcgen = null ;
	private ScriptEngine scriptEngine = null ;
	private ScriptGen sptgen;
	private XlsGen xlsgen;
	
	private UIStatemachine stm;
	public AbstractUIState selectTo = null ;
	public AbstractUIState selectFrom = null ;
	private String uisutFilePath;
	private int maxLoop;
	private int maxStep;
	private AbstractUIState astStart;
	private AbstractUIState astEnd;

	/**
	 * temp var for hightlignt
	 */
	String[] lastExecutedUUID = null ;
	




	

	/* 
	 * 
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		// prepare parameter form event
		intervalPrepareContext(event);
		
		String subCmd = event.getParameter("name.niu.guitar.ui.commands.GenOnline.subCmd") ;
		// online_start
		if ( subCmd.equals(SM_TRIGGER_START_ONLINE_CONTINUOUS_MODE)){
			if ( getStatus().equals(SM_STATUS_IDLE)) {
				addEvent(SM_TRIGGER_START_ONLINE_CONTINUOUS_MODE);
				doStart(event);
			} else {
				MessageDialog.openInformation(
				HandlerUtil.getActiveShell(event),
				"Guitar",
				"Already Started");			
			}
		// online_step
		} else if ( subCmd.equals(SM_TRIGGER_START_ONLINE_STEP_MODE)){
			if ( getStatus().equals(SM_STATUS_IDLE)) {
				addEvent(SM_TRIGGER_START_ONLINE_STEP_MODE);
				setStepMode(true);
				doStart(event);
			} else {
				MessageDialog.openInformation(
				HandlerUtil.getActiveShell(event),
				"Guitar",
				"Already Started");			
			}
		// online_stop
		} else if (subCmd.equals(SM_TRIGGER_STOP)) {
			addEvent(SM_TRIGGER_STOP);
		} else if (subCmd.equals(SM_TRIGGER_STEP)) {
			addEvent(SM_TRIGGER_STEP);
		// offline
		} else if (subCmd.equals("OFFLINE")){
			return doGenOffline(event) ;
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
	
	private void smEventLoop() {
		while ( true ) 
		{
//			if ( getStepMode() == false ) {
//				try {
//					Thread.sleep(Config.getAnimationInterval());
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				addEvent(SM_TRIGGER_STEP);
//			}
			String event = pollEvent();
			if ( getStatus().equals(SM_STATUS_IDLE) ) {
				if (event.equals(SM_TRIGGER_START_ONLINE_CONTINUOUS_MODE)) {						
					scriptEngine.setStepMode(false);
					setStepMode(false);
					monitor.beginTask("Gen And Exe!!!",IProgressMonitor.UNKNOWN );
					tcgen.generateTestCase(uisutFilePath, stm, maxLoop, maxStep, astStart, astEnd);
					setStatus(SM_STATUS_RUNNING);
					
				} else if (event.equals(SM_TRIGGER_START_ONLINE_STEP_MODE)) {						
					scriptEngine.setStepMode(true);
					setStepMode(true);
					monitor.beginTask("Gen And Exe!!!",IProgressMonitor.UNKNOWN );
					tcgen.generateTestCase(uisutFilePath, stm, maxLoop, maxStep, astStart, astEnd);							
					setStatus(SM_STATUS_RUNNING);
				}
			} else if ( getStatus().equals(SM_STATUS_RUNNING) ) {
				if ( event.equals(SM_TRIGGER_STEP )){
					scriptEngine.step(1);
				} else if (event.equals(SM_TRIGGER_STOP)) {
					if ( !scriptEngine.getStatus().equals(ScriptEngine.SM_STATUS_STOPPED)) {
						scriptEngine.stop();
					}
					if ( !tcgen.getStatus().equals( TestCaseGen.SM_STATUS_STOPPED )) {
						tcgen.stopGen() ;
					}
					setStatus(SM_STATUS_STOPPED);
					break ;
				} 
			} else if ( getStatus().equals(SM_STATUS_STOPING) ) {
				
			} else if ( getStatus().equals(SM_STATUS_STOPPED) ) {
				
			} else {
				assert(false):"add more status?";
			}
		}
	}



	/**
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	private Object doStart( ExecutionEvent event) throws ExecutionException 
	{
		// set maxLoop and max Step
		TestCaseGenWizard wizard = new TestCaseGenWizard();
		WizardDialog wizardDialog = new WizardDialog(shell, wizard);
		int wizardResult = wizardDialog.open();
		if ( wizardResult == Window.CANCEL ) {
			return null ;
		}
		maxLoop = wizard.getMaxLoopCount();
		maxStep = wizard.getMaxStepCount();
		// set start and end
		astStart = this.selectFrom;
		astEnd = this.selectTo;
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
			stm = (UIStatemachine)astEnd.eContainer().eResource().getContents().get(0);
		}
		
		tcgen = new TestCaseGen();		
		sptgen = new ScriptGen();		
		xlsgen = new XlsGen();
		scriptEngine = new ScriptEngine();
		
		tcgen.addSubscriber(sptgen);
		tcgen.addSubscriber(xlsgen);
		tcgen.addSubscriber(scriptEngine);
		
		// add listener to scritpEngine				
		scriptEngine.addSubscriber( new ITargetScriptExeDoneSubscriber() {
			public void OnTargetStatementDone(String[] executedUUID) {
				internalHightlight(executedUUID ) ;
			}
			public void OnSEStoped(ITargetScriptExeDonePublisher p) {
				addEvent(SM_TRIGGER_STOP);
			}
			@Override
			public void OnTestCaseDone(TestCase tc) {
				internalClearTC();
				lastExecutedUUID = null ;
			}					
		});			
		tcgen.addSubscriber(  new ITCDoneSubscriber() {
			public void OnUtifFileDone(String uitfFileParth) {
			};
			public void OnTestCaseDone(name.niu.guitar.uitf.TestCase tc) {
				//internalClearTC() ;
			}
			public void OnTCGStoped(ITCDonePublisher tcg, String reason) {
				if( reason.equals(ITCDoneSubscriber.Stop_Reason_Completion)) {
					//addEvent(SM_TRIGGER_STOP);
				}
			}					
		});		
		job = new Job("GenAndExe") 
		{
			protected IStatus run(IProgressMonitor monitor) 
			{
				TCgenOnlineAction.this.monitor = monitor ;
				smEventLoop();
				setStatus(SM_STATUS_IDLE);
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
					addEvent(SM_TRIGGER_STOP);
					
				} else {
					addEvent(SM_TRIGGER_STOP);
				}
			}
		});	
		job.setPriority(Job.INTERACTIVE);
		job.setUser(true);
		job.schedule(500);
		return null;
	}

//	private Object doContinue()
//	{
//		click.release() ;
//		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_STEPPING );
//		return null ;
//	}
	
//	private Object doStop()   
//	{
//		click.release(3) ;		
//		scriptEngine.stop() ;
//		tcgen.stopGen() ;
//		ChangeGenAndExe( CommandState.GEN_AND_EXE_IN_IDLE );
//		//click.release();
////		if ( job != null){
////			job.cancel();
////			job = null ;
////		}
//		return null ;
//	}
	
//	private void doExternalStop(boolean isNormallyCompleted )   
//	{
//		if ( isNormallyCompleted ){
//			//MessageDialog.openInformation(shell,"Guitar","Completed!");
//		} else {
//			//MessageDialog.openInformation(shell,"Guitar","Canceled or Failed");
//		}
//		doStop() ;
//	}
	

	

	public Object doGenOffline(ExecutionEvent event) throws ExecutionException 
	{
		// set maxLoop
		TestCaseGenWizard wizard = new TestCaseGenWizard();
		Shell shell = HandlerUtil.getActiveShell(event);
		WizardDialog wizardDialog = new WizardDialog(shell, wizard);
		int wizardResult = wizardDialog.open() ;
		if ( wizardResult == Window.CANCEL ) {
			return null ;
		}
		final int maxLoop = wizard.getMaxLoopCount();
		final int maxStep = wizard.getMaxStepCount();
		//
		// set start and end
		AbstractUIState astStart = this.selectFrom;
		AbstractUIState astEnd = this.selectTo;
		
		
		// set stm
		UIStatemachine stm = null;
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
			stm = (UIStatemachine)astEnd.eContainer().eResource().getContents().get(0);
			//return null ;
		}
		// set uisutFilePath
		String uisutFilePath = TCgenOfflineAction.getCurrentInputString(event);
	
		// add addSubscriber
		TestCaseGen tcgen = new TestCaseGen();
		ScriptGen sptgen = new ScriptGen();
		XlsGen xlsgen = new XlsGen();
		
		tcgen.addSubscriber(sptgen);
		tcgen.addSubscriber(xlsgen);
		
		// generate TestCase
		tcgen.generateTestCase(uisutFilePath, stm, maxLoop, maxStep, astStart, astEnd);
		
		return null;
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
	
	@Override
	public	boolean isEnabled(){
		try {
			IEditorPart ed = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			if (ed instanceof UisutDiagramEditor){
				return true ;
			}
		} catch ( NullPointerException e ){
			return false;
		}
		return false ;
	}
	
	private void internalSetEnableToolBar(final int index, final boolean enable) {
		CoolBarManager cbm  = workbenchWindown.getCoolBarManager() ;						
		// set disable
		IContributionItem demoGroup1 = cbm.find("name.niu.guitar.ui.toolbars.GuitarMainToolBar") ;	
		final CoolBar guitarCoolBar = cbm.getControl() ;
		
		Display.getDefault().syncExec(new Runnable() {
		    public void run() {
		    	guitarCoolBar.getItem(index).getControl().setEnabled(enable);
		    	}
		    });
		
		
		if ( enable ) {
			IContributionItem continueButton = cbm.getItems()[index] ;
			if ( continueButton instanceof CommandContributionItem) {
				((CommandContributionItem)continueButton).getCommand().getCommand().setHandler(this) ;
			}
		} else {
			IContributionItem continueButton = cbm.find( "name.niu.guitar.ui.toolbars.GuitarMainToolBar/continue") ;// or continue??
			if ( continueButton instanceof CommandContributionItem) {
				((CommandContributionItem)continueButton).getCommand().getCommand().setHandler(null) ;
			}
		}
	}
	private void internalClearTC() {
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
	
	private void internalHightlight( String[] executedUUID ) {
		
		// update last Executed uuidID's UIState/UITransition's color
		if ( lastExecutedUUID != null ) {
			for ( String uuid : lastExecutedUUID ) {
				final EObject o = stm.eResource().getEObject( uuid ) ;
				if ( o instanceof AbstractUIState || o instanceof UITransition ){
					editingDomain.getCommandStack().execute( new RecordingCommand(editingDomain) {

						@Override
						protected void doExecute() {
							((UIElement)o).setHighlight(Config.ANIMATIONPATHCOLOR);
						}
					});
				} else {
					assert(false):"model changed?";
				}
			}
		} 
		lastExecutedUUID = executedUUID ;
		
		for ( String uuid : executedUUID ) {
			final EObject o = stm.eResource().getEObject( uuid ) ;
			if ( o instanceof AbstractUIState || o instanceof UITransition ){
				// set color
				editingDomain.getCommandStack().execute( new RecordingCommand(editingDomain) {

					@Override
					protected void doExecute() {
						((UIElement)o).setHighlight(Config.ANIMATIONHEADCOLOR);
					}
				});
			}else {
				assert(false):"model changed?";
			}
		}
	}
	
	private void intervalPrepareContext( ExecutionEvent event )  {
		if ( commandStateService == null ) {
			ISourceProviderService sourceProviderService = (ISourceProviderService) HandlerUtil
					.getActiveWorkbenchWindow(event).getService(
							ISourceProviderService.class);
			commandStateService = (CommandState) sourceProviderService
					.getSourceProvider(CommandState.GEN_AND_EXE_STATUS);
		}
		
		shell = HandlerUtil.getActiveShell(event);


		workbench = (Workbench)PlatformUI.getWorkbench() ;
		if ( workbenchWindown instanceof WorkbenchWindow == false ){
			System.out.println( "not WorkbenchWindwo!") ;
		}
		workbenchWindown = (WorkbenchWindow)workbench.getActiveWorkbenchWindow() ;
		
		try {
			uisutFilePath = TCgenOfflineAction.getCurrentInputString(event);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		editorPart = null;
		try {
			editorPart = HandlerUtil.getActiveEditorChecked(event);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		editingDomain = ((UisutDiagramEditor)editorPart).getEditingDomain();
	}
	

	
}
