package org.xmlpipe.ms.api;

public interface JSModule {
    /**
     * @return An object for JS to use. The object should contain methods that can
     *         be called within JavaScript. The easiest approach is to use only
     *         primitives in method arguments.
     */
    Object getJSObject();
}
