package name.niu.guitar.uisut.presentation.editorParts;

import name.niu.guitar.uisut.presentation.UisutEditor;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

public class TableEditorPart extends UISUTBaseEditorPart 
{
	  protected TableViewer viewer;
	  
	  public TableEditorPart(UisutEditor parent) {
	    super(parent);
	  }

	  @Override
	  public void createPartControl(Composite parent) {
	    viewer = new TableViewer(parent, SWT.NONE);
	    
		Table table = viewer.getTable();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn objectColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(3, 100, true));
		objectColumn.setText(getString("_UI_ObjectColumn_label"));
		objectColumn.setResizable(true);

		TableColumn selfColumn = new TableColumn(table, SWT.NONE);
		layout.addColumnData(new ColumnWeightData(2, 100, true));
		selfColumn.setText(getString("_UI_SelfColumn_label"));
		selfColumn.setResizable(true);

		viewer.setColumnProperties(new String [] {"a", "b"});
		viewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));

	    createContextMenuFor(viewer);
	    getEditorSite().setSelectionProvider(viewer);
	  }

	  @Override
	  public void setFocus() {
	    viewer.getTable().setFocus();
	  }

	  @Override
	  public void setInput(Object input) {
	    viewer.setInput(input);
	  }
}