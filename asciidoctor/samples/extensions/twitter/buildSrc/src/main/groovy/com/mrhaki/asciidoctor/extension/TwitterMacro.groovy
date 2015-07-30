package com.mrhaki.asciidoctor.extension

import org.asciidoctor.extension.*
import org.asciidoctor.ast.*

import groovy.transform.CompileStatic

@CompileStatic
class TwitterMacro extends InlineMacroProcessor {

    TwitterMacro(final String name, final Map<String, Object> config) {
        super(name, config)
    }

    @Override
    protected Object process(final AbstractBlock parent, 
        final String target, final Map<String, Object> attributes) {

        final Map options = [
            type: ':link',
            target: "http://www.twitter.com/${target}".toString()
        ] as Map<String, Object>

        final Inline inlineTwitterLink = createInline(parent, 'anchor', "@${target}", attributes, options)
        inlineTwitterLink.convert()
    }

}