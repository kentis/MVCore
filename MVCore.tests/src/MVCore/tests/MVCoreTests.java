/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>MVCore</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MVCoreTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MVCoreTests("MVCore Tests");
		suite.addTestSuite(AttributeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MVCoreTests(String name) {
		super(name);
	}

} //MVCoreTests
