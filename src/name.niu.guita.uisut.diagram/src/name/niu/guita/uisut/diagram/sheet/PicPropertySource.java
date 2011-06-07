package name.niu.guita.uisut.diagram.sheet;

import name.niu.guita.uisut.edit.provider.propertyDescriptor.PicItemPropertyDescriptor;

import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
//import org.eclipse.gmf.runtime.common.ui.services.properties.extended.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;



public class PicPropertySource extends PropertySource 
{
	public PicPropertySource(Object object, IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}

	@Override
	protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
		if (itemPropertyDescriptor instanceof PicItemPropertyDescriptor) {
			return new PicPropertyDescriptor(object, itemPropertyDescriptor);

			//return new PicPropertyDescriptor(object, itemPropertyDescriptor.getDisplayName(object));
		}
		return super.createPropertyDescriptor(itemPropertyDescriptor);
	}


}
