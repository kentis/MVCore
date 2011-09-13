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
 * A test suite for the '<em><b>MVCore</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class MVCoreAllTests extends TestSuite {

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
		TestSuite suite = new MVCoreAllTests("MVCore Tests");
		suite.addTest(MVCoreTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MVCoreAllTests(String name) {
		super(name);
	}

} //MVCoreAllTests
