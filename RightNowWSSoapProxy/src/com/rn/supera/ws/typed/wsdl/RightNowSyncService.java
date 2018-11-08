

/**
 * RightNowSyncService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package com.rn.supera.ws.typed.wsdl;

    /*
     *  RightNowSyncService java interface
     */

    public interface RightNowSyncService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getValuesForNamedID49
                
                    * @param clientInfoHeader52
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.base.NamedID[] getValuesForNamedID(

                        java.lang.String packageName50,java.lang.String fieldName51,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader52)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getValuesForNamedID49
            
                * @param clientInfoHeader52
            
          */
        public void startgetValuesForNamedID(

            java.lang.String packageName50,java.lang.String fieldName51,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader52,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param executeMarketingFlow55
                
                    * @param clientInfoHeader59
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.ExecuteMarketingFlowResponseMsg executeMarketingFlow(

                        com.rn.supera.ws.typed.base.ID contactID56,com.rn.supera.ws.typed.base.ID campaignID57,java.lang.String entryPoint58,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader59)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param executeMarketingFlow55
            
                * @param clientInfoHeader59
            
          */
        public void startexecuteMarketingFlow(

            com.rn.supera.ws.typed.base.ID contactID56,com.rn.supera.ws.typed.base.ID campaignID57,java.lang.String entryPoint58,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader59,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param sendMailingToContact61
                
                    * @param clientInfoHeader68
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.SendMailingToContactResponseMsg sendMailingToContact(

                        com.rn.supera.ws.typed.base.ID contactID62,com.rn.supera.ws.typed.base.ID mailingID63,java.util.Calendar scheduledTime64,com.rn.supera.ws.typed.base.ID incidentID65,com.rn.supera.ws.typed.base.ID opportunityID66,com.rn.supera.ws.typed.base.ID chatID67,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader68)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sendMailingToContact61
            
                * @param clientInfoHeader68
            
          */
        public void startsendMailingToContact(

            com.rn.supera.ws.typed.base.ID contactID62,com.rn.supera.ws.typed.base.ID mailingID63,java.util.Calendar scheduledTime64,com.rn.supera.ws.typed.base.ID incidentID65,com.rn.supera.ws.typed.base.ID opportunityID66,com.rn.supera.ws.typed.base.ID chatID67,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader68,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param batch70
                
                    * @param clientInfoHeader72
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.BatchResponseItem[] batch(

                        com.rn.supera.ws.typed.messages.BatchRequestItem[] batchRequestItem71,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader72)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param batch70
            
                * @param clientInfoHeader72
            
          */
        public void startbatch(

            com.rn.supera.ws.typed.messages.BatchRequestItem[] batchRequestItem71,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader72,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaDataForOperation75
                
                    * @param clientInfoHeader79
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.metadata.MetaDataClassOperation[] getMetaDataForOperation(

                        java.lang.String[] operation76,java.lang.String[] className77,com.rn.supera.ws.typed.generic.RNObjectType[] qualifiedClassName78,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader79)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaDataForOperation75
            
                * @param clientInfoHeader79
            
          */
        public void startgetMetaDataForOperation(

            java.lang.String[] operation76,java.lang.String[] className77,com.rn.supera.ws.typed.generic.RNObjectType[] qualifiedClassName78,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader79,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param create82
                
                    * @param clientInfoHeader85
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail : 
         */

         
                     public com.rn.supera.ws.typed.messages.RNObjectsResult create(

                        com.rn.supera.ws.typed.base.RNObject[] rNObjects83,com.rn.supera.ws.typed.messages.CreateProcessingOptions processingOptions84,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader85)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param create82
            
                * @param clientInfoHeader85
            
          */
        public void startcreate(

            com.rn.supera.ws.typed.base.RNObject[] rNObjects83,com.rn.supera.ws.typed.messages.CreateProcessingOptions processingOptions84,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader85,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param destroy88
                
                    * @param clientInfoHeader91
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail : 
         */

         
                     public com.rn.supera.ws.typed.messages.DestroyResponseMsg destroy(

                        com.rn.supera.ws.typed.base.RNObject[] rNObjects89,com.rn.supera.ws.typed.messages.DestroyProcessingOptions processingOptions90,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader91)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param destroy88
            
                * @param clientInfoHeader91
            
          */
        public void startdestroy(

            com.rn.supera.ws.typed.base.RNObject[] rNObjects89,com.rn.supera.ws.typed.messages.DestroyProcessingOptions processingOptions90,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader91,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param transferSubObjects93
                
                    * @param clientInfoHeader96
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.TransferSubObjectsResponseMsg transferSubObjects(

                        com.rn.supera.ws.typed.base.RNObject destinationRNObject94,com.rn.supera.ws.typed.base.RNObject[] sourceRNObjects95,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader96)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param transferSubObjects93
            
                * @param clientInfoHeader96
            
          */
        public void starttransferSubObjects(

            com.rn.supera.ws.typed.base.RNObject destinationRNObject94,com.rn.supera.ws.typed.base.RNObject[] sourceRNObjects95,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader96,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param get98
                
                    * @param clientInfoHeader101
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail : 
         */

         
                     public com.rn.supera.ws.typed.messages.RNObjectsResult get(

                        com.rn.supera.ws.typed.base.RNObject[] rNObjects99,com.rn.supera.ws.typed.messages.GetProcessingOptions processingOptions100,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader101)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param get98
            
                * @param clientInfoHeader101
            
          */
        public void startget(

            com.rn.supera.ws.typed.base.RNObject[] rNObjects99,com.rn.supera.ws.typed.messages.GetProcessingOptions processingOptions100,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader101,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getValuesForNamedIDHierarchy104
                
                    * @param clientInfoHeader106
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.base.NamedIDWithParent[] getValuesForNamedIDHierarchy(

                        java.lang.String fieldName105,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader106)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getValuesForNamedIDHierarchy104
            
                * @param clientInfoHeader106
            
          */
        public void startgetValuesForNamedIDHierarchy(

            java.lang.String fieldName105,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader106,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getFileData109
                
                    * @param clientInfoHeader113
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public javax.activation.DataHandler getFileData(

                        com.rn.supera.ws.typed.base.RNObject rNObject110,com.rn.supera.ws.typed.base.ID fileID111,boolean disableMTOM112,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader113)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getFileData109
            
                * @param clientInfoHeader113
            
          */
        public void startgetFileData(

            com.rn.supera.ws.typed.base.RNObject rNObject110,com.rn.supera.ws.typed.base.ID fileID111,boolean disableMTOM112,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader113,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param resetContactPassword116
                
                    * @param clientInfoHeader118
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.ResetContactPasswordResponseMsg resetContactPassword(

                        com.rn.supera.ws.typed.base.ID contactID117,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader118)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param resetContactPassword116
            
                * @param clientInfoHeader118
            
          */
        public void startresetContactPassword(

            com.rn.supera.ws.typed.base.ID contactID117,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader118,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param queryObjects120
                
                    * @param clientInfoHeader124
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.QueryResultData[] queryObjects(

                        java.lang.String query121,com.rn.supera.ws.typed.base.RNObject[] objectTemplates122,int pageSize123,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader124)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queryObjects120
            
                * @param clientInfoHeader124
            
          */
        public void startqueryObjects(

            java.lang.String query121,com.rn.supera.ws.typed.base.RNObject[] objectTemplates122,int pageSize123,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader124,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param convertGenericToObject127
                
                    * @param clientInfoHeader129
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.RNObjectsResult convertGenericToObject(

                        com.rn.supera.ws.typed.base.RNObject[] rNObjects128,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader129)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param convertGenericToObject127
            
                * @param clientInfoHeader129
            
          */
        public void startconvertGenericToObject(

            com.rn.supera.ws.typed.base.RNObject[] rNObjects128,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader129,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaData132
                
                    * @param clientInfoHeader133
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.metadata.MetaDataClass[] getMetaData(

                        com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader133)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaData132
            
                * @param clientInfoHeader133
            
          */
        public void startgetMetaData(

            com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader133,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param runAnalyticsReport136
                
                    * @param clientInfoHeader143
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.RunAnalyticsReportResponseMsg runAnalyticsReport(

                        com.rn.supera.ws.typed.objects.AnalyticsReport analyticsReport137,int limit138,int start139,java.lang.String delimiter140,boolean returnRawResult141,boolean disableMTOM142,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader143)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param runAnalyticsReport136
            
                * @param clientInfoHeader143
            
          */
        public void startrunAnalyticsReport(

            com.rn.supera.ws.typed.objects.AnalyticsReport analyticsReport137,int limit138,int start139,java.lang.String delimiter140,boolean returnRawResult141,boolean disableMTOM142,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader143,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getSubscribableObjects147
                
                    * @param clientInfoHeader148
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.SubscribableObject[] getSubscribableObjects(

                        com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader148)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getSubscribableObjects147
            
                * @param clientInfoHeader148
            
          */
        public void startgetSubscribableObjects(

            com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader148,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param update151
                
                    * @param clientInfoHeader154
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail : 
         */

         
                     public com.rn.supera.ws.typed.messages.UpdateResponseMsg update(

                        com.rn.supera.ws.typed.base.RNObject[] rNObjects152,com.rn.supera.ws.typed.messages.UpdateProcessingOptions processingOptions153,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader154)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFaultDetail;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param update151
            
                * @param clientInfoHeader154
            
          */
        public void startupdate(

            com.rn.supera.ws.typed.base.RNObject[] rNObjects152,com.rn.supera.ws.typed.messages.UpdateProcessingOptions processingOptions153,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader154,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param queryCSV156
                
                    * @param clientInfoHeader162
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.QueryCSVResponseMsg queryCSV(

                        java.lang.String query157,int pageSize158,java.lang.String delimiter159,boolean returnRawResult160,boolean disableMTOM161,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader162)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queryCSV156
            
                * @param clientInfoHeader162
            
          */
        public void startqueryCSV(

            java.lang.String query157,int pageSize158,java.lang.String delimiter159,boolean returnRawResult160,boolean disableMTOM161,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader162,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaDataLastChangeTime166
                
                    * @param clientInfoHeader167
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public java.util.Calendar getMetaDataLastChangeTime(

                        com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader167)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaDataLastChangeTime166
            
                * @param clientInfoHeader167
            
          */
        public void startgetMetaDataLastChangeTime(

            com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader167,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getPrimaryClassNames170
                
                    * @param clientInfoHeader171
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.generic.RNObjectType[] getPrimaryClassNames(

                        com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader171)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getPrimaryClassNames170
            
                * @param clientInfoHeader171
            
          */
        public void startgetPrimaryClassNames(

            com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader171,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param convertObjectToGeneric174
                
                    * @param clientInfoHeader176
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.messages.RNObjectsResult convertObjectToGeneric(

                        com.rn.supera.ws.typed.base.RNObject[] rNObjects175,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader176)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param convertObjectToGeneric174
            
                * @param clientInfoHeader176
            
          */
        public void startconvertObjectToGeneric(

            com.rn.supera.ws.typed.base.RNObject[] rNObjects175,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader176,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaDataForClass179
                
                    * @param clientInfoHeader183
                
             * @throws com.rn.supera.ws.typed.wsdl.RequestErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault : 
             * @throws com.rn.supera.ws.typed.wsdl.ServerErrorFault : 
         */

         
                     public com.rn.supera.ws.typed.metadata.MetaDataClass[] getMetaDataForClass(

                        java.lang.String[] className180,com.rn.supera.ws.typed.generic.RNObjectType[] qualifiedClassName181,java.lang.String[] metaDataLink182,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader183)
                        throws java.rmi.RemoteException
             
          ,com.rn.supera.ws.typed.wsdl.RequestErrorFault
          ,com.rn.supera.ws.typed.wsdl.UnexpectedErrorFault
          ,com.rn.supera.ws.typed.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaDataForClass179
            
                * @param clientInfoHeader183
            
          */
        public void startgetMetaDataForClass(

            java.lang.String[] className180,com.rn.supera.ws.typed.generic.RNObjectType[] qualifiedClassName181,java.lang.String[] metaDataLink182,com.rn.supera.ws.typed.messages.ClientInfoHeader clientInfoHeader183,
                

            final com.rn.supera.ws.typed.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    