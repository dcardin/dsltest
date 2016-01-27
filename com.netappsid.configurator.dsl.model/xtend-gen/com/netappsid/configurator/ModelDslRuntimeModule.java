package com.netappsid.configurator;

import com.netappsid.configurator.AbstractModelDslRuntimeModule;
import com.netappsid.configurator.MyFeatureScopes;
import org.eclipse.xtext.xbase.scoping.batch.FeatureScopes;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class ModelDslRuntimeModule extends AbstractModelDslRuntimeModule {
  public Class<? extends FeatureScopes> bindFeatureScopes() {
    return MyFeatureScopes.class;
  }
}
