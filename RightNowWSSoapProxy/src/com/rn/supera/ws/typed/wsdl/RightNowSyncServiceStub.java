
/**
 * RightNowSyncServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package com.rn.supera.ws.typed.wsdl;

        

        /*
        *  RightNowSyncServiceStub java implementation
        */

        
        public class RightNowSyncServiceStub extends org.apache.axis2.client.Stub
        implements RightNowSyncService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("RightNowSyncService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[23];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getValuesForNamedID"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "executeMarketingFlow"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "sendMailingToContact"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "batch"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataForOperation"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "create"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "destroy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "transferSubObjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "get"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getValuesForNamedIDHierarchy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getFileData"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "resetContactPassword"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "queryObjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "convertGenericToObject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaData"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "runAnalyticsReport"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getSubscribableObjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "update"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "queryCSV"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataLastChangeTime"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getPrimaryClassNames"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "convertObjectToGeneric"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataForClass"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.faults.RequestErrorFaultDetail");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.faults.RequestErrorFaultDetail");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.faults.RequestErrorFaultDetail");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFaultDetail"),"com.rn.supera.faults.RequestErrorFaultDetail");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.ws.typed.wsdl.RequestErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","RequestErrorFault"),"com.rn.supera.faults.RequestErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","UnexpectedErrorFault"),"com.rn.supera.faults.UnexpectedErrorFault");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.ws.typed.wsdl.ServerErrorFault");
              faultMessageMap.put( new javax.xml.namespace.QName("urn:faults.ws.rightnow.com/v1_3","ServerErrorFault"),"com.rn.supera.faults.ServerErrorFault");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public RightNowSyncServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public RightNowSyncServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public RightNowSyncServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://superarx.custhelp.com/cgi-bin/superarx.cfg/services/soap" );
                
    }

    /**
     * Default Constructor
     */
    public RightNowSyncServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://superarx.custhelp.com/cgi-bin/superarx.cfg/services/soap" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public RightNowSyncServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getValuesForNamedID
                     * @param getValuesForNamedID186
                    
                     * @param clientInfoHeader189
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.base.NamedID[] getValuesForNamedID(

                            java.lang.String packageName187,java.lang.String fieldName188,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader189)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("GetValuesForNamedID");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetValuesForNamedID dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    packageName187,
                                                    fieldName188,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getValuesForNamedID")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader189!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader189 = toOM(clientInfoHeader189, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getValuesForNamedID")));
                                                    addHeader(omElementclientInfoHeader189,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetValuesForNamedIDResponseEntry((com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetValuesForNamedID
                    * @param getValuesForNamedID186
                
                    * @param clientInfoHeader189
                
                */
                public  void startgetValuesForNamedID(

                 java.lang.String packageName187,java.lang.String fieldName188,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader189,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("GetValuesForNamedID");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetValuesForNamedID dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    packageName187,
                                                    fieldName188,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getValuesForNamedID")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader189!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader189 = toOM(clientInfoHeader189, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getValuesForNamedID")));
                                                    addHeader(omElementclientInfoHeader189,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetValuesForNamedID(
                                            getGetValuesForNamedIDResponseEntry((com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetValuesForNamedID(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetValuesForNamedID((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetValuesForNamedID((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetValuesForNamedID((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetValuesForNamedID(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedID(f);
                                            }
									    } else {
										    callback.receiveErrorgetValuesForNamedID(f);
									    }
									} else {
									    callback.receiveErrorgetValuesForNamedID(f);
									}
								} else {
								    callback.receiveErrorgetValuesForNamedID(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetValuesForNamedID(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#executeMarketingFlow
                     * @param executeMarketingFlow192
                    
                     * @param clientInfoHeader196
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponseMsg executeMarketingFlow(

                            com.rn.supera.ws.typed.base.ID contactID193,com.rn.supera.ws.typed.base.ID campaignID194,java.lang.String entryPoint195,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader196)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("ExecuteMarketingFlow");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.ExecuteMarketingFlow dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID193,
                                                    campaignID194,
                                                    entryPoint195,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "executeMarketingFlow")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader196!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader196 = toOM(clientInfoHeader196, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "executeMarketingFlow")));
                                                    addHeader(omElementclientInfoHeader196,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getExecuteMarketingFlow((com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startexecuteMarketingFlow
                    * @param executeMarketingFlow192
                
                    * @param clientInfoHeader196
                
                */
                public  void startexecuteMarketingFlow(

                 com.rn.supera.ws.typed.base.ID contactID193,com.rn.supera.ws.typed.base.ID campaignID194,java.lang.String entryPoint195,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader196,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("ExecuteMarketingFlow");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.ExecuteMarketingFlow dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID193,
                                                    campaignID194,
                                                    entryPoint195,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "executeMarketingFlow")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader196!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader196 = toOM(clientInfoHeader196, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "executeMarketingFlow")));
                                                    addHeader(omElementclientInfoHeader196,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultexecuteMarketingFlow(
                                            (com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorexecuteMarketingFlow(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorexecuteMarketingFlow((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorexecuteMarketingFlow((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorexecuteMarketingFlow((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorexecuteMarketingFlow(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorexecuteMarketingFlow(f);
                                            }
									    } else {
										    callback.receiveErrorexecuteMarketingFlow(f);
									    }
									} else {
									    callback.receiveErrorexecuteMarketingFlow(f);
									}
								} else {
								    callback.receiveErrorexecuteMarketingFlow(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorexecuteMarketingFlow(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#sendMailingToContact
                     * @param sendMailingToContact198
                    
                     * @param clientInfoHeader205
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.SendMailingToContactResponseMsg sendMailingToContact(

                            com.rn.supera.ws.typed.base.ID contactID199,com.rn.supera.ws.typed.base.ID mailingID200,java.util.Calendar scheduledTime201,com.rn.supera.ws.typed.base.ID incidentID202,com.rn.supera.ws.typed.base.ID opportunityID203,com.rn.supera.ws.typed.base.ID chatID204,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader205)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("SendMailingToContact");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.SendMailingToContact dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID199,
                                                    mailingID200,
                                                    scheduledTime201,
                                                    incidentID202,
                                                    opportunityID203,
                                                    chatID204,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "sendMailingToContact")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader205!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader205 = toOM(clientInfoHeader205, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "sendMailingToContact")));
                                                    addHeader(omElementclientInfoHeader205,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.SendMailingToContactResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getSendMailingToContact((com.rn.supera.ws.typed.messages.SendMailingToContactResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startsendMailingToContact
                    * @param sendMailingToContact198
                
                    * @param clientInfoHeader205
                
                */
                public  void startsendMailingToContact(

                 com.rn.supera.ws.typed.base.ID contactID199,com.rn.supera.ws.typed.base.ID mailingID200,java.util.Calendar scheduledTime201,com.rn.supera.ws.typed.base.ID incidentID202,com.rn.supera.ws.typed.base.ID opportunityID203,com.rn.supera.ws.typed.base.ID chatID204,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader205,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("SendMailingToContact");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.SendMailingToContact dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID199,
                                                    mailingID200,
                                                    scheduledTime201,
                                                    incidentID202,
                                                    opportunityID203,
                                                    chatID204,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "sendMailingToContact")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader205!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader205 = toOM(clientInfoHeader205, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "sendMailingToContact")));
                                                    addHeader(omElementclientInfoHeader205,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.SendMailingToContactResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultsendMailingToContact(
                                            (com.rn.supera.ws.typed.messages.SendMailingToContactResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorsendMailingToContact(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorsendMailingToContact((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorsendMailingToContact((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorsendMailingToContact((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorsendMailingToContact(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorsendMailingToContact(f);
                                            }
									    } else {
										    callback.receiveErrorsendMailingToContact(f);
									    }
									} else {
									    callback.receiveErrorsendMailingToContact(f);
									}
								} else {
								    callback.receiveErrorsendMailingToContact(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorsendMailingToContact(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#batch
                     * @param batch207
                    
                     * @param clientInfoHeader209
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.BatchResponseItem[] batch(

                            com.rn.supera.ws.typed.messages.BatchRequestItem[] batchRequestItem208,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader209)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("Batch");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.Batch dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    batchRequestItem208,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "batch")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader209!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader209 = toOM(clientInfoHeader209, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "batch")));
                                                    addHeader(omElementclientInfoHeader209,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.BatchResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getBatchResponseBatchResponseItem((com.rn.supera.ws.typed.messages.BatchResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startbatch
                    * @param batch207
                
                    * @param clientInfoHeader209
                
                */
                public  void startbatch(

                 com.rn.supera.ws.typed.messages.BatchRequestItem[] batchRequestItem208,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader209,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("Batch");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.Batch dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    batchRequestItem208,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "batch")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader209!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader209 = toOM(clientInfoHeader209, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "batch")));
                                                    addHeader(omElementclientInfoHeader209,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.BatchResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultbatch(
                                            getBatchResponseBatchResponseItem((com.rn.supera.ws.typed.messages.BatchResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorbatch(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorbatch((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorbatch((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorbatch((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorbatch(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbatch(f);
                                            }
									    } else {
										    callback.receiveErrorbatch(f);
									    }
									} else {
									    callback.receiveErrorbatch(f);
									}
								} else {
								    callback.receiveErrorbatch(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorbatch(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getMetaDataForOperation
                     * @param getMetaDataForOperation212
                    
                     * @param clientInfoHeader216
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.metadata.MetaDataClassOperation[] getMetaDataForOperation(

                            java.lang.String[] operation213,java.lang.String[] className214,com.rn.supera.ws.typed.generic.RNObjectType[] qualifiedClassName215,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader216)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("GetMetaDataForOperation");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetMetaDataForOperation dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    operation213,
                                                    className214,
                                                    qualifiedClassName215,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getMetaDataForOperation")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader216!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader216 = toOM(clientInfoHeader216, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataForOperation")));
                                                    addHeader(omElementclientInfoHeader216,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMetaDataForOperationResponseMetaDataClassOperation((com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetMetaDataForOperation
                    * @param getMetaDataForOperation212
                
                    * @param clientInfoHeader216
                
                */
                public  void startgetMetaDataForOperation(

                 java.lang.String[] operation213,java.lang.String[] className214,com.rn.supera.ws.typed.generic.RNObjectType[] qualifiedClassName215,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader216,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("GetMetaDataForOperation");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetMetaDataForOperation dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    operation213,
                                                    className214,
                                                    qualifiedClassName215,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getMetaDataForOperation")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader216!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader216 = toOM(clientInfoHeader216, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataForOperation")));
                                                    addHeader(omElementclientInfoHeader216,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMetaDataForOperation(
                                            getGetMetaDataForOperationResponseMetaDataClassOperation((com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMetaDataForOperation(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetMetaDataForOperation((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetMetaDataForOperation((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetMetaDataForOperation((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMetaDataForOperation(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForOperation(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForOperation(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForOperation(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForOperation(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForOperation(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForOperation(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForOperation(f);
                                            }
									    } else {
										    callback.receiveErrorgetMetaDataForOperation(f);
									    }
									} else {
									    callback.receiveErrorgetMetaDataForOperation(f);
									}
								} else {
								    callback.receiveErrorgetMetaDataForOperation(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMetaDataForOperation(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#create
                     * @param create219
                    
                     * @param clientInfoHeader222
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.RNObjectsResult create(

                            com.rn.supera.ws.typed.base.RNObject[] rNObjects220,com.rn.supera.ws.typed.messages.CreateProcessingOptions processingOptions221,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader222)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("Create");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.Create dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects220,
                                                    processingOptions221,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "create")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader222!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader222 = toOM(clientInfoHeader222, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "create")));
                                                    addHeader(omElementclientInfoHeader222,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.CreateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getCreateResponseRNObjectsResult((com.rn.supera.ws.typed.messages.CreateResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startcreate
                    * @param create219
                
                    * @param clientInfoHeader222
                
                */
                public  void startcreate(

                 com.rn.supera.ws.typed.base.RNObject[] rNObjects220,com.rn.supera.ws.typed.messages.CreateProcessingOptions processingOptions221,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader222,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("Create");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.Create dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects220,
                                                    processingOptions221,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "create")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader222!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader222 = toOM(clientInfoHeader222, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "create")));
                                                    addHeader(omElementclientInfoHeader222,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.CreateResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcreate(
                                            getCreateResponseRNObjectsResult((com.rn.supera.ws.typed.messages.CreateResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcreate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorcreate((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorcreate((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorcreate((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail){
														callback.receiveErrorcreate((com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcreate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreate(f);
                                            }
									    } else {
										    callback.receiveErrorcreate(f);
									    }
									} else {
									    callback.receiveErrorcreate(f);
									}
								} else {
								    callback.receiveErrorcreate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcreate(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#destroy
                     * @param destroy225
                    
                     * @param clientInfoHeader228
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.DestroyResponseMsg destroy(

                            com.rn.supera.ws.typed.base.RNObject[] rNObjects226,com.rn.supera.ws.typed.messages.DestroyProcessingOptions processingOptions227,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader228)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("Destroy");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.Destroy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects226,
                                                    processingOptions227,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "destroy")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader228!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader228 = toOM(clientInfoHeader228, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "destroy")));
                                                    addHeader(omElementclientInfoHeader228,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.DestroyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getDestroy((com.rn.supera.ws.typed.messages.DestroyResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startdestroy
                    * @param destroy225
                
                    * @param clientInfoHeader228
                
                */
                public  void startdestroy(

                 com.rn.supera.ws.typed.base.RNObject[] rNObjects226,com.rn.supera.ws.typed.messages.DestroyProcessingOptions processingOptions227,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader228,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("Destroy");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.Destroy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects226,
                                                    processingOptions227,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "destroy")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader228!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader228 = toOM(clientInfoHeader228, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "destroy")));
                                                    addHeader(omElementclientInfoHeader228,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.DestroyResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultdestroy(
                                            (com.rn.supera.ws.typed.messages.DestroyResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrordestroy(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrordestroy((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrordestroy((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrordestroy((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail){
														callback.receiveErrordestroy((com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail)ex);
											            return;
										            }
										            
					
										            callback.receiveErrordestroy(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordestroy(f);
                                            }
									    } else {
										    callback.receiveErrordestroy(f);
									    }
									} else {
									    callback.receiveErrordestroy(f);
									}
								} else {
								    callback.receiveErrordestroy(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrordestroy(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#transferSubObjects
                     * @param transferSubObjects230
                    
                     * @param clientInfoHeader233
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.TransferSubObjectsResponseMsg transferSubObjects(

                            com.rn.supera.ws.typed.base.RNObject destinationRNObject231,com.rn.supera.ws.typed.base.RNObject[] sourceRNObjects232,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader233)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("TransferSubObjects");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.TransferSubObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    destinationRNObject231,
                                                    sourceRNObjects232,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "transferSubObjects")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader233!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader233 = toOM(clientInfoHeader233, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "transferSubObjects")));
                                                    addHeader(omElementclientInfoHeader233,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.TransferSubObjectsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getTransferSubObjects((com.rn.supera.ws.typed.messages.TransferSubObjectsResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#starttransferSubObjects
                    * @param transferSubObjects230
                
                    * @param clientInfoHeader233
                
                */
                public  void starttransferSubObjects(

                 com.rn.supera.ws.typed.base.RNObject destinationRNObject231,com.rn.supera.ws.typed.base.RNObject[] sourceRNObjects232,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader233,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("TransferSubObjects");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.TransferSubObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    destinationRNObject231,
                                                    sourceRNObjects232,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "transferSubObjects")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader233!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader233 = toOM(clientInfoHeader233, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "transferSubObjects")));
                                                    addHeader(omElementclientInfoHeader233,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.TransferSubObjectsResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResulttransferSubObjects(
                                            (com.rn.supera.ws.typed.messages.TransferSubObjectsResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrortransferSubObjects(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrortransferSubObjects((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrortransferSubObjects((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrortransferSubObjects((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrortransferSubObjects(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortransferSubObjects(f);
                                            }
									    } else {
										    callback.receiveErrortransferSubObjects(f);
									    }
									} else {
									    callback.receiveErrortransferSubObjects(f);
									}
								} else {
								    callback.receiveErrortransferSubObjects(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrortransferSubObjects(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#get
                     * @param get235
                    
                     * @param clientInfoHeader238
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.RNObjectsResult get(

                            com.rn.supera.ws.typed.base.RNObject[] rNObjects236,com.rn.supera.ws.typed.messages.GetProcessingOptions processingOptions237,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader238)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("Get");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.Get dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects236,
                                                    processingOptions237,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "get")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader238!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader238 = toOM(clientInfoHeader238, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "get")));
                                                    addHeader(omElementclientInfoHeader238,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetResponseRNObjectsResult((com.rn.supera.ws.typed.messages.GetResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startget
                    * @param get235
                
                    * @param clientInfoHeader238
                
                */
                public  void startget(

                 com.rn.supera.ws.typed.base.RNObject[] rNObjects236,com.rn.supera.ws.typed.messages.GetProcessingOptions processingOptions237,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader238,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("Get");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.Get dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects236,
                                                    processingOptions237,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "get")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader238!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader238 = toOM(clientInfoHeader238, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "get")));
                                                    addHeader(omElementclientInfoHeader238,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultget(
                                            getGetResponseRNObjectsResult((com.rn.supera.ws.typed.messages.GetResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorget(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorget((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorget((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorget((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail){
														callback.receiveErrorget((com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorget(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorget(f);
                                            }
									    } else {
										    callback.receiveErrorget(f);
									    }
									} else {
									    callback.receiveErrorget(f);
									}
								} else {
								    callback.receiveErrorget(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorget(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getValuesForNamedIDHierarchy
                     * @param getValuesForNamedIDHierarchy241
                    
                     * @param clientInfoHeader243
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.base.NamedIDWithParent[] getValuesForNamedIDHierarchy(

                            java.lang.String fieldName242,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader243)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("GetValuesForNamedIDHierarchy");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fieldName242,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getValuesForNamedIDHierarchy")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader243!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader243 = toOM(clientInfoHeader243, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getValuesForNamedIDHierarchy")));
                                                    addHeader(omElementclientInfoHeader243,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetValuesForNamedIDHierarchyResponseEntry((com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetValuesForNamedIDHierarchy
                    * @param getValuesForNamedIDHierarchy241
                
                    * @param clientInfoHeader243
                
                */
                public  void startgetValuesForNamedIDHierarchy(

                 java.lang.String fieldName242,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader243,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("GetValuesForNamedIDHierarchy");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    fieldName242,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getValuesForNamedIDHierarchy")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader243!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader243 = toOM(clientInfoHeader243, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getValuesForNamedIDHierarchy")));
                                                    addHeader(omElementclientInfoHeader243,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetValuesForNamedIDHierarchy(
                                            getGetValuesForNamedIDHierarchyResponseEntry((com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetValuesForNamedIDHierarchy(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetValuesForNamedIDHierarchy((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetValuesForNamedIDHierarchy((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetValuesForNamedIDHierarchy((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetValuesForNamedIDHierarchy(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetValuesForNamedIDHierarchy(f);
                                            }
									    } else {
										    callback.receiveErrorgetValuesForNamedIDHierarchy(f);
									    }
									} else {
									    callback.receiveErrorgetValuesForNamedIDHierarchy(f);
									}
								} else {
								    callback.receiveErrorgetValuesForNamedIDHierarchy(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetValuesForNamedIDHierarchy(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getFileData
                     * @param getFileData246
                    
                     * @param clientInfoHeader250
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  javax.activation.DataHandler getFileData(

                            com.rn.supera.ws.typed.base.RNObject rNObject247,com.rn.supera.ws.typed.base.ID fileID248,boolean disableMTOM249,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader250)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("GetFileData");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetFileData dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObject247,
                                                    fileID248,
                                                    disableMTOM249,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getFileData")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader250!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader250 = toOM(clientInfoHeader250, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getFileData")));
                                                    addHeader(omElementclientInfoHeader250,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetFileDataResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetFileDataResponseFileData((com.rn.supera.ws.typed.messages.GetFileDataResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetFileData
                    * @param getFileData246
                
                    * @param clientInfoHeader250
                
                */
                public  void startgetFileData(

                 com.rn.supera.ws.typed.base.RNObject rNObject247,com.rn.supera.ws.typed.base.ID fileID248,boolean disableMTOM249,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader250,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("GetFileData");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetFileData dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObject247,
                                                    fileID248,
                                                    disableMTOM249,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getFileData")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader250!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader250 = toOM(clientInfoHeader250, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getFileData")));
                                                    addHeader(omElementclientInfoHeader250,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetFileDataResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetFileData(
                                            getGetFileDataResponseFileData((com.rn.supera.ws.typed.messages.GetFileDataResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetFileData(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetFileData((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetFileData((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetFileData((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetFileData(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetFileData(f);
                                            }
									    } else {
										    callback.receiveErrorgetFileData(f);
									    }
									} else {
									    callback.receiveErrorgetFileData(f);
									}
								} else {
								    callback.receiveErrorgetFileData(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetFileData(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#resetContactPassword
                     * @param resetContactPassword253
                    
                     * @param clientInfoHeader255
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.ResetContactPasswordResponseMsg resetContactPassword(

                            com.rn.supera.ws.typed.base.ID contactID254,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader255)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("ResetContactPassword");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.ResetContactPassword dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID254,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "resetContactPassword")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader255!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader255 = toOM(clientInfoHeader255, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "resetContactPassword")));
                                                    addHeader(omElementclientInfoHeader255,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.ResetContactPasswordResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getResetContactPassword((com.rn.supera.ws.typed.messages.ResetContactPasswordResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startresetContactPassword
                    * @param resetContactPassword253
                
                    * @param clientInfoHeader255
                
                */
                public  void startresetContactPassword(

                 com.rn.supera.ws.typed.base.ID contactID254,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader255,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("ResetContactPassword");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.ResetContactPassword dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contactID254,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "resetContactPassword")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader255!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader255 = toOM(clientInfoHeader255, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "resetContactPassword")));
                                                    addHeader(omElementclientInfoHeader255,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.ResetContactPasswordResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultresetContactPassword(
                                            (com.rn.supera.ws.typed.messages.ResetContactPasswordResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorresetContactPassword(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorresetContactPassword((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorresetContactPassword((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorresetContactPassword((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorresetContactPassword(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresetContactPassword(f);
                                            }
									    } else {
										    callback.receiveErrorresetContactPassword(f);
									    }
									} else {
									    callback.receiveErrorresetContactPassword(f);
									}
								} else {
								    callback.receiveErrorresetContactPassword(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorresetContactPassword(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#queryObjects
                     * @param queryObjects257
                    
                     * @param clientInfoHeader261
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.QueryResultData[] queryObjects(

                            java.lang.String query258,com.rn.supera.ws.typed.base.RNObject[] objectTemplates259,int pageSize260,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader261)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("QueryObjects");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.QueryObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query258,
                                                    objectTemplates259,
                                                    pageSize260,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "queryObjects")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader261!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader261 = toOM(clientInfoHeader261, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "queryObjects")));
                                                    addHeader(omElementclientInfoHeader261,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.QueryObjectsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getQueryObjectsResponseResult((com.rn.supera.ws.typed.messages.QueryObjectsResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startqueryObjects
                    * @param queryObjects257
                
                    * @param clientInfoHeader261
                
                */
                public  void startqueryObjects(

                 java.lang.String query258,com.rn.supera.ws.typed.base.RNObject[] objectTemplates259,int pageSize260,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader261,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
             _operationClient.getOptions().setAction("QueryObjects");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.QueryObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query258,
                                                    objectTemplates259,
                                                    pageSize260,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "queryObjects")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader261!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader261 = toOM(clientInfoHeader261, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "queryObjects")));
                                                    addHeader(omElementclientInfoHeader261,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.QueryObjectsResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryObjects(
                                            getQueryObjectsResponseResult((com.rn.supera.ws.typed.messages.QueryObjectsResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryObjects(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorqueryObjects((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorqueryObjects((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorqueryObjects((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryObjects(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryObjects(f);
                                            }
									    } else {
										    callback.receiveErrorqueryObjects(f);
									    }
									} else {
									    callback.receiveErrorqueryObjects(f);
									}
								} else {
								    callback.receiveErrorqueryObjects(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryObjects(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[12].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#convertGenericToObject
                     * @param convertGenericToObject264
                    
                     * @param clientInfoHeader266
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.RNObjectsResult convertGenericToObject(

                            com.rn.supera.ws.typed.base.RNObject[] rNObjects265,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader266)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("ConvertGenericToObject");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.ConvertGenericToObject dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects265,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "convertGenericToObject")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader266!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader266 = toOM(clientInfoHeader266, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "convertGenericToObject")));
                                                    addHeader(omElementclientInfoHeader266,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getConvertGenericToObjectResponseRNObjectsResult((com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startconvertGenericToObject
                    * @param convertGenericToObject264
                
                    * @param clientInfoHeader266
                
                */
                public  void startconvertGenericToObject(

                 com.rn.supera.ws.typed.base.RNObject[] rNObjects265,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader266,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
             _operationClient.getOptions().setAction("ConvertGenericToObject");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.ConvertGenericToObject dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects265,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "convertGenericToObject")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader266!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader266 = toOM(clientInfoHeader266, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "convertGenericToObject")));
                                                    addHeader(omElementclientInfoHeader266,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultconvertGenericToObject(
                                            getConvertGenericToObjectResponseRNObjectsResult((com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorconvertGenericToObject(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorconvertGenericToObject((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorconvertGenericToObject((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorconvertGenericToObject((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorconvertGenericToObject(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertGenericToObject(f);
                                            }
									    } else {
										    callback.receiveErrorconvertGenericToObject(f);
									    }
									} else {
									    callback.receiveErrorconvertGenericToObject(f);
									}
								} else {
								    callback.receiveErrorconvertGenericToObject(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorconvertGenericToObject(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[13].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[13].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getMetaData
                     * @param getMetaData269
                    
                     * @param clientInfoHeader270
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.metadata.MetaDataClass[] getMetaData(

                            com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader270)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("GetMetaData");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetMetaData dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getMetaData")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader270!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader270 = toOM(clientInfoHeader270, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaData")));
                                                    addHeader(omElementclientInfoHeader270,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetMetaDataResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMetaDataResponseMetaDataClass((com.rn.supera.ws.typed.messages.GetMetaDataResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetMetaData
                    * @param getMetaData269
                
                    * @param clientInfoHeader270
                
                */
                public  void startgetMetaData(

                 com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader270,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
             _operationClient.getOptions().setAction("GetMetaData");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetMetaData dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getMetaData")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader270!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader270 = toOM(clientInfoHeader270, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaData")));
                                                    addHeader(omElementclientInfoHeader270,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetMetaDataResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMetaData(
                                            getGetMetaDataResponseMetaDataClass((com.rn.supera.ws.typed.messages.GetMetaDataResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMetaData(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetMetaData((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetMetaData((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetMetaData((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMetaData(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaData(f);
                                            }
									    } else {
										    callback.receiveErrorgetMetaData(f);
									    }
									} else {
									    callback.receiveErrorgetMetaData(f);
									}
								} else {
								    callback.receiveErrorgetMetaData(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMetaData(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[14].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[14].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#runAnalyticsReport
                     * @param runAnalyticsReport273
                    
                     * @param clientInfoHeader280
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.RunAnalyticsReportResponseMsg runAnalyticsReport(

                            com.rn.supera.ws.typed.objects.AnalyticsReport analyticsReport274,int limit275,int start276,java.lang.String delimiter277,boolean returnRawResult278,boolean disableMTOM279,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader280)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("RunAnalyticsReport");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.RunAnalyticsReport dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    analyticsReport274,
                                                    limit275,
                                                    start276,
                                                    delimiter277,
                                                    returnRawResult278,
                                                    disableMTOM279,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "runAnalyticsReport")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader280!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader280 = toOM(clientInfoHeader280, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "runAnalyticsReport")));
                                                    addHeader(omElementclientInfoHeader280,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getRunAnalyticsReport((com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startrunAnalyticsReport
                    * @param runAnalyticsReport273
                
                    * @param clientInfoHeader280
                
                */
                public  void startrunAnalyticsReport(

                 com.rn.supera.ws.typed.objects.AnalyticsReport analyticsReport274,int limit275,int start276,java.lang.String delimiter277,boolean returnRawResult278,boolean disableMTOM279,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader280,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
             _operationClient.getOptions().setAction("RunAnalyticsReport");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.RunAnalyticsReport dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    analyticsReport274,
                                                    limit275,
                                                    start276,
                                                    delimiter277,
                                                    returnRawResult278,
                                                    disableMTOM279,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "runAnalyticsReport")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader280!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader280 = toOM(clientInfoHeader280, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "runAnalyticsReport")));
                                                    addHeader(omElementclientInfoHeader280,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultrunAnalyticsReport(
                                            (com.rn.supera.ws.typed.messages.RunAnalyticsReportResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorrunAnalyticsReport(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorrunAnalyticsReport((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorrunAnalyticsReport((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorrunAnalyticsReport((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorrunAnalyticsReport(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunAnalyticsReport(f);
                                            }
									    } else {
										    callback.receiveErrorrunAnalyticsReport(f);
									    }
									} else {
									    callback.receiveErrorrunAnalyticsReport(f);
									}
								} else {
								    callback.receiveErrorrunAnalyticsReport(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorrunAnalyticsReport(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[15].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[15].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getSubscribableObjects
                     * @param getSubscribableObjects284
                    
                     * @param clientInfoHeader285
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.SubscribableObject[] getSubscribableObjects(

                            com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader285)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("GetSubscribableObjects");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetSubscribableObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getSubscribableObjects")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader285!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader285 = toOM(clientInfoHeader285, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getSubscribableObjects")));
                                                    addHeader(omElementclientInfoHeader285,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetSubscribableObjectsResponseSubscribableObjects((com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetSubscribableObjects
                    * @param getSubscribableObjects284
                
                    * @param clientInfoHeader285
                
                */
                public  void startgetSubscribableObjects(

                 com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader285,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
             _operationClient.getOptions().setAction("GetSubscribableObjects");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetSubscribableObjects dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getSubscribableObjects")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader285!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader285 = toOM(clientInfoHeader285, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getSubscribableObjects")));
                                                    addHeader(omElementclientInfoHeader285,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetSubscribableObjects(
                                            getGetSubscribableObjectsResponseSubscribableObjects((com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetSubscribableObjects(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetSubscribableObjects((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetSubscribableObjects((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetSubscribableObjects((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetSubscribableObjects(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetSubscribableObjects(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetSubscribableObjects(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetSubscribableObjects(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetSubscribableObjects(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetSubscribableObjects(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetSubscribableObjects(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetSubscribableObjects(f);
                                            }
									    } else {
										    callback.receiveErrorgetSubscribableObjects(f);
									    }
									} else {
									    callback.receiveErrorgetSubscribableObjects(f);
									}
								} else {
								    callback.receiveErrorgetSubscribableObjects(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetSubscribableObjects(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[16].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[16].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#update
                     * @param update288
                    
                     * @param clientInfoHeader291
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.UpdateResponseMsg update(

                            com.rn.supera.ws.typed.base.RNObject[] rNObjects289,com.rn.supera.ws.typed.messages.UpdateProcessingOptions processingOptions290,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader291)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("Update");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.Update dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects289,
                                                    processingOptions290,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "update")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader291!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader291 = toOM(clientInfoHeader291, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "update")));
                                                    addHeader(omElementclientInfoHeader291,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.UpdateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getUpdate((com.rn.supera.ws.typed.messages.UpdateResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startupdate
                    * @param update288
                
                    * @param clientInfoHeader291
                
                */
                public  void startupdate(

                 com.rn.supera.ws.typed.base.RNObject[] rNObjects289,com.rn.supera.ws.typed.messages.UpdateProcessingOptions processingOptions290,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader291,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
             _operationClient.getOptions().setAction("Update");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.Update dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects289,
                                                    processingOptions290,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "update")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader291!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader291 = toOM(clientInfoHeader291, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "update")));
                                                    addHeader(omElementclientInfoHeader291,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.UpdateResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultupdate(
                                            (com.rn.supera.ws.typed.messages.UpdateResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorupdate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorupdate((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorupdate((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorupdate((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail){
														callback.receiveErrorupdate((com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorupdate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorupdate(f);
                                            }
									    } else {
										    callback.receiveErrorupdate(f);
									    }
									} else {
									    callback.receiveErrorupdate(f);
									}
								} else {
								    callback.receiveErrorupdate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorupdate(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[17].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[17].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#queryCSV
                     * @param queryCSV293
                    
                     * @param clientInfoHeader299
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.QueryCSVResponseMsg queryCSV(

                            java.lang.String query294,int pageSize295,java.lang.String delimiter296,boolean returnRawResult297,boolean disableMTOM298,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader299)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("QueryCSV");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.QueryCSV dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query294,
                                                    pageSize295,
                                                    delimiter296,
                                                    returnRawResult297,
                                                    disableMTOM298,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "queryCSV")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader299!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader299 = toOM(clientInfoHeader299, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "queryCSV")));
                                                    addHeader(omElementclientInfoHeader299,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.QueryCSVResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getQueryCSV((com.rn.supera.ws.typed.messages.QueryCSVResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startqueryCSV
                    * @param queryCSV293
                
                    * @param clientInfoHeader299
                
                */
                public  void startqueryCSV(

                 java.lang.String query294,int pageSize295,java.lang.String delimiter296,boolean returnRawResult297,boolean disableMTOM298,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader299,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
             _operationClient.getOptions().setAction("QueryCSV");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.QueryCSV dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    query294,
                                                    pageSize295,
                                                    delimiter296,
                                                    returnRawResult297,
                                                    disableMTOM298,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "queryCSV")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader299!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader299 = toOM(clientInfoHeader299, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "queryCSV")));
                                                    addHeader(omElementclientInfoHeader299,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.QueryCSVResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryCSV(
                                            (com.rn.supera.ws.typed.messages.QueryCSVResponseMsg)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryCSV(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorqueryCSV((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorqueryCSV((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorqueryCSV((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryCSV(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryCSV(f);
                                            }
									    } else {
										    callback.receiveErrorqueryCSV(f);
									    }
									} else {
									    callback.receiveErrorqueryCSV(f);
									}
								} else {
								    callback.receiveErrorqueryCSV(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryCSV(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[18].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[18].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getMetaDataLastChangeTime
                     * @param getMetaDataLastChangeTime303
                    
                     * @param clientInfoHeader304
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  java.util.Calendar getMetaDataLastChangeTime(

                            com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader304)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("GetMetaDataLastChangeTime");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getMetaDataLastChangeTime")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader304!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader304 = toOM(clientInfoHeader304, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataLastChangeTime")));
                                                    addHeader(omElementclientInfoHeader304,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMetaDataLastChangeTimeResponseLastChangeDateTime((com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetMetaDataLastChangeTime
                    * @param getMetaDataLastChangeTime303
                
                    * @param clientInfoHeader304
                
                */
                public  void startgetMetaDataLastChangeTime(

                 com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader304,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
             _operationClient.getOptions().setAction("GetMetaDataLastChangeTime");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getMetaDataLastChangeTime")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader304!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader304 = toOM(clientInfoHeader304, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataLastChangeTime")));
                                                    addHeader(omElementclientInfoHeader304,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMetaDataLastChangeTime(
                                            getGetMetaDataLastChangeTimeResponseLastChangeDateTime((com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMetaDataLastChangeTime(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetMetaDataLastChangeTime((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetMetaDataLastChangeTime((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetMetaDataLastChangeTime((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMetaDataLastChangeTime(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataLastChangeTime(f);
                                            }
									    } else {
										    callback.receiveErrorgetMetaDataLastChangeTime(f);
									    }
									} else {
									    callback.receiveErrorgetMetaDataLastChangeTime(f);
									}
								} else {
								    callback.receiveErrorgetMetaDataLastChangeTime(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMetaDataLastChangeTime(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[19].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[19].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getPrimaryClassNames
                     * @param getPrimaryClassNames307
                    
                     * @param clientInfoHeader308
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.generic.RNObjectType[] getPrimaryClassNames(

                            com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader308)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("GetPrimaryClassNames");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetPrimaryClassNames dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getPrimaryClassNames")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader308!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader308 = toOM(clientInfoHeader308, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getPrimaryClassNames")));
                                                    addHeader(omElementclientInfoHeader308,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetPrimaryClassNamesResponsePrimaryClassName((com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetPrimaryClassNames
                    * @param getPrimaryClassNames307
                
                    * @param clientInfoHeader308
                
                */
                public  void startgetPrimaryClassNames(

                 com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader308,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
             _operationClient.getOptions().setAction("GetPrimaryClassNames");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetPrimaryClassNames dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getPrimaryClassNames")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader308!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader308 = toOM(clientInfoHeader308, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getPrimaryClassNames")));
                                                    addHeader(omElementclientInfoHeader308,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetPrimaryClassNames(
                                            getGetPrimaryClassNamesResponsePrimaryClassName((com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetPrimaryClassNames(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetPrimaryClassNames((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetPrimaryClassNames((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetPrimaryClassNames((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetPrimaryClassNames(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPrimaryClassNames(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPrimaryClassNames(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPrimaryClassNames(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPrimaryClassNames(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPrimaryClassNames(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPrimaryClassNames(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetPrimaryClassNames(f);
                                            }
									    } else {
										    callback.receiveErrorgetPrimaryClassNames(f);
									    }
									} else {
									    callback.receiveErrorgetPrimaryClassNames(f);
									}
								} else {
								    callback.receiveErrorgetPrimaryClassNames(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetPrimaryClassNames(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[20].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[20].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#convertObjectToGeneric
                     * @param convertObjectToGeneric311
                    
                     * @param clientInfoHeader313
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.messages.RNObjectsResult convertObjectToGeneric(

                            com.rn.supera.ws.typed.base.RNObject[] rNObjects312,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader313)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("ConvertObjectToGeneric");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.ConvertObjectToGeneric dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects312,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "convertObjectToGeneric")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader313!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader313 = toOM(clientInfoHeader313, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "convertObjectToGeneric")));
                                                    addHeader(omElementclientInfoHeader313,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getConvertObjectToGenericResponseRNObjectsResult((com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startconvertObjectToGeneric
                    * @param convertObjectToGeneric311
                
                    * @param clientInfoHeader313
                
                */
                public  void startconvertObjectToGeneric(

                 com.rn.supera.ws.typed.base.RNObject[] rNObjects312,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader313,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
             _operationClient.getOptions().setAction("ConvertObjectToGeneric");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.ConvertObjectToGeneric dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    rNObjects312,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "convertObjectToGeneric")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader313!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader313 = toOM(clientInfoHeader313, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "convertObjectToGeneric")));
                                                    addHeader(omElementclientInfoHeader313,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultconvertObjectToGeneric(
                                            getConvertObjectToGenericResponseRNObjectsResult((com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorconvertObjectToGeneric(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorconvertObjectToGeneric((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorconvertObjectToGeneric((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorconvertObjectToGeneric((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorconvertObjectToGeneric(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconvertObjectToGeneric(f);
                                            }
									    } else {
										    callback.receiveErrorconvertObjectToGeneric(f);
									    }
									} else {
									    callback.receiveErrorconvertObjectToGeneric(f);
									}
								} else {
								    callback.receiveErrorconvertObjectToGeneric(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorconvertObjectToGeneric(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[21].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[21].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#getMetaDataForClass
                     * @param getMetaDataForClass316
                    
                     * @param clientInfoHeader320
                    
                     * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
                     * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
                     */

                    

                            public  com.rn.supera.ws.typed.metadata.MetaDataClass[] getMetaDataForClass(

                            java.lang.String[] className317,com.rn.supera.ws.typed.generic.RNObjectType[] qualifiedClassName318,java.lang.String[] metaDataLink319,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader320)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
                        ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
                        ,com.rn.supera.ws.typed.wsdl.ServerErrorFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("GetMetaDataForClass");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    com.rn.supera.ws.typed.messages.GetMetaDataForClass dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    className317,
                                                    qualifiedClassName318,
                                                    metaDataLink319,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getMetaDataForClass")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (clientInfoHeader320!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader320 = toOM(clientInfoHeader320, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataForClass")));
                                                    addHeader(omElementclientInfoHeader320,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetMetaDataForClassResponseMetaDataClass((com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex;
                        }
                        
                        if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
                          throw (com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.rn.supera.ws.typed.wsdl.RightNowSyncService#startgetMetaDataForClass
                    * @param getMetaDataForClass316
                
                    * @param clientInfoHeader320
                
                */
                public  void startgetMetaDataForClass(

                 java.lang.String[] className317,com.rn.supera.ws.typed.generic.RNObjectType[] qualifiedClassName318,java.lang.String[] metaDataLink319,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader320,
                    

                  final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
             _operationClient.getOptions().setAction("GetMetaDataForClass");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    com.rn.supera.ws.typed.messages.GetMetaDataForClass dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    className317,
                                                    qualifiedClassName318,
                                                    metaDataLink319,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3",
                                                    "getMetaDataForClass")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (clientInfoHeader320!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementclientInfoHeader320 = toOM(clientInfoHeader320, optimizeContent(new javax.xml.namespace.QName("urn:wsdl.ws.rightnow.com/v1_3", "getMetaDataForClass")));
                                                    addHeader(omElementclientInfoHeader320,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMetaDataForClass(
                                            getGetMetaDataForClassResponseMetaDataClass((com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMetaDataForClass(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.rn.supera.ws.typed.wsdl.RequestErrorFault){
														callback.receiveErrorgetMetaDataForClass((com.rn.supera.ws.typed.wsdl.RequestErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault){
														callback.receiveErrorgetMetaDataForClass((com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault)ex);
											            return;
										            }
										            
													if (ex instanceof com.rn.supera.ws.typed.wsdl.ServerErrorFault){
														callback.receiveErrorgetMetaDataForClass((com.rn.supera.ws.typed.wsdl.ServerErrorFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetMetaDataForClass(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMetaDataForClass(f);
                                            }
									    } else {
										    callback.receiveErrorgetMetaDataForClass(f);
									    }
									} else {
									    callback.receiveErrorgetMetaDataForClass(f);
									}
								} else {
								    callback.receiveErrorgetMetaDataForClass(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMetaDataForClass(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[22].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[22].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://superarx.custhelp.com/cgi-bin/superarx.cfg/services/soap
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetValuesForNamedID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetValuesForNamedID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.faults.RequestErrorFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.faults.RequestErrorFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.faults.UnexpectedErrorFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.faults.UnexpectedErrorFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.faults.ServerErrorFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.faults.ServerErrorFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ClientInfoHeader param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ClientInfoHeader.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ExecuteMarketingFlow param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ExecuteMarketingFlow.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.SendMailingToContact param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.SendMailingToContact.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.SendMailingToContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.SendMailingToContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.Batch param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.Batch.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.BatchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.BatchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetMetaDataForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.Create param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.Create.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.CreateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.CreateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.faults.RequestErrorFaultDetail param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.Destroy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.Destroy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.DestroyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.DestroyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.TransferSubObjects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.TransferSubObjects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.TransferSubObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.TransferSubObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.Get param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.Get.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetFileData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetFileData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetFileDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetFileDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ResetContactPassword param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ResetContactPassword.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ResetContactPasswordResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ResetContactPasswordResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.QueryObjects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.QueryObjects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.QueryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.QueryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ConvertGenericToObject param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ConvertGenericToObject.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetMetaData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetMetaData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetMetaDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.RunAnalyticsReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.RunAnalyticsReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetSubscribableObjects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetSubscribableObjects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.Update param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.Update.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.UpdateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.UpdateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.QueryCSV param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.QueryCSV.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.QueryCSVResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.QueryCSVResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetPrimaryClassNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetPrimaryClassNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ConvertObjectToGeneric param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ConvertObjectToGeneric.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetMetaDataForClass param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataForClass.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    com.rn.supera.ws.typed.messages.GetValuesForNamedID dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetValuesForNamedID wrappedType = new com.rn.supera.ws.typed.messages.GetValuesForNamedID();

                                 com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg();
                                          
                                              wrappedComplexType.setPackageName(param1);
                                         
                                              wrappedComplexType.setFieldName(param2);
                                         
                                         wrappedType.setGetValuesForNamedID(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetValuesForNamedID.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg getGetValuesForNamedID(
                                com.rn.supera.ws.typed.messages.GetValuesForNamedID wrappedType){
                                    return wrappedType.getGetValuesForNamedID();
                                }

                                private com.rn.supera.ws.typed.messages.GetValuesForNamedID wrapGetValuesForNamedID(
                                com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetValuesForNamedID wrappedElement = new com.rn.supera.ws.typed.messages.GetValuesForNamedID();
                                    wrappedElement.setGetValuesForNamedID(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.base.NamedID[] getGetValuesForNamedIDResponseEntry(
                                com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse wrappedType){
                                
                                        return wrappedType.getGetValuesForNamedIDResponse().getEntry();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponseMsg getGetValuesForNamedID(
                                com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse wrappedType){
                                    return wrappedType.getGetValuesForNamedIDResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.ID param1,
                                    com.rn.supera.ws.typed.base.ID param2,
                                    java.lang.String param3,
                                    com.rn.supera.ws.typed.messages.ExecuteMarketingFlow dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.ExecuteMarketingFlow wrappedType = new com.rn.supera.ws.typed.messages.ExecuteMarketingFlow();

                                 com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg();
                                          
                                              wrappedComplexType.setContactID(param1);
                                         
                                              wrappedComplexType.setCampaignID(param2);
                                         
                                              wrappedComplexType.setEntryPoint(param3);
                                         
                                         wrappedType.setExecuteMarketingFlow(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.ExecuteMarketingFlow.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg getExecuteMarketingFlow(
                                com.rn.supera.ws.typed.messages.ExecuteMarketingFlow wrappedType){
                                    return wrappedType.getExecuteMarketingFlow();
                                }

                                private com.rn.supera.ws.typed.messages.ExecuteMarketingFlow wrapExecuteMarketingFlow(
                                com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg innerType){
                                    com.rn.supera.ws.typed.messages.ExecuteMarketingFlow wrappedElement = new com.rn.supera.ws.typed.messages.ExecuteMarketingFlow();
                                    wrappedElement.setExecuteMarketingFlow(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponseMsg getExecuteMarketingFlow(
                                com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponse wrappedType){
                                    return wrappedType.getExecuteMarketingFlowResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.ID param1,
                                    com.rn.supera.ws.typed.base.ID param2,
                                    java.util.Calendar param3,
                                    com.rn.supera.ws.typed.base.ID param4,
                                    com.rn.supera.ws.typed.base.ID param5,
                                    com.rn.supera.ws.typed.base.ID param6,
                                    com.rn.supera.ws.typed.messages.SendMailingToContact dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.SendMailingToContact wrappedType = new com.rn.supera.ws.typed.messages.SendMailingToContact();

                                 com.rn.supera.ws.typed.messages.SendMailingToContactMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.SendMailingToContactMsg();
                                          
                                              wrappedComplexType.setContactID(param1);
                                         
                                              wrappedComplexType.setMailingID(param2);
                                         
                                              wrappedComplexType.setScheduledTime(param3);
                                         
                                              wrappedComplexType.setIncidentID(param4);
                                         
                                              wrappedComplexType.setOpportunityID(param5);
                                         
                                              wrappedComplexType.setChatID(param6);
                                         
                                         wrappedType.setSendMailingToContact(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.SendMailingToContact.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.SendMailingToContactMsg getSendMailingToContact(
                                com.rn.supera.ws.typed.messages.SendMailingToContact wrappedType){
                                    return wrappedType.getSendMailingToContact();
                                }

                                private com.rn.supera.ws.typed.messages.SendMailingToContact wrapSendMailingToContact(
                                com.rn.supera.ws.typed.messages.SendMailingToContactMsg innerType){
                                    com.rn.supera.ws.typed.messages.SendMailingToContact wrappedElement = new com.rn.supera.ws.typed.messages.SendMailingToContact();
                                    wrappedElement.setSendMailingToContact(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rn.supera.ws.typed.messages.SendMailingToContactResponseMsg getSendMailingToContact(
                                com.rn.supera.ws.typed.messages.SendMailingToContactResponse wrappedType){
                                    return wrappedType.getSendMailingToContactResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.messages.BatchRequestItem[] param1,
                                    com.rn.supera.ws.typed.messages.Batch dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.Batch wrappedType = new com.rn.supera.ws.typed.messages.Batch();

                                 com.rn.supera.ws.typed.messages.BatchMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.BatchMsg();
                                          
                                              wrappedComplexType.setBatchRequestItem(param1);
                                         
                                         wrappedType.setBatch(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.Batch.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.BatchMsg getBatch(
                                com.rn.supera.ws.typed.messages.Batch wrappedType){
                                    return wrappedType.getBatch();
                                }

                                private com.rn.supera.ws.typed.messages.Batch wrapBatch(
                                com.rn.supera.ws.typed.messages.BatchMsg innerType){
                                    com.rn.supera.ws.typed.messages.Batch wrappedElement = new com.rn.supera.ws.typed.messages.Batch();
                                    wrappedElement.setBatch(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.BatchResponseItem[] getBatchResponseBatchResponseItem(
                                com.rn.supera.ws.typed.messages.BatchResponse wrappedType){
                                
                                        return wrappedType.getBatchResponse().getBatchResponseItem();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.BatchResponseMsg getBatch(
                                com.rn.supera.ws.typed.messages.BatchResponse wrappedType){
                                    return wrappedType.getBatchResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String[] param1,
                                    java.lang.String[] param2,
                                    com.rn.supera.ws.typed.generic.RNObjectType[] param3,
                                    com.rn.supera.ws.typed.messages.GetMetaDataForOperation dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetMetaDataForOperation wrappedType = new com.rn.supera.ws.typed.messages.GetMetaDataForOperation();

                                 com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg();
                                          
                                              wrappedComplexType.setOperation(param1);
                                         
                                              wrappedComplexType.setClassName(param2);
                                         
                                              wrappedComplexType.setQualifiedClassName(param3);
                                         
                                         wrappedType.setGetMetaDataForOperation(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataForOperation.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg getGetMetaDataForOperation(
                                com.rn.supera.ws.typed.messages.GetMetaDataForOperation wrappedType){
                                    return wrappedType.getGetMetaDataForOperation();
                                }

                                private com.rn.supera.ws.typed.messages.GetMetaDataForOperation wrapGetMetaDataForOperation(
                                com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetMetaDataForOperation wrappedElement = new com.rn.supera.ws.typed.messages.GetMetaDataForOperation();
                                    wrappedElement.setGetMetaDataForOperation(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.metadata.MetaDataClassOperation[] getGetMetaDataForOperationResponseMetaDataClassOperation(
                                com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse wrappedType){
                                
                                        return wrappedType.getGetMetaDataForOperationResponse().getMetaDataClassOperation();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponseMsg getGetMetaDataForOperation(
                                com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse wrappedType){
                                    return wrappedType.getGetMetaDataForOperationResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.RNObject[] param1,
                                    com.rn.supera.ws.typed.messages.CreateProcessingOptions param2,
                                    com.rn.supera.ws.typed.messages.Create dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.Create wrappedType = new com.rn.supera.ws.typed.messages.Create();

                                 com.rn.supera.ws.typed.messages.CreateMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.CreateMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                              wrappedComplexType.setProcessingOptions(param2);
                                         
                                         wrappedType.setCreate(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.Create.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.CreateMsg getCreate(
                                com.rn.supera.ws.typed.messages.Create wrappedType){
                                    return wrappedType.getCreate();
                                }

                                private com.rn.supera.ws.typed.messages.Create wrapCreate(
                                com.rn.supera.ws.typed.messages.CreateMsg innerType){
                                    com.rn.supera.ws.typed.messages.Create wrappedElement = new com.rn.supera.ws.typed.messages.Create();
                                    wrappedElement.setCreate(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.RNObjectsResult getCreateResponseRNObjectsResult(
                                com.rn.supera.ws.typed.messages.CreateResponse wrappedType){
                                
                                        return wrappedType.getCreateResponse().getRNObjectsResult();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.CreateResponseMsg getCreate(
                                com.rn.supera.ws.typed.messages.CreateResponse wrappedType){
                                    return wrappedType.getCreateResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.RNObject[] param1,
                                    com.rn.supera.ws.typed.messages.DestroyProcessingOptions param2,
                                    com.rn.supera.ws.typed.messages.Destroy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.Destroy wrappedType = new com.rn.supera.ws.typed.messages.Destroy();

                                 com.rn.supera.ws.typed.messages.DestroyMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.DestroyMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                              wrappedComplexType.setProcessingOptions(param2);
                                         
                                         wrappedType.setDestroy(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.Destroy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.DestroyMsg getDestroy(
                                com.rn.supera.ws.typed.messages.Destroy wrappedType){
                                    return wrappedType.getDestroy();
                                }

                                private com.rn.supera.ws.typed.messages.Destroy wrapDestroy(
                                com.rn.supera.ws.typed.messages.DestroyMsg innerType){
                                    com.rn.supera.ws.typed.messages.Destroy wrappedElement = new com.rn.supera.ws.typed.messages.Destroy();
                                    wrappedElement.setDestroy(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rn.supera.ws.typed.messages.DestroyResponseMsg getDestroy(
                                com.rn.supera.ws.typed.messages.DestroyResponse wrappedType){
                                    return wrappedType.getDestroyResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.RNObject param1,
                                    com.rn.supera.ws.typed.base.RNObject[] param2,
                                    com.rn.supera.ws.typed.messages.TransferSubObjects dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.TransferSubObjects wrappedType = new com.rn.supera.ws.typed.messages.TransferSubObjects();

                                 com.rn.supera.ws.typed.messages.TransferSubObjectsMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.TransferSubObjectsMsg();
                                          
                                              wrappedComplexType.setDestinationRNObject(param1);
                                         
                                              wrappedComplexType.setSourceRNObjects(param2);
                                         
                                         wrappedType.setTransferSubObjects(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.TransferSubObjects.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.TransferSubObjectsMsg getTransferSubObjects(
                                com.rn.supera.ws.typed.messages.TransferSubObjects wrappedType){
                                    return wrappedType.getTransferSubObjects();
                                }

                                private com.rn.supera.ws.typed.messages.TransferSubObjects wrapTransferSubObjects(
                                com.rn.supera.ws.typed.messages.TransferSubObjectsMsg innerType){
                                    com.rn.supera.ws.typed.messages.TransferSubObjects wrappedElement = new com.rn.supera.ws.typed.messages.TransferSubObjects();
                                    wrappedElement.setTransferSubObjects(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rn.supera.ws.typed.messages.TransferSubObjectsResponseMsg getTransferSubObjects(
                                com.rn.supera.ws.typed.messages.TransferSubObjectsResponse wrappedType){
                                    return wrappedType.getTransferSubObjectsResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.RNObject[] param1,
                                    com.rn.supera.ws.typed.messages.GetProcessingOptions param2,
                                    com.rn.supera.ws.typed.messages.Get dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.Get wrappedType = new com.rn.supera.ws.typed.messages.Get();

                                 com.rn.supera.ws.typed.messages.GetMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                              wrappedComplexType.setProcessingOptions(param2);
                                         
                                         wrappedType.setGet(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.Get.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetMsg getGet(
                                com.rn.supera.ws.typed.messages.Get wrappedType){
                                    return wrappedType.getGet();
                                }

                                private com.rn.supera.ws.typed.messages.Get wrapGet(
                                com.rn.supera.ws.typed.messages.GetMsg innerType){
                                    com.rn.supera.ws.typed.messages.Get wrappedElement = new com.rn.supera.ws.typed.messages.Get();
                                    wrappedElement.setGet(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.RNObjectsResult getGetResponseRNObjectsResult(
                                com.rn.supera.ws.typed.messages.GetResponse wrappedType){
                                
                                        return wrappedType.getGetResponse().getRNObjectsResult();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetResponseMsg getGet(
                                com.rn.supera.ws.typed.messages.GetResponse wrappedType){
                                    return wrappedType.getGetResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy wrappedType = new com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy();

                                 com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg();
                                          
                                              wrappedComplexType.setFieldName(param1);
                                         
                                         wrappedType.setGetValuesForNamedIDHierarchy(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg getGetValuesForNamedIDHierarchy(
                                com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy wrappedType){
                                    return wrappedType.getGetValuesForNamedIDHierarchy();
                                }

                                private com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy wrapGetValuesForNamedIDHierarchy(
                                com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy wrappedElement = new com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy();
                                    wrappedElement.setGetValuesForNamedIDHierarchy(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.base.NamedIDWithParent[] getGetValuesForNamedIDHierarchyResponseEntry(
                                com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse wrappedType){
                                
                                        return wrappedType.getGetValuesForNamedIDHierarchyResponse().getEntry();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponseMsg getGetValuesForNamedIDHierarchy(
                                com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse wrappedType){
                                    return wrappedType.getGetValuesForNamedIDHierarchyResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.RNObject param1,
                                    com.rn.supera.ws.typed.base.ID param2,
                                    boolean param3,
                                    com.rn.supera.ws.typed.messages.GetFileData dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetFileData wrappedType = new com.rn.supera.ws.typed.messages.GetFileData();

                                 com.rn.supera.ws.typed.messages.GetFileDataMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetFileDataMsg();
                                          
                                              wrappedComplexType.setRNObject(param1);
                                         
                                              wrappedComplexType.setFileID(param2);
                                         
                                              wrappedComplexType.setDisableMTOM(param3);
                                         
                                         wrappedType.setGetFileData(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetFileData.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetFileDataMsg getGetFileData(
                                com.rn.supera.ws.typed.messages.GetFileData wrappedType){
                                    return wrappedType.getGetFileData();
                                }

                                private com.rn.supera.ws.typed.messages.GetFileData wrapGetFileData(
                                com.rn.supera.ws.typed.messages.GetFileDataMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetFileData wrappedElement = new com.rn.supera.ws.typed.messages.GetFileData();
                                    wrappedElement.setGetFileData(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private javax.activation.DataHandler getGetFileDataResponseFileData(
                                com.rn.supera.ws.typed.messages.GetFileDataResponse wrappedType){
                                
                                        return wrappedType.getGetFileDataResponse().getFileData();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetFileDataResponseMsg getGetFileData(
                                com.rn.supera.ws.typed.messages.GetFileDataResponse wrappedType){
                                    return wrappedType.getGetFileDataResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.ID param1,
                                    com.rn.supera.ws.typed.messages.ResetContactPassword dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.ResetContactPassword wrappedType = new com.rn.supera.ws.typed.messages.ResetContactPassword();

                                 com.rn.supera.ws.typed.messages.ResetContactPasswordMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.ResetContactPasswordMsg();
                                          
                                              wrappedComplexType.setContactID(param1);
                                         
                                         wrappedType.setResetContactPassword(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.ResetContactPassword.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.ResetContactPasswordMsg getResetContactPassword(
                                com.rn.supera.ws.typed.messages.ResetContactPassword wrappedType){
                                    return wrappedType.getResetContactPassword();
                                }

                                private com.rn.supera.ws.typed.messages.ResetContactPassword wrapResetContactPassword(
                                com.rn.supera.ws.typed.messages.ResetContactPasswordMsg innerType){
                                    com.rn.supera.ws.typed.messages.ResetContactPassword wrappedElement = new com.rn.supera.ws.typed.messages.ResetContactPassword();
                                    wrappedElement.setResetContactPassword(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rn.supera.ws.typed.messages.ResetContactPasswordResponseMsg getResetContactPassword(
                                com.rn.supera.ws.typed.messages.ResetContactPasswordResponse wrappedType){
                                    return wrappedType.getResetContactPasswordResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    com.rn.supera.ws.typed.base.RNObject[] param2,
                                    int param3,
                                    com.rn.supera.ws.typed.messages.QueryObjects dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.QueryObjects wrappedType = new com.rn.supera.ws.typed.messages.QueryObjects();

                                 com.rn.supera.ws.typed.messages.QueryObjectsMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.QueryObjectsMsg();
                                          
                                              wrappedComplexType.setQuery(param1);
                                         
                                              wrappedComplexType.setObjectTemplates(param2);
                                         
                                              wrappedComplexType.setPageSize(param3);
                                         
                                         wrappedType.setQueryObjects(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.QueryObjects.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.QueryObjectsMsg getQueryObjects(
                                com.rn.supera.ws.typed.messages.QueryObjects wrappedType){
                                    return wrappedType.getQueryObjects();
                                }

                                private com.rn.supera.ws.typed.messages.QueryObjects wrapQueryObjects(
                                com.rn.supera.ws.typed.messages.QueryObjectsMsg innerType){
                                    com.rn.supera.ws.typed.messages.QueryObjects wrappedElement = new com.rn.supera.ws.typed.messages.QueryObjects();
                                    wrappedElement.setQueryObjects(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.QueryResultData[] getQueryObjectsResponseResult(
                                com.rn.supera.ws.typed.messages.QueryObjectsResponse wrappedType){
                                
                                        return wrappedType.getQueryObjectsResponse().getResult();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.QueryObjectsResponseMsg getQueryObjects(
                                com.rn.supera.ws.typed.messages.QueryObjectsResponse wrappedType){
                                    return wrappedType.getQueryObjectsResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.messages.GetMetaData dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetMetaData wrappedType = new com.rn.supera.ws.typed.messages.GetMetaData();

                                 com.rn.supera.ws.typed.messages.GetMetaDataMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetMetaDataMsg();
                                          
                                         wrappedType.setGetMetaData(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetMetaData.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetMetaDataMsg getGetMetaData(
                                com.rn.supera.ws.typed.messages.GetMetaData wrappedType){
                                    return wrappedType.getGetMetaData();
                                }

                                private com.rn.supera.ws.typed.messages.GetMetaData wrapGetMetaData(
                                com.rn.supera.ws.typed.messages.GetMetaDataMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetMetaData wrappedElement = new com.rn.supera.ws.typed.messages.GetMetaData();
                                    wrappedElement.setGetMetaData(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.metadata.MetaDataClass[] getGetMetaDataResponseMetaDataClass(
                                com.rn.supera.ws.typed.messages.GetMetaDataResponse wrappedType){
                                
                                        return wrappedType.getGetMetaDataResponse().getMetaDataClass();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetMetaDataResponseMsg getGetMetaData(
                                com.rn.supera.ws.typed.messages.GetMetaDataResponse wrappedType){
                                    return wrappedType.getGetMetaDataResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.RNObject[] param1,
                                    com.rn.supera.ws.typed.messages.ConvertGenericToObject dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.ConvertGenericToObject wrappedType = new com.rn.supera.ws.typed.messages.ConvertGenericToObject();

                                 com.rn.supera.ws.typed.messages.ConvertObjectMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.ConvertObjectMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                         wrappedType.setConvertGenericToObject(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.ConvertGenericToObject.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.ConvertObjectMsg getConvertGenericToObject(
                                com.rn.supera.ws.typed.messages.ConvertGenericToObject wrappedType){
                                    return wrappedType.getConvertGenericToObject();
                                }

                                private com.rn.supera.ws.typed.messages.ConvertGenericToObject wrapConvertGenericToObject(
                                com.rn.supera.ws.typed.messages.ConvertObjectMsg innerType){
                                    com.rn.supera.ws.typed.messages.ConvertGenericToObject wrappedElement = new com.rn.supera.ws.typed.messages.ConvertGenericToObject();
                                    wrappedElement.setConvertGenericToObject(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.RNObjectsResult getConvertGenericToObjectResponseRNObjectsResult(
                                com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse wrappedType){
                                
                                        return wrappedType.getConvertGenericToObjectResponse().getRNObjectsResult();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.ConvertObjectResponseMsg getConvertGenericToObject(
                                com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse wrappedType){
                                    return wrappedType.getConvertGenericToObjectResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.objects.AnalyticsReport param1,
                                    int param2,
                                    int param3,
                                    java.lang.String param4,
                                    boolean param5,
                                    boolean param6,
                                    com.rn.supera.ws.typed.messages.RunAnalyticsReport dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.RunAnalyticsReport wrappedType = new com.rn.supera.ws.typed.messages.RunAnalyticsReport();

                                 com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg();
                                          
                                              wrappedComplexType.setAnalyticsReport(param1);
                                         
                                              wrappedComplexType.setLimit(param2);
                                         
                                              wrappedComplexType.setStart(param3);
                                         
                                              wrappedComplexType.setDelimiter(param4);
                                         
                                              wrappedComplexType.setReturnRawResult(param5);
                                         
                                              wrappedComplexType.setDisableMTOM(param6);
                                         
                                         wrappedType.setRunAnalyticsReport(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.RunAnalyticsReport.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg getRunAnalyticsReport(
                                com.rn.supera.ws.typed.messages.RunAnalyticsReport wrappedType){
                                    return wrappedType.getRunAnalyticsReport();
                                }

                                private com.rn.supera.ws.typed.messages.RunAnalyticsReport wrapRunAnalyticsReport(
                                com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg innerType){
                                    com.rn.supera.ws.typed.messages.RunAnalyticsReport wrappedElement = new com.rn.supera.ws.typed.messages.RunAnalyticsReport();
                                    wrappedElement.setRunAnalyticsReport(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.CSVTableSet getRunAnalyticsReportResponseCSVTableSet(
                                com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse wrappedType){
                                
                                        return wrappedType.getRunAnalyticsReportResponse().getCSVTableSet();
                                    
                                }
                             

                                
                                private javax.activation.DataHandler getRunAnalyticsReportResponseFileData(
                                com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse wrappedType){
                                
                                        return wrappedType.getRunAnalyticsReportResponse().getFileData();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.RunAnalyticsReportResponseMsg getRunAnalyticsReport(
                                com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse wrappedType){
                                    return wrappedType.getRunAnalyticsReportResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.messages.GetSubscribableObjects dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetSubscribableObjects wrappedType = new com.rn.supera.ws.typed.messages.GetSubscribableObjects();

                                 com.rn.supera.ws.typed.messages.GetSubscribableObjectsMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetSubscribableObjectsMsg();
                                          
                                         wrappedType.setGetSubscribableObjects(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetSubscribableObjects.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetSubscribableObjectsMsg getGetSubscribableObjects(
                                com.rn.supera.ws.typed.messages.GetSubscribableObjects wrappedType){
                                    return wrappedType.getGetSubscribableObjects();
                                }

                                private com.rn.supera.ws.typed.messages.GetSubscribableObjects wrapGetSubscribableObjects(
                                com.rn.supera.ws.typed.messages.GetSubscribableObjectsMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetSubscribableObjects wrappedElement = new com.rn.supera.ws.typed.messages.GetSubscribableObjects();
                                    wrappedElement.setGetSubscribableObjects(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.SubscribableObject[] getGetSubscribableObjectsResponseSubscribableObjects(
                                com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse wrappedType){
                                
                                        return wrappedType.getGetSubscribableObjectsResponse().getSubscribableObjects();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponseMsg getGetSubscribableObjects(
                                com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse wrappedType){
                                    return wrappedType.getGetSubscribableObjectsResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.RNObject[] param1,
                                    com.rn.supera.ws.typed.messages.UpdateProcessingOptions param2,
                                    com.rn.supera.ws.typed.messages.Update dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.Update wrappedType = new com.rn.supera.ws.typed.messages.Update();

                                 com.rn.supera.ws.typed.messages.UpdateMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.UpdateMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                              wrappedComplexType.setProcessingOptions(param2);
                                         
                                         wrappedType.setUpdate(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.Update.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.UpdateMsg getUpdate(
                                com.rn.supera.ws.typed.messages.Update wrappedType){
                                    return wrappedType.getUpdate();
                                }

                                private com.rn.supera.ws.typed.messages.Update wrapUpdate(
                                com.rn.supera.ws.typed.messages.UpdateMsg innerType){
                                    com.rn.supera.ws.typed.messages.Update wrappedElement = new com.rn.supera.ws.typed.messages.Update();
                                    wrappedElement.setUpdate(innerType);
                                    return wrappedElement;
                                }
                            

                                private com.rn.supera.ws.typed.messages.UpdateResponseMsg getUpdate(
                                com.rn.supera.ws.typed.messages.UpdateResponse wrappedType){
                                    return wrappedType.getUpdateResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    int param2,
                                    java.lang.String param3,
                                    boolean param4,
                                    boolean param5,
                                    com.rn.supera.ws.typed.messages.QueryCSV dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.QueryCSV wrappedType = new com.rn.supera.ws.typed.messages.QueryCSV();

                                 com.rn.supera.ws.typed.messages.QueryMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.QueryMsg();
                                          
                                              wrappedComplexType.setQuery(param1);
                                         
                                              wrappedComplexType.setPageSize(param2);
                                         
                                              wrappedComplexType.setDelimiter(param3);
                                         
                                              wrappedComplexType.setReturnRawResult(param4);
                                         
                                              wrappedComplexType.setDisableMTOM(param5);
                                         
                                         wrappedType.setQueryCSV(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.QueryCSV.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.QueryMsg getQueryCSV(
                                com.rn.supera.ws.typed.messages.QueryCSV wrappedType){
                                    return wrappedType.getQueryCSV();
                                }

                                private com.rn.supera.ws.typed.messages.QueryCSV wrapQueryCSV(
                                com.rn.supera.ws.typed.messages.QueryMsg innerType){
                                    com.rn.supera.ws.typed.messages.QueryCSV wrappedElement = new com.rn.supera.ws.typed.messages.QueryCSV();
                                    wrappedElement.setQueryCSV(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.CSVTableSet getQueryCSVResponseCSVTableSet(
                                com.rn.supera.ws.typed.messages.QueryCSVResponse wrappedType){
                                
                                        return wrappedType.getQueryCSVResponse().getCSVTableSet();
                                    
                                }
                             

                                
                                private javax.activation.DataHandler getQueryCSVResponseFileData(
                                com.rn.supera.ws.typed.messages.QueryCSVResponse wrappedType){
                                
                                        return wrappedType.getQueryCSVResponse().getFileData();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.QueryCSVResponseMsg getQueryCSV(
                                com.rn.supera.ws.typed.messages.QueryCSVResponse wrappedType){
                                    return wrappedType.getQueryCSVResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime wrappedType = new com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime();

                                 com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg();
                                          
                                         wrappedType.setGetMetaDataLastChangeTime(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg getGetMetaDataLastChangeTime(
                                com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime wrappedType){
                                    return wrappedType.getGetMetaDataLastChangeTime();
                                }

                                private com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime wrapGetMetaDataLastChangeTime(
                                com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime wrappedElement = new com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime();
                                    wrappedElement.setGetMetaDataLastChangeTime(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private java.util.Calendar getGetMetaDataLastChangeTimeResponseLastChangeDateTime(
                                com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse wrappedType){
                                
                                        return wrappedType.getGetMetaDataLastChangeTimeResponse().getLastChangeDateTime();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponseMsg getGetMetaDataLastChangeTime(
                                com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse wrappedType){
                                    return wrappedType.getGetMetaDataLastChangeTimeResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.messages.GetPrimaryClassNames dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetPrimaryClassNames wrappedType = new com.rn.supera.ws.typed.messages.GetPrimaryClassNames();

                                 com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg();
                                          
                                         wrappedType.setGetPrimaryClassNames(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetPrimaryClassNames.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg getGetPrimaryClassNames(
                                com.rn.supera.ws.typed.messages.GetPrimaryClassNames wrappedType){
                                    return wrappedType.getGetPrimaryClassNames();
                                }

                                private com.rn.supera.ws.typed.messages.GetPrimaryClassNames wrapGetPrimaryClassNames(
                                com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetPrimaryClassNames wrappedElement = new com.rn.supera.ws.typed.messages.GetPrimaryClassNames();
                                    wrappedElement.setGetPrimaryClassNames(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.generic.RNObjectType[] getGetPrimaryClassNamesResponsePrimaryClassName(
                                com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse wrappedType){
                                
                                        return wrappedType.getGetPrimaryClassNamesResponse().getPrimaryClassName();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponseMsg getGetPrimaryClassNames(
                                com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse wrappedType){
                                    return wrappedType.getGetPrimaryClassNamesResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String[] param1,
                                    com.rn.supera.ws.typed.generic.RNObjectType[] param2,
                                    java.lang.String[] param3,
                                    com.rn.supera.ws.typed.messages.GetMetaDataForClass dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.GetMetaDataForClass wrappedType = new com.rn.supera.ws.typed.messages.GetMetaDataForClass();

                                 com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg();
                                          
                                              wrappedComplexType.setClassName(param1);
                                         
                                              wrappedComplexType.setQualifiedClassName(param2);
                                         
                                              wrappedComplexType.setMetaDataLink(param3);
                                         
                                         wrappedType.setGetMetaDataForClass(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.GetMetaDataForClass.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg getGetMetaDataForClass(
                                com.rn.supera.ws.typed.messages.GetMetaDataForClass wrappedType){
                                    return wrappedType.getGetMetaDataForClass();
                                }

                                private com.rn.supera.ws.typed.messages.GetMetaDataForClass wrapGetMetaDataForClass(
                                com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg innerType){
                                    com.rn.supera.ws.typed.messages.GetMetaDataForClass wrappedElement = new com.rn.supera.ws.typed.messages.GetMetaDataForClass();
                                    wrappedElement.setGetMetaDataForClass(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.metadata.MetaDataClass[] getGetMetaDataForClassResponseMetaDataClass(
                                com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse wrappedType){
                                
                                        return wrappedType.getGetMetaDataForClassResponse().getMetaDataClass();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.GetMetaDataForClassResponseMsg getGetMetaDataForClass(
                                com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse wrappedType){
                                    return wrappedType.getGetMetaDataForClassResponse();
                                }

                                
                                
                            
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    com.rn.supera.ws.typed.base.RNObject[] param1,
                                    com.rn.supera.ws.typed.messages.ConvertObjectToGeneric dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                com.rn.supera.ws.typed.messages.ConvertObjectToGeneric wrappedType = new com.rn.supera.ws.typed.messages.ConvertObjectToGeneric();

                                 com.rn.supera.ws.typed.messages.ConvertObjectMsg wrappedComplexType = new com.rn.supera.ws.typed.messages.ConvertObjectMsg();
                                          
                                              wrappedComplexType.setRNObjects(param1);
                                         
                                         wrappedType.setConvertObjectToGeneric(wrappedComplexType);
                                     

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(com.rn.supera.ws.typed.messages.ConvertObjectToGeneric.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                private com.rn.supera.ws.typed.messages.ConvertObjectMsg getConvertObjectToGeneric(
                                com.rn.supera.ws.typed.messages.ConvertObjectToGeneric wrappedType){
                                    return wrappedType.getConvertObjectToGeneric();
                                }

                                private com.rn.supera.ws.typed.messages.ConvertObjectToGeneric wrapConvertObjectToGeneric(
                                com.rn.supera.ws.typed.messages.ConvertObjectMsg innerType){
                                    com.rn.supera.ws.typed.messages.ConvertObjectToGeneric wrappedElement = new com.rn.supera.ws.typed.messages.ConvertObjectToGeneric();
                                    wrappedElement.setConvertObjectToGeneric(innerType);
                                    return wrappedElement;
                                }
                            

                                
                                private com.rn.supera.ws.typed.messages.RNObjectsResult getConvertObjectToGenericResponseRNObjectsResult(
                                com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse wrappedType){
                                
                                        return wrappedType.getConvertObjectToGenericResponse().getRNObjectsResult();
                                    
                                }
                             

                                private com.rn.supera.ws.typed.messages.ConvertObjectResponseMsg getConvertObjectToGeneric(
                                com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse wrappedType){
                                    return wrappedType.getConvertObjectToGenericResponse();
                                }

                                
                                
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.rn.supera.ws.typed.messages.GetValuesForNamedID.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetValuesForNamedID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetValuesForNamedIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ExecuteMarketingFlow.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ExecuteMarketingFlow.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.SendMailingToContact.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.SendMailingToContact.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.SendMailingToContactResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.SendMailingToContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.Batch.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.Batch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.BatchResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.BatchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetMetaDataForOperation.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetMetaDataForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetMetaDataForOperationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.Create.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.Create.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.CreateResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.CreateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.Destroy.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.Destroy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.DestroyResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.DestroyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.TransferSubObjects.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.TransferSubObjects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.TransferSubObjectsResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.TransferSubObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.Get.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.Get.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetFileData.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetFileData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetFileDataResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetFileDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ResetContactPassword.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ResetContactPassword.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ResetContactPasswordResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ResetContactPasswordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.QueryObjects.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.QueryObjects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.QueryObjectsResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.QueryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ConvertGenericToObject.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ConvertGenericToObject.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ConvertGenericToObjectResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetMetaData.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetMetaData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetMetaDataResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetMetaDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.RunAnalyticsReport.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.RunAnalyticsReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.RunAnalyticsReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetSubscribableObjects.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetSubscribableObjects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetSubscribableObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.Update.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.Update.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.UpdateResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.UpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFaultDetail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.QueryCSV.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.QueryCSV.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.QueryCSVResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.QueryCSVResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetPrimaryClassNames.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetPrimaryClassNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetPrimaryClassNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ConvertObjectToGeneric.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ConvertObjectToGeneric.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ConvertObjectToGenericResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetMetaDataForClass.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetMetaDataForClass.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.GetMetaDataForClassResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.RequestErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.RequestErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.UnexpectedErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.UnexpectedErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.faults.ServerErrorFault.class.equals(type)){
                
                           return com.rn.supera.ws.typed.faults.ServerErrorFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.rn.supera.ws.typed.messages.ClientInfoHeader.class.equals(type)){
                
                           return com.rn.supera.ws.typed.messages.ClientInfoHeader.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   