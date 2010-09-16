/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore.impl;

import MVCore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MVCoreFactoryImpl extends EFactoryImpl implements MVCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MVCoreFactory init() {
		try {
			MVCoreFactory theMVCoreFactory = (MVCoreFactory)EPackage.Registry.INSTANCE.getEFactory("org.friark"); 
			if (theMVCoreFactory != null) {
				return theMVCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MVCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MVCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MVCorePackage.EDOMAIN_CLASS: return createEDomainClass();
			case MVCorePackage.ECONTROLLER_CLASS: return createEControllerClass();
			case MVCorePackage.EACTION: return createEAction();
			case MVCorePackage.EMVC_PACKAGE: return createEMVCPackage();
			case MVCorePackage.EMVC_ATTRIBUTE: return createEMVCAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDomainClass createEDomainClass() {
		EDomainClassImpl eDomainClass = new EDomainClassImpl();
		return eDomainClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EControllerClass createEControllerClass() {
		EControllerClassImpl eControllerClass = new EControllerClassImpl();
		return eControllerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAction createEAction() {
		EActionImpl eAction = new EActionImpl();
		return eAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMVCPackage createEMVCPackage() {
		EMVCPackageImpl emvcPackage = new EMVCPackageImpl();
		return emvcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMVCAttribute createEMVCAttribute() {
		EMVCAttributeImpl emvcAttribute = new EMVCAttributeImpl();
		return emvcAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MVCorePackage getMVCorePackage() {
		return (MVCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MVCorePackage getPackage() {
		return MVCorePackage.eINSTANCE;
	}

} //MVCoreFactoryImpl
