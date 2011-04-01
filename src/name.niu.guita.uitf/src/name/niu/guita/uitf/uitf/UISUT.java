/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UISUT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uitf.uitf.UISUT#getItsVariable <em>Its Variable</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.UISUT#getItsUICtrl <em>Its UI Ctrl</em>}</li>
 *   <li>{@link name.niu.guita.uitf.uitf.UISUT#getObjectURI <em>Object URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uitf.uitf.UitfPackage#getUISUT()
 * @model
 * @generated
 */
public interface UISUT extends Variable {
	/**
	 * Returns the value of the '<em><b>Its Variable</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guita.uitf.uitf.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Variable</em>' containment reference list.
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getUISUT_ItsVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getItsVariable();

	/**
	 * Returns the value of the '<em><b>Its UI Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link name.niu.guita.uitf.uitf.UIControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its UI Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its UI Ctrl</em>' containment reference list.
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getUISUT_ItsUICtrl()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIControl> getItsUICtrl();

	/**
	 * Returns the value of the '<em><b>Object URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object URI</em>' attribute.
	 * @see #setObjectURI(String)
	 * @see name.niu.guita.uitf.uitf.UitfPackage#getUISUT_ObjectURI()
	 * @model
	 * @generated
	 */
	String getObjectURI();

	/**
	 * Sets the value of the '{@link name.niu.guita.uitf.uitf.UISUT#getObjectURI <em>Object URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object URI</em>' attribute.
	 * @see #getObjectURI()
	 * @generated
	 */
	void setObjectURI(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onUITrigger(String trigger);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onManipulateUIControl(String controlPath, String manipulationKind);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onManipulateUIControlData(String controlPath, String controlPropertyKey, String controlPropertyVal);

} // UISUT
