package org.xmlpipe.ms.api;

/**
 * All programming model is single threaded so there is no need to worry about lock etc
 * 
 * @author haohe
 *
 */
public interface ProtocolHandler {
    
    /**
     * Use the given logger for fast logging
     * 
     * @param logger
     */
    void setLogger(ILogger logger);

    /**
     * This will be called by the MS to set the helper, which can be used to write back to a given port
     * @param helper
     */
    void setHelper(TCPConnectionHelper helper);
    
    /**
     * 
     * When a message arrives from a client, the message is passed here in full.  Please note that the message maybe partial so it is important to check if the message
     * is complete.
     * 
     * @param port
     * The port represents a remote connection and with the TCPConnectionHelper, one can then send messages back
     * @param msg
     *   the message from a client
     * @param start
     *  the starting offset of the message
     * @param length
     *  the total bytes of message that the handler should read
     * @param writer
     *  Once the message is parsed, one may choose to write the converted message using the writer
     *  
     * @return
     *  the number of bytes processed.  If the message is partial, return 0
     *  
     */
    int onInbound(int port, byte[] msg, int start, int length, TopicWriter writer) ;
    
    /**
     * A message is available to be sent to a client.  The client must be associated with a port typically through a business data. 
     * 
     * A protocol handler needs to understand this message and find the associated client port, find the client port, construct the output message and then invoke TCPConnectionHelper
     * to send message back to the client
     * 
     * @param reader
     *  the reader to read the underlying message
     */
    void onOutbound(TopicReader reader);
    
    /**
     * When a client is disconnected, this method is called
     * 
     * @param port
     * The port represents a remote connection 
     */
    void onDisconnected(int port);
    
    
    
    
}
