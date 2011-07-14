/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guitar.uisut;

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
 * @see name.niu.guitar.uisut.UisutFactory
 * @model kind="package"
 * @generated
 */
public interface UisutPackage extends EPackage {
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
	UisutPackage eINSTANCE = name.niu.guitar.uisut.impl.UisutPackageImpl.init();

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.UIElementImpl <em>UI Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.UIElementImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUIElement()
	 * @generated
	 */
	int UI_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT__HIGHLIGHT = 3;

	/**
	 * The number of structural features of the '<em>UI Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.UIStatemachineImpl <em>UI Statemachine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.UIStatemachineImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUIStatemachine()
	 * @generated
	 */
	int UI_STATEMACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__HIGHLIGHT = UI_ELEMENT__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its UI State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_UI_STATE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its UI Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_UI_TRANSITION = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Its Sub STM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_SUB_STM = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Its UI System Variable Pool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Its UI System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE = UI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Its State Shortcut</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE__ITS_STATE_SHORTCUT = UI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>UI Statemachine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STATEMACHINE_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.VertexImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__HIGHLIGHT = UI_ELEMENT__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ITS_IN_TRANSITION = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ITS_OUT_TRANSITION = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl <em>Abstract UI State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.AbstractUIStateImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getAbstractUIState()
	 * @generated
	 */
	int ABSTRACT_UI_STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__DESCRIPTION = VERTEX__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__ID = VERTEX__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__HIGHLIGHT = VERTEX__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__ITS_IN_TRANSITION = VERTEX__ITS_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__ITS_OUT_TRANSITION = VERTEX__ITS_OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Added System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deleted System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Script Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__SCRIPT_STR = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Its Expanded In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__ITS_EXPANDED_IN_TRANSITION = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Its Expanded Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE__ITS_EXPANDED_OUT_TRANSITION = VERTEX_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract UI State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UI_STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.UITransitionImpl <em>UI Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.UITransitionImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUITransition()
	 * @generated
	 */
	int UI_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__HIGHLIGHT = UI_ELEMENT__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its Src State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_SRC_STATE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Tar State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_TAR_STATE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guarded System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__GUARDED_SYSTEM_VARIABLE = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Script Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__SCRIPT_STR = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Its Expanded Tar State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_EXPANDED_TAR_STATE = UI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Its Expanded Src State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION__ITS_EXPANDED_SRC_STATE = UI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>UI Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_TRANSITION_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.UISystemVariableImpl <em>UI System Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.UISystemVariableImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUISystemVariable()
	 * @generated
	 */
	int UI_SYSTEM_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE__HIGHLIGHT = UI_ELEMENT__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Add UI State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE__ADD_UI_STATE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delete UI State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE__DELETE_UI_STATE = UI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guard UI Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS = UI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>UI System Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.CommonStateImpl <em>Common State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.CommonStateImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getCommonState()
	 * @generated
	 */
	int COMMON_STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__NAME = ABSTRACT_UI_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__DESCRIPTION = ABSTRACT_UI_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__ID = ABSTRACT_UI_STATE__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__HIGHLIGHT = ABSTRACT_UI_STATE__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__ITS_IN_TRANSITION = ABSTRACT_UI_STATE__ITS_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__ITS_OUT_TRANSITION = ABSTRACT_UI_STATE__ITS_OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Added System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__ADDED_SYSTEM_VARIABLE = ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE;

