package name.niu.guita.properties;


import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.IDescriptionProvider;

public class PropertiesLabelProvider extends LabelProvider implements 
		ILabelProvider, IDescriptionProvider {

	@Override
	public Image getImage(Object element) {
		if ( element instanceof PropertiesTreeData )
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJS_INFO_TSK);
		return null;
	}
	
	@Override
	public String getText(Object element) {
		if ( element instanceof PropertiesTreeData ) {
			PropertiesTreeData data = (PropertiesTreeData) element ;
			return data.getName() + "=" + data.getValue() ; 
		}
		return null;
	}
	
	public String getDescription(Object anElement) {
		if (anElement instanceof PropertiesTreeData) {
			PropertiesTreeData data = (PropertiesTreeData) anElement;
			return "Property: " + data.getName(); //$NON-NLS-1$
		}
		return null;
	}
	


}
