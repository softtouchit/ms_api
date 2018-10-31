package org.xmlpipe.ms.api;

public interface TopicReader {
    
    /**
     * 
     * @param key
     * @return
     *   the string representation of the value
     *   
     */
    String get(String key);
    
    /**
     * 
     * get the value of the given key and copy the value to the given byte array
     * 
     * @param key
     *   the key
     * @param value
     *  the byte array to be copied into 
     * @param offset
     *  copy from the given offset
     * @return
     *  number of bytes copied
     */
    int get(String key, byte[] value, int offset);
    
    /**
     * The data must be of type i
     * 
     * @param key
     * @return
     *  the int value, if not set, then def is returned
     */
    int getInt(String key, int def);
    
    /**
     * The data must be of type b
     * 
     * @param key
     * @return
     *  the int value, if not set, then def is returned
     */
    byte getByte(String key, byte def);
    
    
    /**
     * The data must be of type h
     * 
     * @param key
     * @return
     *  the short value, if not set, then def is returned
     */
    short getShort(String key, short def);
        
    
    /**
     * the data type must be l
     * 
     * @param key
     * @return
     *  the long value.  If not set, then def is returned
     */
    long getLong(String key, long def);

    
}