	/**
	 * The feature id for the '<em><b>Deleted System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__DELETED_SYSTEM_VARIABLE = ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE;

	/**
	 * The feature id for the '<em><b>Script Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__SCRIPT_STR = ABSTRACT_UI_STATE__SCRIPT_STR;

	/**
	 * The feature id for the '<em><b>Its Expanded In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__ITS_EXPANDED_IN_TRANSITION = ABSTRACT_UI_STATE__ITS_EXPANDED_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Expanded Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__ITS_EXPANDED_OUT_TRANSITION = ABSTRACT_UI_STATE__ITS_EXPANDED_OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__PICTURE = ABSTRACT_UI_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Its Shortcut</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE__ITS_SHORTCUT = ABSTRACT_UI_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Common State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_STATE_FEATURE_COUNT = ABSTRACT_UI_STATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.InitialStateImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = ABSTRACT_UI_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__DESCRIPTION = ABSTRACT_UI_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ID = ABSTRACT_UI_STATE__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__HIGHLIGHT = ABSTRACT_UI_STATE__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ITS_IN_TRANSITION = ABSTRACT_UI_STATE__ITS_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ITS_OUT_TRANSITION = ABSTRACT_UI_STATE__ITS_OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Added System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ADDED_SYSTEM_VARIABLE = ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE;

	/**
	 * The feature id for the '<em><b>Deleted System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__DELETED_SYSTEM_VARIABLE = ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE;

	/**
	 * The feature id for the '<em><b>Script Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__SCRIPT_STR = ABSTRACT_UI_STATE__SCRIPT_STR;

	/**
	 * The feature id for the '<em><b>Its Expanded In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ITS_EXPANDED_IN_TRANSITION = ABSTRACT_UI_STATE__ITS_EXPANDED_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Expanded Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__ITS_EXPANDED_OUT_TRANSITION = ABSTRACT_UI_STATE__ITS_EXPANDED_OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = ABSTRACT_UI_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.FinalStateImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = ABSTRACT_UI_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DESCRIPTION = ABSTRACT_UI_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ID = ABSTRACT_UI_STATE__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__HIGHLIGHT = ABSTRACT_UI_STATE__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ITS_IN_TRANSITION = ABSTRACT_UI_STATE__ITS_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ITS_OUT_TRANSITION = ABSTRACT_UI_STATE__ITS_OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Added System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ADDED_SYSTEM_VARIABLE = ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE;

	/**
	 * The feature id for the '<em><b>Deleted System Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DELETED_SYSTEM_VARIABLE = ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE;

	/**
	 * The feature id for the '<em><b>Script Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__SCRIPT_STR = ABSTRACT_UI_STATE__SCRIPT_STR;

	/**
	 * The feature id for the '<em><b>Its Expanded In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ITS_EXPANDED_IN_TRANSITION = ABSTRACT_UI_STATE__ITS_EXPANDED_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Expanded Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ITS_EXPANDED_OUT_TRANSITION = ABSTRACT_UI_STATE__ITS_EXPANDED_OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = ABSTRACT_UI_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.UISUTImpl <em>UISUT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.UISUTImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUISUT()
	 * @generated
	 */
	int UISUT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__HIGHLIGHT = UI_ELEMENT__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its STM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT__ITS_STM = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UISUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UISUT_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.UISystemVariablePoolImpl <em>UI System Variable Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.UISystemVariablePoolImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUISystemVariablePool()
	 * @generated
	 */
	int UI_SYSTEM_VARIABLE_POOL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE_POOL__NAME = UI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE_POOL__DESCRIPTION = UI_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE_POOL__ID = UI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE_POOL__HIGHLIGHT = UI_ELEMENT__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its UI System Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE = UI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI System Variable Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SYSTEM_VARIABLE_POOL_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link name.niu.guitar.uisut.impl.StateshortcutImpl <em>Stateshortcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see name.niu.guitar.uisut.impl.StateshortcutImpl
	 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getStateshortcut()
	 * @generated
	 */
	int STATESHORTCUT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATESHORTCUT__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATESHORTCUT__DESCRIPTION = VERTEX__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATESHORTCUT__ID = VERTEX__ID;

