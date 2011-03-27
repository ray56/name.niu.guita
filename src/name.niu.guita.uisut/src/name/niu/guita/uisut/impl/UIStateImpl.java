/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.UIControl;
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

} //UIStateImpl
