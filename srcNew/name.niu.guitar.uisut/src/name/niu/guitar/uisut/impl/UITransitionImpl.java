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
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getItsTarStateShortcut <em>Its Tar State Shortcut</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getItsSrcStateShortcut <em>Its Src State Shortcut</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getItsExpandedTarState <em>Its Expanded Tar State</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.UITransitionImpl#getItsExpendedSrcState <em>Its Expended Src State</em>}</li>
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
	protected AbstractUIState itsSrcState;

	/**
	 * The cached value of the '{@link #getItsTarState() <em>Its Tar State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsTarState()
	 * @generated
	 * @ordered
	 */
	protected AbstractUIState itsTarState;

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
	 * The cached value of the '{@link #getItsTarStateShortcut() <em>Its Tar State Shortcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsTarStateShortcut()
	 * @generated
	 * @ordered
	 */
	protected Stateshortcut itsTarStateShortcut;

	/**
	 * The cached value of the '{@link #getItsSrcStateShortcut() <em>Its Src State Shortcut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSrcStateShortcut()
	 * @generated
	 * @ordered
	 */
	protected Stateshortcut itsSrcStateShortcut;

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
	 * The cached value of the '{@link #getItsExpendedSrcState() <em>Its Expended Src State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsExpendedSrcState()
	 * @generated
	 * @ordered
	 */
	protected AbstractUIState itsExpendedSrcState;

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
	public AbstractUIState getItsSrcState() {
		if (itsSrcState != null && itsSrcState.eIsProxy()) {
			InternalEObject oldItsSrcState = (InternalEObject)itsSrcState;
			itsSrcState = (AbstractUIState)eResolveProxy(oldItsSrcState);
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
	public AbstractUIState basicGetItsSrcState() {
		return itsSrcState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsSrcState(AbstractUIState newItsSrcState, NotificationChain msgs) {
		AbstractUIState oldItsSrcState = itsSrcState;
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
	public void setItsSrcState(AbstractUIState newItsSrcState) {
		if (newItsSrcState != itsSrcState) {
			NotificationChain msgs = null;
			if (itsSrcState != null)
				msgs = ((InternalEObject)itsSrcState).eInverseRemove(this, UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION, AbstractUIState.class, msgs);
			if (newItsSrcState != null)
				msgs = ((InternalEObject)newItsSrcState).eInverseAdd(this, UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION, AbstractUIState.class, msgs);
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
	public AbstractUIState getItsTarState() {
		if (itsTarState != null && itsTarState.eIsProxy()) {
			InternalEObject oldItsTarState = (InternalEObject)itsTarState;
			itsTarState = (AbstractUIState)eResolveProxy(oldItsTarState);
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
	public AbstractUIState basicGetItsTarState() {
		return itsTarState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsTarState(AbstractUIState newItsTarState, NotificationChain msgs) {
		AbstractUIState oldItsTarState = itsTarState;
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
	public void setItsTarState(AbstractUIState newItsTarState) {
		if (newItsTarState != itsTarState) {
			NotificationChain msgs = null;
			if (itsTarState != null)
				msgs = ((InternalEObject)itsTarState).eInverseRemove(this, UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION, AbstractUIState.class, msgs);
			if (newItsTarState != null)
				msgs = ((InternalEObject)newItsTarState).eInverseAdd(this, UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION, AbstractUIState.class, msgs);
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
	 * @generated
	 */
	public Stateshortcut getItsTarStateShortcut() {
		if (itsTarStateShortcut != null && itsTarStateShortcut.eIsProxy()) {
			InternalEObject oldItsTarStateShortcut = (InternalEObject)itsTarStateShortcut;
			itsTarStateShortcut = (Stateshortcut)eResolveProxy(oldItsTarStateShortcut);
			if (itsTarStateShortcut != oldItsTarStateShortcut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT, oldItsTarStateShortcut, itsTarStateShortcut));
			}
		}
		return itsTarStateShortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stateshortcut basicGetItsTarStateShortcut() {
		return itsTarStateShortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsTarStateShortcut(Stateshortcut newItsTarStateShortcut, NotificationChain msgs) {
		Stateshortcut oldItsTarStateShortcut = itsTarStateShortcut;
		itsTarStateShortcut = newItsTarStateShortcut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT, oldItsTarStateShortcut, newItsTarStateShortcut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsTarStateShortcut(Stateshortcut newItsTarStateShortcut) {
		if (newItsTarStateShortcut != itsTarStateShortcut) {
			NotificationChain msgs = null;
			if (itsTarStateShortcut != null)
				msgs = ((InternalEObject)itsTarStateShortcut).eInverseRemove(this, UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION, Stateshortcut.class, msgs);
			if (newItsTarStateShortcut != null)
				msgs = ((InternalEObject)newItsTarStateShortcut).eInverseAdd(this, UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION, Stateshortcut.class, msgs);
			msgs = basicSetItsTarStateShortcut(newItsTarStateShortcut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT, newItsTarStateShortcut, newItsTarStateShortcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stateshortcut getItsSrcStateShortcut() {
		if (itsSrcStateShortcut != null && itsSrcStateShortcut.eIsProxy()) {
			InternalEObject oldItsSrcStateShortcut = (InternalEObject)itsSrcStateShortcut;
			itsSrcStateShortcut = (Stateshortcut)eResolveProxy(oldItsSrcStateShortcut);
			if (itsSrcStateShortcut != oldItsSrcStateShortcut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT, oldItsSrcStateShortcut, itsSrcStateShortcut));
			}
		}
		return itsSrcStateShortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stateshortcut basicGetItsSrcStateShortcut() {
		return itsSrcStateShortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsSrcStateShortcut(Stateshortcut newItsSrcStateShortcut, NotificationChain msgs) {
		Stateshortcut oldItsSrcStateShortcut = itsSrcStateShortcut;
		itsSrcStateShortcut = newItsSrcStateShortcut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT, oldItsSrcStateShortcut, newItsSrcStateShortcut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsSrcStateShortcut(Stateshortcut newItsSrcStateShortcut) {
		if (newItsSrcStateShortcut != itsSrcStateShortcut) {
			NotificationChain msgs = null;
			if (itsSrcStateShortcut != null)
				msgs = ((InternalEObject)itsSrcStateShortcut).eInverseRemove(this, UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION, Stateshortcut.class, msgs);
			if (newItsSrcStateShortcut != null)
				msgs = ((InternalEObject)newItsSrcStateShortcut).eInverseAdd(this, UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION, Stateshortcut.class, msgs);
			msgs = basicSetItsSrcStateShortcut(newItsSrcStateShortcut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT, newItsSrcStateShortcut, newItsSrcStateShortcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * itsExpandedTarState is derived
	 */
	public AbstractUIState getItsExpandedTarState() {
		
		if ( getItsTarState() != null ) {
			return getItsTarState() ;
		} else if ( getItsTarStateShortcut() != null  ) {
			return getItsTarStateShortcut().getItsShortcutFor();
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
	 * @generated NOT
	 * itsExpendedSrcState is derived
	 */
	public AbstractUIState getItsExpendedSrcState() {
		
		if ( getItsSrcState() != null ) {
			return getItsSrcState() ;
		} else if ( getItsSrcStateShortcut() != null  ) {
			return getItsSrcStateShortcut().getItsShortcutFor();
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
	public AbstractUIState basicGetItsExpendedSrcState() {
		return itsExpendedSrcState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsExpendedSrcState(AbstractUIState newItsExpendedSrcState) {
		AbstractUIState oldItsExpendedSrcState = itsExpendedSrcState;
		itsExpendedSrcState = newItsExpendedSrcState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UisutPackage.UI_TRANSITION__ITS_EXPENDED_SRC_STATE, oldItsExpendedSrcState, itsExpendedSrcState));
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
					msgs = ((InternalEObject)itsSrcState).eInverseRemove(this, UisutPackage.ABSTRACT_UI_STATE__ITS_OUT_TRANTION, AbstractUIState.class, msgs);
				return basicSetItsSrcState((AbstractUIState)otherEnd, msgs);
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				if (itsTarState != null)
					msgs = ((InternalEObject)itsTarState).eInverseRemove(this, UisutPackage.ABSTRACT_UI_STATE__ITS_IN_TRANSITION, AbstractUIState.class, msgs);
				return basicSetItsTarState((AbstractUIState)otherEnd, msgs);
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGuardedSystemVariable()).basicAdd(otherEnd, msgs);
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT:
				if (itsTarStateShortcut != null)
					msgs = ((InternalEObject)itsTarStateShortcut).eInverseRemove(this, UisutPackage.STATESHORTCUT__ITS_IN_TRANSITION, Stateshortcut.class, msgs);
				return basicSetItsTarStateShortcut((Stateshortcut)otherEnd, msgs);
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT:
				if (itsSrcStateShortcut != null)
					msgs = ((InternalEObject)itsSrcStateShortcut).eInverseRemove(this, UisutPackage.STATESHORTCUT__ITS_OUT_TRANSITION, Stateshortcut.class, msgs);
				return basicSetItsSrcStateShortcut((Stateshortcut)otherEnd, msgs);
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
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT:
				return basicSetItsTarStateShortcut(null, msgs);
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT:
				return basicSetItsSrcStateShortcut(null, msgs);
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
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT:
				if (resolve) return getItsTarStateShortcut();
				return basicGetItsTarStateShortcut();
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT:
				if (resolve) return getItsSrcStateShortcut();
				return basicGetItsSrcStateShortcut();
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE:
				if (resolve) return getItsExpandedTarState();
				return basicGetItsExpandedTarState();
			case UisutPackage.UI_TRANSITION__ITS_EXPENDED_SRC_STATE:
				if (resolve) return getItsExpendedSrcState();
				return basicGetItsExpendedSrcState();
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
				setItsSrcState((AbstractUIState)newValue);
				return;
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				setItsTarState((AbstractUIState)newValue);
				return;
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				getGuardedSystemVariable().clear();
				getGuardedSystemVariable().addAll((Collection<? extends UISystemVariable>)newValue);
				return;
			case UisutPackage.UI_TRANSITION__SCRIPT_STR:
				setScriptStr((String)newValue);
				return;
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT:
				setItsTarStateShortcut((Stateshortcut)newValue);
				return;
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT:
				setItsSrcStateShortcut((Stateshortcut)newValue);
				return;
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE:
				setItsExpandedTarState((AbstractUIState)newValue);
				return;
			case UisutPackage.UI_TRANSITION__ITS_EXPENDED_SRC_STATE:
				setItsExpendedSrcState((AbstractUIState)newValue);
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
				setItsSrcState((AbstractUIState)null);
				return;
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE:
				setItsTarState((AbstractUIState)null);
				return;
			case UisutPackage.UI_TRANSITION__GUARDED_SYSTEM_VARIABLE:
				getGuardedSystemVariable().clear();
				return;
			case UisutPackage.UI_TRANSITION__SCRIPT_STR:
				setScriptStr(SCRIPT_STR_EDEFAULT);
				return;
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT:
				setItsTarStateShortcut((Stateshortcut)null);
				return;
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT:
				setItsSrcStateShortcut((Stateshortcut)null);
				return;
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE:
				setItsExpandedTarState((AbstractUIState)null);
				return;
			case UisutPackage.UI_TRANSITION__ITS_EXPENDED_SRC_STATE:
				setItsExpendedSrcState((AbstractUIState)null);
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
			case UisutPackage.UI_TRANSITION__ITS_TAR_STATE_SHORTCUT:
				return itsTarStateShortcut != null;
			case UisutPackage.UI_TRANSITION__ITS_SRC_STATE_SHORTCUT:
				return itsSrcStateShortcut != null;
			case UisutPackage.UI_TRANSITION__ITS_EXPANDED_TAR_STATE:
				return itsExpandedTarState != null;
			case UisutPackage.UI_TRANSITION__ITS_EXPENDED_SRC_STATE:
				return itsExpendedSrcState != null;
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
