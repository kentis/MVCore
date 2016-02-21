/**
 */
package MVCore.impl;

import MVCore.Action;
import MVCore.Domain;
import MVCore.MVCorePackage;
import MVCore.View;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MVCore.impl.ViewImpl#getViewParts <em>View Parts</em>}</li>
 *   <li>{@link MVCore.impl.ViewImpl#getData <em>Data</em>}</li>
 *   <li>{@link MVCore.impl.ViewImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends MVCoreClassImpl implements View {
	/**
	 * The cached value of the '{@link #getViewParts() <em>View Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewParts()
	 * @generated
	 * @ordered
	 */
	protected EList<View> viewParts;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> data;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MVCorePackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViewParts() {
		if (viewParts == null) {
			viewParts = new EObjectResolvingEList<View>(View.class, this, MVCorePackage.VIEW__VIEW_PARTS);
		}
		return viewParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Domain>(Domain.class, this, MVCorePackage.VIEW__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Action>(Action.class, this, MVCorePackage.VIEW__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MVCorePackage.VIEW__VIEW_PARTS:
				return getViewParts();
			case MVCorePackage.VIEW__DATA:
				return getData();
			case MVCorePackage.VIEW__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MVCorePackage.VIEW__VIEW_PARTS:
				getViewParts().clear();
				getViewParts().addAll((Collection<? extends View>)newValue);
				return;
			case MVCorePackage.VIEW__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Domain>)newValue);
				return;
			case MVCorePackage.VIEW__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MVCorePackage.VIEW__VIEW_PARTS:
				getViewParts().clear();
				return;
			case MVCorePackage.VIEW__DATA:
				getData().clear();
				return;
			case MVCorePackage.VIEW__ACTIONS:
				getActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MVCorePackage.VIEW__VIEW_PARTS:
				return viewParts != null && !viewParts.isEmpty();
			case MVCorePackage.VIEW__DATA:
				return data != null && !data.isEmpty();
			case MVCorePackage.VIEW__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewImpl
