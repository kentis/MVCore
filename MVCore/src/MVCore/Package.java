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
 *   <li>{@link MVCore.Package#getParent <em>Parent</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link MVCore.Package#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see MVCore.MVCorePackage#getPackage_SubPackages()
	 * @see MVCore.Package#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MVCore.Package#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Package)
	 * @see MVCore.MVCorePackage#getPackage_Parent()
	 * @see MVCore.Package#getSubPackages
	 * @model opposite="subPackages" transient="false"
	 * @generated
	 */
	Package getParent();

	/**
	 * Sets the value of the '{@link MVCore.Package#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Package value);

} // Package
