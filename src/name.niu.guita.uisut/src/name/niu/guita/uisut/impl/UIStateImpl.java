/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.UIControl;
import name.niu.guita.uisut.UIDataVariable;
import name.niu.guita.uisut.UIState;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.impl.UIStateImpl#getItsUIControl <em>Its UI Control</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UIStateImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UIStateImpl#getAddedDataVariable <em>Added Data Variable</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UIStateImpl#getDeletedDataVariable <em>Deleted Data Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIStateImpl extends AbstractStateImpl implements UIState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return uisutPackage.Literals.UI_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UIControl> getItsUIControl() {
		return (EList<UIControl>)eGet(uisutPackage.Literals.UI_STATE__ITS_UI_CONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInitial() {
		return (Boolean)eGet(uisutPackage.Literals.UI_STATE__IS_INITIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		eSet(uisutPackage.Literals.UI_STATE__IS_INITIAL, newIsInitial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UIDataVariable> getAddedDataVariable() {
		return (EList<UIDataVariable>)eGet(uisutPackage.Literals.UI_STATE__ADDED_DATA_VARIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UIDataVariable> getDeletedDataVariable() {
		return (EList<UIDataVariable>)eGet(uisutPackage.Literals.UI_STATE__DELETED_DATA_VARIABLE, true);
	}

} //UIStateImpl
