/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.UITransition#getItsTrgtState <em>Its Trgt State</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UITransition#getItsSrcState <em>Its Src State</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UITransition#getItsTrigger <em>Its Trigger</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UITransition#getItsCondition <em>Its Condition</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UITransition#getItsAction <em>Its Action</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UITransition#getTriggerStr <em>Trigger Str</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UITransition#getGuardStr <em>Guard Str</em>}</li>
 *   <li>{@link name.niu.guita.uisut.UITransition#getActionStr <em>Action Str</em>}</li>
 * </ul>
 * </p>
 *
 * @see name.niu.guita.uisut.uisutPackage#getUITransition()
 * @model
 * @generated
 */
public interface UITransition extends UISUTElement {
	/**
	 * Returns the value of the '<em><b>Its Trgt State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link name.niu.guita.uisut.AbstractState#getItsInTransition <em>Its In Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Trgt State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Trgt State</em>' reference.
	 * @see #setItsTrgtState(AbstractState)
	 * @see name.niu.guita.uisut.uisutPackage#getUITransition_ItsTrgtState()
	 * @see name.niu.guita.uisut.AbstractState#getItsInTransition
	 * @model opposite="itsInTransition" required="true"
	 * @generated
	 */
	AbstractState getItsTrgtState();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UITransition#getItsTrgtState <em>Its Trgt State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Trgt State</em>' reference.
	 * @see #getItsTrgtState()
	 * @generated
	 */
	void setItsTrgtState(AbstractState value);

	/**
	 * Returns the value of the '<em><b>Its Src State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link name.niu.guita.uisut.AbstractState#getItsOutTransition <em>Its Out Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Src State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Src State</em>' reference.
	 * @see #setItsSrcState(AbstractState)
	 * @see name.niu.guita.uisut.uisutPackage#getUITransition_ItsSrcState()
	 * @see name.niu.guita.uisut.AbstractState#getItsOutTransition
	 * @model opposite="itsOutTransition" required="true"
	 * @generated
	 */
	AbstractState getItsSrcState();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UITransition#getItsSrcState <em>Its Src State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Src State</em>' reference.
	 * @see #getItsSrcState()
	 * @generated
	 */
	void setItsSrcState(AbstractState value);

	/**
	 * Returns the value of the '<em><b>Its Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Trigger</em>' containment reference.
	 * @see #setItsTrigger(UITrigger)
	 * @see name.niu.guita.uisut.uisutPackage#getUITransition_ItsTrigger()
	 * @model containment="true"
	 * @generated
	 */
	UITrigger getItsTrigger();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UITransition#getItsTrigger <em>Its Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Trigger</em>' containment reference.
	 * @see #getItsTrigger()
	 * @generated
	 */
	void setItsTrigger(UITrigger value);

	/**
	 * Returns the value of the '<em><b>Its Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Condition</em>' containment reference.
	 * @see #setItsCondition(UICondition)
	 * @see name.niu.guita.uisut.uisutPackage#getUITransition_ItsCondition()
	 * @model containment="true"
	 * @generated
	 */
	UICondition getItsCondition();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UITransition#getItsCondition <em>Its Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Condition</em>' containment reference.
	 * @see #getItsCondition()
	 * @generated
	 */
	void setItsCondition(UICondition value);

	/**
	 * Returns the value of the '<em><b>Its Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Action</em>' containment reference.
	 * @see #setItsAction(Action)
	 * @see name.niu.guita.uisut.uisutPackage#getUITransition_ItsAction()
	 * @model containment="true"
	 * @generated
	 */
	Action getItsAction();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UITransition#getItsAction <em>Its Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Its Action</em>' containment reference.
	 * @see #getItsAction()
	 * @generated
	 */
	void setItsAction(Action value);

	/**
	 * Returns the value of the '<em><b>Trigger Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Str</em>' attribute.
	 * @see #setTriggerStr(String)
	 * @see name.niu.guita.uisut.uisutPackage#getUITransition_TriggerStr()
	 * @model
	 * @generated
	 */
	String getTriggerStr();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UITransition#getTriggerStr <em>Trigger Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Str</em>' attribute.
	 * @see #getTriggerStr()
	 * @generated
	 */
	void setTriggerStr(String value);

	/**
	 * Returns the value of the '<em><b>Guard Str</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Str</em>' attribute.
	 * @see #setGuardStr(String)
	 * @see name.niu.guita.uisut.uisutPackage#getUITransition_GuardStr()
	 * @model default="" derived="true"
	 * @generated
	 */
	String getGuardStr();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UITransition#getGuardStr <em>Guard Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Str</em>' attribute.
	 * @see #getGuardStr()
	 * @generated
	 */
	void setGuardStr(String value);

	/**
	 * Returns the value of the '<em><b>Action Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Str</em>' attribute.
	 * @see #setActionStr(String)
	 * @see name.niu.guita.uisut.uisutPackage#getUITransition_ActionStr()
	 * @model
	 * @generated
	 */
	String getActionStr();

	/**
	 * Sets the value of the '{@link name.niu.guita.uisut.UITransition#getActionStr <em>Action Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Str</em>' attribute.
	 * @see #getActionStr()
	 * @generated
	 */
	void setActionStr(String value);

} // UITransition
