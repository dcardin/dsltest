/**
 * generated by Xtext 2.9.1
 */
package com.netappsid.configurator.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.netappsid.configurator.modelDsl.DynamicEnum#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.netappsid.configurator.modelDsl.DynamicEnum#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.netappsid.configurator.modelDsl.DynamicEnum#getImageColumn <em>Image Column</em>}</li>
 * </ul>
 *
 * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getDynamicEnum()
 * @model
 * @generated
 */
public interface DynamicEnum extends PackageMember
{
  /**
   * Returns the value of the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Name</em>' attribute.
   * @see #setTableName(String)
   * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getDynamicEnum_TableName()
   * @model
   * @generated
   */
  String getTableName();

  /**
   * Sets the value of the '{@link com.netappsid.configurator.modelDsl.DynamicEnum#getTableName <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Name</em>' attribute.
   * @see #getTableName()
   * @generated
   */
  void setTableName(String value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link com.netappsid.configurator.modelDsl.DynamicEnumColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getDynamicEnum_Columns()
   * @model containment="true"
   * @generated
   */
  EList<DynamicEnumColumn> getColumns();

  /**
   * Returns the value of the '<em><b>Image Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Column</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Column</em>' reference.
   * @see #setImageColumn(DynamicEnumColumn)
   * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getDynamicEnum_ImageColumn()
   * @model
   * @generated
   */
  DynamicEnumColumn getImageColumn();

  /**
   * Sets the value of the '{@link com.netappsid.configurator.modelDsl.DynamicEnum#getImageColumn <em>Image Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image Column</em>' reference.
   * @see #getImageColumn()
   * @generated
   */
  void setImageColumn(DynamicEnumColumn value);

} // DynamicEnum