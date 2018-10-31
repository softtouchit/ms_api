package org.xmlpipe.ms.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * Use this annotation to annotate a module. The name will become the XML tag in
 * the mml file and all the attributes declared in the tag will become the
 * properties to be passed to the module constructor
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Module {    
    String name();
}
