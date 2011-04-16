/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggered Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.TriggeredTransition#getScriptStr <em>Script Str</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.TriggeredTransition#getTransitionId <em>Transition Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uitf.uitf.UitfPackage#getTriggeredTransition()
 * @model
 * @generated
 */
public interface TriggeredTransition extends Statement {
	/**
	 * Returns the value of the '<em><b>Script Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Str</em>' attribute.
	 * @see #setScriptStr(String)
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getTriggeredTransition_ScriptStr()
	 * @model
	 * @generated
	 */
	String getScriptStr();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.TriggeredTransition#getScriptStr <em>Script Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Str</em>' attribute.
	 * @see #getScriptStr()
	 * @generated
	 */
	void setScriptStr(String value);

	/**
	 * Returns the value of the '<em><b>Transition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Id</em>' attribute.
	 * @see #setTransitionId(String)
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getTriggeredTransition_TransitionId()
	 * @model
	 * @generated
	 */
	String getTransitionId();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.TriggeredTransition#getTransitionId <em>Transition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Id</em>' attribute.
	 * @see #getTransitionId()
	 * @generated
	 */
	void setTransitionId(String value);

} // TriggeredTransition
