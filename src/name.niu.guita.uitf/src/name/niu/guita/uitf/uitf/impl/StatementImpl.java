/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf.impl;

import name.niu.guita.uitf.uitf.Statement;
import name.niu.guita.uitf.uitf.UitfPackage;
import name.niu.guita.uitf.uitf.UserInstructionEnum;
import name.niu.guita.uitf.uitf.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.StatementImpl#getItsVariable <em>Its Variable</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.StatementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.StatementImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends EObjectImpl implements Statement {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final UserInstructionEnum KIND_EDEFAULT = UserInstructionEnum.SET_UI_VALUE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected UserInstructionEnum kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UitfPackage.Literals.STATEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UitfPackage.STATEMENT__ITS_VARIABLE, oldItsVariable, itsVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.STATEMENT__ITS_VARIABLE, oldItsVariable, itsVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.STATEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInstructionEnum getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(UserInstructionEnum newKind) {
		UserInstructionEnum oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.STATEMENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UitfPackage.STATEMENT__ITS_VARIABLE:
				if (resolve) return getItsVariable();
				return basicGetItsVariable();
			case UitfPackage.STATEMENT__DESCRIPTION:
				return getDescription();
			case UitfPackage.STATEMENT__KIND:
				return getKind();
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
			case UitfPackage.STATEMENT__ITS_VARIABLE:
				setItsVariable((Variable)newValue);
				return;
			case UitfPackage.STATEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case UitfPackage.STATEMENT__KIND:
				setKind((UserInstructionEnum)newValue);
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
			case UitfPackage.STATEMENT__ITS_VARIABLE:
				setItsVariable((Variable)null);
				return;
			case UitfPackage.STATEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case UitfPackage.STATEMENT__KIND:
				setKind(KIND_EDEFAULT);
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
			case UitfPackage.STATEMENT__ITS_VARIABLE:
				return itsVariable != null;
			case UitfPackage.STATEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case UitfPackage.STATEMENT__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //StatementImpl
