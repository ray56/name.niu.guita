/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.util;

import name.niu.guita.uisut.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see name.niu.guita.uisut.uisutPackage
 * @generated
 */
public class uisutAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static uisutPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uisutAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = uisutPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uisutSwitch<Adapter> modelSwitch =
		new uisutSwitch<Adapter>() {
			@Override
			public Adapter caseUISUT(UISUT object) {
				return createUISUTAdapter();
			}
			@Override
			public Adapter caseApplicationSystem(ApplicationSystem object) {
				return createApplicationSystemAdapter();
			}
			@Override
			public Adapter caseUIStatemachine(UIStatemachine object) {
				return createUIStatemachineAdapter();
			}
			@Override
			public Adapter caseUIState(UIState object) {
				return createUIStateAdapter();
			}
			@Override
			public Adapter caseUITransition(UITransition object) {
				return createUITransitionAdapter();
			}
			@Override
			public Adapter caseUITrigger(UITrigger object) {
				return createUITriggerAdapter();
			}
			@Override
			public Adapter caseUserTrigger(UserTrigger object) {
				return createUserTriggerAdapter();
			}
			@Override
			public Adapter caseComponentTrigger(ComponentTrigger object) {
				return createComponentTriggerAdapter();
			}
			@Override
			public Adapter caseUICondition(UICondition object) {
				return createUIConditionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseUIControl(UIControl object) {
				return createUIControlAdapter();
			}
			@Override
			public Adapter caseUIDataVariable(UIDataVariable object) {
				return createUIDataVariableAdapter();
			}
			@Override
			public Adapter caseUISUTElement(UISUTElement object) {
				return createUISUTElementAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseAbstractState(AbstractState object) {
				return createAbstractStateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UISUT <em>UISUT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UISUT
	 * @generated
	 */
	public Adapter createUISUTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.ApplicationSystem <em>Application System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.ApplicationSystem
	 * @generated
	 */
	public Adapter createApplicationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UIStatemachine <em>UI Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UIStatemachine
	 * @generated
	 */
	public Adapter createUIStatemachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UIState <em>UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UIState
	 * @generated
	 */
	public Adapter createUIStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UITransition <em>UI Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UITransition
	 * @generated
	 */
	public Adapter createUITransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UITrigger <em>UI Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UITrigger
	 * @generated
	 */
	public Adapter createUITriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UserTrigger <em>User Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UserTrigger
	 * @generated
	 */
	public Adapter createUserTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.ComponentTrigger <em>Component Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.ComponentTrigger
	 * @generated
	 */
	public Adapter createComponentTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UICondition <em>UI Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UICondition
	 * @generated
	 */
	public Adapter createUIConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UIControl <em>UI Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UIControl
	 * @generated
	 */
	public Adapter createUIControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UIDataVariable <em>UI Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UIDataVariable
	 * @generated
	 */
	public Adapter createUIDataVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.UISUTElement <em>UISUT Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.UISUTElement
	 * @generated
	 */
	public Adapter createUISUTElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guita.uisut.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guita.uisut.AbstractState
	 * @generated
	 */
	public Adapter createAbstractStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //uisutAdapterFactory
