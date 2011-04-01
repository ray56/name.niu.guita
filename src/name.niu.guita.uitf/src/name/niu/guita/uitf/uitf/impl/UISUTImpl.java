/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf.impl;

import java.util.Collection;

import name.niu.guita.uitf.uitf.UIControl;
import name.niu.guita.uitf.uitf.UISUT;
import name.niu.guita.uitf.uitf.UitfPackage;
import name.niu.guita.uitf.uitf.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UISUT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.UISUTImpl#getItsVariable <em>Its Variable</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.UISUTImpl#getItsUICtrl <em>Its UI Ctrl</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.impl.UISUTImpl#getObjectURI <em>Object URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UISUTImpl extends VariableImpl implements UISUT {
	/**
	 * The cached value of the '{@link #getItsVariable() <em>Its Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> itsVariable;

	/**
	 * The cached value of the '{@link #getItsUICtrl() <em>Its UI Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsUICtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<UIControl> itsUICtrl;

	/**
	 * The default value of the '{@link #getObjectURI() <em>Object URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectURI()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectURI() <em>Object URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectURI()
	 * @generated
	 * @ordered
	 */
	protected String objectURI = OBJECT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISUTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UitfPackage.Literals.UISUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getItsVariable() {
		if (itsVariable == null) {
			itsVariable = new EObjectContainmentEList<Variable>(Variable.class, this, UitfPackage.UISUT__ITS_VARIABLE);
		}
		return itsVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIControl> getItsUICtrl() {
		if (itsUICtrl == null) {
			itsUICtrl = new EObjectContainmentEList<UIControl>(UIControl.class, this, UitfPackage.UISUT__ITS_UI_CTRL);
		}
		return itsUICtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectURI() {
		return objectURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectURI(String newObjectURI) {
		String oldObjectURI = objectURI;
		objectURI = newObjectURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UitfPackage.UISUT__OBJECT_URI, oldObjectURI, objectURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void onUITrigger(String trigger) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void onManipulateUIControl(String controlPath, String manipulationKind) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void onManipulateUIControlData(String controlPath, String controlPropertyKey, String controlPropertyVal) {
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
			case UitfPackage.UISUT__ITS_VARIABLE:
				return ((InternalEList<?>)getItsVariable()).basicRemove(otherEnd, msgs);
			case UitfPackage.UISUT__ITS_UI_CTRL:
				return ((InternalEList<?>)getItsUICtrl()).basicRemove(otherEnd, msgs);
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
			case UitfPackage.UISUT__ITS_VARIABLE:
				return getItsVariable();
			case UitfPackage.UISUT__ITS_UI_CTRL:
				return getItsUICtrl();
			case UitfPackage.UISUT__OBJECT_URI:
				return getObjectURI();
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
			case UitfPackage.UISUT__ITS_VARIABLE:
				getItsVariable().clear();
				getItsVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case UitfPackage.UISUT__ITS_UI_CTRL:
				getItsUICtrl().clear();
				getItsUICtrl().addAll((Collection<? extends UIControl>)newValue);
				return;
			case UitfPackage.UISUT__OBJECT_URI:
				setObjectURI((String)newValue);
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
			case UitfPackage.UISUT__ITS_VARIABLE:
				getItsVariable().clear();
				return;
			case UitfPackage.UISUT__ITS_UI_CTRL:
				getItsUICtrl().clear();
				return;
			case UitfPackage.UISUT__OBJECT_URI:
				setObjectURI(OBJECT_URI_EDEFAULT);
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
			case UitfPackage.UISUT__ITS_VARIABLE:
				return itsVariable != null && !itsVariable.isEmpty();
			case UitfPackage.UISUT__ITS_UI_CTRL:
				return itsUICtrl != null && !itsUICtrl.isEmpty();
			case UitfPackage.UISUT__OBJECT_URI:
				return OBJECT_URI_EDEFAULT == null ? objectURI != null : !OBJECT_URI_EDEFAULT.equals(objectURI);
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
		result.append(" (objectURI: ");
		result.append(objectURI);
		result.append(')');
		return result.toString();
	}

} //UISUTImpl
