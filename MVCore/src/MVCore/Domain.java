/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MVCore.Domain#getSearchable <em>Searchable</em>}</li>
 *   <li>{@link MVCore.Domain#getLoggable <em>Loggable</em>}</li>
 *   <li>{@link MVCore.Domain#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link MVCore.Domain#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see MVCore.MVCorePackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends MVCoreClass {
	/**
	 * Returns the value of the '<em><b>Searchable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Searchable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchable</em>' attribute.
	 * @see #setSearchable(String)
	 * @see MVCore.MVCorePackage#getDomain_Searchable()
	 * @model default="false"
	 * @generated
	 */
	String getSearchable();

	/**
	 * Sets the value of the '{@link MVCore.Domain#getSearchable <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Searchable</em>' attribute.
	 * @see #getSearchable()
	 * @generated
	 */
	void setSearchable(String value);

	/**
	 * Returns the value of the '<em><b>Loggable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loggable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loggable</em>' attribute.
	 * @see #setLoggable(String)
	 * @see MVCore.MVCorePackage#getDomain_Loggable()
	 * @model default="false"
	 * @generated
	 */
	String getLoggable();

	/**
	 * Sets the value of the '{@link MVCore.Domain#getLoggable <em>Loggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loggable</em>' attribute.
	 * @see #getLoggable()
	 * @generated
	 */
	void setLoggable(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link MVCore.Attribute}.
	 * It is bidirectional and its opposite is '{@link MVCore.Attribute#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see MVCore.MVCorePackage#getDomain_Attributes()
	 * @see MVCore.Attribute#getDomain
	 * @model opposite="domain" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link MVCore.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see MVCore.MVCorePackage#getDomain_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

} // Domain