	/**
	 * The feature id for the '<em><b>Highlight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATESHORTCUT__HIGHLIGHT = VERTEX__HIGHLIGHT;

	/**
	 * The feature id for the '<em><b>Its In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATESHORTCUT__ITS_IN_TRANSITION = VERTEX__ITS_IN_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Out Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATESHORTCUT__ITS_OUT_TRANSITION = VERTEX__ITS_OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Its Shortcut For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATESHORTCUT__ITS_SHORTCUT_FOR = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stateshortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATESHORTCUT_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.UIStatemachine <em>UI Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Statemachine</em>'.
	 * @see name.niu.guitar.uisut.UIStatemachine
	 * @generated
	 */
	EClass getUIStatemachine();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guitar.uisut.UIStatemachine#getItsUIState <em>Its UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its UI State</em>'.
	 * @see name.niu.guitar.uisut.UIStatemachine#getItsUIState()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsUIState();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guitar.uisut.UIStatemachine#getItsUITransition <em>Its UI Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its UI Transition</em>'.
	 * @see name.niu.guitar.uisut.UIStatemachine#getItsUITransition()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsUITransition();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.UIStatemachine#getItsUISystemVariable <em>Its UI System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its UI System Variable</em>'.
	 * @see name.niu.guitar.uisut.UIStatemachine#getItsUISystemVariable()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsUISystemVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guitar.uisut.UIStatemachine#getItsStateShortcut <em>Its State Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its State Shortcut</em>'.
	 * @see name.niu.guitar.uisut.UIStatemachine#getItsStateShortcut()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsStateShortcut();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guitar.uisut.UIStatemachine#getItsSubSTM <em>Its Sub STM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Sub STM</em>'.
	 * @see name.niu.guitar.uisut.UIStatemachine#getItsSubSTM()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsSubSTM();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guitar.uisut.UIStatemachine#getItsUISystemVariablePool <em>Its UI System Variable Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its UI System Variable Pool</em>'.
	 * @see name.niu.guitar.uisut.UIStatemachine#getItsUISystemVariablePool()
	 * @see #getUIStatemachine()
	 * @generated
	 */
	EReference getUIStatemachine_ItsUISystemVariablePool();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.AbstractUIState <em>Abstract UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract UI State</em>'.
	 * @see name.niu.guitar.uisut.AbstractUIState
	 * @generated
	 */
	EClass getAbstractUIState();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.AbstractUIState#getAddedSystemVariable <em>Added System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Added System Variable</em>'.
	 * @see name.niu.guitar.uisut.AbstractUIState#getAddedSystemVariable()
	 * @see #getAbstractUIState()
	 * @generated
	 */
	EReference getAbstractUIState_AddedSystemVariable();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.AbstractUIState#getDeletedSystemVariable <em>Deleted System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deleted System Variable</em>'.
	 * @see name.niu.guitar.uisut.AbstractUIState#getDeletedSystemVariable()
	 * @see #getAbstractUIState()
	 * @generated
	 */
	EReference getAbstractUIState_DeletedSystemVariable();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uisut.AbstractUIState#getScriptStr <em>Script Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Str</em>'.
	 * @see name.niu.guitar.uisut.AbstractUIState#getScriptStr()
	 * @see #getAbstractUIState()
	 * @generated
	 */
	EAttribute getAbstractUIState_ScriptStr();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.AbstractUIState#getItsExpandedInTransition <em>Its Expanded In Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Expanded In Transition</em>'.
	 * @see name.niu.guitar.uisut.AbstractUIState#getItsExpandedInTransition()
	 * @see #getAbstractUIState()
	 * @generated
	 */
	EReference getAbstractUIState_ItsExpandedInTransition();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.AbstractUIState#getItsExpandedOutTransition <em>Its Expanded Out Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Expanded Out Transition</em>'.
	 * @see name.niu.guitar.uisut.AbstractUIState#getItsExpandedOutTransition()
	 * @see #getAbstractUIState()
	 * @generated
	 */
	EReference getAbstractUIState_ItsExpandedOutTransition();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.UITransition <em>UI Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Transition</em>'.
	 * @see name.niu.guitar.uisut.UITransition
	 * @generated
	 */
	EClass getUITransition();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guitar.uisut.UITransition#getItsSrcState <em>Its Src State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Src State</em>'.
	 * @see name.niu.guitar.uisut.UITransition#getItsSrcState()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsSrcState();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guitar.uisut.UITransition#getItsTarState <em>Its Tar State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Tar State</em>'.
	 * @see name.niu.guitar.uisut.UITransition#getItsTarState()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsTarState();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.UITransition#getGuardedSystemVariable <em>Guarded System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guarded System Variable</em>'.
	 * @see name.niu.guitar.uisut.UITransition#getGuardedSystemVariable()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_GuardedSystemVariable();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uisut.UITransition#getScriptStr <em>Script Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Str</em>'.
	 * @see name.niu.guitar.uisut.UITransition#getScriptStr()
	 * @see #getUITransition()
	 * @generated
	 */
	EAttribute getUITransition_ScriptStr();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guitar.uisut.UITransition#getItsExpandedTarState <em>Its Expanded Tar State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Expanded Tar State</em>'.
	 * @see name.niu.guitar.uisut.UITransition#getItsExpandedTarState()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsExpandedTarState();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guitar.uisut.UITransition#getItsExpandedSrcState <em>Its Expanded Src State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Expanded Src State</em>'.
	 * @see name.niu.guitar.uisut.UITransition#getItsExpandedSrcState()
	 * @see #getUITransition()
	 * @generated
	 */
	EReference getUITransition_ItsExpandedSrcState();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.UISystemVariable <em>UI System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI System Variable</em>'.
	 * @see name.niu.guitar.uisut.UISystemVariable
	 * @generated
	 */
	EClass getUISystemVariable();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.UISystemVariable#getAddUIState <em>Add UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Add UI State</em>'.
	 * @see name.niu.guitar.uisut.UISystemVariable#getAddUIState()
	 * @see #getUISystemVariable()
	 * @generated
	 */
	EReference getUISystemVariable_AddUIState();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.UISystemVariable#getDeleteUIState <em>Delete UI State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delete UI State</em>'.
	 * @see name.niu.guitar.uisut.UISystemVariable#getDeleteUIState()
	 * @see #getUISystemVariable()
	 * @generated
	 */
	EReference getUISystemVariable_DeleteUIState();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.UISystemVariable#getGuardUITransitions <em>Guard UI Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guard UI Transitions</em>'.
	 * @see name.niu.guitar.uisut.UISystemVariable#getGuardUITransitions()
	 * @see #getUISystemVariable()
	 * @generated
	 */
	EReference getUISystemVariable_GuardUITransitions();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.UIElement <em>UI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Element</em>'.
	 * @see name.niu.guitar.uisut.UIElement
	 * @generated
	 */
	EClass getUIElement();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uisut.UIElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see name.niu.guitar.uisut.UIElement#getName()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uisut.UIElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see name.niu.guitar.uisut.UIElement#getDescription()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uisut.UIElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see name.niu.guitar.uisut.UIElement#getId()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uisut.UIElement#getHighlight <em>Highlight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highlight</em>'.
	 * @see name.niu.guitar.uisut.UIElement#getHighlight()
	 * @see #getUIElement()
	 * @generated
	 */
	EAttribute getUIElement_Highlight();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.CommonState <em>Common State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common State</em>'.
	 * @see name.niu.guitar.uisut.CommonState
	 * @generated
	 */
	EClass getCommonState();

