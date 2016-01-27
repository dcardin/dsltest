/*
 * generated by Xtext 2.9.1
 */
package com.netappsid.configurator.web

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Provider
import com.google.inject.util.Modules
import com.netappsid.configurator.ModelDslRuntimeModule
import com.netappsid.configurator.ModelDslStandaloneSetup
import java.util.concurrent.ExecutorService
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
class ModelDslWebSetup extends ModelDslStandaloneSetup {
	
	val Provider<ExecutorService> executorServiceProvider;
	
	override Injector createInjector() {
		val runtimeModule = new ModelDslRuntimeModule()
		val webModule = new ModelDslWebModule(executorServiceProvider)
		return Guice.createInjector(Modules.override(runtimeModule).with(webModule))
	}
	
}