package com.mrhaki.asciidoctor.extension

import org.asciidoctor.extension.spi.ExtensionRegistry
import org.asciidoctor.extension.JavaExtensionRegistry
import org.asciidoctor.Asciidoctor

import groovy.transform.CompileStatic

import org.kordamp.jipsy.ServiceProviderFor

@CompileStatic
@ServiceProviderFor(ExtensionRegistry)
class TwitterMacroExtension implements ExtensionRegistry {

    @Override
    void register(final Asciidoctor asciidoctor) {
        final JavaExtensionRegistry javaExtensionRegistry = asciidoctor.javaExtensionRegistry()
        javaExtensionRegistry.inlineMacro 'twitter', TwitterMacro        
    }

}
