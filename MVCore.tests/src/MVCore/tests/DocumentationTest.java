/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore.tests;

import MVCore.Documentation;
import MVCore.MVCoreFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentationTest extends TestCase {

	/**
	 * The fixture for this Documentation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Documentation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentationTest.class);
	}

	/**
	 * Constructs a new Documentation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Documentation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Documentation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Documentation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Documentation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MVCoreFactory.eINSTANCE.createDocumentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DocumentationTest
