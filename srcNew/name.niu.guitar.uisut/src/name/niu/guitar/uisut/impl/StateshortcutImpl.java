/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import java.util.Collection;

import name.niu.guitar.uisut.CommonState;
import name.niu.guitar.uisut.Stateshortcut;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stateshortcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.impl.StateshortcutImpl#getItsShortcutFor <em>Its Shortcut For</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.StateshortcutImpl#getItsInTransition <em>Its In Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.StateshortcutImpl#getItsOutTransition <em>Its Out Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateshortcutImpl extends UIElementImpl implements Stateshortcut {
	/**
	 * The cached value of the '{@link #getItsShortcutFor() <em>Its Shortcut For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsShortcutFor()
	 * @generated
	 * @ordered
	 */
	protected EList<CommonState> itsShortcutFor;

	/**
	 * The cached value of the '{@link #getItsInTransition() <em>Its In Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsInTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<UITransition> itsInTransition;

	/**
	 * The cached value of the '{@link #getItsOutTransition() <em>Its Out Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsOutTransition()
	 * @generated
	 * @ordered
	 */
	protected UITransition itsOutTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateshortcutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UisutPackage.Literals.STATESHORTCUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommonState> getItsShortcutFor() {
		if (itsShortcutFor == null) {
			itsShortcutFor = new EObjectWithInverseResolvingEList.ManyInverse<CommonState>(CommonState.class, this, UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR, UisutPackage.COMMON_STATE__ITS_SHORTCUT);
		}
		return itsShortcutFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UITransition> getItsInTransition() {
		if (itsInTransition == null) {
			itsInTransition = new EObjectWithInverseResolvingEList<UITransition>(UITransition.class, this, UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION, UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT);
		}
		return itsInTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UITransition getItsOutTransition() {
		if (itsOutTransition != null && itsOutTransition.eIsProxy()) {
			InternalEObject oldItsOutTransition = (InternalEObject)itsOutTransition;
			itsOutTransition = (UITransition)eResolveProxy(oldItsOutTransition);
			if (itsOutTransition != oldItsOutTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION, oldItsOutTransition, itsOutTransition));
			}
		}
		return itsOutTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UITransition basicGetItsOutTransition() {
		return itsOutTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsOutTransition(UITransition newItsOutTransition, NotificationChain msgs) {
		UITransition oldItsOutTransition = itsOutTransition;
		itsOutTransition = newItsOutTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION, oldItsOutTransition, newItsOutTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsOutTransition(UITransition newItsOutTransition) {
		if (newItsOutTransition != itsOutTransition) {
			NotificationChain msgs = null;
			if (itsOutTransition != null)
				msgs = ((InternalEObject)itsOutTransition).eInverseRemove(this, UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT, UITransition.class, msgs);
			if (newItsOutTransition != null)
				msgs = ((InternalEObject)newItsOutTransition).eInverseAdd(this, UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT, UITransition.class, msgs);
			msgs = basicSetItsOutTransition(newItsOutTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION, newItsOutTransition, newItsOutTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItsShortcutFor()).basicAdd(otherEnd, msgs);
			case UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItsInTransition()).basicAdd(otherEnd, msgs);
			case UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION:
				if (itsOutTransition != null)
					msgs = ((InternalEObject)itsOutTransition).eInverseRemove(this, UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT, UITransition.class, msgs);
				return basicSetItsOutTransition((UITransition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR:
				return ((InternalEList<?>)getItsShortcutFor()).basicRemove(otherEnd, msgs);
			case UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION:
				return ((InternalEList<?>)getItsInTransition()).basicRemove(otherEnd, msgs);
			case UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION:
				return basicSetItsOutTransition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR:
				return getItsShortcutFor();
			case UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION:
				return getItsInTransition();
			case UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION:
				if (resolve) return getItsOutTransition();
				return basicGetItsOutTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR:
				getItsShortcutFor().clear();
				getItsShortcutFor().addAll((Collection<? extends CommonState>)newValue);
				return;
			case UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION:
				getItsInTransition().clear();
				getItsInTransition().addAll((Collection<? extends UITransition>)newValue);
				return;
			case UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION:
				setItsOutTransition((UITransition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR:
				getItsShortcutFor().clear();
				return;
			case UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION:
				getItsInTransition().clear();
				return;
			case UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION:
				setItsOutTransition((UITransition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR:
				return itsShortcutFor != null && !itsShortcutFor.isEmpty();
			case UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION:
				return itsInTransition != null && !itsInTransition.isEmpty();
			case UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION:
				return itsOutTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //StateshortcutImpl
