/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MVCore.impl;

import MVCore.EDomainClass;
import MVCore.EMVCAttribute;
import MVCore.MVCorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDomain Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MVCore.impl.EDomainClassImpl#getSearchable <em>Searchable</em>}</li>
 *   <li>{@link MVCore.impl.EDomainClassImpl#getLoggable <em>Loggable</em>}</li>
 *   <li>{@link MVCore.impl.EDomainClassImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDomainClassImpl extends EClassImpl implements EDomainClass {
	/**
	 * The default value of the '{@link #getSearchable() <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchable()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCHABLE_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getSearchable() <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchable()
	 * @generated
	 * @ordered
	 */
	protected String searchable = SEARCHABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoggable() <em>Loggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggable()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGGABLE_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getLoggable() <em>Loggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggable()
	 * @generated
	 * @ordered
	 */
	protected String loggable = LOGGABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EMVCAttribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDomainClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MVCorePackage.Literals.EDOMAIN_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearchable() {
		return searchable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchable(String newSearchable) {
		String oldSearchable = searchable;
		searchable = newSearchable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MVCorePackage.EDOMAIN_CLASS__SEARCHABLE, oldSearchable, searchable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoggable() {
		return loggable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoggable(String newLoggable) {
		String oldLoggable = loggable;
		loggable = newLoggable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MVCorePackage.EDOMAIN_CLASS__LOGGABLE, oldLoggable, loggable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMVCAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<EMVCAttribute>(EMVCAttribute.class, this, MVCorePackage.EDOMAIN_CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MVCorePackage.EDOMAIN_CLASS__SEARCHABLE:
				return getSearchable();
			case MVCorePackage.EDOMAIN_CLASS__LOGGABLE:
				return getLoggable();
			case MVCorePackage.EDOMAIN_CLASS__ATTRIBUTES:
				return getAttributes();
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
			case MVCorePackage.EDOMAIN_CLASS__SEARCHABLE:
				setSearchable((String)newValue);
				return;
			case MVCorePackage.EDOMAIN_CLASS__LOGGABLE:
				setLoggable((String)newValue);
				return;
			case MVCorePackage.EDOMAIN_CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends EMVCAttribute>)newValue);
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
			case MVCorePackage.EDOMAIN_CLASS__SEARCHABLE:
				setSearchable(SEARCHABLE_EDEFAULT);
				return;
			case MVCorePackage.EDOMAIN_CLASS__LOGGABLE:
				setLoggable(LOGGABLE_EDEFAULT);
				return;
			case MVCorePackage.EDOMAIN_CLASS__ATTRIBUTES:
				getAttributes().clear();
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
			case MVCorePackage.EDOMAIN_CLASS__SEARCHABLE:
				return SEARCHABLE_EDEFAULT == null ? searchable != null : !SEARCHABLE_EDEFAULT.equals(searchable);
			case MVCorePackage.EDOMAIN_CLASS__LOGGABLE:
				return LOGGABLE_EDEFAULT == null ? loggable != null : !LOGGABLE_EDEFAULT.equals(loggable);
			case MVCorePackage.EDOMAIN_CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Searchable: ");
		result.append(searchable);
		result.append(", Loggable: ");
		result.append(loggable);
		result.append(')');
		return result.toString();
	}

} //EDomainClassImpl