	/**
	 * Returns the meta object for the attribute '{@link name.niu.guitar.uisut.CommonState#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture</em>'.
	 * @see name.niu.guitar.uisut.CommonState#getPicture()
	 * @see #getCommonState()
	 * @generated
	 */
	EAttribute getCommonState_Picture();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.CommonState#getItsShortcut <em>Its Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Shortcut</em>'.
	 * @see name.niu.guitar.uisut.CommonState#getItsShortcut()
	 * @see #getCommonState()
	 * @generated
	 */
	EReference getCommonState_ItsShortcut();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see name.niu.guitar.uisut.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see name.niu.guitar.uisut.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.UISUT <em>UISUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UISUT</em>'.
	 * @see name.niu.guitar.uisut.UISUT
	 * @generated
	 */
	EClass getUISUT();

	/**
	 * Returns the meta object for the containment reference '{@link name.niu.guitar.uisut.UISUT#getItsSTM <em>Its STM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Its STM</em>'.
	 * @see name.niu.guitar.uisut.UISUT#getItsSTM()
	 * @see #getUISUT()
	 * @generated
	 */
	EReference getUISUT_ItsSTM();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.UISystemVariablePool <em>UI System Variable Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI System Variable Pool</em>'.
	 * @see name.niu.guitar.uisut.UISystemVariablePool
	 * @generated
	 */
	EClass getUISystemVariablePool();

