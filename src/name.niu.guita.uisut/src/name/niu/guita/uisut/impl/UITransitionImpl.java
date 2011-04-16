/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.AbstractState;
import name.niu.guita.uisut.Action;
import name.niu.guita.uisut.UICondition;
import name.niu.guita.uisut.UIDataVariable;
import name.niu.guita.uisut.UITransition;
import name.niu.guita.uisut.UITrigger;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getItsTrgtState <em>Its Trgt State</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getItsSrcState <em>Its Src State</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getItsTrigger <em>Its Trigger</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getItsCondition <em>Its Condition</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getItsAction <em>Its Action</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getTriggerStr <em>Trigger Str</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getGuardStr <em>Guard Str</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getActionStr <em>Action Str</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getGuardedDataVariable <em>Guarded Data Variable</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UITransitionImpl#getScriptStr <em>Script Str</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UITransitionImpl extends UISUTElementImpl implements UITransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UITransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return uisutPackage.Literals.UI_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState getItsTrgtState() {
		return (AbstractState)eGet(uisutPackage.Literals.UI_TRANSITION__ITS_TRGT_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsTrgtState(AbstractState newItsTrgtState) {
		eSet(uisutPackage.Literals.UI_TRANSITION__ITS_TRGT_STATE, newItsTrgtState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState getItsSrcState() {
		return (AbstractState)eGet(uisutPackage.Literals.UI_TRANSITION__ITS_SRC_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsSrcState(AbstractState newItsSrcState) {
		eSet(uisutPackage.Literals.UI_TRANSITION__ITS_SRC_STATE, newItsSrcState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UITrigger getItsTrigger() {
		return (UITrigger)eGet(uisutPackage.Literals.UI_TRANSITION__ITS_TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsTrigger(UITrigger newItsTrigger) {
		eSet(uisutPackage.Literals.UI_TRANSITION__ITS_TRIGGER, newItsTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UICondition getItsCondition() {
		return (UICondition)eGet(uisutPackage.Literals.UI_TRANSITION__ITS_CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsCondition(UICondition newItsCondition) {
		eSet(uisutPackage.Literals.UI_TRANSITION__ITS_CONDITION, newItsCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getItsAction() {
		return (Action)eGet(uisutPackage.Literals.UI_TRANSITION__ITS_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsAction(Action newItsAction) {
		eSet(uisutPackage.Literals.UI_TRANSITION__ITS_ACTION, newItsAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerStr() {
		return (String)eGet(uisutPackage.Literals.UI_TRANSITION__TRIGGER_STR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerStr(String newTriggerStr) {
		eSet(uisutPackage.Literals.UI_TRANSITION__TRIGGER_STR, newTriggerStr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardStr() {
		return (String)eGet(uisutPackage.Literals.UI_TRANSITION__GUARD_STR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardStr(String newGuardStr) {
		eSet(uisutPackage.Literals.UI_TRANSITION__GUARD_STR, newGuardStr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStr() {
		return (String)eGet(uisutPackage.Literals.UI_TRANSITION__ACTION_STR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStr(String newActionStr) {
		eSet(uisutPackage.Literals.UI_TRANSITION__ACTION_STR, newActionStr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UIDataVariable> getGuardedDataVariable() {
		return (EList<UIDataVariable>)eGet(uisutPackage.Literals.UI_TRANSITION__GUARDED_DATA_VARIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptStr() {
		return (String)eGet(uisutPackage.Literals.UI_TRANSITION__SCRIPT_STR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptStr(String newScriptStr) {
		eSet(uisutPackage.Literals.UI_TRANSITION__SCRIPT_STR, newScriptStr);
	}

} //UITransitionImpl
