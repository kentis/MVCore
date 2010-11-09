/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MVCore.MVCoreClass#getName <em>Name</em>}</li>
 *   <li>{@link MVCore.MVCoreClass#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see MVCore.MVCorePackage#getMVCoreClass()
 * @model
 * @generated
 */
public interface MVCoreClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MVCore.MVCorePackage#getMVCoreClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MVCore.MVCoreClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MVCore.Package#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(MVCore.Package)
	 * @see MVCore.MVCorePackage#getMVCoreClass_Package()
	 * @see MVCore.Package#getMembers
	 * @model opposite="members" required="true" transient="false"
	 * @generated
	 */
	MVCore.Package getPackage();

	/**
	 * Sets the value of the '{@link MVCore.MVCoreClass#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(MVCore.Package value);

} // MVCoreClass
