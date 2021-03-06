/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.edit.provider;


import java.util.Collection;
import java.util.List;

import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.uisutFactory;
import name.niu.guita.uisut.uisutPackage;
import name.niu.guita.uisut.edit.provider.propertyDescriptor.PicItemPropertyDescriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;


/**
 * This is the item provider adapter for a {@link name.niu.guita.uisut.UIState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UIStateItemProvider
	extends AbstractStateItemProvider
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
	public UIStateItemProvider(AdapterFactory adapterFactory) {
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

			//addIsInitialPropertyDescriptor(object);
			addAddedDataVariablePropertyDescriptor(object);
			addDeletedDataVariablePropertyDescriptor(object);
			
			// 2011-06-06
			//addPicPropertyDescriptor(object);
			itemPropertyDescriptors.add( new PicItemPropertyDescriptor(
					((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
					 getResourceLocator(),
					 getString("_UI_UIState_pic_feature"),
					 getString("_UI_PropertyDescriptor_description", "_UI_UIState_pic_feature", "_UI_UIState_type"),
					 uisutPackage.Literals.UI_STATE__PIC,
					 true,
					 null));
			
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Initial feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsInitialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIState_isInitial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIState_isInitial_feature", "_UI_UIState_type"),
				 uisutPackage.Literals.UI_STATE__IS_INITIAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Added Data Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddedDataVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIState_addedDataVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIState_addedDataVariable_feature", "_UI_UIState_type"),
				 uisutPackage.Literals.UI_STATE__ADDED_DATA_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deleted Data Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeletedDataVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(
					createItemPropertyDescriptor
				(
						((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIState_deletedDataVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIState_deletedDataVariable_feature", "_UI_UIState_type"),
				 uisutPackage.Literals.UI_STATE__DELETED_DATA_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null
				 )
				 );
	}

	/**
	 * This adds a property descriptor for the Pic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIState_pic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIState_pic_feature", "_UI_UIState_type"),
				 uisutPackage.Literals.UI_STATE__PIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(uisutPackage.Literals.UI_STATE__ITS_UI_CONTROL);
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
	 * This returns UIState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UIState"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UIState)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UIState_type") :
			getString("_UI_UIState_type") + " " + label;
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

		switch (notification.getFeatureID(UIState.class)) {
			case uisutPackage.UI_STATE__IS_INITIAL:
			case uisutPackage.UI_STATE__PIC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case uisutPackage.UI_STATE__ITS_UI_CONTROL:
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
				(uisutPackage.Literals.UI_STATE__ITS_UI_CONTROL,
				 uisutFactory.eINSTANCE.createUIControl()));
	}

}
