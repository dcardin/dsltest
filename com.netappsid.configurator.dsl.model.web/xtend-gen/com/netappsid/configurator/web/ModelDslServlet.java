/**
 * generated by Xtext 2.9.1
 */
package com.netappsid.configurator.web;

import com.google.inject.Provider;
import com.netappsid.configurator.web.ModelDslWebSetup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import javax.servlet.annotation.WebServlet;
import org.eclipse.xtext.web.servlet.XtextServlet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = "XtextServices", urlPatterns = "/xtext-service/*")
@SuppressWarnings("all")
public class ModelDslServlet extends XtextServlet {
  private final List<ExecutorService> executorServices = CollectionLiterals.<ExecutorService>newArrayList();
  
  @Override
  public void init() {
    try {
      super.init();
      final Provider<ExecutorService> _function = () -> {
        ExecutorService _newCachedThreadPool = Executors.newCachedThreadPool();
        final Procedure1<ExecutorService> _function_1 = (ExecutorService it) -> {
          this.executorServices.add(it);
        };
        return ObjectExtensions.<ExecutorService>operator_doubleArrow(_newCachedThreadPool, _function_1);
      };
      final Provider<ExecutorService> executorServiceProvider = _function;
      ModelDslWebSetup _modelDslWebSetup = new ModelDslWebSetup(executorServiceProvider);
      _modelDslWebSetup.createInjectorAndDoEMFRegistration();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void destroy() {
    final Consumer<ExecutorService> _function = (ExecutorService it) -> {
      it.shutdown();
    };
    this.executorServices.forEach(_function);
    this.executorServices.clear();
    super.destroy();
  }
}
