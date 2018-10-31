package org.xmlpipe.ms.api;


public interface ILogger {
    
    boolean logAll();

    boolean logDebug();

    boolean logInfo();

    boolean logWarn();

    boolean logError();

    boolean logFatal();


    ILogger log(CharSequence msg);

    ILogger log(byte[] msg);
    
    ILogger log(byte[] msg, int offset, int len);

    ILogger log(boolean num);

    ILogger log(char ch);

    ILogger log(short num);

    ILogger log(int num);

    ILogger log(long num);


    ILogger log(Throwable t);

    ILogger logMessage(Throwable t);

    ILogger log(Object obj);

    
    ILogger logHEX(byte[] msg, int offset, int len);

    ILogger flush();

}
