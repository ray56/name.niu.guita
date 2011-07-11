package name.niu.guitar.uisut.presentation.editorParts;



import name.niu.guitar.uisut.presentation.UisutEditor;
import name.niu.guitar.uisut.presentation.UisutEditorPlugin;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain ;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy ;

public abstract class UISUTBaseEditorPart 
	extends EditorPart 
	implements IMenuListener, IEditingDomainProvider
{
	  protected UisutEditor parentEditor;
	  
	  public UISUTBaseEditorPart(UisutEditor parent) {
	    super();
	    this.parentEditor = parent;
	  }
	  
	  protected static String getString(String key) {
	    return UisutEditorPlugin.INSTANCE.getString(key);
	  }

	  public EditingDomain getEditingDomain() {
	    return parentEditor.getEditingDomain();
	  }

	  protected BasicCommandStack getCommandStack() {
	    return ((BasicCommandStack)getEditingDomain().getCommandStack());
	  }
	    
	  protected AdapterFactory getAdapterFactory() {
	    return ((AdapterFactoryEditingDomain) ((FileEditorInputProxy)getEditorInput()).getEditingDomain()).getAdapterFactory();
	  }
	    
	  protected void createContextMenuFor(StructuredViewer viewer) {
	    MenuManager contextMenu = new MenuManager("#PopUp");
	    contextMenu.add(new Separator("additions"));
	    contextMenu.setRemoveAllWhenShown(true);
	    contextMenu.addMenuListener(this);
	    Menu menu= contextMenu.createContextMenu(viewer.getControl());
	    viewer.getControl().setMenu(menu);
	    getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

	    int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
	    Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
	    viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
	    viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(getEditingDomain(), viewer));
	  }
	    
	  @Override
	  public void doSave(IProgressMonitor monitor) {
	    // nothing to do here - this is handled by the parent editor
	  }

	  @Override
	  public void doSaveAs() {
	    // nothing to do here - this is handled by the parent editor
	  }

	  @Override
	  public void init(IEditorSite site, IEditorInput input) throws PartInitException {
	    setSite(site);
	    setInput(input);
	  }

	  @Override
	  public boolean isDirty() {
	    return getCommandStack().isSaveNeeded();        
	  }

	  @Override
	  public boolean isSaveAsAllowed() {
	    return true;
	  }

	  public void menuAboutToShow(IMenuManager manager) {
	    // pass the request to show the context menu on to the parent editor
	    ((IMenuListener)parentEditor.getEditorSite().getActionBarContributor()).menuAboutToShow(manager);
	  }
	  
	  public abstract void setInput(Object input);	

}
