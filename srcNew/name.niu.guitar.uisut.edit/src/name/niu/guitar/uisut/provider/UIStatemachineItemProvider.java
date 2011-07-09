/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.provider;


import java.util.Collection;
import java.util.List;

import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UisutFactory;
import name.niu.guitar.uisut.UisutPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link name.niu.guitar.uisut.UIStatemachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIStatemachineItemProvider
	extends UIElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIStatemachineItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_STATE);
			childrenFeatures.add(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_TRANSITION);
			childrenFeatures.add(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE);
			childrenFeatures.add(UisutPackage.Literals.UI_STATEMACHINE__ITS_SUB_STM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UIStatemachine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UIStatemachine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UIStatemachine)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UIStatemachine_type") :
			getString("_UI_UIStatemachine_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UIStatemachine.class)) {
			case UisutPackage.UI_STATEMACHINE__ITS_UI_STATE:
			case UisutPackage.UI_STATEMACHINE__ITS_UI_TRANSITION:
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE:
			case UisutPackage.UI_STATEMACHINE__ITS_SUB_STM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_STATE,
				 UisutFactory.eINSTANCE.createAbstractUIState()));

		newChildDescriptors.add
			(createChildParameter
				(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_STATE,
				 UisutFactory.eINSTANCE.createCommonState()));

		newChildDescriptors.add
			(createChildParameter
				(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_STATE,
				 UisutFactory.eINSTANCE.createInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_STATE,
				 UisutFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_TRANSITION,
				 UisutFactory.eINSTANCE.createUITransition()));

		newChildDescriptors.add
			(createChildParameter
				(UisutPackage.Literals.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE,
				 UisutFactory.eINSTANCE.createUISystemVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UisutPackage.Literals.UI_STATEMACHINE__ITS_SUB_STM,
				 UisutFactory.eINSTANCE.createUIStatemachine()));
	}

}
