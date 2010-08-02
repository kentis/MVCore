/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDomain Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MVCore.EDomainClass#getSearchable <em>Searchable</em>}</li>
 *   <li>{@link MVCore.EDomainClass#getLoggable <em>Loggable</em>}</li>
 *   <li>{@link MVCore.EDomainClass#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see MVCore.MVCorePackage#getEDomainClass()
 * @model
 * @generated
 */
public interface EDomainClass extends EClass {
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
	 * @see MVCore.MVCorePackage#getEDomainClass_Searchable()
	 * @model default="false"
	 * @generated
	 */
	String getSearchable();

	/**
	 * Sets the value of the '{@link MVCore.EDomainClass#getSearchable <em>Searchable</em>}' attribute.
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
	 * @see MVCore.MVCorePackage#getEDomainClass_Loggable()
	 * @model default="false"
	 * @generated
	 */
	String getLoggable();

	/**
	 * Sets the value of the '{@link MVCore.EDomainClass#getLoggable <em>Loggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loggable</em>' attribute.
	 * @see #getLoggable()
	 * @generated
	 */
	void setLoggable(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link MVCore.EMVCAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see MVCore.MVCorePackage#getEDomainClass_Attributes()
	 * @model
	 * @generated
	 */
	EList<EMVCAttribute> getAttributes();

} // EDomainClass
