package name.niu.guitar.uisut.presentation.editorParts;


import name.niu.guitar.uisut.presentation.UisutEditor;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

public class ListEditorPart extends UISUTBaseEditorPart 
{
	  protected ListViewer viewer;
	  
	  public ListEditorPart(UisutEditor parent) {
	    super(parent);
	  }

	  @Override
	  public void createPartControl(Composite parent) {			
				viewer = new ListViewer(parent, SWT.NONE);
				viewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
				viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
				createContextMenuFor(viewer);
				getEditorSite().setSelectionProvider(viewer);
	  }

	  @Override
	  public void setFocus() {
	    viewer.getList().setFocus();
	  }

	  @Override
	  public void setInput(Object input) {
	    viewer.setInput(input);
	  }
}