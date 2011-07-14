/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guitar.uisut.UIElement#getName <em>Name</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UIElement#getDescription <em>Description</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UIElement#getId <em>Id</em>}</li>
 *   <li>{@link name.niu.guitar.uisut.UIElement#getHighlight <em>Highlight</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guitar.uisut.UisutPackage#getUIElement()
 * @model
 * @generated
 */
public interface UIElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see name.niu.guitar.uisut.UisutPackage#getUIElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.UIElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see name.niu.guitar.uisut.UisutPackage#getUIElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.UIElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see name.niu.guitar.uisut.UisutPackage#getUIElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.UIElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highlight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlight</em>' attribute.
	 * @see #setHighlight(String)
	 * @see name.niu.guitar.uisut.UisutPackage#getUIElement_Highlight()
	 * @model transient="true"
	 * @generated
	 */
	String getHighlight();

	/**
	 * Sets the value of the '{@link name.niu.guitar.uisut.UIElement#getHighlight <em>Highlight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highlight</em>' attribute.
	 * @see #getHighlight()
	 * @generated
	 */
	void setHighlight(String value);

} // UIElement
