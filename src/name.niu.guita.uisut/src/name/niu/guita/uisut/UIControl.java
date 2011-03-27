/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.UIControl#getItsInputDaa <em>Its Input Daa</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UIControl#getItsOutputData <em>Its Output Data</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UIControl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UIControl#getValueExpression <em>Value Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uisut.uisutPackage#getUIControl()
 * @model
 * @generated
 */
public interface UIControl extends UISUTElement {
	/**
	 * Returns the value of the '<em><b>Its Input Daa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Input Daa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Input Daa</em>' reference.
	 * @see #setItsInputDaa(UIDataVariable)
	 * @see name.niu.guita.uisut.uisutPackage#getUIControl_ItsInputDaa()
	 * @model
	 * @generated
	 */
	UIDataVariable getItsInputDaa();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UIControl#getItsInputDaa <em>Its Input Daa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Input Daa</em>' reference.
	 * @see #getItsInputDaa()
	 * @generated
	 */
	void setItsInputDaa(UIDataVariable value);

	/**
	 * Returns the value of the '<em><b>Its Output Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Output Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Output Data</em>' reference.
	 * @see #setItsOutputData(UIDataVariable)
	 * @see name.niu.guita.uisut.uisutPackage#getUIControl_ItsOutputData()
	 * @model
	 * @generated
	 */
	UIDataVariable getItsOutputData();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UIControl#getItsOutputData <em>Its Output Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Output Data</em>' reference.
	 * @see #getItsOutputData()
	 * @generated
	 */
	void setItsOutputData(UIDataVariable value);

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see name.niu.guita.uisut.uisutPackage#getUIControl_VariableName()
	 * @model
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UIControl#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see name.niu.guita.uisut.uisutPackage#getUIControl_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UIControl#getValueExpression <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

} // UIControl
