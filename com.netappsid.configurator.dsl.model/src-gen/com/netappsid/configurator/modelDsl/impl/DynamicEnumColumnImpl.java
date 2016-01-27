/**
 * generated by Xtext 2.9.1
 */
package com.netappsid.configurator.modelDsl.impl;

import com.netappsid.configurator.modelDsl.DynamicEnumColumn;
import com.netappsid.configurator.modelDsl.ModelDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Enum Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.netappsid.configurator.modelDsl.impl.DynamicEnumColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.netappsid.configurator.modelDsl.impl.DynamicEnumColumnImpl#getColumnIndex <em>Column Index</em>}</li>
 *   <li>{@link com.netappsid.configurator.modelDsl.impl.DynamicEnumColumnImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicEnumColumnImpl extends MinimalEObjectImpl.Container implements DynamicEnumColumn
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getColumnIndex() <em>Column Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnIndex()
   * @generated
   * @ordered
   */
  protected static final int COLUMN_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColumnIndex() <em>Column Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnIndex()
   * @generated
   * @ordered
   */
  protected int columnIndex = COLUMN_INDEX_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicEnumColumnImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelDslPackage.Literals.DYNAMIC_ENUM_COLUMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.DYNAMIC_ENUM_COLUMN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumnIndex()
  {
    return columnIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnIndex(int newColumnIndex)
  {
    int oldColumnIndex = columnIndex;
    columnIndex = newColumnIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.DYNAMIC_ENUM_COLUMN__COLUMN_INDEX, oldColumnIndex, columnIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.DYNAMIC_ENUM_COLUMN__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__NAME:
        return getName();
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__COLUMN_INDEX:
        return getColumnIndex();
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__LABEL:
        return getLabel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__NAME:
        setName((String)newValue);
        return;
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__COLUMN_INDEX:
        setColumnIndex((Integer)newValue);
        return;
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__LABEL:
        setLabel((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__COLUMN_INDEX:
        setColumnIndex(COLUMN_INDEX_EDEFAULT);
        return;
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__LABEL:
        setLabel(LABEL_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__COLUMN_INDEX:
        return columnIndex != COLUMN_INDEX_EDEFAULT;
      case ModelDslPackage.DYNAMIC_ENUM_COLUMN__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", columnIndex: ");
    result.append(columnIndex);
    result.append(", label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //DynamicEnumColumnImpl
