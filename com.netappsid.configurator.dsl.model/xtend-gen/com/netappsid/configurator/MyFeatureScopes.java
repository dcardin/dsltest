package com.netappsid.configurator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.netappsid.configurator.modelDsl.Attribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.batch.FeatureScopes;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.scoping.batch.ITypeImporter;

@SuppressWarnings("all")
public class MyFeatureScopes extends FeatureScopes {
  @Inject
  private TypeReferences typeReferences;
  
  @Override
  protected IScope createStaticFeaturesScope(final EObject featureCall, final IScope parent, final IFeatureScopeSession session) {
    final Attribute attribute = EcoreUtil2.<Attribute>getContainerOfType(featureCall, Attribute.class);
    IFeatureScopeSession newSession = session;
    boolean _notEquals = (!Objects.equal(attribute, null));
    if (_notEquals) {
      IFeatureScopeSession _addImports = session.addImports(new ITypeImporter.Client() {
        @Override
        public void doAddImports(final ITypeImporter importer) {
          String _name = attribute.getName();
          String _plus = ("com.bc360.configurator.property.PropertyAttribute." + _name);
          Resource _eResource = featureCall.eResource();
          final JvmType type = MyFeatureScopes.this.typeReferences.findDeclaredType(_plus, _eResource);
          if ((type instanceof JvmDeclaredType)) {
            importer.importStatic(((JvmDeclaredType) type));
          }
        }
      });
      newSession = _addImports;
    }
    return super.createStaticFeaturesScope(featureCall, parent, newSession);
  }
}
