/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.util;

import java.util.List;

import name.niu.guita.uisut.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see name.niu.guita.uisut.uisutPackage
 * @generated
 */
public class uisutSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static uisutPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uisutSwitch() {
		if (modelPackage == null) {
			modelPackage = uisutPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case uisutPackage.UISUT: {
				UISUT uisut = (UISUT)theEObject;
				T result = caseUISUT(uisut);
				if (result == null) result = caseUISUTElement(uisut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.APPLICATION_SYSTEM: {
				ApplicationSystem applicationSystem = (ApplicationSystem)theEObject;
				T result = caseApplicationSystem(applicationSystem);
				if (result == null) result = caseUISUTElement(applicationSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.UI_STATEMACHINE: {
				UIStatemachine uiStatemachine = (UIStatemachine)theEObject;
				T result = caseUIStatemachine(uiStatemachine);
				if (result == null) result = caseUISUTElement(uiStatemachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.UI_STATE: {
				UIState uiState = (UIState)theEObject;
				T result = caseUIState(uiState);
				if (result == null) result = caseAbstractState(uiState);
				if (result == null) result = caseUISUTElement(uiState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.UI_TRANSITION: {
				UITransition uiTransition = (UITransition)theEObject;
				T result = caseUITransition(uiTransition);
				if (result == null) result = caseUISUTElement(uiTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.UI_TRIGGER: {
				UITrigger uiTrigger = (UITrigger)theEObject;
				T result = caseUITrigger(uiTrigger);
				if (result == null) result = caseUISUTElement(uiTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.USER_TRIGGER: {
				UserTrigger userTrigger = (UserTrigger)theEObject;
				T result = caseUserTrigger(userTrigger);
				if (result == null) result = caseUITrigger(userTrigger);
				if (result == null) result = caseUISUTElement(userTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.COMPONENT_TRIGGER: {
				ComponentTrigger componentTrigger = (ComponentTrigger)theEObject;
				T result = caseComponentTrigger(componentTrigger);
				if (result == null) result = caseUITrigger(componentTrigger);
				if (result == null) result = caseUISUTElement(componentTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.UI_CONDITION: {
				UICondition uiCondition = (UICondition)theEObject;
				T result = caseUICondition(uiCondition);
				if (result == null) result = caseUISUTElement(uiCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseUISUTElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.UI_CONTROL: {
				UIControl uiControl = (UIControl)theEObject;
				T result = caseUIControl(uiControl);
				if (result == null) result = caseUISUTElement(uiControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.UI_DATA_VARIABLE: {
				UIDataVariable uiDataVariable = (UIDataVariable)theEObject;
				T result = caseUIDataVariable(uiDataVariable);
				if (result == null) result = caseUISUTElement(uiDataVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.UISUT_ELEMENT: {
				UISUTElement uisutElement = (UISUTElement)theEObject;
				T result = caseUISUTElement(uisutElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseAbstractState(initialState);
				if (result == null) result = caseUISUTElement(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseAbstractState(finalState);
				if (result == null) result = caseUISUTElement(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case uisutPackage.ABSTRACT_STATE: {
				AbstractState abstractState = (AbstractState)theEObject;
				T result = caseAbstractState(abstractState);
				if (result == null) result = caseUISUTElement(abstractState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UISUT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UISUT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUISUT(UISUT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationSystem(ApplicationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Statemachine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Statemachine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIStatemachine(UIStatemachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIState(UIState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUITransition(UITransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUITrigger(UITrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTrigger(UserTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentTrigger(ComponentTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUICondition(UICondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIControl(UIControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Data Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Data Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIDataVariable(UIDataVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UISUT Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UISUT Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUISUTElement(UISUTElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractState(AbstractState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //uisutSwitch
