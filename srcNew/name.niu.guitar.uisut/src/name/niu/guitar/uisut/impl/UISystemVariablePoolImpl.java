/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import java.util.Collection;

import name.niu.guitar.uisut.UISystemVariable;
import name.niu.guitar.uisut.UISystemVariablePool;
import name.niu.guitar.uisut.UisutPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI System Variable Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.impl.UISystemVariablePoolImpl#getItsUISystemVariable <em>Its UI System Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UISystemVariablePoolImpl extends UIElementImpl implements UISystemVariablePool {
	/**
	 * The cached value of the '{@link #getItsUISystemVariable() <em>Its UI System Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsUISystemVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<UISystemVariable> itsUISystemVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISystemVariablePoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UisutPackage.Literals.UI_SYSTEM_VARIABLE_POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UISystemVariable> getItsUISystemVariable() {
		if (itsUISystemVariable == null) {
			itsUISystemVariable = new EObjectContainmentEList<UISystemVariable>(UISystemVariable.class, this, UisutPackage.UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE);
		}
		return itsUISystemVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UisutPackage.UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE:
				return ((InternalEList<?>)getItsUISystemVariable()).basicRemove(otherEnd, msgs);
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
			case UisutPackage.UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE:
				return getItsUISystemVariable();
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
			case UisutPackage.UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE:
				getItsUISystemVariable().clear();
				getItsUISystemVariable().addAll((Collection<? extends UISystemVariable>)newValue);
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
			case UisutPackage.UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE:
				getItsUISystemVariable().clear();
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
			case UisutPackage.UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE:
				return itsUISystemVariable != null && !itsUISystemVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UISystemVariablePoolImpl
