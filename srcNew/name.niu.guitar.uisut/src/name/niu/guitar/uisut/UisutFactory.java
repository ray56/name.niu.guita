/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see name.niu.guitar.uisut.UisutPackage
 * @generated
 */
public interface UisutFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UisutFactory eINSTANCE = name.niu.guitar.uisut.impl.UisutFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UI Statemachine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Statemachine</em>'.
	 * @generated
	 */
	UIStatemachine createUIStatemachine();

	/**
	 * Returns a new object of class '<em>Abstract UI State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract UI State</em>'.
	 * @generated
	 */
	AbstractUIState createAbstractUIState();

	/**
	 * Returns a new object of class '<em>UI Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Transition</em>'.
	 * @generated
	 */
	UITransition createUITransition();

	/**
	 * Returns a new object of class '<em>UI System Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI System Variable</em>'.
	 * @generated
	 */
	UISystemVariable createUISystemVariable();

	/**
	 * Returns a new object of class '<em>UI Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Element</em>'.
	 * @generated
	 */
	UIElement createUIElement();

	/**
	 * Returns a new object of class '<em>Common State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common State</em>'.
	 * @generated
	 */
	CommonState createCommonState();

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
	 * Returns a new object of class '<em>UISUT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UISUT</em>'.
	 * @generated
	 */
	UISUT createUISUT();

	/**
	 * Returns a new object of class '<em>UI System Variable Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI System Variable Pool</em>'.
	 * @generated
	 */
	UISystemVariablePool createUISystemVariablePool();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UisutPackage getUisutPackage();

} //UisutFactory
