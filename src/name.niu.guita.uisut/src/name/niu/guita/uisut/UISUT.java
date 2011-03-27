/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UISUT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.UISUT#getItsSTM <em>Its STM</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uisut.uisutPackage#getUISUT()
 * @model
 * @generated
 */
public interface UISUT extends UISUTElement {
	/**
	 * Returns the value of the '<em><b>Its STM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its STM</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its STM</em>' containment reference.
	 * @see #setItsSTM(UIStatemachine)
	 * @see name.niu.guita.uisut.uisutPackage#getUISUT_ItsSTM()
	 * @model containment="true"
	 * @generated
	 */
	UIStatemachine getItsSTM();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UISUT#getItsSTM <em>Its STM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its STM</em>' containment reference.
	 * @see #getItsSTM()
	 * @generated
	 */
	void setItsSTM(UIStatemachine value);

} // UISUT
