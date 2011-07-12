/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import java.util.Collection;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.UIStatemachine;
import name.niu.guitar.uisut.UISystemVariable;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract UI State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl#getItsInTransition <em>Its In Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl#getItsOutTrantion <em>Its Out Trantion</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl#getAddedSystemVariable <em>Added System Variable</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl#getDeletedSystemVariable <em>Deleted System Variable</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl#getScriptStr <em>Script Str</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl#getItsExpendedInTransition <em>Its Expended In Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl#getItsExpendedOutTransition <em>Its Expended Out Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractUIStateImpl extends UIElementImpl implements AbstractUIState {
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
	 * The cached value of the '{@link #getItsOutTrantion() <em>Its Out Trantion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsOutTrantion()
	 * @generated
	 * @ordered
	 */
	protected EList<UITransition> itsOutTrantion;

	/**
	 * The cached value of the '{@link #getAddedSystemVariable() <em>Added System Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddedSystemVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<UISystemVariable> addedSystemVariable;

	/**
	 * The cached value of the '{@link #getDeletedSystemVariable() <em>Deleted System Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedSystemVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<UISystemVariable> deletedSystemVariable;

	/**
	 * The default value of the '{@link #getScriptStr() <em>Script Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptStr()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_STR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptStr() <em>Script Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptStr()
	 * @generated
	 * @ordered
	 */
	protected String scriptStr = SCRIPT_STR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItsExpendedInTransition() <em>Its Expended In Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsExpendedInTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<UITransition> itsExpendedInTransition;

	/**
	 * The cached value of the '{@link #getItsExpendedOutTransition() <em>Its Expended Out Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsExpendedOutTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<UITransition> itsExpendedOutTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractUIStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UisutPackage.Literals.ABSTRACT_UI_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UITransition> getItsInTransition() {
		if (itsInTransition == null) {
			itsInTransition = new EObjectWithInverseResolvingEList<UITransition>(UITransition.class, this, UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION, UisutPackage.UI_TRANSITION__ITS_TAR_STATE);
		}
		return itsInTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UITransition> getItsOutTrantion() {
		if (itsOutTrantion == null) {
			itsOutTrantion = new EObjectWithInverseResolvingEList<UITransition>(UITransition.class, this, UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION, UisutPackage.UI_TRANSITION__ITS_SRC_STATE);
		}
		return itsOutTrantion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UISystemVariable> getAddedSystemVariable() {
		if (addedSystemVariable == null) {
			addedSystemVariable = new EObjectWithInverseResolvingEList.ManyInverse<UISystemVariable>(UISystemVariable.class, this, UisutPackage.ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE, UisutPackage.UI_SYSTEM_VARIABLE__ADD_UI_STATE);
		}
		return addedSystemVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UISystemVariable> getDeletedSystemVariable() {
		if (deletedSystemVariable == null) {
			deletedSystemVariable = new EObjectWithInverseResolvingEList.ManyInverse<UISystemVariable>(UISystemVariable.class, this, UisutPackage.ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE, UisutPackage.UI_SYSTEM_VARIABLE__DELETE_UI_STATE);
		}
		return deletedSystemVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptStr() {
		return scriptStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptStr(String newScriptStr) {
		String oldScriptStr = scriptStr;
		scriptStr = newScriptStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.ABSTRACT_UI_STATE__SCRIPT_STR, oldScriptStr, scriptStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * itsExpendedInTransition is derived
	 */
	public EList<UITransition> getItsExpendedInTransition() {		
		EList<UITransition> itsExpendedInTransition = null ;
		if (itsExpendedInTransition == null) {
			itsExpendedInTransition = new EObjectResolvingEList<UITransition>(UITransition.class, this, UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_IN_TRANSITION);
		}
		itsExpendedInTransition.addAll(getItsInTransition()) ;
		return itsExpendedInTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * itsExpendedOutTransition is derived
	 */
	public EList<UITransition> getItsExpendedOutTransition() {
		EList<UITransition> itsExpendedOutTransition = null ;
		if (itsExpendedOutTransition == null) {
			itsExpendedOutTransition = new EObjectResolvingEList<UITransition>(UITransition.class, this, UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_OUT_TRANSITION);
		}
		itsExpendedOutTransition.addAll(getItsOutTrantion());
		return itsExpendedOutTransition;
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
			case UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItsInTransition()).basicAdd(otherEnd, msgs);
			case UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItsOutTrantion()).basicAdd(otherEnd, msgs);
			case UisutPackage.ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAddedSystemVariable()).basicAdd(otherEnd, msgs);
			case UisutPackage.ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeletedSystemVariable()).basicAdd(otherEnd, msgs);
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
			case UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION:
				return ((InternalEList<?>)getItsInTransition()).basicRemove(otherEnd, msgs);
			case UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION:
				return ((InternalEList<?>)getItsOutTrantion()).basicRemove(otherEnd, msgs);
			case UisutPackage.ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE:
				return ((InternalEList<?>)getAddedSystemVariable()).basicRemove(otherEnd, msgs);
			case UisutPackage.ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE:
				return ((InternalEList<?>)getDeletedSystemVariable()).basicRemove(otherEnd, msgs);
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
			case UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION:
				return getItsInTransition();
			case UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION:
				return getItsOutTrantion();
			case UisutPackage.ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE:
				return getAddedSystemVariable();
			case UisutPackage.ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE:
				return getDeletedSystemVariable();
			case UisutPackage.ABSTRACT_UI_STATE__SCRIPT_STR:
				return getScriptStr();
			case UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_IN_TRANSITION:
				return getItsExpendedInTransition();
			case UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_OUT_TRANSITION:
				return getItsExpendedOutTransition();
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
			case UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION:
				getItsInTransition().clear();
				getItsInTransition().addAll((Collection<? extends UITransition>)newValue);
				return;
			case UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION:
				getItsOutTrantion().clear();
				getItsOutTrantion().addAll((Collection<? extends UITransition>)newValue);
				return;
			case UisutPackage.ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE:
				getAddedSystemVariable().clear();
				getAddedSystemVariable().addAll((Collection<? extends UISystemVariable>)newValue);
				return;
			case UisutPackage.ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE:
				getDeletedSystemVariable().clear();
				getDeletedSystemVariable().addAll((Collection<? extends UISystemVariable>)newValue);
				return;
			case UisutPackage.ABSTRACT_UI_STATE__SCRIPT_STR:
				setScriptStr((String)newValue);
				return;
			case UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_IN_TRANSITION:
				getItsExpendedInTransition().clear();
				getItsExpendedInTransition().addAll((Collection<? extends UITransition>)newValue);
				return;
			case UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_OUT_TRANSITION:
				getItsExpendedOutTransition().clear();
				getItsExpendedOutTransition().addAll((Collection<? extends UITransition>)newValue);
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
			case UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION:
				getItsInTransition().clear();
				return;
			case UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION:
				getItsOutTrantion().clear();
				return;
			case UisutPackage.ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE:
				getAddedSystemVariable().clear();
				return;
			case UisutPackage.ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE:
				getDeletedSystemVariable().clear();
				return;
			case UisutPackage.ABSTRACT_UI_STATE__SCRIPT_STR:
				setScriptStr(SCRIPT_STR_EDEFAULT);
				return;
			case UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_IN_TRANSITION:
				getItsExpendedInTransition().clear();
				return;
			case UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_OUT_TRANSITION:
				getItsExpendedOutTransition().clear();
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
			case UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION:
				return itsInTransition != null && !itsInTransition.isEmpty();
			case UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION:
				return itsOutTrantion != null && !itsOutTrantion.isEmpty();
			case UisutPackage.ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE:
				return addedSystemVariable != null && !addedSystemVariable.isEmpty();
			case UisutPackage.ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE:
				return deletedSystemVariable != null && !deletedSystemVariable.isEmpty();
			case UisutPackage.ABSTRACT_UI_STATE__SCRIPT_STR:
				return SCRIPT_STR_EDEFAULT == null ? scriptStr != null : !SCRIPT_STR_EDEFAULT.equals(scriptStr);
			case UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_IN_TRANSITION:
				return itsExpendedInTransition != null && !itsExpendedInTransition.isEmpty();
			case UisutPackage.ABSTRACT_UI_STATE__ITS_EXPENDED_OUT_TRANSITION:
				return itsExpendedOutTransition != null && !itsExpendedOutTransition.isEmpty();
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
		result.append(" (scriptStr: ");
		result.append(scriptStr);
		result.append(')');
		return result.toString();
	}

} //AbstractUIStateImpl
