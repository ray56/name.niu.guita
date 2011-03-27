/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see name.niu.guita.uisut.uisutPackage
 * @generated
 */
public interface uisutFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	uisutFactory eINSTANCE = name.niu.guita.uisut.impl.uisutFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UISUT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UISUT</em>'.
	 * @generated
	 */
	UISUT createUISUT();

	/**
	 * Returns a new object of class '<em>Application System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application System</em>'.
	 * @generated
	 */
	ApplicationSystem createApplicationSystem();

	/**
	 * Returns a new object of class '<em>UI Statemachine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Statemachine</em>'.
	 * @generated
	 */
	UIStatemachine createUIStatemachine();

	/**
	 * Returns a new object of class '<em>UI State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI State</em>'.
	 * @generated
	 */
	UIState createUIState();

	/**
	 * Returns a new object of class '<em>UI Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Transition</em>'.
	 * @generated
	 */
	UITransition createUITransition();

	/**
	 * Returns a new object of class '<em>User Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Trigger</em>'.
	 * @generated
	 */
	UserTrigger createUserTrigger();

	/**
	 * Returns a new object of class '<em>Component Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Trigger</em>'.
	 * @generated
	 */
	ComponentTrigger createComponentTrigger();

	/**
	 * Returns a new object of class '<em>UI Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Condition</em>'.
	 * @generated
	 */
	UICondition createUICondition();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>UI Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Control</em>'.
	 * @generated
	 */
	UIControl createUIControl();

	/**
	 * Returns a new object of class '<em>UI Data Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Data Variable</em>'.
	 * @generated
	 */
	UIDataVariable createUIDataVariable();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InitialState createInitialState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	uisutPackage getuisutPackage();

} //uisutFactory
