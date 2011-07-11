package name.niu.guitar.uisut.presentation.editorParts;

import name.niu.guitar.uisut.presentation.UisutEditor;

import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

public class SelectionEditorPart extends UISUTBaseEditorPart 
{
	  protected TreeViewer viewer;
	  
	  public SelectionEditorPart(UisutEditor parent) {
	    super(parent);
	  }

	  @Override
	  public void createPartControl(Composite parent) {
	    viewer = new TreeViewer(parent, SWT.MULTI);
	    viewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
	    viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
	    viewer.setSelection(new StructuredSelection(getEditingDomain().getResourceSet().getResources().get(0)), true);
	    getEditorSite().setSelectionProvider(viewer);
	    new AdapterFactoryTreeEditor(viewer.getTree(), getAdapterFactory());
	    createContextMenuFor(viewer);
	  }

	  @Override
	  public void setFocus() {
	    viewer.getTree().setFocus();
	  }

	  @Override
	  public void setInput(Object input) {
	    viewer.setInput(input);
	  }
}
