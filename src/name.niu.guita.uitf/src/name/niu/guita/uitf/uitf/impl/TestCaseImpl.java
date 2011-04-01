/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf.impl;

import java.util.Collection;

import name.niu.guita.uitf.uitf.Statement;
import name.niu.guita.uitf.uitf.TestCase;
import name.niu.guita.uitf.uitf.UISUT;
import name.niu.guita.uitf.uitf.UitfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.TestCaseImpl#getItsUISUT <em>Its UISUT</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.TestCaseImpl#getItsStatement <em>Its Statement</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.TestCaseImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestCaseImpl extends EObjectImpl implements TestCase {
	/**
	 * The cached value of the '{@link #getItsUISUT() <em>Its UISUT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsUISUT()
	 * @generated
	 * @ordered
	 */
	protected UISUT itsUISUT;

	/**
	 * The cached value of the '{@link #getItsStatement() <em>Its Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> itsStatement;

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
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UitfPackage.Literals.TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISUT getItsUISUT() {
		return itsUISUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsUISUT(UISUT newItsUISUT, NotificationChain msgs) {
		UISUT oldItsUISUT = itsUISUT;
		itsUISUT = newItsUISUT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UitfPackage.TEST_CASE__ITS_UISUT, oldItsUISUT, newItsUISUT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsUISUT(UISUT newItsUISUT) {
		if (newItsUISUT != itsUISUT) {
			NotificationChain msgs = null;
			if (itsUISUT != null)
				msgs = ((InternalEObject)itsUISUT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UitfPackage.TEST_CASE__ITS_UISUT, null, msgs);
			if (newItsUISUT != null)
				msgs = ((InternalEObject)newItsUISUT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UitfPackage.TEST_CASE__ITS_UISUT, null, msgs);
			msgs = basicSetItsUISUT(newItsUISUT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.TEST_CASE__ITS_UISUT, newItsUISUT, newItsUISUT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getItsStatement() {
		if (itsStatement == null) {
			itsStatement = new EObjectContainmentEList<Statement>(Statement.class, this, UitfPackage.TEST_CASE__ITS_STATEMENT);
		}
		return itsStatement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.TEST_CASE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UitfPackage.TEST_CASE__ITS_UISUT:
				return basicSetItsUISUT(null, msgs);
			case UitfPackage.TEST_CASE__ITS_STATEMENT:
				return ((InternalEList<?>)getItsStatement()).basicRemove(otherEnd, msgs);
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
			case UitfPackage.TEST_CASE__ITS_UISUT:
				return getItsUISUT();
			case UitfPackage.TEST_CASE__ITS_STATEMENT:
				return getItsStatement();
			case UitfPackage.TEST_CASE__ID:
				return getId();
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
			case UitfPackage.TEST_CASE__ITS_UISUT:
				setItsUISUT((UISUT)newValue);
				return;
			case UitfPackage.TEST_CASE__ITS_STATEMENT:
				getItsStatement().clear();
				getItsStatement().addAll((Collection<? extends Statement>)newValue);
				return;
			case UitfPackage.TEST_CASE__ID:
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
			case UitfPackage.TEST_CASE__ITS_UISUT:
				setItsUISUT((UISUT)null);
				return;
			case UitfPackage.TEST_CASE__ITS_STATEMENT:
				getItsStatement().clear();
				return;
			case UitfPackage.TEST_CASE__ID:
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
			case UitfPackage.TEST_CASE__ITS_UISUT:
				return itsUISUT != null;
			case UitfPackage.TEST_CASE__ITS_STATEMENT:
				return itsStatement != null && !itsStatement.isEmpty();
			case UitfPackage.TEST_CASE__ID:
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

} //TestCaseImpl
