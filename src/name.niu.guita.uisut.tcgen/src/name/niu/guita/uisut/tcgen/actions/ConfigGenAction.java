package name.niu.guita.uisut.tcgen.actions;

import java.util.ArrayList;
import java.util.List;

import name.niu.guita.uisut.AbstractState;
import name.niu.guita.uisut.FinalState;
import name.niu.guita.uisut.InitialState;
import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.diagram.edit.parts.FinalStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.InitialStateEditPart;
import name.niu.guita.uisut.diagram.edit.parts.UIStateEditPart;
import name.niu.guita.uisut.diagram.part.UISUTDiagramEditor;
import name.niu.guita.uisut.tcgen.config.Configuration;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

public class ConfigGenAction implements IEditorActionDelegate {
	
	protected static ArrayList<EditPart> selectedEditParts = null;
	protected static IStructuredSelection selectedScope = null ;
	protected static EditPartListener.Stub deactivationListener = new EditPartListener.Stub() { 
		
		@Override
		public void removingChild(EditPart child, int index) {
			int i = ConfigGenAction.selectedScope.toList().indexOf(child) ;
			ArrayList<EditPart> l = new ArrayList<EditPart>() ;
			for( int j = 0 ; j < ConfigGenAction.selectedScope.toList().size() ; j ++ )
			{
				if ( ! ConfigGenAction.selectedScope.toList().get(j).equals(child) )
				{
					l.add((EditPart)ConfigGenAction.selectedScope.toList().get(j));
				}else
				{
					
				}
			}
			StructuredSelection newSel = new StructuredSelection(l);
			ConfigGenAction.selectedScope = newSel;
		}
		@Override
		public void partDeactivated(EditPart editpart) {
			if ( selectedScope != null ) {
				ConfigGenAction.selectedScope.toList().remove(editpart) ;
			}
		}
		
	} ;
	
	private static UISUTDiagramEditor editor = null ;
	
	private Shell shell = null ;

	@Override
	public void run(IAction action) {
		System.out.println(action.toString()) ;
		action.getId();
		action.getText();
		action.getActionDefinitionId();
		action.getDescription();
		
		if ( action.getId().equals( "name.niu.guita.uisut.tcgen.setGenFromAction" ) 
				&& ConfigGenAction.selectedEditParts != null ) 
		{
			EditPart fromEp = ConfigGenAction.selectedEditParts.get(0) ;
			if ( fromEp instanceof UIStateEditPart ) {
				UIStateEditPart fromStateEp = (UIStateEditPart) fromEp ;
				UIState st = (UIState) fromStateEp.getAdapter(UIState.class) ;
				Configuration.setGenFrom( st.getName() );
			} else if ( fromEp instanceof InitialStateEditPart ){
				InitialStateEditPart scopeStateEp = (InitialStateEditPart) fromEp ;
				InitialState inist = (InitialState) scopeStateEp.getAdapter(InitialState.class) ;
				Configuration.setGenFrom( inist.getName() );
			}
		
		} else if ( action.getId().equals( "name.niu.guita.uisut.tcgen.setGenToAction" ) 
				&& ConfigGenAction.selectedEditParts != null ) {
			EditPart toEp = ConfigGenAction.selectedEditParts.get(0) ;
			if ( toEp instanceof UIStateEditPart ) {
				UIStateEditPart toStateEp = (UIStateEditPart) toEp ;
				UIState st = (UIState) toStateEp.getAdapter(UIState.class) ;
				Configuration.setGenTo( st.getName() );
			} else if ( toEp instanceof FinalStateEditPart ){
				FinalStateEditPart scopeStateEp = (FinalStateEditPart) toEp ;
				FinalState finst = (FinalState) scopeStateEp.getAdapter(FinalState.class) ;
				Configuration.setGenTo( finst.getName() );
			}
		} 
		else if ( action.getId().equals( "name.niu.guita.uisut.tcgen.setGenScopeAction" ) 
				&& ConfigGenAction.selectedEditParts != null ) 
		{
			ArrayList<String> genScope = new ArrayList<String>();
			for( EditPart scopeEp : ConfigGenAction.selectedEditParts ){
				if ( scopeEp instanceof UIStateEditPart ) {
					UIStateEditPart scopeStateEp = (UIStateEditPart) scopeEp ;
					UIState st = (UIState) scopeStateEp.getAdapter(UIState.class) ;
					genScope.add(st.getName());
				} else if (scopeEp instanceof InitialStateEditPart){
					InitialStateEditPart scopeStateEp = (InitialStateEditPart) scopeEp ;
					InitialState inist = (InitialState) scopeStateEp.getAdapter(InitialState.class) ;
					genScope.add(inist.getName());
				} else if (scopeEp instanceof FinalStateEditPart){
					FinalStateEditPart scopeStateEp = (FinalStateEditPart) scopeEp ;
					FinalState st = (FinalState) scopeStateEp.getAdapter(FinalState.class) ;
					genScope.add(st.getName());
				}
			}
			Configuration.setGenScope(genScope ) ;
			
			List<EditPart> selectedEditPart = 
				ConfigGenAction.editor.getDiagramGraphicalViewer().getSelectedEditParts();
			ISelection sel = ConfigGenAction.editor.getDiagramGraphicalViewer().getSelection();
			if( sel instanceof IStructuredSelection )
			{
				IStructuredSelection ssel = (IStructuredSelection)sel ;
				ConfigGenAction.selectedScope = ssel;
			}
			
			
		} 
		else if ( action.getId().equals( "name.niu.guita.uisut.tcgen.showGenScopeAction" ) )
		{
			IStructuredSelection ssel = ConfigGenAction.selectedScope ;
			ConfigGenAction.editor.getDiagramGraphicalViewer().setSelection(ConfigGenAction.selectedScope);
		}
		

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		System.out.println( "selectionChanged: " + selection.toString()) ;
		
		try {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				ArrayList<EditPart> selectedEditParts = new ArrayList<EditPart>();
				for ( Object selItem : structuredSelection.toList() ){
					if ( selItem instanceof EditPart ) {
						selectedEditParts.add((EditPart)selItem) ;
					}
				}
				if (selectedEditParts.size()> 0 ) {
					ConfigGenAction.selectedEditParts = selectedEditParts ;
				}
			}
		} catch (Exception e) {
			e.printStackTrace() ;
		} finally {
		}
		

	}

	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {	
		if ( targetEditor.equals( ConfigGenAction.editor )  )
		{
			
		}
		else if ( ConfigGenAction.editor == null )
		{
			ConfigGenAction.editor = (UISUTDiagramEditor) targetEditor ;
			System.out.println(ConfigGenAction.editor.toString()) ;
			ConfigGenAction.editor.getDiagramEditPart().getRoot().getContents().addEditPartListener(ConfigGenAction.deactivationListener);
		}
		else
		{
			ConfigGenAction.editor.getDiagramEditPart().getRoot().getContents().removeEditPartListener(ConfigGenAction.deactivationListener) ;
			ConfigGenAction.editor = (UISUTDiagramEditor) targetEditor ;
			System.out.println(ConfigGenAction.editor.toString()) ;
			ConfigGenAction.editor.getDiagramEditPart().getRoot().getContents().addEditPartListener(ConfigGenAction.deactivationListener);
		}
		

		if ( targetEditor != null ) {
			this.shell = targetEditor.getSite().getShell();
		}

	}
	
	

}
