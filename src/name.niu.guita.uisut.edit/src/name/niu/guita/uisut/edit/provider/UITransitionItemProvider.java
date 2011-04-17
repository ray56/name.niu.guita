/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.edit.provider;


import java.util.Collection;
import java.util.List;

import name.niu.guita.uisut.UITransition;
import name.niu.guita.uisut.uisutFactory;
import name.niu.guita.uisut.uisutPackage;

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
 * This is the item provider adapter for a {@link name.niu.guita.uisut.UITransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UITransitionItemProvider
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
	public UITransitionItemProvider(AdapterFactory adapterFactory) {
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

			addItsTrgtStatePropertyDescriptor(object);
			addItsSrcStatePropertyDescriptor(object);
			addTriggerStrPropertyDescriptor(object);
			addGuardStrPropertyDescriptor(object);
			addActionStrPropertyDescriptor(object);
			addGuardedDataVariablePropertyDescriptor(object);
			addScriptStrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Its Trgt State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItsTrgtStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UITransition_itsTrgtState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UITransition_itsTrgtState_feature", "_UI_UITransition_type"),
				 uisutPackage.Literals.UI_TRANSITION__ITS_TRGT_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Its Src State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItsSrcStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UITransition_itsSrcState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UITransition_itsSrcState_feature", "_UI_UITransition_type"),
				 uisutPackage.Literals.UI_TRANSITION__ITS_SRC_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trigger Str feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerStrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UITransition_triggerStr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UITransition_triggerStr_feature", "_UI_UITransition_type"),
				 uisutPackage.Literals.UI_TRANSITION__TRIGGER_STR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard Str feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardStrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UITransition_guardStr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UITransition_guardStr_feature", "_UI_UITransition_type"),
				 uisutPackage.Literals.UI_TRANSITION__GUARD_STR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Str feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionStrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UITransition_actionStr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UITransition_actionStr_feature", "_UI_UITransition_type"),
				 uisutPackage.Literals.UI_TRANSITION__ACTION_STR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guarded Data Variable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardedDataVariablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UITransition_guardedDataVariable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UITransition_guardedDataVariable_feature", "_UI_UITransition_type"),
				 uisutPackage.Literals.UI_TRANSITION__GUARDED_DATA_VARIABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Script Str feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptStrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UITransition_scriptStr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UITransition_scriptStr_feature", "_UI_UITransition_type"),
				 uisutPackage.Literals.UI_TRANSITION__SCRIPT_STR,
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
			childrenFeatures.add(uisutPackage.Literals.UI_TRANSITION__ITS_TRIGGER);
			childrenFeatures.add(uisutPackage.Literals.UI_TRANSITION__ITS_CONDITION);
			childrenFeatures.add(uisutPackage.Literals.UI_TRANSITION__ITS_ACTION);
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
	 * This returns UITransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UITransition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UITransition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UITransition_type") :
			getString("_UI_UITransition_type") + " " + label;
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

		switch (notification.getFeatureID(UITransition.class)) {
			case uisutPackage.UI_TRANSITION__TRIGGER_STR:
			case uisutPackage.UI_TRANSITION__GUARD_STR:
			case uisutPackage.UI_TRANSITION__ACTION_STR:
			case uisutPackage.UI_TRANSITION__SCRIPT_STR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case uisutPackage.UI_TRANSITION__ITS_TRIGGER:
			case uisutPackage.UI_TRANSITION__ITS_CONDITION:
			case uisutPackage.UI_TRANSITION__ITS_ACTION:
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
				(uisutPackage.Literals.UI_TRANSITION__ITS_TRIGGER,
				 uisutFactory.eINSTANCE.createUserTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(uisutPackage.Literals.UI_TRANSITION__ITS_TRIGGER,
				 uisutFactory.eINSTANCE.createComponentTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(uisutPackage.Literals.UI_TRANSITION__ITS_CONDITION,
				 uisutFactory.eINSTANCE.createUICondition()));

		newChildDescriptors.add
			(createChildParameter
				(uisutPackage.Literals.UI_TRANSITION__ITS_ACTION,
				 uisutFactory.eINSTANCE.createAction()));
	}

}
