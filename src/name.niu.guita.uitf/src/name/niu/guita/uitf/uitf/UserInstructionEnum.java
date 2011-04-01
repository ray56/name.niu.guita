/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uitf.uitf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Instruction Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see name.niu.guita.uitf.uitf.UitfPackage#getUserInstructionEnum()
 * @model
 * @generated
 */
public enum UserInstructionEnum implements Enumerator {
	/**
	 * The '<em><b>Set UI Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_UI_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	SET_UI_VALUE(0, "SetUIValue", "SetUIValue"),

	/**
	 * The '<em><b>Send UI Trigger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_UI_TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	SEND_UI_TRIGGER(0, "SendUITrigger", "SendUITrigger"),

	/**
	 * The '<em><b>Manipulate UI Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANIPULATE_UI_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	MANIPULATE_UI_CONTROL(0, "ManipulateUIControl", "ManipulateUIControl"),

	/**
	 * The '<em><b>Assert UI Value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERT_UI_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERT_UI_VALUE(0, "AssertUIValue", "AssertUIValue"),

	/**
	 * The '<em><b>Assert UI State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERT_UI_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERT_UI_STATE(0, "AssertUIState", "AssertUIState"),

	/**
	 * The '<em><b>Instantiate UISUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANTIATE_UISUT_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANTIATE_UISUT(0, "InstantiateUISUT", "InstantiateUISUT");

	/**
	 * The '<em><b>Set UI Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set UI Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_UI_VALUE
	 * @model name="SetUIValue"
	 * @generated
	 * @ordered
	 */
	public static final int SET_UI_VALUE_VALUE = 0;

	/**
	 * The '<em><b>Send UI Trigger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Send UI Trigger</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND_UI_TRIGGER
	 * @model name="SendUITrigger"
	 * @generated
	 * @ordered
	 */
	public static final int SEND_UI_TRIGGER_VALUE = 0;

	/**
	 * The '<em><b>Manipulate UI Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manipulate UI Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANIPULATE_UI_CONTROL
	 * @model name="ManipulateUIControl"
	 * @generated
	 * @ordered
	 */
	public static final int MANIPULATE_UI_CONTROL_VALUE = 0;

	/**
	 * The '<em><b>Assert UI Value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assert UI Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSERT_UI_VALUE
	 * @model name="AssertUIValue"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERT_UI_VALUE_VALUE = 0;

	/**
	 * The '<em><b>Assert UI State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assert UI State</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSERT_UI_STATE
	 * @model name="AssertUIState"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERT_UI_STATE_VALUE = 0;

	/**
	 * The '<em><b>Instantiate UISUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instantiate UISUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANTIATE_UISUT
	 * @model name="InstantiateUISUT"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANTIATE_UISUT_VALUE = 0;

	/**
	 * An array of all the '<em><b>User Instruction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserInstructionEnum[] VALUES_ARRAY =
		new UserInstructionEnum[] {
			SET_UI_VALUE,
			SEND_UI_TRIGGER,
			MANIPULATE_UI_CONTROL,
			ASSERT_UI_VALUE,
			ASSERT_UI_STATE,
			INSTANTIATE_UISUT,
		};

	/**
	 * A public read-only list of all the '<em><b>User Instruction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserInstructionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Instruction Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserInstructionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserInstructionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Instruction Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserInstructionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserInstructionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Instruction Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserInstructionEnum get(int value) {
		switch (value) {
			case SET_UI_VALUE_VALUE: return SET_UI_VALUE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UserInstructionEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UserInstructionEnum
