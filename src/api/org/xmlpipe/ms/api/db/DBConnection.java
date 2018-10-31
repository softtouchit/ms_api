package org.xmlpipe.ms.api.db;

import java.io.IOException;

/**
 * TODO change to use a binary protocol
 * 
 * @author haohe
 *
 */
public interface DBConnection {
    
    int search(String db, String query, int start, int limit, boolean reverse, byte[] out) throws IOException;
    
    int update(String db, byte[] req, int reqOffset, int reqLength, byte[] out) throws IOException;
    
    void close();

    void check() throws IOException;
    
}