	/**
	 * Returns the meta object for the containment reference list '{@link name.niu.guitar.uisut.UISystemVariablePool#getItsUISystemVariable <em>Its UI System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its UI System Variable</em>'.
	 * @see name.niu.guitar.uisut.UISystemVariablePool#getItsUISystemVariable()
	 * @see #getUISystemVariablePool()
	 * @generated
	 */
	EReference getUISystemVariablePool_ItsUISystemVariable();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.Stateshortcut <em>Stateshortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateshortcut</em>'.
	 * @see name.niu.guitar.uisut.Stateshortcut
	 * @generated
	 */
	EClass getStateshortcut();

	/**
	 * Returns the meta object for the reference '{@link name.niu.guitar.uisut.Stateshortcut#getItsShortcutFor <em>Its Shortcut For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Shortcut For</em>'.
	 * @see name.niu.guitar.uisut.Stateshortcut#getItsShortcutFor()
	 * @see #getStateshortcut()
	 * @generated
	 */
	EReference getStateshortcut_ItsShortcutFor();

	/**
	 * Returns the meta object for class '{@link name.niu.guitar.uisut.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see name.niu.guitar.uisut.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.Vertex#getItsInTransition <em>Its In Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its In Transition</em>'.
	 * @see name.niu.guitar.uisut.Vertex#getItsInTransition()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_ItsInTransition();

	/**
	 * Returns the meta object for the reference list '{@link name.niu.guitar.uisut.Vertex#getItsOutTransition <em>Its Out Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Its Out Transition</em>'.
	 * @see name.niu.guitar.uisut.Vertex#getItsOutTransition()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_ItsOutTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UisutFactory getUisutFactory();

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
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.UIStatemachineImpl <em>UI Statemachine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.UIStatemachineImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUIStatemachine()
		 * @generated
		 */
		EClass UI_STATEMACHINE = eINSTANCE.getUIStatemachine();

		/**
		 * The meta object literal for the '<em><b>Its UI State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_UI_STATE = eINSTANCE.getUIStatemachine_ItsUIState();

		/**
		 * The meta object literal for the '<em><b>Its UI Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_UI_TRANSITION = eINSTANCE.getUIStatemachine_ItsUITransition();

		/**
		 * The meta object literal for the '<em><b>Its UI System Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE = eINSTANCE.getUIStatemachine_ItsUISystemVariable();

		/**
		 * The meta object literal for the '<em><b>Its State Shortcut</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_STATE_SHORTCUT = eINSTANCE.getUIStatemachine_ItsStateShortcut();

		/**
		 * The meta object literal for the '<em><b>Its Sub STM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_SUB_STM = eINSTANCE.getUIStatemachine_ItsSubSTM();

		/**
		 * The meta object literal for the '<em><b>Its UI System Variable Pool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_STATEMACHINE__ITS_UI_SYSTEM_VARIABLE_POOL = eINSTANCE.getUIStatemachine_ItsUISystemVariablePool();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.AbstractUIStateImpl <em>Abstract UI State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.AbstractUIStateImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getAbstractUIState()
		 * @generated
		 */
		EClass ABSTRACT_UI_STATE = eINSTANCE.getAbstractUIState();

		/**
		 * The meta object literal for the '<em><b>Added System Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UI_STATE__ADDED_SYSTEM_VARIABLE = eINSTANCE.getAbstractUIState_AddedSystemVariable();

		/**
		 * The meta object literal for the '<em><b>Deleted System Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UI_STATE__DELETED_SYSTEM_VARIABLE = eINSTANCE.getAbstractUIState_DeletedSystemVariable();

		/**
		 * The meta object literal for the '<em><b>Script Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_UI_STATE__SCRIPT_STR = eINSTANCE.getAbstractUIState_ScriptStr();

		/**
		 * The meta object literal for the '<em><b>Its Expanded In Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UI_STATE__ITS_EXPANDED_IN_TRANSITION = eINSTANCE.getAbstractUIState_ItsExpandedInTransition();

		/**
		 * The meta object literal for the '<em><b>Its Expanded Out Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_UI_STATE__ITS_EXPANDED_OUT_TRANSITION = eINSTANCE.getAbstractUIState_ItsExpandedOutTransition();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.UITransitionImpl <em>UI Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.UITransitionImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUITransition()
		 * @generated
		 */
		EClass UI_TRANSITION = eINSTANCE.getUITransition();

