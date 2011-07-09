/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uitf.impl;

import java.util.Collection;

import name.niu.guitar.uitf.TestCase;
import name.niu.guitar.uitf.TestSuite;
import name.niu.guitar.uitf.UitfPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uitf.impl.TestSuiteImpl#getItsTestCase <em>Its Test Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuiteImpl extends TestElementImpl implements TestSuite {
	/**
	 * The cached value of the '{@link #getItsTestCase() <em>Its Test Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsTestCase()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> itsTestCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UitfPackage.Literals.TEST_SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getItsTestCase() {
		if (itsTestCase == null) {
			itsTestCase = new EObjectContainmentEList<TestCase>(TestCase.class, this, UitfPackage.TEST_SUITE__ITS_TEST_CASE);
		}
		return itsTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UitfPackage.TEST_SUITE__ITS_TEST_CASE:
				return ((InternalEList<?>)getItsTestCase()).basicRemove(otherEnd, msgs);
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
			case UitfPackage.TEST_SUITE__ITS_TEST_CASE:
				return getItsTestCase();
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
			case UitfPackage.TEST_SUITE__ITS_TEST_CASE:
				getItsTestCase().clear();
				getItsTestCase().addAll((Collection<? extends TestCase>)newValue);
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
			case UitfPackage.TEST_SUITE__ITS_TEST_CASE:
				getItsTestCase().clear();
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
			case UitfPackage.TEST_SUITE__ITS_TEST_CASE:
				return itsTestCase != null && !itsTestCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestSuiteImpl
