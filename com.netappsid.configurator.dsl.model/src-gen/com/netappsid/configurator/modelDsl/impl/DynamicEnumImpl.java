/**
 * generated by Xtext 2.9.1
 */
package com.netappsid.configurator.modelDsl.impl;

import com.netappsid.configurator.modelDsl.DynamicEnum;
import com.netappsid.configurator.modelDsl.DynamicEnumColumn;
import com.netappsid.configurator.modelDsl.ModelDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.netappsid.configurator.modelDsl.impl.DynamicEnumImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.netappsid.configurator.modelDsl.impl.DynamicEnumImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.netappsid.configurator.modelDsl.impl.DynamicEnumImpl#getImageColumn <em>Image Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicEnumImpl extends PackageMemberImpl implements DynamicEnum
{
  /**
   * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableName()
   * @generated
   * @ordered
   */
  protected static final String TABLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableName()
   * @generated
   * @ordered
   */
  protected String tableName = TABLE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<DynamicEnumColumn> columns;

  /**
   * The cached value of the '{@link #getImageColumn() <em>Image Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageColumn()
   * @generated
   * @ordered
   */
  protected DynamicEnumColumn imageColumn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicEnumImpl()
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
    return ModelDslPackage.Literals.DYNAMIC_ENUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTableName()
  {
    return tableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableName(String newTableName)
  {
    String oldTableName = tableName;
    tableName = newTableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.DYNAMIC_ENUM__TABLE_NAME, oldTableName, tableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DynamicEnumColumn> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<DynamicEnumColumn>(DynamicEnumColumn.class, this, ModelDslPackage.DYNAMIC_ENUM__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicEnumColumn getImageColumn()
  {
    if (imageColumn != null && imageColumn.eIsProxy())
    {
      InternalEObject oldImageColumn = (InternalEObject)imageColumn;
      imageColumn = (DynamicEnumColumn)eResolveProxy(oldImageColumn);
      if (imageColumn != oldImageColumn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelDslPackage.DYNAMIC_ENUM__IMAGE_COLUMN, oldImageColumn, imageColumn));
      }
    }
    return imageColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicEnumColumn basicGetImageColumn()
  {
    return imageColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImageColumn(DynamicEnumColumn newImageColumn)
  {
    DynamicEnumColumn oldImageColumn = imageColumn;
    imageColumn = newImageColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.DYNAMIC_ENUM__IMAGE_COLUMN, oldImageColumn, imageColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelDslPackage.DYNAMIC_ENUM__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ModelDslPackage.DYNAMIC_ENUM__TABLE_NAME:
        return getTableName();
      case ModelDslPackage.DYNAMIC_ENUM__COLUMNS:
        return getColumns();
      case ModelDslPackage.DYNAMIC_ENUM__IMAGE_COLUMN:
        if (resolve) return getImageColumn();
        return basicGetImageColumn();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelDslPackage.DYNAMIC_ENUM__TABLE_NAME:
        setTableName((String)newValue);
        return;
      case ModelDslPackage.DYNAMIC_ENUM__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends DynamicEnumColumn>)newValue);
        return;
      case ModelDslPackage.DYNAMIC_ENUM__IMAGE_COLUMN:
        setImageColumn((DynamicEnumColumn)newValue);
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
      case ModelDslPackage.DYNAMIC_ENUM__TABLE_NAME:
        setTableName(TABLE_NAME_EDEFAULT);
        return;
      case ModelDslPackage.DYNAMIC_ENUM__COLUMNS:
        getColumns().clear();
        return;
      case ModelDslPackage.DYNAMIC_ENUM__IMAGE_COLUMN:
        setImageColumn((DynamicEnumColumn)null);
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
      case ModelDslPackage.DYNAMIC_ENUM__TABLE_NAME:
        return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
      case ModelDslPackage.DYNAMIC_ENUM__COLUMNS:
        return columns != null && !columns.isEmpty();
      case ModelDslPackage.DYNAMIC_ENUM__IMAGE_COLUMN:
        return imageColumn != null;
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
    result.append(" (tableName: ");
    result.append(tableName);
    result.append(')');
    return result.toString();
  }

} //DynamicEnumImpl
