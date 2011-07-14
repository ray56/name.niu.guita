/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import java.util.Collection;

import name.niu.guitar.uisut.AbstractUIState;
import name.niu.guitar.uisut.Stateshortcut;
import name.niu.guitar.uisut.UISystemVariable;
import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutPackage;

import name.niu.guitar.uisut.Vertex;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getItsSrcState <em>Its Src State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getItsTarState <em>Its Tar State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getGuardedSystemVariable <em>Guarded System Variable</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getScriptStr <em>Script Str</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getItsExpandedTarState <em>Its Expanded Tar State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getItsExpandedSrcState <em>Its Expanded Src State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UITransitionImpl extends UIElementImpl implements UITransition {
	/**
	 * The cached value of the '{@link #getItsSrcState() <em>Its Src State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSrcState()
	 * @generated
	 * @ordered
	 */
	protected Vertex itsSrcState;

	/**
	 * The cached value of the '{@link #getItsTarState() <em>Its Tar State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsTarState()
	 * @generated
	 * @ordered
	 */
	protected Vertex itsTarState;

	/**
	 * The cached value of the '{@link #getGuardedSystemVariable() <em>Guarded System Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardedSystemVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<UISystemVariable> guardedSystemVariable;

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
	 * The cached value of the '{@link #getItsExpandedTarState() <em>Its Expanded Tar State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsExpandedTarState()
	 * @generated
	 * @ordered
	 */
	protected AbstractUIState itsExpandedTarState;

	/**
	 * The cached value of the '{@link #getItsExpandedSrcState() <em>Its Expanded Src State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsExpandedSrcState()
	 * @generated
	 * @ordered
	 */
	protected AbstractUIState itsExpandedSrcState;

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
		return UisutPackage.Literals.UI_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getItsSrcState() {
		if (itsSrcState != null && itsSrcState.eIsProxy()) {
			InternalEObject oldItsSrcState = (InternalEObject)itsSrcState;
			itsSrcState = (Vertex)eResolveProxy(oldItsSrcState);
			if (itsSrcState != oldItsSrcState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UisutPackage.UI_TRANSITION__ITS_SRC_STATE, oldItsSrcState, itsSrcState));
			}
		}
		return itsSrcState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetItsSrcState() {
		return itsSrcState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsSrcState(Vertex newItsSrcState, NotificationChain msgs) {
		Vertex oldItsSrcState = itsSrcState;
		itsSrcState = newItsSrcState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_SRC_STATE, oldItsSrcState, newItsSrcState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsSrcState(Vertex newItsSrcState) {
		if (newItsSrcState != itsSrcState) {
			NotificationChain msgs = null;
			if (itsSrcState != null)
				msgs = ((InternalEObject)itsSrcState).eInverseRemove(this, UisutPackage.VERTEX__ITS_OUT_TRANSITION, Vertex.class, msgs);
			if (newItsSrcState != null)
				msgs = ((InternalEObject)newItsSrcState).eInverseAdd(this, UisutPackage.VERTEX__ITS_OUT_TRANSITION, Vertex.class, msgs);
			msgs = basicSetItsSrcState(newItsSrcState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_SRC_STATE, newItsSrcState, newItsSrcState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getItsTarState() {
		if (itsTarState != null && itsTarState.eIsProxy()) {
			InternalEObject oldItsTarState = (InternalEObject)itsTarState;
			itsTarState = (Vertex)eResolveProxy(oldItsTarState);
			if (itsTarState != oldItsTarState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UisutPackage.UI_TRANSITION__ITS_TAR_STATE, oldItsTarState, itsTarState));
			}
		}
		return itsTarState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetItsTarState() {
		return itsTarState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsTarState(Vertex newItsTarState, NotificationChain msgs) {
		Vertex oldItsTarState = itsTarState;
		itsTarState = newItsTarState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_TAR_STATE, oldItsTarState, newItsTarState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsTarState(Vertex newItsTarState) {
		if (newItsTarState != itsTarState) {
			NotificationChain msgs = null;
			if (itsTarState != null)
				msgs = ((InternalEObject)itsTarState).eInverseRemove(this, UisutPackage.VERTEX__ITS_IN_TRANSITION, Vertex.class, msgs);
			if (newItsTarState != null)
				msgs = ((InternalEObject)newItsTarState).eInverseAdd(this, UisutPackage.VERTEX__ITS_IN_TRANSITION, Vertex.class, msgs);
			msgs = basicSetItsTarState(newItsTarState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_TAR_STATE, newItsTarState, newItsTarState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UISystemVariable> getGuardedSystemVariable() {
		if (guardedSystemVariable == null) {
			guardedSystemVariable = new EObjectWithInverseResolvingEList.ManyInverse<UISystemVariable>(UISystemVariable.class, this, UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE, UisutPackage.UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS);
		}
		return guardedSystemVariable;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__SCRIPT_STR, oldScriptStr, scriptStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * itsExpandedTarState is derived
	 */
	public AbstractUIState getItsExpandedTarState() {
		
		Vertex target = getItsTarState() ;
		if ( target != null ) {
			if ( target instanceof Stateshortcut ){
				return ((Stateshortcut)target).getItsShortcutFor() ;
			} else if ( target instanceof AbstractUIState ){
				return (AbstractUIState)target ;
			} else {
				assert(false):"domain model changed?";
				return null ;
			}
		} else {
			return null ;
		}
		
//		if (itsExpandedTarState != null && itsExpandedTarState.eIsProxy()) {
//			InternalEObject oldItsExpandedTarState = (InternalEObject)itsExpandedTarState;
//			itsExpandedTarState = (AbstractUIState)eResolveProxy(oldItsExpandedTarState);
//			if (itsExpandedTarState != oldItsExpandedTarState) {
//				if (eNotificationRequired())
//					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE, oldItsExpandedTarState, itsExpandedTarState));
//			}
//		}
//		return itsExpandedTarState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractUIState basicGetItsExpandedTarState() {
		return itsExpandedTarState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsExpandedTarState(AbstractUIState newItsExpandedTarState) {
		AbstractUIState oldItsExpandedTarState = itsExpandedTarState;
		itsExpandedTarState = newItsExpandedTarState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE, oldItsExpandedTarState, itsExpandedTarState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractUIState basicGetItsExpandedSrcState() {
		return itsExpandedSrcState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsExpandedSrcState(AbstractUIState newItsExpandedSrcState) {
		AbstractUIState oldItsExpandedSrcState = itsExpandedSrcState;
		itsExpandedSrcState = newItsExpandedSrcState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_EXPANDED_SRC_STATE, oldItsExpandedSrcState, itsExpandedSrcState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * itsExpandedSrcState is derived
	 */
	public AbstractUIState getItsExpandedSrcState() {
		
		Vertex target = getItsSrcState() ;
		if ( target != null ) {
			if ( target instanceof Stateshortcut ){
				return ((Stateshortcut)target).getItsShortcutFor() ;
			} else if ( target instanceof AbstractUIState){
				return (AbstractUIState)target ;
			} else {
				assert(false):"domain model changed?";
				return null ;
			}
			
		} else {
			return null ;
		}
		
//		if (itsExpendedSrcState != null && itsExpendedSrcState.eIsProxy()) {
//			InternalEObject oldItsExpendedSrcState = (InternalEObject)itsExpendedSrcState;
//			itsExpendedSrcState = (AbstractUIState)eResolveProxy(oldItsExpendedSrcState);
//			if (itsExpendedSrcState != oldItsExpendedSrcState) {
//				if (eNotificationRequired())
//					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UisutPackage.UI_TRANSITION__ITS_EXPENDED_SRC_STATE, oldItsExpendedSrcState, itsExpendedSrcState));
//			}
//		}
//		return itsExpendedSrcState;
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
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE:
				if (itsSrcState != null)
					msgs = ((InternalEObject)itsSrcState).eInverseRemove(this, UisutPackage.VERTEX__ITS_OUT_TRANSITION, Vertex.class, msgs);
				return basicSetItsSrcState((Vertex)otherEnd, msgs);
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				if (itsTarState != null)
					msgs = ((InternalEObject)itsTarState).eInverseRemove(this, UisutPackage.VERTEX__ITS_IN_TRANSITION, Vertex.class, msgs);
				return basicSetItsTarState((Vertex)otherEnd, msgs);
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGuardedSystemVariable()).basicAdd(otherEnd, msgs);
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
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE:
				return basicSetItsSrcState(null, msgs);
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				return basicSetItsTarState(null, msgs);
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				return ((InternalEList<?>)getGuardedSystemVariable()).basicRemove(otherEnd, msgs);
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
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE:
				if (resolve) return getItsSrcState();
				return basicGetItsSrcState();
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				if (resolve) return getItsTarState();
				return basicGetItsTarState();
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				return getGuardedSystemVariable();
			case UisutPackage.UI_TRANSITION__SCRIPT_STR:
				return getScriptStr();
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE:
				if (resolve) return getItsExpandedTarState();
				return basicGetItsExpandedTarState();
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_SRC_STATE:
				if (resolve) return getItsExpandedSrcState();
				return basicGetItsExpandedSrcState();
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
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE:
				setItsSrcState((Vertex)newValue);
				return;
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				setItsTarState((Vertex)newValue);
				return;
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				getGuardedSystemVariable().clear();
				getGuardedSystemVariable().addAll((Collection<? extends UISystemVariable>)newValue);
				return;
			case UisutPackage.UI_TRANSITION__SCRIPT_STR:
				setScriptStr((String)newValue);
				return;
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE:
				setItsExpandedTarState((AbstractUIState)newValue);
				return;
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_SRC_STATE:
				setItsExpandedSrcState((AbstractUIState)newValue);
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
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE:
				setItsSrcState((Vertex)null);
				return;
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				setItsTarState((Vertex)null);
				return;
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				getGuardedSystemVariable().clear();
				return;
			case UisutPackage.UI_TRANSITION__SCRIPT_STR:
				setScriptStr(SCRIPT_STR_EDEFAULT);
				return;
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE:
				setItsExpandedTarState((AbstractUIState)null);
				return;
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_SRC_STATE:
				setItsExpandedSrcState((AbstractUIState)null);
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
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE:
				return itsSrcState != null;
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				return itsTarState != null;
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				return guardedSystemVariable != null && !guardedSystemVariable.isEmpty();
			case UisutPackage.UI_TRANSITION__SCRIPT_STR:
				return SCRIPT_STR_EDEFAULT == null ? scriptStr != null : !SCRIPT_STR_EDEFAULT.equals(scriptStr);
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE:
				return itsExpandedTarState != null;
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_SRC_STATE:
				return itsExpandedSrcState != null;
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

} //UITransitionImpl
