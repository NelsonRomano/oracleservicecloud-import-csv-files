
/**
 * RequestErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package com.rn.supera.ws.typed.wsdl;

public class RequestErrorFault extends java.lang.Exception{
    
    private com.rn.supera.ws.typed.faults.RequestErrorFault faultMessage;

    
        public RequestErrorFault() {
            super("RequestErrorFault");
        }

        public RequestErrorFault(java.lang.String s) {
           super(s);
        }

        public RequestErrorFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RequestErrorFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rn.supera.ws.typed.faults.RequestErrorFault msg){
       faultMessage = msg;
    }
    
    public com.rn.supera.ws.typed.faults.RequestErrorFault getFaultMessage(){
       return faultMessage;
    }
}
    