		/**
		 * The meta object literal for the '<em><b>Its Src State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_SRC_STATE = eINSTANCE.getUITransition_ItsSrcState();

		/**
		 * The meta object literal for the '<em><b>Its Tar State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_TAR_STATE = eINSTANCE.getUITransition_ItsTarState();

		/**
		 * The meta object literal for the '<em><b>Guarded System Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__GUARDED_SYSTEM_VARIABLE = eINSTANCE.getUITransition_GuardedSystemVariable();

		/**
		 * The meta object literal for the '<em><b>Script Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_TRANSITION__SCRIPT_STR = eINSTANCE.getUITransition_ScriptStr();

		/**
		 * The meta object literal for the '<em><b>Its Expanded Tar State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_EXPANDED_TAR_STATE = eINSTANCE.getUITransition_ItsExpandedTarState();

		/**
		 * The meta object literal for the '<em><b>Its Expanded Src State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_TRANSITION__ITS_EXPANDED_SRC_STATE = eINSTANCE.getUITransition_ItsExpandedSrcState();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.UISystemVariableImpl <em>UI System Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.UISystemVariableImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUISystemVariable()
		 * @generated
		 */
		EClass UI_SYSTEM_VARIABLE = eINSTANCE.getUISystemVariable();

		/**
		 * The meta object literal for the '<em><b>Add UI State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SYSTEM_VARIABLE__ADD_UI_STATE = eINSTANCE.getUISystemVariable_AddUIState();

		/**
		 * The meta object literal for the '<em><b>Delete UI State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SYSTEM_VARIABLE__DELETE_UI_STATE = eINSTANCE.getUISystemVariable_DeleteUIState();

		/**
		 * The meta object literal for the '<em><b>Guard UI Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SYSTEM_VARIABLE__GUARD_UI_TRANSITIONS = eINSTANCE.getUISystemVariable_GuardUITransitions();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.UIElementImpl <em>UI Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.UIElementImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUIElement()
		 * @generated
		 */
		EClass UI_ELEMENT = eINSTANCE.getUIElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__NAME = eINSTANCE.getUIElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__DESCRIPTION = eINSTANCE.getUIElement_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__ID = eINSTANCE.getUIElement_Id();

		/**
		 * The meta object literal for the '<em><b>Highlight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEMENT__HIGHLIGHT = eINSTANCE.getUIElement_Highlight();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.CommonStateImpl <em>Common State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.CommonStateImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getCommonState()
		 * @generated
		 */
		EClass COMMON_STATE = eINSTANCE.getCommonState();

		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_STATE__PICTURE = eINSTANCE.getCommonState_Picture();

		/**
		 * The meta object literal for the '<em><b>Its Shortcut</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_STATE__ITS_SHORTCUT = eINSTANCE.getCommonState_ItsShortcut();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.InitialStateImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.FinalStateImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.UISUTImpl <em>UISUT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.UISUTImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUISUT()
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
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.UISystemVariablePoolImpl <em>UI System Variable Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.UISystemVariablePoolImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getUISystemVariablePool()
		 * @generated
		 */
		EClass UI_SYSTEM_VARIABLE_POOL = eINSTANCE.getUISystemVariablePool();

		/**
		 * The meta object literal for the '<em><b>Its UI System Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_SYSTEM_VARIABLE_POOL__ITS_UI_SYSTEM_VARIABLE = eINSTANCE.getUISystemVariablePool_ItsUISystemVariable();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.StateshortcutImpl <em>Stateshortcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.StateshortcutImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getStateshortcut()
		 * @generated
		 */
		EClass STATESHORTCUT = eINSTANCE.getStateshortcut();

		/**
		 * The meta object literal for the '<em><b>Its Shortcut For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATESHORTCUT__ITS_SHORTCUT_FOR = eINSTANCE.getStateshortcut_ItsShortcutFor();

		/**
		 * The meta object literal for the '{@link name.niu.guitar.uisut.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see name.niu.guitar.uisut.impl.VertexImpl
		 * @see name.niu.guitar.uisut.impl.UisutPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Its In Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__ITS_IN_TRANSITION = eINSTANCE.getVertex_ItsInTransition();

		/**
		 * The meta object literal for the '<em><b>Its Out Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__ITS_OUT_TRANSITION = eINSTANCE.getVertex_ItsOutTransition();

	}

} //UisutPackage
