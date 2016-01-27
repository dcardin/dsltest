/**
 * generated by Xtext 2.9.1
 */
package com.netappsid.configurator.modelDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Enum Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.netappsid.configurator.modelDsl.DynamicEnumColumn#getName <em>Name</em>}</li>
 *   <li>{@link com.netappsid.configurator.modelDsl.DynamicEnumColumn#getColumnIndex <em>Column Index</em>}</li>
 *   <li>{@link com.netappsid.configurator.modelDsl.DynamicEnumColumn#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getDynamicEnumColumn()
 * @model
 * @generated
 */
public interface DynamicEnumColumn extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getDynamicEnumColumn_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.netappsid.configurator.modelDsl.DynamicEnumColumn#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Column Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Index</em>' attribute.
   * @see #setColumnIndex(int)
   * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getDynamicEnumColumn_ColumnIndex()
   * @model
   * @generated
   */
  int getColumnIndex();

  /**
   * Sets the value of the '{@link com.netappsid.configurator.modelDsl.DynamicEnumColumn#getColumnIndex <em>Column Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Index</em>' attribute.
   * @see #getColumnIndex()
   * @generated
   */
  void setColumnIndex(int value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getDynamicEnumColumn_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link com.netappsid.configurator.modelDsl.DynamicEnumColumn#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

} // DynamicEnumColumn