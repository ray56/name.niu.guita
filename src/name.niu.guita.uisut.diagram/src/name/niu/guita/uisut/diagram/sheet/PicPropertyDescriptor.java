package name.niu.guita.uisut.diagram.sheet;

import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
//import org.eclipse.ui.views.properties.PropertyDescriptor;

public class PicPropertyDescriptor extends PropertyDescriptor {

	public PicPropertyDescriptor(Object id, IItemPropertyDescriptor itemPropertyDescriptor) {
		super(id, itemPropertyDescriptor);		
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		//ILabelProvider editLabelProvider = getEditLabelProvider();
		CellEditor editor = new FileDialogCellEditor(composite);
		return editor ;
	}

}
