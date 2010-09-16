/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore.impl;

import MVCore.EAction;
import MVCore.EControllerClass;
import MVCore.EDomainClass;
import MVCore.EMVCAttribute;
import MVCore.EMVCPackage;
import MVCore.MVCoreFactory;
import MVCore.MVCorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MVCorePackageImpl extends EPackageImpl implements MVCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDomainClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eControllerClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emvcPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emvcAttributeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MVCore.MVCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MVCorePackageImpl() {
		super(eNS_URI, MVCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MVCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MVCorePackage init() {
		if (isInited) return (MVCorePackage)EPackage.Registry.INSTANCE.getEPackage(MVCorePackage.eNS_URI);

		// Obtain or create and register package
		MVCorePackageImpl theMVCorePackage = (MVCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MVCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MVCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMVCorePackage.createPackageContents();

		// Initialize created meta-data
		theMVCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMVCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MVCorePackage.eNS_URI, theMVCorePackage);
		return theMVCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDomainClass() {
		return eDomainClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainClass_Searchable() {
		return (EAttribute)eDomainClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainClass_Loggable() {
		return (EAttribute)eDomainClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDomainClass_Attributes() {
		return (EReference)eDomainClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEControllerClass() {
		return eControllerClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAction() {
		return eActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMVCPackage() {
		return emvcPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMVCAttribute() {
		return emvcAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MVCoreFactory getMVCoreFactory() {
		return (MVCoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eDomainClassEClass = createEClass(EDOMAIN_CLASS);
		createEAttribute(eDomainClassEClass, EDOMAIN_CLASS__SEARCHABLE);
		createEAttribute(eDomainClassEClass, EDOMAIN_CLASS__LOGGABLE);
		createEReference(eDomainClassEClass, EDOMAIN_CLASS__ATTRIBUTES);

		eControllerClassEClass = createEClass(ECONTROLLER_CLASS);

		eActionEClass = createEClass(EACTION);

		emvcPackageEClass = createEClass(EMVC_PACKAGE);

		emvcAttributeEClass = createEClass(EMVC_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eDomainClassEClass.getESuperTypes().add(theEcorePackage.getEClass());
		eControllerClassEClass.getESuperTypes().add(theEcorePackage.getEClass());
		eActionEClass.getESuperTypes().add(theEcorePackage.getEOperation());
		emvcPackageEClass.getESuperTypes().add(theEcorePackage.getEPackage());
		emvcAttributeEClass.getESuperTypes().add(theEcorePackage.getEAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(eDomainClassEClass, EDomainClass.class, "EDomainClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDomainClass_Searchable(), theEcorePackage.getEString(), "Searchable", "false", 0, 1, EDomainClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDomainClass_Loggable(), theEcorePackage.getEString(), "Loggable", "false", 0, 1, EDomainClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDomainClass_Attributes(), this.getEMVCAttribute(), null, "attributes", null, 0, -1, EDomainClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eControllerClassEClass, EControllerClass.class, "EControllerClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eActionEClass, EAction.class, "EAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emvcPackageEClass, EMVCPackage.class, "EMVCPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emvcAttributeEClass, EMVCAttribute.class, "EMVCAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MVCorePackageImpl
