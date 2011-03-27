/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.niu.guita.uisut.impl;

import name.niu.guita.uisut.UIDataVariable;
import name.niu.guita.uisut.uisutPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Data Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link name.niu.guita.uisut.impl.UIDataVariableImpl#getConstraintRE <em>Constraint RE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIDataVariableImpl extends UISUTElementImpl implements UIDataVariable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIDataVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return uisutPackage.Literals.UI_DATA_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintRE() {
		return (String)eGet(uisutPackage.Literals.UI_DATA_VARIABLE__CONSTRAINT_RE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintRE(String newConstraintRE) {
		eSet(uisutPackage.Literals.UI_DATA_VARIABLE__CONSTRAINT_RE, newConstraintRE);
	}

} //UIDataVariableImpl
