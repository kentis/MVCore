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
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MVCore.Attribute#getDomain <em>Domain</em>}</li>
 *   <li>{@link MVCore.Attribute#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see MVCore.MVCorePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MVCore.Domain#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see MVCore.MVCorePackage#getAttribute_Domain()
	 * @see MVCore.Domain#getAttributes
	 * @model opposite="attributes" required="true" transient="false"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link MVCore.Attribute#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

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
	 * @see MVCore.MVCorePackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MVCore.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Attribute
