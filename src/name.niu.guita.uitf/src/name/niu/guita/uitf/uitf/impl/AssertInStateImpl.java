/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf.impl;

import name.niu.guita.uitf.uitf.AssertInState;
import name.niu.guita.uitf.uitf.UitfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert In State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.AssertInStateImpl#getStateId <em>State Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertInStateImpl extends StatementImpl implements AssertInState {
	/**
	 * The default value of the '{@link #getStateId() <em>State Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateId() <em>State Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateId()
	 * @generated
	 * @ordered
	 */
	protected String stateId = STATE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertInStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UitfPackage.Literals.ASSERT_IN_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateId() {
		return stateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateId(String newStateId) {
		String oldStateId = stateId;
		stateId = newStateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.ASSERT_IN_STATE__STATE_ID, oldStateId, stateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UitfPackage.ASSERT_IN_STATE__STATE_ID:
				return getStateId();
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
			case UitfPackage.ASSERT_IN_STATE__STATE_ID:
				setStateId((String)newValue);
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
			case UitfPackage.ASSERT_IN_STATE__STATE_ID:
				setStateId(STATE_ID_EDEFAULT);
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
			case UitfPackage.ASSERT_IN_STATE__STATE_ID:
				return STATE_ID_EDEFAULT == null ? stateId != null : !STATE_ID_EDEFAULT.equals(stateId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stateId: ");
		result.append(stateId);
		result.append(')');
		return result.toString();
	}

} //AssertInStateImpl
