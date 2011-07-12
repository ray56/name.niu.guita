/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.impl;

import java.util.Collection;

import name.niu.guitar.uisut.UITransition;
import name.niu.guitar.uisut.UisutPackage;
import name.niu.guitar.uisut.Vertex;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.impl.VertexImpl#getItsInTransition <em>Its In Transition</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.impl.VertexImpl#getItsOutTransition <em>Its Out Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertexImpl extends UIElementImpl implements Vertex {
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
	 * The cached value of the '{@link #getItsOutTransition() <em>Its Out Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsOutTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<UITransition> itsOutTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UisutPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UITransition> getItsInTransition() {
		if (itsInTransition == null) {
			itsInTransition = new EObjectWithInverseResolvingEList<UITransition>(UITransition.class, this, UisutPackage.VERTEX__ITS_IN_TRANSITION, UisutPackage.UI_TRANSITION__ITS_TAR_STATE);
		}
		return itsInTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UITransition> getItsOutTransition() {
		if (itsOutTransition == null) {
			itsOutTransition = new EObjectWithInverseResolvingEList<UITransition>(UITransition.class, this, UisutPackage.VERTEX__ITS_OUT_TRANSITION, UisutPackage.UI_TRANSITION__ITS_SRC_STATE);
		}
		return itsOutTransition;
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
			case UisutPackage.VERTEX__ITS_IN_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItsInTransition()).basicAdd(otherEnd, msgs);
			case UisutPackage.VERTEX__ITS_OUT_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItsOutTransition()).basicAdd(otherEnd, msgs);
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
			case UisutPackage.VERTEX__ITS_IN_TRANSITION:
				return ((InternalEList<?>)getItsInTransition()).basicRemove(otherEnd, msgs);
			case UisutPackage.VERTEX__ITS_OUT_TRANSITION:
				return ((InternalEList<?>)getItsOutTransition()).basicRemove(otherEnd, msgs);
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
			case UisutPackage.VERTEX__ITS_IN_TRANSITION:
				return getItsInTransition();
			case UisutPackage.VERTEX__ITS_OUT_TRANSITION:
				return getItsOutTransition();
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
			case UisutPackage.VERTEX__ITS_IN_TRANSITION:
				getItsInTransition().clear();
				getItsInTransition().addAll((Collection<? extends UITransition>)newValue);
				return;
			case UisutPackage.VERTEX__ITS_OUT_TRANSITION:
				getItsOutTransition().clear();
				getItsOutTransition().addAll((Collection<? extends UITransition>)newValue);
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
			case UisutPackage.VERTEX__ITS_IN_TRANSITION:
				getItsInTransition().clear();
				return;
			case UisutPackage.VERTEX__ITS_OUT_TRANSITION:
				getItsOutTransition().clear();
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
			case UisutPackage.VERTEX__ITS_IN_TRANSITION:
				return itsInTransition != null && !itsInTransition.isEmpty();
			case UisutPackage.VERTEX__ITS_OUT_TRANSITION:
				return itsOutTransition != null && !itsOutTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VertexImpl
