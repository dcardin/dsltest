/**
 * generated by Xtext 2.9.1
 */
package com.netappsid.configurator.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.netappsid.configurator.modelDsl.PackageDeclaration#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getPackageDeclaration()
 * @model
 * @generated
 */
public interface PackageDeclaration extends PackageMember
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.netappsid.configurator.modelDsl.PackageMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.netappsid.configurator.modelDsl.ModelDslPackage#getPackageDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<PackageMember> getElements();

} // PackageDeclaration