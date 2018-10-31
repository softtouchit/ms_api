package org.xmlpipe.ms.api;

import java.util.Properties;

/**
 * Skeleton for you to implement a JS module
 *
 */
public abstract class AbstractJSModule implements JSModule {

    /**
     * Implement this constructor to get initialised properties
     * 
     * @param props
     *  A read-only properties, do not cache this properties
     *  
     */
    public AbstractJSModule(Properties props) {
        
    }
    
    /**
     * If you do not need to get initialised properties, implement this constructor 
     */
    public AbstractJSModule() {
        
    }

}
