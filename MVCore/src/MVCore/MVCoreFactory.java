/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MVCore.MVCorePackage
 * @generated
 */
public interface MVCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MVCoreFactory eINSTANCE = MVCore.impl.MVCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EDomain Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDomain Class</em>'.
	 * @generated
	 */
	EDomainClass createEDomainClass();

	/**
	 * Returns a new object of class '<em>EController Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EController Class</em>'.
	 * @generated
	 */
	EControllerClass createEControllerClass();

	/**
	 * Returns a new object of class '<em>EAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAction</em>'.
	 * @generated
	 */
	EAction createEAction();

	/**
	 * Returns a new object of class '<em>EMVC Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMVC Package</em>'.
	 * @generated
	 */
	EMVCPackage createEMVCPackage();

	/**
	 * Returns a new object of class '<em>EMVC Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMVC Attribute</em>'.
	 * @generated
	 */
	EMVCAttribute createEMVCAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MVCorePackage getMVCorePackage();

} //MVCoreFactory
