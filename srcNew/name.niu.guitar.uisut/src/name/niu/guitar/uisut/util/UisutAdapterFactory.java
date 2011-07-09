/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut.util;

import name.niu.guitar.uisut.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see name.niu.guitar.uisut.UisutPackage
 * @generated
 */
public class UisutAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UisutPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UisutAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UisutPackage.eINSTANCE;
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
	protected UisutSwitch<Adapter> modelSwitch =
		new UisutSwitch<Adapter>() {
			@Override
			public Adapter caseUIStatemachine(UIStatemachine object) {
				return createUIStatemachineAdapter();
			}
			@Override
			public Adapter caseAbstractUIState(AbstractUIState object) {
				return createAbstractUIStateAdapter();
			}
			@Override
			public Adapter caseUITransition(UITransition object) {
				return createUITransitionAdapter();
			}
			@Override
			public Adapter caseUISystemVariable(UISystemVariable object) {
				return createUISystemVariableAdapter();
			}
			@Override
			public Adapter caseUIElement(UIElement object) {
				return createUIElementAdapter();
			}
			@Override
			public Adapter caseCommonState(CommonState object) {
				return createCommonStateAdapter();
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
			public Adapter caseUISUT(UISUT object) {
				return createUISUTAdapter();
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
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.UIStatemachine <em>UI Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.UIStatemachine
	 * @generated
	 */
	public Adapter createUIStatemachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.AbstractUIState <em>Abstract UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.AbstractUIState
	 * @generated
	 */
	public Adapter createAbstractUIStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.UITransition <em>UI Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.UITransition
	 * @generated
	 */
	public Adapter createUITransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.UISystemVariable <em>UI System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.UISystemVariable
	 * @generated
	 */
	public Adapter createUISystemVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.UIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.UIElement
	 * @generated
	 */
	public Adapter createUIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.CommonState <em>Common State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.CommonState
	 * @generated
	 */
	public Adapter createCommonStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link name.niu.guitar.uisut.UISUT <em>UISUT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see name.niu.guitar.uisut.UISUT
	 * @generated
	 */
	public Adapter createUISUTAdapter() {
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

} //UisutAdapterFactory
