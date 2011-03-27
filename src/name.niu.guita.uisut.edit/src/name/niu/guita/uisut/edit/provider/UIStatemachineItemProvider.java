/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.edit.provider;


import java.util.Collection;
import java.util.List;

import name.niu.guita.uisut.UIStatemachine;
import name.niu.guita.uisut.uisutFactory;
import name.niu.guita.uisut.uisutPackage;

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
 * This is the item provider adapter for a {@link name.niu.guita.uisut.UIStatemachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIStatemachineItemProvider
	extends UISUTElementItemProvider
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
			childrenFeatures.add(uisutPackage.Literals.UI_STATEMACHINE__ITS_STATE);
			childrenFeatures.add(uisutPackage.Literals.UI_STATEMACHINE__ITS_TRANSITION);
			childrenFeatures.add(uisutPackage.Literals.UI_STATEMACHINE__ITS_DATA_VARIABLE);
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
			case uisutPackage.UI_STATEMACHINE__ITS_STATE:
			case uisutPackage.UI_STATEMACHINE__ITS_TRANSITION:
			case uisutPackage.UI_STATEMACHINE__ITS_DATA_VARIABLE:
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
				(uisutPackage.Literals.UI_STATEMACHINE__ITS_STATE,
				 uisutFactory.eINSTANCE.createUIState()));

		newChildDescriptors.add
			(createChildParameter
				(uisutPackage.Literals.UI_STATEMACHINE__ITS_STATE,
				 uisutFactory.eINSTANCE.createInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(uisutPackage.Literals.UI_STATEMACHINE__ITS_STATE,
				 uisutFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(uisutPackage.Literals.UI_STATEMACHINE__ITS_TRANSITION,
				 uisutFactory.eINSTANCE.createUITransition()));

		newChildDescriptors.add
			(createChildParameter
				(uisutPackage.Literals.UI_STATEMACHINE__ITS_DATA_VARIABLE,
				 uisutFactory.eINSTANCE.createUIDataVariable()));
	}

}
