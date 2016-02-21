/**
 */
package MVCore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MVCore.View#getViewParts <em>View Parts</em>}</li>
 *   <li>{@link MVCore.View#getData <em>Data</em>}</li>
 *   <li>{@link MVCore.View#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see MVCore.MVCorePackage#getView()
 * @model
 * @generated
 */
public interface View extends MVCoreClass {
	/**
	 * Returns the value of the '<em><b>View Parts</b></em>' reference list.
	 * The list contents are of type {@link MVCore.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Parts</em>' reference list.
	 * @see MVCore.MVCorePackage#getView_ViewParts()
	 * @model
	 * @generated
	 */
	EList<View> getViewParts();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link MVCore.Domain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see MVCore.MVCorePackage#getView_Data()
	 * @model
	 * @generated
	 */
	EList<Domain> getData();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link MVCore.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see MVCore.MVCorePackage#getView_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

} // View
