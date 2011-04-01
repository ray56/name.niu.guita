/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf.impl;

import name.niu.guita.uitf.uitf.UIControl;
import name.niu.guita.uitf.uitf.UitfPackage;
import name.niu.guita.uitf.uitf.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.UIControlImpl#getItsVariable <em>Its Variable</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.UIControlImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIControlImpl extends EObjectImpl implements UIControl {
	/**
	 * The cached value of the '{@link #getItsVariable() <em>Its Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable itsVariable;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UitfPackage.Literals.UI_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getItsVariable() {
		if (itsVariable != null && itsVariable.eIsProxy()) {
			InternalEObject oldItsVariable = (InternalEObject)itsVariable;
			itsVariable = (Variable)eResolveProxy(oldItsVariable);
			if (itsVariable != oldItsVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UitfPackage.UI_CONTROL__ITS_VARIABLE, oldItsVariable, itsVariable));
			}
		}
		return itsVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetItsVariable() {
		return itsVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsVariable(Variable newItsVariable) {
		Variable oldItsVariable = itsVariable;
		itsVariable = newItsVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.UI_CONTROL__ITS_VARIABLE, oldItsVariable, itsVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.UI_CONTROL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UitfPackage.UI_CONTROL__ITS_VARIABLE:
				if (resolve) return getItsVariable();
				return basicGetItsVariable();
			case UitfPackage.UI_CONTROL__ID:
				return getId();
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
			case UitfPackage.UI_CONTROL__ITS_VARIABLE:
				setItsVariable((Variable)newValue);
				return;
			case UitfPackage.UI_CONTROL__ID:
				setId((String)newValue);
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
			case UitfPackage.UI_CONTROL__ITS_VARIABLE:
				setItsVariable((Variable)null);
				return;
			case UitfPackage.UI_CONTROL__ID:
				setId(ID_EDEFAULT);
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
			case UitfPackage.UI_CONTROL__ITS_VARIABLE:
				return itsVariable != null;
			case UitfPackage.UI_CONTROL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //UIControlImpl
