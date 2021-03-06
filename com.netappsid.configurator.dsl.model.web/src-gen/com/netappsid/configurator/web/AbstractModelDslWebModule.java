/*
 * generated by Xtext 2.9.1
 */
package com.netappsid.configurator.web;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import com.netappsid.configurator.ide.contentassist.antlr.ModelDslParser;
import com.netappsid.configurator.ide.contentassist.antlr.internal.InternalModelDslLexer;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
import org.eclipse.xtext.xbase.web.DefaultXbaseWebModule;

/**
 * Manual modifications go to {@link ModelDslWebModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractModelDslWebModule extends DefaultXbaseWebModule {

	public AbstractModelDslWebModule(Provider<ExecutorService> executorServiceProvider) {
		super(executorServiceProvider);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.web.WebIntegrationFragment
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(Lexer.class).annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST)).to(InternalModelDslLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.web.WebIntegrationFragment
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return ModelDslParser.class;
	}
	
}
