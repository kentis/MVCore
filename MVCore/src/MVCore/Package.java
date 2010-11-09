/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MVCore.Package#getMembers <em>Members</em>}</li>
 *   <li>{@link MVCore.Package#getName <em>Name</em>}</li>
 *   <li>{@link MVCore.Package#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see MVCore.MVCorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link MVCore.MVCoreClass}.
	 * It is bidirectional and its opposite is '{@link MVCore.MVCoreClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see MVCore.MVCorePackage#getPackage_Members()
	 * @see MVCore.MVCoreClass#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<MVCoreClass> getMembers();

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
	 * @see MVCore.MVCorePackage#getPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MVCore.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link MVCore.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see MVCore.MVCorePackage#getPackage_SubPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

} // Package
