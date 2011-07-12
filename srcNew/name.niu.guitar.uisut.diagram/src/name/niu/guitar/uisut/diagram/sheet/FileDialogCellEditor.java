package name.niu.guitar.uisut.diagram.sheet;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;

import org.eclipse.gmf.runtime.common.ui.services.properties.extended.IPropertyAction;
import org.eclipse.gmf.runtime.common.ui.services.properties.extended.MultiButtonCellEditor ;

public class FileDialogCellEditor extends MultiButtonCellEditor/*DialogCellEditor*/  {

	 public FileDialogCellEditor(Composite parent)
	 {
		 super(parent);
	 }

	protected Object openDialogBox(Control cellEditorWindow) 
	{

		FileDialog fileDialog = new FileDialog(cellEditorWindow.getShell(),
				SWT.OPEN);

		fileDialog.setFileName("选择图形文件");

		fileDialog.setFilterExtensions(new String[] { "*.gif;*.png;*.jpg" , "*.*" });

		// fileDialog.setFilterPath(getURLPath(LogicPlugin.class,"icons/gef/model"));

//		fileDialog.setFilterPath(getURLPath(LogicPlugin.class,
//				"icons/gef/model"));

		String path = fileDialog.open();

		return path;

	}
	
	   protected Button createButton(Composite parent){

	        Button result = new Button(parent, SWT.PUSH);

	           result.setText("Select Image"); //$NON-NLS-1$
	           
	           return result;

	   }
	   protected static String getURLPath(Class rsrcClass, String name){

	       return rsrcClass.getResource(name).getPath();

	   }

	@Override
	protected void initButtons() {
        IPropertyAction clearAction = new IPropertyAction() {
            public Object execute(Control owner) {
        		return "";                
            }
        };
        addButton("clear", clearAction); //$NON-NLS-1$
        IPropertyAction setAction = new IPropertyAction() {
            public Object execute(Control owner) {
            	
        		FileDialog fileDialog = new FileDialog(owner.getShell(), SWT.OPEN);
        		fileDialog.setFileName("选择图形文件");
        		fileDialog.setFilterExtensions(new String[] { "*.gif;*.png;*.jpg" , "*.*" });
        		String path = fileDialog.open();
        		return path;                
            }
        };
        addButton("select image", setAction);
        
		
	}
}
