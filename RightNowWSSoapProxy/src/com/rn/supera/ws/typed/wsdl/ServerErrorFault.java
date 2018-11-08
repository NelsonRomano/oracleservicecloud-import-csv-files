
/**
 * ServerErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package com.rn.supera.ws.typed.wsdl;

public class ServerErrorFault extends java.lang.Exception{
    
    private com.rn.supera.ws.typed.faults.ServerErrorFault faultMessage;

    
        public ServerErrorFault() {
            super("ServerErrorFault");
        }

        public ServerErrorFault(java.lang.String s) {
           super(s);
        }

        public ServerErrorFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ServerErrorFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rn.supera.ws.typed.faults.ServerErrorFault msg){
       faultMessage = msg;
    }
    
    public com.rn.supera.ws.typed.faults.ServerErrorFault getFaultMessage(){
       return faultMessage;
    }
}
    