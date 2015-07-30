package com.mrhaki.asciidoctor.extension

import org.asciidoctor.extension.*
import org.asciidoctor.ast.*

import groovy.transform.CompileStatic

@CompileStatic
class JvmAttributePreprocessor extends Preprocessor {

    JvmAttributePreprocessor(final Map<String, Object> config) {
        super(config)
    }    

    @Override
    PreprocessorReader process(final Document document, final PreprocessorReader reader) { 
        final String jvmVersion = System.getProperty('java.version')
        document.attributes.put 'jvmVersion', jvmVersion
        document.attributes.put 'userName', 'mrhaki'
        document.attributes.put 'content', 'mrhaki'
        reader
    }

}