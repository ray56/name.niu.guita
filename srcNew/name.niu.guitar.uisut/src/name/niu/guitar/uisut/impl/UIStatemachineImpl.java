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
import name.niu.guitar.uisut.UISystemVariablePool;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.impl.UIStatemachineImpl#getItsUIState <em>Its UI State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UIStatemachineImpl#getItsUITransition <em>Its UI Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UIStatemachineImpl#getItsSubSTM <em>Its Sub STM</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UIStatemachineImpl#getItsUISystemVariablePool <em>Its UI System Variable Pool</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UIStatemachineImpl#getItsUISystemVariable <em>Its UI System Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIStatemachineImpl extends UIElementImpl implements UIStatemachine {
	/**
	 * The cached value of the '{@link #getItsUIState() <em>Its UI State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsUIState()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractUIState> itsUIState;

	/**
	 * The cached value of the '{@link #getItsUITransition() <em>Its UI Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsUITransition()
	 * @generated
	 * @ordered
	 */
	protected EList<UITransition> itsUITransition;

	/**
	 * The cached value of the '{@link #getItsSubSTM() <em>Its Sub STM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSubSTM()
	 * @generated
	 * @ordered
	 */
	protected EList<UIStatemachine> itsSubSTM;

	/**
	 * The cached value of the '{@link #getItsUISystemVariablePool() <em>Its UI System Variable Pool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsUISystemVariablePool()
	 * @generated
	 * @ordered
	 */
	protected UISystemVariablePool itsUISystemVariablePool;

	/**
	 * The cached value of the '{@link #getItsUISystemVariable() <em>Its UI System Variable</em>}' reference list.
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
	protected UIStatemachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UisutPackage.Literals.UI_STATEMACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractUIState> getItsUIState() {
		if (itsUIState == null) {
			itsUIState = new EObjectContainmentEList<AbstractUIState>(AbstractUIState.class, this, UisutPackage.UI_STATEMACHINE__ITS_UI_STATE);
		}
		return itsUIState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UITransition> getItsUITransition() {
		if (itsUITransition == null) {
			itsUITransition = new EObjectContainmentEList<UITransition>(UITransition.class, this, UisutPackage.UI_STATEMACHINE__ITS_UI_TRANSITION);
		}
		return itsUITransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<UISystemVariable> getItsUISystemVariable() {
		UISystemVariablePool pool = getItsUISystemVariablePool() ;
		if ( pool != null ) {
			return pool.getItsUISystemVariable() ;
		} else {
			return new EObjectResolvingEList<UISystemVariable>(UISystemVariable.class, this, UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE) ;
		}
//		if (itsUISystemVariable == null) {
//			itsUISystemVariable = new EObjectResolvingEList<UISystemVariable>(UISystemVariable.class, this, UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE);
//		}
//		return itsUISystemVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIStatemachine> getItsSubSTM() {
		if (itsSubSTM == null) {
			itsSubSTM = new EObjectContainmentEList<UIStatemachine>(UIStatemachine.class, this, UisutPackage.UI_STATEMACHINE__ITS_SUB_STM);
		}
		return itsSubSTM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISystemVariablePool getItsUISystemVariablePool() {
		return itsUISystemVariablePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsUISystemVariablePool(UISystemVariablePool newItsUISystemVariablePool, NotificationChain msgs) {
		UISystemVariablePool oldItsUISystemVariablePool = itsUISystemVariablePool;
		itsUISystemVariablePool = newItsUISystemVariablePool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL, oldItsUISystemVariablePool, newItsUISystemVariablePool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsUISystemVariablePool(UISystemVariablePool newItsUISystemVariablePool) {
		if (newItsUISystemVariablePool != itsUISystemVariablePool) {
			NotificationChain msgs = null;
			if (itsUISystemVariablePool != null)
				msgs = ((InternalEObject)itsUISystemVariablePool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL, null, msgs);
			if (newItsUISystemVariablePool != null)
				msgs = ((InternalEObject)newItsUISystemVariablePool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL, null, msgs);
			msgs = basicSetItsUISystemVariablePool(newItsUISystemVariablePool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL, newItsUISystemVariablePool, newItsUISystemVariablePool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UisutPackage.UI_STATEMACHINE__ITS_UI_STATE:
				return ((InternalEList<?>)getItsUIState()).basicRemove(otherEnd, msgs);
			case UisutPackage.UI_STATEMACHINE__ITS_UI_TRANSITION:
				return ((InternalEList<?>)getItsUITransition()).basicRemove(otherEnd, msgs);
			case UisutPackage.UI_STATEMACHINE__ITS_SUB_STM:
				return ((InternalEList<?>)getItsSubSTM()).basicRemove(otherEnd, msgs);
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL:
				return basicSetItsUISystemVariablePool(null, msgs);
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
			case UisutPackage.UI_STATEMACHINE__ITS_UI_STATE:
				return getItsUIState();
			case UisutPackage.UI_STATEMACHINE__ITS_UI_TRANSITION:
				return getItsUITransition();
			case UisutPackage.UI_STATEMACHINE__ITS_SUB_STM:
				return getItsSubSTM();
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL:
				return getItsUISystemVariablePool();
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE:
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
			case UisutPackage.UI_STATEMACHINE__ITS_UI_STATE:
				getItsUIState().clear();
				getItsUIState().addAll((Collection<? extends AbstractUIState>)newValue);
				return;
			case UisutPackage.UI_STATEMACHINE__ITS_UI_TRANSITION:
				getItsUITransition().clear();
				getItsUITransition().addAll((Collection<? extends UITransition>)newValue);
				return;
			case UisutPackage.UI_STATEMACHINE__ITS_SUB_STM:
				getItsSubSTM().clear();
				getItsSubSTM().addAll((Collection<? extends UIStatemachine>)newValue);
				return;
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL:
				setItsUISystemVariablePool((UISystemVariablePool)newValue);
				return;
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE:
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
			case UisutPackage.UI_STATEMACHINE__ITS_UI_STATE:
				getItsUIState().clear();
				return;
			case UisutPackage.UI_STATEMACHINE__ITS_UI_TRANSITION:
				getItsUITransition().clear();
				return;
			case UisutPackage.UI_STATEMACHINE__ITS_SUB_STM:
				getItsSubSTM().clear();
				return;
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL:
				setItsUISystemVariablePool((UISystemVariablePool)null);
				return;
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE:
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
			case UisutPackage.UI_STATEMACHINE__ITS_UI_STATE:
				return itsUIState != null && !itsUIState.isEmpty();
			case UisutPackage.UI_STATEMACHINE__ITS_UI_TRANSITION:
				return itsUITransition != null && !itsUITransition.isEmpty();
			case UisutPackage.UI_STATEMACHINE__ITS_SUB_STM:
				return itsSubSTM != null && !itsSubSTM.isEmpty();
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL:
				return itsUISystemVariablePool != null;
			case UisutPackage.UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE:
				return itsUISystemVariable != null && !itsUISystemVariable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UIStatemachineImpl
