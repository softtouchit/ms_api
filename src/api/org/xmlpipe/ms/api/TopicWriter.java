package org.xmlpipe.ms.api;

public interface TopicWriter {
    
    /**
     * Set the value of the given key
     * 
     * @param key
     * @param value
     * @return
     *  this writer
     */
    TopicWriter set(String key, String value);
    /**
     * Set the value of the given key
     * 
     * @param key
     * @param value
     * @return
     *  this writer
     */
    TopicWriter set(String key, byte[] value, int offset, int len);
    /**
     * Set the value of the given key
     * 
     * @param key
     * @param value
     * @return
     *  this writer
     */
    TopicWriter set(String key, int value);
    /**
     * Set the value of the given key
     * 
     * @param key
     * @param value
     * @return
     *  this writer
     */
    TopicWriter set(String key, short value);
    /**
     * Set the value of the given key
     * 
     * @param key
     * @param value
     * @return
     *  this writer
     */
    TopicWriter set(String key, long value);
    /**
     * Set the value of the given key
     * 
     * @param key
     * @param value
     * @return
     *  this writer
     */
    TopicWriter set(String key, byte value);
    
    /**
     * Call this method last when you are done with setting values
     * 
     * Should only call it last
     */
    void write();
    
    /**
     * Call this method first
     */
    void start();

}
