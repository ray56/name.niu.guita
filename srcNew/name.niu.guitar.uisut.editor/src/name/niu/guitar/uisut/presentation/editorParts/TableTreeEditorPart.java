package name.niu.guitar.uisut.presentation.editorParts;

import name.niu.guitar.uisut.presentation.UisutEditor;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

public class TableTreeEditorPart extends UISUTBaseEditorPart 
{
	  protected TreeViewer viewer;
	  
	  public TableTreeEditorPart(UisutEditor parent) {
	    super(parent);
	  }

	  @Override
	  public void createPartControl(Composite parent) {
	    viewer = new TreeViewer(parent, SWT.NONE);
	    Tree tree = viewer.getTree();
	    tree.setLayoutData(new FillLayout());
	    tree.setHeaderVisible(true);
	    tree.setLinesVisible(true);

	    TreeColumn objectColumn = new TreeColumn(tree, SWT.NONE);
	    objectColumn.setText(getString("_UI_ObjectColumn_label"));
	    objectColumn.setResizable(true);
	    objectColumn.setWidth(250);

	    TreeColumn selfColumn = new TreeColumn(tree, SWT.NONE);
	    selfColumn.setText(getString("_UI_SelfColumn_label"));
	    selfColumn.setResizable(true);
	    selfColumn.setWidth(200);

	    viewer.setColumnProperties(new String [] {"a", "b"});
	    viewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
	    viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));

	    createContextMenuFor(viewer);
	    getEditorSite().setSelectionProvider(viewer);
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