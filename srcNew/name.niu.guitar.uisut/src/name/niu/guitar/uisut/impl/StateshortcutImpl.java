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
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateshortcutImpl extends VertexImpl implements Stateshortcut {
	/**
	 * The cached value of the '{@link #getItsShortcutFor() <em>Its Shortcut For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsShortcutFor()
	 * @generated
	 * @ordered
	 */
	protected CommonState itsShortcutFor;

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
	public CommonState getItsShortcutFor() {
		if (itsShortcutFor != null && itsShortcutFor.eIsProxy()) {
			InternalEObject oldItsShortcutFor = (InternalEObject)itsShortcutFor;
			itsShortcutFor = (CommonState)eResolveProxy(oldItsShortcutFor);
			if (itsShortcutFor != oldItsShortcutFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR, oldItsShortcutFor, itsShortcutFor));
			}
		}
		return itsShortcutFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonState basicGetItsShortcutFor() {
		return itsShortcutFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsShortcutFor(CommonState newItsShortcutFor, NotificationChain msgs) {
		CommonState oldItsShortcutFor = itsShortcutFor;
		itsShortcutFor = newItsShortcutFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR, oldItsShortcutFor, newItsShortcutFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsShortcutFor(CommonState newItsShortcutFor) {
		if (newItsShortcutFor != itsShortcutFor) {
			NotificationChain msgs = null;
			if (itsShortcutFor != null)
				msgs = ((InternalEObject)itsShortcutFor).eInverseRemove(this, UisutPackage.COMMON_STATE__ITS_SHORTCUT, CommonState.class, msgs);
			if (newItsShortcutFor != null)
				msgs = ((InternalEObject)newItsShortcutFor).eInverseAdd(this, UisutPackage.COMMON_STATE__ITS_SHORTCUT, CommonState.class, msgs);
			msgs = basicSetItsShortcutFor(newItsShortcutFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.STATESHORTCUT__ITS_SHORTCUT_FOR, newItsShortcutFor, newItsShortcutFor));
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
				if (itsShortcutFor != null)
					msgs = ((InternalEObject)itsShortcutFor).eInverseRemove(this, UisutPackage.COMMON_STATE__ITS_SHORTCUT, CommonState.class, msgs);
				return basicSetItsShortcutFor((CommonState)otherEnd, msgs);
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
				return basicSetItsShortcutFor(null, msgs);
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
				if (resolve) return getItsShortcutFor();
				return basicGetItsShortcutFor();
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
				setItsShortcutFor((CommonState)newValue);
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
				setItsShortcutFor((CommonState)null);
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
				return itsShortcutFor != null;
		}
		return super.eIsSet(featureID);
	}

} //StateshortcutImpl
