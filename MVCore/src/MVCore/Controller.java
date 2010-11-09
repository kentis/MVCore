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
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MVCore.Controller#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see MVCore.MVCorePackage#getController()
 * @model
 * @generated
 */
public interface Controller extends MVCoreClass {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link MVCore.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see MVCore.MVCorePackage#getController_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Controller
