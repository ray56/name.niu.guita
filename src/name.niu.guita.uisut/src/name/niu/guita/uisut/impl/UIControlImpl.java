/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.UIControl;
import name.niu.guita.uisut.UIDataVariable;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.impl.UIControlImpl#getItsInputDaa <em>Its Input Daa</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UIControlImpl#getItsOutputData <em>Its Output Data</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UIControlImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link name.niu.guita.uisut.impl.UIControlImpl#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIControlImpl extends UISUTElementImpl implements UIControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return uisutPackage.Literals.UI_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDataVariable getItsInputDaa() {
		return (UIDataVariable)eGet(uisutPackage.Literals.UI_CONTROL__ITS_INPUT_DAA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsInputDaa(UIDataVariable newItsInputDaa) {
		eSet(uisutPackage.Literals.UI_CONTROL__ITS_INPUT_DAA, newItsInputDaa);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDataVariable getItsOutputData() {
		return (UIDataVariable)eGet(uisutPackage.Literals.UI_CONTROL__ITS_OUTPUT_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsOutputData(UIDataVariable newItsOutputData) {
		eSet(uisutPackage.Literals.UI_CONTROL__ITS_OUTPUT_DATA, newItsOutputData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return (String)eGet(uisutPackage.Literals.UI_CONTROL__VARIABLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		eSet(uisutPackage.Literals.UI_CONTROL__VARIABLE_NAME, newVariableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueExpression() {
		return (String)eGet(uisutPackage.Literals.UI_CONTROL__VALUE_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueExpression(String newValueExpression) {
		eSet(uisutPackage.Literals.UI_CONTROL__VALUE_EXPRESSION, newValueExpression);
	}

} //UIControlImpl
