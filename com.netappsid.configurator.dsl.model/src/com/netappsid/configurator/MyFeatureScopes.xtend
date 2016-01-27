package com.netappsid.configurator

import com.google.inject.Inject
import com.netappsid.configurator.modelDsl.Attribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.xbase.scoping.batch.FeatureScopes
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession
import org.eclipse.xtext.xbase.scoping.batch.ITypeImporter

class MyFeatureScopes extends FeatureScopes {

	@Inject
	TypeReferences typeReferences;
	
	override protected IScope createStaticFeaturesScope(EObject featureCall, IScope parent, IFeatureScopeSession session) {
		val Attribute attribute = EcoreUtil2.getContainerOfType(featureCall, Attribute);
		var newSession = session
		
		if (attribute != null) {
			// i am inside an attribute
			newSession = session.addImports(new ITypeImporter.Client() {
				
				override void doAddImports(ITypeImporter importer) {
					val type = typeReferences.findDeclaredType("com.bc360.configurator.property.PropertyAttribute."+ attribute.name, featureCall.eResource());
					
					if (type instanceof JvmDeclaredType) {
						importer.importStatic(type as JvmDeclaredType)
					}
					
					
				}
			});
		}
		return super.createStaticFeaturesScope(featureCall, parent, newSession);
	}

}