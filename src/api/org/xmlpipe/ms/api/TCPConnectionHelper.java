package org.xmlpipe.ms.api;

public interface TCPConnectionHelper {
    
    /**
     * Write message back to the remote host represented by the port number.  It will keep writing until all data is fully written.
     * 
     * @param port
     *  the port number that represents to the connection to the remote host.  The port number must represent a valid connection. Non-existing port will cause runtime exception
     * @param data
     * the data to be written
     * @param offset
     * the offset of the data array
     * @param len
     * number of bytes to be written
     */
    void write(int port, byte[] data, int offset, int len);

    
    /**
     * Close the connection represented by the port number.
     * 
     * @param port
     *  the port number that represents to the connection to the remote host.  The port number must represent a valid connection. Non-existing port will cause runtime exception
     */
    void close(int port);


}
