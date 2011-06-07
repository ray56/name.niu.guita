package name.niu.guita.uisut.edit.provider.propertyDescriptor;

import java.util.Collection;

import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

public class PicItemPropertyDescriptor extends ItemPropertyDescriptor 
{
	public PicItemPropertyDescriptor(
			AdapterFactory adapterFactory, 
			ResourceLocator resourceLocator,
			String displayName, 
			String description, 
			EStructuralFeature feature, 
			boolean isSettable, 
			String category) 
	{
		super(adapterFactory, 
				resourceLocator, 
				displayName, 
				description, 
				feature, 
				isSettable, 
				false, 
				true, 
				null,
				category, 
				null);
	}

	@Override
	protected Collection<?> getComboBoxObjects(Object object) {
		EObject eObject = (EObject) object;
//		if (uisutPackage.Literals.UI_STATE__PIC.equals(feature)) {
//			
//			return null;
//		}
		return super.getComboBoxObjects(object);
	}

	@Override
	public Object getPropertyValue(Object object) {
		EObject eObject = (EObject) object;
//		if (uisutPackage.Literals.UI_STATE__PIC.equals(feature)) {
//			
//			return createPropertyValueWrapper(object, result);
//		}
		return super.getPropertyValue(object);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		super.setPropertyValue(object, value) ;
	}

	@Override
	protected Object createPropertyValueWrapper(Object object, Object propertyValue) {
		return super.createPropertyValueWrapper(object, propertyValue);
	}

}
