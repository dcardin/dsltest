package com.netappsid.configurator

import org.eclipse.xtext.xbase.scoping.batch.FeatureScopes

/* Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ModelDslRuntimeModule extends AbstractModelDslRuntimeModule {
	def Class<? extends FeatureScopes> bindFeatureScopes() {
		return MyFeatureScopes
	}
}
