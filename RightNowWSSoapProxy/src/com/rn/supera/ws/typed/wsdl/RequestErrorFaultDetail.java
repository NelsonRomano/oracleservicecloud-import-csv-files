
/**
 * RequestErrorFaultDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package com.rn.supera.ws.typed.wsdl;

public class RequestErrorFaultDetail extends java.lang.Exception{
    
    private com.rn.supera.ws.typed.faults.RequestErrorFaultDetail faultMessage;

    
        public RequestErrorFaultDetail() {
            super("RequestErrorFaultDetail");
        }

        public RequestErrorFaultDetail(java.lang.String s) {
           super(s);
        }

        public RequestErrorFaultDetail(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RequestErrorFaultDetail(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rn.supera.ws.typed.faults.RequestErrorFaultDetail msg){
       faultMessage = msg;
    }
    
    public com.rn.supera.ws.typed.faults.RequestErrorFaultDetail getFaultMessage(){
       return faultMessage;
    }
}
    