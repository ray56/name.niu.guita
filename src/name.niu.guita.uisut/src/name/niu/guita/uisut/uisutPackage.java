/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see name.niu.guita.uisut.uisutFactory
 * @model kind="package"
 * @generated
 */
public interface uisutPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uisut";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.niu.name/guita/uisut/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UISUT_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	uisutPackage eINSTANCE = name.niu.guita.uisut.impl.uisutPackageImpl.init();

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UISUTElementImpl <em>UISUT Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UISUTElementImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUISUTElement()
	 * @generated
	 */
	int UISUT_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>UISUT Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UISUTImpl <em>UISUT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UISUTImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUISUT()
	 * @generated
	 */
	int UISUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its STM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__ITS_STM = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UISUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.ApplicationSystemImpl <em>Application System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.ApplicationSystemImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getApplicationSystem()
	 * @generated
	 */
	int APPLICATION_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYSTEM__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYSTEM__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its UISUT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYSTEM__ITS_UISUT = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_SYSTEM_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UIStatemachineImpl <em>UI Statemachine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UIStatemachineImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUIStatemachine()
	 * @generated
	 */
	int UI_STATEMACHINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_STATE = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_TRANSITION = UISUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Its Data Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_DATA_VARIABLE = UISUT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UI Statemachine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.AbstractStateImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__ITS_IN_TRANSITION = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__ITS_OUT_TRANSITION = UISUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UIStateImpl <em>UI State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UIStateImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUIState()
	 * @generated
	 */
	int UI_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATE__DESCRIPTION = ABSTRACT_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATE__ITS_IN_TRANSITION = ABSTRACT_STATE__ITS_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATE__ITS_OUT_TRANSITION = ABSTRACT_STATE__ITS_OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its UI Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATE__ITS_UI_CONTROL = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UITransitionImpl <em>UI Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UITransitionImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUITransition()
	 * @generated
	 */
	int UI_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its Trgt State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_TRGT_STATE = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Src State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_SRC_STATE = UISUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Its Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_TRIGGER = UISUT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Its Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_CONDITION = UISUT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Its Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_ACTION = UISUT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trigger Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__TRIGGER_STR = UISUT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Guard Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__GUARD_STR = UISUT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Action Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ACTION_STR = UISUT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>UI Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UITriggerImpl <em>UI Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UITriggerImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUITrigger()
	 * @generated
	 */
	int UI_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRIGGER__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRIGGER__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>UI Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRIGGER_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UserTriggerImpl <em>User Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UserTriggerImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUserTrigger()
	 * @generated
	 */
	int USER_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TRIGGER__NAME = UI_TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TRIGGER__DESCRIPTION = UI_TRIGGER__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>User Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TRIGGER_FEATURE_COUNT = UI_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.ComponentTriggerImpl <em>Component Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.ComponentTriggerImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getComponentTrigger()
	 * @generated
	 */
	int COMPONENT_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TRIGGER__NAME = UI_TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TRIGGER__DESCRIPTION = UI_TRIGGER__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Component Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TRIGGER_FEATURE_COUNT = UI_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UIConditionImpl <em>UI Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UIConditionImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUICondition()
	 * @generated
	 */
	int UI_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONDITION__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONDITION__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>UI Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONDITION_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.ActionImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UIControlImpl <em>UI Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UIControlImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUIControl()
	 * @generated
	 */
	int UI_CONTROL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its Input Daa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL__ITS_INPUT_DAA = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Output Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL__ITS_OUTPUT_DATA = UISUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL__VARIABLE_NAME = UISUT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL__VALUE_EXPRESSION = UISUT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UI Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_CONTROL_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.UIDataVariableImpl <em>UI Data Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.UIDataVariableImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUIDataVariable()
	 * @generated
	 */
	int UI_DATA_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DATA_VARIABLE__NAME = UISUT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DATA_VARIABLE__DESCRIPTION = UISUT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint RE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DATA_VARIABLE__CONSTRAINT_RE = UISUT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Data Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DATA_VARIABLE_FEATURE_COUNT = UISUT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.InitialStateImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__DESCRIPTION = ABSTRACT_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ITS_IN_TRANSITION = ABSTRACT_STATE__ITS_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ITS_OUT_TRANSITION = ABSTRACT_STATE__ITS_OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guita.uisut.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guita.uisut.impl.FinalStateImpl
	 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DESCRIPTION = ABSTRACT_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ITS_IN_TRANSITION = ABSTRACT_STATE__ITS_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ITS_OUT_TRANSITION = ABSTRACT_STATE__ITS_OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UISUT <em>UISUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UISUT</em>'.
	 * @see name.niu.guita.uisut.UISUT
	 * @generated
	 */
	EClass getUISUT();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guita.uisut.UISUT#getItsSTM <em>Its STM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its STM</em>'.
	 * @see name.niu.guita.uisut.UISUT#getItsSTM()
	 * @see #getUISUT()
	 * @generated
	 */
	EReference getUISUT_ItsSTM();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.ApplicationSystem <em>Application System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application System</em>'.
	 * @see name.niu.guita.uisut.ApplicationSystem
	 * @generated
	 */
	EClass getApplicationSystem();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guita.uisut.ApplicationSystem#getItsUISUT <em>Its UISUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its UISUT</em>'.
	 * @see name.niu.guita.uisut.ApplicationSystem#getItsUISUT()
	 * @see #getApplicationSystem()
	 * @generated
	 */
	EReference getApplicationSystem_ItsUISUT();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UIStatemachine <em>UI Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Statemachine</em>'.
	 * @see name.niu.guita.uisut.UIStatemachine
	 * @generated
	 */
	EClass getUIStatemachine();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guita.uisut.UIStatemachine#getItsState <em>Its State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its State</em>'.
	 * @see name.niu.guita.uisut.UIStatemachine#getItsState()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsState();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guita.uisut.UIStatemachine#getItsTransition <em>Its Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Transition</em>'.
	 * @see name.niu.guita.uisut.UIStatemachine#getItsTransition()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsTransition();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guita.uisut.UIStatemachine#getItsDataVariable <em>Its Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its Data Variable</em>'.
	 * @see name.niu.guita.uisut.UIStatemachine#getItsDataVariable()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsDataVariable();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UIState <em>UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI State</em>'.
	 * @see name.niu.guita.uisut.UIState
	 * @generated
	 */
	EClass getUIState();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guita.uisut.UIState#getItsUIControl <em>Its UI Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its UI Control</em>'.
	 * @see name.niu.guita.uisut.UIState#getItsUIControl()
	 * @see #getUIState()
	 * @generated
	 */
	EReference getUIState_ItsUIControl();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UITransition <em>UI Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Transition</em>'.
	 * @see name.niu.guita.uisut.UITransition
	 * @generated
	 */
	EClass getUITransition();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guita.uisut.UITransition#getItsTrgtState <em>Its Trgt State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Trgt State</em>'.
	 * @see name.niu.guita.uisut.UITransition#getItsTrgtState()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsTrgtState();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guita.uisut.UITransition#getItsSrcState <em>Its Src State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Src State</em>'.
	 * @see name.niu.guita.uisut.UITransition#getItsSrcState()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsSrcState();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guita.uisut.UITransition#getItsTrigger <em>Its Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its Trigger</em>'.
	 * @see name.niu.guita.uisut.UITransition#getItsTrigger()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guita.uisut.UITransition#getItsCondition <em>Its Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its Condition</em>'.
	 * @see name.niu.guita.uisut.UITransition#getItsCondition()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsCondition();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guita.uisut.UITransition#getItsAction <em>Its Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its Action</em>'.
	 * @see name.niu.guita.uisut.UITransition#getItsAction()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsAction();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uisut.UITransition#getTriggerStr <em>Trigger Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Str</em>'.
	 * @see name.niu.guita.uisut.UITransition#getTriggerStr()
	 * @see #getUITransition()
	 * @generated
	 */
	EAttribute getUITransition_TriggerStr();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uisut.UITransition#getGuardStr <em>Guard Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Str</em>'.
	 * @see name.niu.guita.uisut.UITransition#getGuardStr()
	 * @see #getUITransition()
	 * @generated
	 */
	EAttribute getUITransition_GuardStr();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uisut.UITransition#getActionStr <em>Action Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Str</em>'.
	 * @see name.niu.guita.uisut.UITransition#getActionStr()
	 * @see #getUITransition()
	 * @generated
	 */
	EAttribute getUITransition_ActionStr();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UITrigger <em>UI Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Trigger</em>'.
	 * @see name.niu.guita.uisut.UITrigger
	 * @generated
	 */
	EClass getUITrigger();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UserTrigger <em>User Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Trigger</em>'.
	 * @see name.niu.guita.uisut.UserTrigger
	 * @generated
	 */
	EClass getUserTrigger();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.ComponentTrigger <em>Component Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Trigger</em>'.
	 * @see name.niu.guita.uisut.ComponentTrigger
	 * @generated
	 */
	EClass getComponentTrigger();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UICondition <em>UI Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Condition</em>'.
	 * @see name.niu.guita.uisut.UICondition
	 * @generated
	 */
	EClass getUICondition();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see name.niu.guita.uisut.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UIControl <em>UI Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Control</em>'.
	 * @see name.niu.guita.uisut.UIControl
	 * @generated
	 */
	EClass getUIControl();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guita.uisut.UIControl#getItsInputDaa <em>Its Input Daa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Input Daa</em>'.
	 * @see name.niu.guita.uisut.UIControl#getItsInputDaa()
	 * @see #getUIControl()
	 * @generated
	 */
	EReference getUIControl_ItsInputDaa();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guita.uisut.UIControl#getItsOutputData <em>Its Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Output Data</em>'.
	 * @see name.niu.guita.uisut.UIControl#getItsOutputData()
	 * @see #getUIControl()
	 * @generated
	 */
	EReference getUIControl_ItsOutputData();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uisut.UIControl#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see name.niu.guita.uisut.UIControl#getVariableName()
	 * @see #getUIControl()
	 * @generated
	 */
	EAttribute getUIControl_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uisut.UIControl#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see name.niu.guita.uisut.UIControl#getValueExpression()
	 * @see #getUIControl()
	 * @generated
	 */
	EAttribute getUIControl_ValueExpression();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UIDataVariable <em>UI Data Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Data Variable</em>'.
	 * @see name.niu.guita.uisut.UIDataVariable
	 * @generated
	 */
	EClass getUIDataVariable();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uisut.UIDataVariable#getConstraintRE <em>Constraint RE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint RE</em>'.
	 * @see name.niu.guita.uisut.UIDataVariable#getConstraintRE()
	 * @see #getUIDataVariable()
	 * @generated
	 */
	EAttribute getUIDataVariable_ConstraintRE();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.UISUTElement <em>UISUT Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UISUT Element</em>'.
	 * @see name.niu.guita.uisut.UISUTElement
	 * @generated
	 */
	EClass getUISUTElement();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uisut.UISUTElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see name.niu.guita.uisut.UISUTElement#getName()
	 * @see #getUISUTElement()
	 * @generated
	 */
	EAttribute getUISUTElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guita.uisut.UISUTElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see name.niu.guita.uisut.UISUTElement#getDescription()
	 * @see #getUISUTElement()
	 * @generated
	 */
	EAttribute getUISUTElement_Description();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see name.niu.guita.uisut.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see name.niu.guita.uisut.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link name.niu.guita.uisut.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see name.niu.guita.uisut.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guita.uisut.AbstractState#getItsInTransition <em>Its In Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its In Transition</em>'.
	 * @see name.niu.guita.uisut.AbstractState#getItsInTransition()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_ItsInTransition();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guita.uisut.AbstractState#getItsOutTransition <em>Its Out Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Out Transition</em>'.
	 * @see name.niu.guita.uisut.AbstractState#getItsOutTransition()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_ItsOutTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	uisutFactory getuisutFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UISUTImpl <em>UISUT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UISUTImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUISUT()
		 * @generated
		 */
		EClass UISUT = eINSTANCE.getUISUT();

		/**
		 * The meta object literal for the '<em><b>Its STM</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UISUT__ITS_STM = eINSTANCE.getUISUT_ItsSTM();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.ApplicationSystemImpl <em>Application System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.ApplicationSystemImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getApplicationSystem()
		 * @generated
		 */
		EClass APPLICATION_SYSTEM = eINSTANCE.getApplicationSystem();

		/**
		 * The meta object literal for the '<em><b>Its UISUT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_SYSTEM__ITS_UISUT = eINSTANCE.getApplicationSystem_ItsUISUT();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UIStatemachineImpl <em>UI Statemachine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UIStatemachineImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUIStatemachine()
		 * @generated
		 */
		EClass UI_STATEMACHINE = eINSTANCE.getUIStatemachine();

		/**
		 * The meta object literal for the '<em><b>Its State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_STATE = eINSTANCE.getUIStatemachine_ItsState();

		/**
		 * The meta object literal for the '<em><b>Its Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_TRANSITION = eINSTANCE.getUIStatemachine_ItsTransition();

		/**
		 * The meta object literal for the '<em><b>Its Data Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_DATA_VARIABLE = eINSTANCE.getUIStatemachine_ItsDataVariable();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UIStateImpl <em>UI State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UIStateImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUIState()
		 * @generated
		 */
		EClass UI_STATE = eINSTANCE.getUIState();

		/**
		 * The meta object literal for the '<em><b>Its UI Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATE__ITS_UI_CONTROL = eINSTANCE.getUIState_ItsUIControl();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UITransitionImpl <em>UI Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UITransitionImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUITransition()
		 * @generated
		 */
		EClass UI_TRANSITION = eINSTANCE.getUITransition();

		/**
		 * The meta object literal for the '<em><b>Its Trgt State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_TRGT_STATE = eINSTANCE.getUITransition_ItsTrgtState();

		/**
		 * The meta object literal for the '<em><b>Its Src State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_SRC_STATE = eINSTANCE.getUITransition_ItsSrcState();

		/**
		 * The meta object literal for the '<em><b>Its Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_TRIGGER = eINSTANCE.getUITransition_ItsTrigger();

		/**
		 * The meta object literal for the '<em><b>Its Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_CONDITION = eINSTANCE.getUITransition_ItsCondition();

		/**
		 * The meta object literal for the '<em><b>Its Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_ACTION = eINSTANCE.getUITransition_ItsAction();

		/**
		 * The meta object literal for the '<em><b>Trigger Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_TRANSITION__TRIGGER_STR = eINSTANCE.getUITransition_TriggerStr();

		/**
		 * The meta object literal for the '<em><b>Guard Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_TRANSITION__GUARD_STR = eINSTANCE.getUITransition_GuardStr();

		/**
		 * The meta object literal for the '<em><b>Action Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_TRANSITION__ACTION_STR = eINSTANCE.getUITransition_ActionStr();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UITriggerImpl <em>UI Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UITriggerImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUITrigger()
		 * @generated
		 */
		EClass UI_TRIGGER = eINSTANCE.getUITrigger();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UserTriggerImpl <em>User Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UserTriggerImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUserTrigger()
		 * @generated
		 */
		EClass USER_TRIGGER = eINSTANCE.getUserTrigger();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.ComponentTriggerImpl <em>Component Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.ComponentTriggerImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getComponentTrigger()
		 * @generated
		 */
		EClass COMPONENT_TRIGGER = eINSTANCE.getComponentTrigger();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UIConditionImpl <em>UI Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UIConditionImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUICondition()
		 * @generated
		 */
		EClass UI_CONDITION = eINSTANCE.getUICondition();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.ActionImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UIControlImpl <em>UI Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UIControlImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUIControl()
		 * @generated
		 */
		EClass UI_CONTROL = eINSTANCE.getUIControl();

		/**
		 * The meta object literal for the '<em><b>Its Input Daa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CONTROL__ITS_INPUT_DAA = eINSTANCE.getUIControl_ItsInputDaa();

		/**
		 * The meta object literal for the '<em><b>Its Output Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_CONTROL__ITS_OUTPUT_DATA = eINSTANCE.getUIControl_ItsOutputData();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_CONTROL__VARIABLE_NAME = eINSTANCE.getUIControl_VariableName();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_CONTROL__VALUE_EXPRESSION = eINSTANCE.getUIControl_ValueExpression();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UIDataVariableImpl <em>UI Data Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UIDataVariableImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUIDataVariable()
		 * @generated
		 */
		EClass UI_DATA_VARIABLE = eINSTANCE.getUIDataVariable();

		/**
		 * The meta object literal for the '<em><b>Constraint RE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_DATA_VARIABLE__CONSTRAINT_RE = eINSTANCE.getUIDataVariable_ConstraintRE();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.UISUTElementImpl <em>UISUT Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.UISUTElementImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getUISUTElement()
		 * @generated
		 */
		EClass UISUT_ELEMENT = eINSTANCE.getUISUTElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UISUT_ELEMENT__NAME = eINSTANCE.getUISUTElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UISUT_ELEMENT__DESCRIPTION = eINSTANCE.getUISUTElement_Description();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.InitialStateImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.FinalStateImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link name.niu.guita.uisut.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guita.uisut.impl.AbstractStateImpl
		 * @see name.niu.guita.uisut.impl.uisutPackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>Its In Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__ITS_IN_TRANSITION = eINSTANCE.getAbstractState_ItsInTransition();

		/**
		 * The meta object literal for the '<em><b>Its Out Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__ITS_OUT_TRANSITION = eINSTANCE.getAbstractState_ItsOutTransition();

	}

} //uisutPackage
