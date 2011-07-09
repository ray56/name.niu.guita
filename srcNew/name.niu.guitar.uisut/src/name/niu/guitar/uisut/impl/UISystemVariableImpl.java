/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import java.util.Collection;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.UISystemVariable;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI System Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.impl.UISystemVariableImpl#getAddUIState <em>Add UI State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UISystemVariableImpl#getDeleteUIState <em>Delete UI State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UISystemVariableImpl#getGuardUITransitions <em>Guard UI Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UISystemVariableImpl extends UIElementImpl implements UISystemVariable {
	/**
	 * The cached value of the '{@link #getAddUIState() <em>Add UI State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddUIState()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUIState> addUIState;

	/**
	 * The cached value of the '{@link #getDeleteUIState() <em>Delete UI State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteUIState()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUIState> deleteUIState;

	/**
	 * The cached value of the '{@link #getGuardUITransitions() <em>Guard UI Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardUITransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<UITransition> guardUITransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISystemVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UisutPackage.Literals.UI_SYSTEM_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractUIState> getAddUIState() {
		if (addUIState == null) {
			addUIState = new EObjectWithInverseResolvingEList.ManyInverse<AbstractUIState>(AbstractUIState.class, this, UisutPackage.UI_SYSTEM_VARIABLE__ADD_UI_STATE, UisutPackage.ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE);
		}
		return addUIState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractUIState> getDeleteUIState() {
		if (deleteUIState == null) {
			deleteUIState = new EObjectWithInverseResolvingEList.ManyInverse<AbstractUIState>(AbstractUIState.class, this, UisutPackage.UI_SYSTEM_VARIABLE__DELETE_UI_STATE, UisutPackage.ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE);
		}
		return deleteUIState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UITransition> getGuardUITransitions() {
		if (guardUITransitions == null) {
			guardUITransitions = new EObjectWithInverseResolvingEList.ManyInverse<UITransition>(UITransition.class, this, UisutPackage.UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS, UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE);
		}
		return guardUITransitions;
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
			case UisutPackage.UI_SYSTEM_VARIABLE__ADD_UI_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddUIState()).basicAdd(otherEnd, msgs);
			case UisutPackage.UI_SYSTEM_VARIABLE__DELETE_UI_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeleteUIState()).basicAdd(otherEnd, msgs);
			case UisutPackage.UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGuardUITransitions()).basicAdd(otherEnd, msgs);
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
			case UisutPackage.UI_SYSTEM_VARIABLE__ADD_UI_STATE:
				return ((InternalEList<?>)getAddUIState()).basicRemove(otherEnd, msgs);
			case UisutPackage.UI_SYSTEM_VARIABLE__DELETE_UI_STATE:
				return ((InternalEList<?>)getDeleteUIState()).basicRemove(otherEnd, msgs);
			case UisutPackage.UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS:
				return ((InternalEList<?>)getGuardUITransitions()).basicRemove(otherEnd, msgs);
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
			case UisutPackage.UI_SYSTEM_VARIABLE__ADD_UI_STATE:
				return getAddUIState();
			case UisutPackage.UI_SYSTEM_VARIABLE__DELETE_UI_STATE:
				return getDeleteUIState();
			case UisutPackage.UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS:
				return getGuardUITransitions();
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
			case UisutPackage.UI_SYSTEM_VARIABLE__ADD_UI_STATE:
				getAddUIState().clear();
				getAddUIState().addAll((Collection<? extends AbstractUIState>)newValue);
				return;
			case UisutPackage.UI_SYSTEM_VARIABLE__DELETE_UI_STATE:
				getDeleteUIState().clear();
				getDeleteUIState().addAll((Collection<? extends AbstractUIState>)newValue);
				return;
			case UisutPackage.UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS:
				getGuardUITransitions().clear();
				getGuardUITransitions().addAll((Collection<? extends UITransition>)newValue);
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
			case UisutPackage.UI_SYSTEM_VARIABLE__ADD_UI_STATE:
				getAddUIState().clear();
				return;
			case UisutPackage.UI_SYSTEM_VARIABLE__DELETE_UI_STATE:
				getDeleteUIState().clear();
				return;
			case UisutPackage.UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS:
				getGuardUITransitions().clear();
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
			case UisutPackage.UI_SYSTEM_VARIABLE__ADD_UI_STATE:
				return addUIState != null && !addUIState.isEmpty();
			case UisutPackage.UI_SYSTEM_VARIABLE__DELETE_UI_STATE:
				return deleteUIState != null && !deleteUIState.isEmpty();
			case UisutPackage.UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS:
				return guardUITransitions != null && !guardUITransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UISystemVariableImpl
