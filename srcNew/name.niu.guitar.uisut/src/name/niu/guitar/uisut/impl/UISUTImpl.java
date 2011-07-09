/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import name.niu.guitar.uisut.UISUT;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UisutPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UISUT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.impl.UISUTImpl#getItsSTM <em>Its STM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UISUTImpl extends UIElementImpl implements UISUT {
	/**
	 * The cached value of the '{@link #getItsSTM() <em>Its STM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSTM()
	 * @generated
	 * @ordered
	 */
	protected UIStatemachine itsSTM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISUTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UisutPackage.Literals.UISUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIStatemachine getItsSTM() {
		return itsSTM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsSTM(UIStatemachine newItsSTM, NotificationChain msgs) {
		UIStatemachine oldItsSTM = itsSTM;
		itsSTM = newItsSTM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UisutPackage.UISUT__ITS_STM, oldItsSTM, newItsSTM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsSTM(UIStatemachine newItsSTM) {
		if (newItsSTM != itsSTM) {
			NotificationChain msgs = null;
			if (itsSTM != null)
				msgs = ((InternalEObject)itsSTM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UisutPackage.UISUT__ITS_STM, null, msgs);
			if (newItsSTM != null)
				msgs = ((InternalEObject)newItsSTM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UisutPackage.UISUT__ITS_STM, null, msgs);
			msgs = basicSetItsSTM(newItsSTM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UISUT__ITS_STM, newItsSTM, newItsSTM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UisutPackage.UISUT__ITS_STM:
				return basicSetItsSTM(null, msgs);
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
			case UisutPackage.UISUT__ITS_STM:
				return getItsSTM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UisutPackage.UISUT__ITS_STM:
				setItsSTM((UIStatemachine)newValue);
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
			case UisutPackage.UISUT__ITS_STM:
				setItsSTM((UIStatemachine)null);
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
			case UisutPackage.UISUT__ITS_STM:
				return itsSTM != null;
		}
		return super.eIsSet(featureID);
	}

} //UISUTImpl
