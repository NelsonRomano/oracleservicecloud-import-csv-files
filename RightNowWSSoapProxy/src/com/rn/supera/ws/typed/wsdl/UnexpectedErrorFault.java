
/**
 * UnexpectedErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package com.rn.supera.ws.typed.wsdl;

public class UnexpectedErrorFault extends java.lang.Exception{
    
    private com.rn.supera.ws.typed.faults.UnexpectedErrorFault faultMessage;

    
        public UnexpectedErrorFault() {
            super("UnexpectedErrorFault");
        }

        public UnexpectedErrorFault(java.lang.String s) {
           super(s);
        }

        public UnexpectedErrorFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnexpectedErrorFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rn.supera.ws.typed.faults.UnexpectedErrorFault msg){
       faultMessage = msg;
    }
    
    public com.rn.supera.ws.typed.faults.UnexpectedErrorFault getFaultMessage(){
       return faultMessage;
    }
}
    