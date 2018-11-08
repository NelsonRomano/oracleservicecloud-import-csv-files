
/**
 * BatchRequestItemChoice_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rn.supera.ws.typed.messages;
            

            /**
            *  BatchRequestItemChoice_type0 bean class
            */
        
        public  class BatchRequestItemChoice_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BatchRequestItemChoice_type0
                Namespace URI = urn:messages.ws.rightnow.com/v1_3
                Namespace Prefix = ns7
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:messages.ws.rightnow.com/v1_3")){
                return "ns7";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localCreateMsgTracker = false;
                
                   localGetMsgTracker = false;
                
                   localUpdateMsgTracker = false;
                
                   localDestroyMsgTracker = false;
                
                   localQueryCSVMsgTracker = false;
                
                   localQueryObjectsMsgTracker = false;
                
                   localExecuteMarketingFlowMsgTracker = false;
                
                   localGetFileDataMsgTracker = false;
                
                   localResetContactPasswordMsgTracker = false;
                
                   localSendMailingToContactMsgTracker = false;
                
                   localTransferSubObjectsMsgTracker = false;
                
                   localGetMetaDataMsgTracker = false;
                
                   localGetMetaDataForClassMsgTracker = false;
                
                   localGetMetaDataForOperationMsgTracker = false;
                
                   localGetMetaDataLastChangeTimeMsgTracker = false;
                
                   localGetPrimaryClassNamesMsgTracker = false;
                
                   localGetValuesForNamedIDMsgTracker = false;
                
                   localGetValuesForNamedIDHierarchyMsgTracker = false;
                
                   localRunAnalyticsReportMsgTracker = false;
                
            }
        

                        /**
                        * field for CreateMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.CreateMsg localCreateMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreateMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.CreateMsg
                           */
                           public  com.rn.supera.ws.typed.messages.CreateMsg getCreateMsg(){
                               return localCreateMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreateMsg
                               */
                               public void setCreateMsg(com.rn.supera.ws.typed.messages.CreateMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCreateMsgTracker = true;
                                       } else {
                                          localCreateMsgTracker = false;
                                              
                                       }
                                   
                                            this.localCreateMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetMsg localGetMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetMsg getGetMsg(){
                               return localGetMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMsg
                               */
                               public void setGetMsg(com.rn.supera.ws.typed.messages.GetMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetMsgTracker = true;
                                       } else {
                                          localGetMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetMsg=param;
                                    

                               }
                            

                        /**
                        * field for UpdateMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.UpdateMsg localUpdateMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdateMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.UpdateMsg
                           */
                           public  com.rn.supera.ws.typed.messages.UpdateMsg getUpdateMsg(){
                               return localUpdateMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateMsg
                               */
                               public void setUpdateMsg(com.rn.supera.ws.typed.messages.UpdateMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUpdateMsgTracker = true;
                                       } else {
                                          localUpdateMsgTracker = false;
                                              
                                       }
                                   
                                            this.localUpdateMsg=param;
                                    

                               }
                            

                        /**
                        * field for DestroyMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.DestroyMsg localDestroyMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestroyMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.DestroyMsg
                           */
                           public  com.rn.supera.ws.typed.messages.DestroyMsg getDestroyMsg(){
                               return localDestroyMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestroyMsg
                               */
                               public void setDestroyMsg(com.rn.supera.ws.typed.messages.DestroyMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDestroyMsgTracker = true;
                                       } else {
                                          localDestroyMsgTracker = false;
                                              
                                       }
                                   
                                            this.localDestroyMsg=param;
                                    

                               }
                            

                        /**
                        * field for QueryCSVMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.QueryMsg localQueryCSVMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryCSVMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.QueryMsg
                           */
                           public  com.rn.supera.ws.typed.messages.QueryMsg getQueryCSVMsg(){
                               return localQueryCSVMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryCSVMsg
                               */
                               public void setQueryCSVMsg(com.rn.supera.ws.typed.messages.QueryMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localQueryCSVMsgTracker = true;
                                       } else {
                                          localQueryCSVMsgTracker = false;
                                              
                                       }
                                   
                                            this.localQueryCSVMsg=param;
                                    

                               }
                            

                        /**
                        * field for QueryObjectsMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.QueryObjectsMsg localQueryObjectsMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryObjectsMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.QueryObjectsMsg
                           */
                           public  com.rn.supera.ws.typed.messages.QueryObjectsMsg getQueryObjectsMsg(){
                               return localQueryObjectsMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryObjectsMsg
                               */
                               public void setQueryObjectsMsg(com.rn.supera.ws.typed.messages.QueryObjectsMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localQueryObjectsMsgTracker = true;
                                       } else {
                                          localQueryObjectsMsgTracker = false;
                                              
                                       }
                                   
                                            this.localQueryObjectsMsg=param;
                                    

                               }
                            

                        /**
                        * field for ExecuteMarketingFlowMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg localExecuteMarketingFlowMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExecuteMarketingFlowMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg
                           */
                           public  com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg getExecuteMarketingFlowMsg(){
                               return localExecuteMarketingFlowMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExecuteMarketingFlowMsg
                               */
                               public void setExecuteMarketingFlowMsg(com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExecuteMarketingFlowMsgTracker = true;
                                       } else {
                                          localExecuteMarketingFlowMsgTracker = false;
                                              
                                       }
                                   
                                            this.localExecuteMarketingFlowMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetFileDataMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetFileDataMsg localGetFileDataMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetFileDataMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetFileDataMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetFileDataMsg getGetFileDataMsg(){
                               return localGetFileDataMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetFileDataMsg
                               */
                               public void setGetFileDataMsg(com.rn.supera.ws.typed.messages.GetFileDataMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetFileDataMsgTracker = true;
                                       } else {
                                          localGetFileDataMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetFileDataMsg=param;
                                    

                               }
                            

                        /**
                        * field for ResetContactPasswordMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.ResetContactPasswordMsg localResetContactPasswordMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResetContactPasswordMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.ResetContactPasswordMsg
                           */
                           public  com.rn.supera.ws.typed.messages.ResetContactPasswordMsg getResetContactPasswordMsg(){
                               return localResetContactPasswordMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResetContactPasswordMsg
                               */
                               public void setResetContactPasswordMsg(com.rn.supera.ws.typed.messages.ResetContactPasswordMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localResetContactPasswordMsgTracker = true;
                                       } else {
                                          localResetContactPasswordMsgTracker = false;
                                              
                                       }
                                   
                                            this.localResetContactPasswordMsg=param;
                                    

                               }
                            

                        /**
                        * field for SendMailingToContactMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.SendMailingToContactMsg localSendMailingToContactMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSendMailingToContactMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.SendMailingToContactMsg
                           */
                           public  com.rn.supera.ws.typed.messages.SendMailingToContactMsg getSendMailingToContactMsg(){
                               return localSendMailingToContactMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendMailingToContactMsg
                               */
                               public void setSendMailingToContactMsg(com.rn.supera.ws.typed.messages.SendMailingToContactMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSendMailingToContactMsgTracker = true;
                                       } else {
                                          localSendMailingToContactMsgTracker = false;
                                              
                                       }
                                   
                                            this.localSendMailingToContactMsg=param;
                                    

                               }
                            

                        /**
                        * field for TransferSubObjectsMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.TransferSubObjectsMsg localTransferSubObjectsMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransferSubObjectsMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.TransferSubObjectsMsg
                           */
                           public  com.rn.supera.ws.typed.messages.TransferSubObjectsMsg getTransferSubObjectsMsg(){
                               return localTransferSubObjectsMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransferSubObjectsMsg
                               */
                               public void setTransferSubObjectsMsg(com.rn.supera.ws.typed.messages.TransferSubObjectsMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTransferSubObjectsMsgTracker = true;
                                       } else {
                                          localTransferSubObjectsMsgTracker = false;
                                              
                                       }
                                   
                                            this.localTransferSubObjectsMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetMetaDataMsg localGetMetaDataMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetMetaDataMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetMetaDataMsg getGetMetaDataMsg(){
                               return localGetMetaDataMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataMsg
                               */
                               public void setGetMetaDataMsg(com.rn.supera.ws.typed.messages.GetMetaDataMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetMetaDataMsgTracker = true;
                                       } else {
                                          localGetMetaDataMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetMetaDataMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataForClassMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg localGetMetaDataForClassMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataForClassMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg getGetMetaDataForClassMsg(){
                               return localGetMetaDataForClassMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataForClassMsg
                               */
                               public void setGetMetaDataForClassMsg(com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetMetaDataForClassMsgTracker = true;
                                       } else {
                                          localGetMetaDataForClassMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetMetaDataForClassMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataForOperationMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg localGetMetaDataForOperationMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataForOperationMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg getGetMetaDataForOperationMsg(){
                               return localGetMetaDataForOperationMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataForOperationMsg
                               */
                               public void setGetMetaDataForOperationMsg(com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetMetaDataForOperationMsgTracker = true;
                                       } else {
                                          localGetMetaDataForOperationMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetMetaDataForOperationMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataLastChangeTimeMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg localGetMetaDataLastChangeTimeMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataLastChangeTimeMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg getGetMetaDataLastChangeTimeMsg(){
                               return localGetMetaDataLastChangeTimeMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataLastChangeTimeMsg
                               */
                               public void setGetMetaDataLastChangeTimeMsg(com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetMetaDataLastChangeTimeMsgTracker = true;
                                       } else {
                                          localGetMetaDataLastChangeTimeMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetMetaDataLastChangeTimeMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetPrimaryClassNamesMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg localGetPrimaryClassNamesMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetPrimaryClassNamesMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg getGetPrimaryClassNamesMsg(){
                               return localGetPrimaryClassNamesMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetPrimaryClassNamesMsg
                               */
                               public void setGetPrimaryClassNamesMsg(com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetPrimaryClassNamesMsgTracker = true;
                                       } else {
                                          localGetPrimaryClassNamesMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetPrimaryClassNamesMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetValuesForNamedIDMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg localGetValuesForNamedIDMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetValuesForNamedIDMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg getGetValuesForNamedIDMsg(){
                               return localGetValuesForNamedIDMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetValuesForNamedIDMsg
                               */
                               public void setGetValuesForNamedIDMsg(com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetValuesForNamedIDMsgTracker = true;
                                       } else {
                                          localGetValuesForNamedIDMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetValuesForNamedIDMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetValuesForNamedIDHierarchyMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg localGetValuesForNamedIDHierarchyMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetValuesForNamedIDHierarchyMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg
                           */
                           public  com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg getGetValuesForNamedIDHierarchyMsg(){
                               return localGetValuesForNamedIDHierarchyMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetValuesForNamedIDHierarchyMsg
                               */
                               public void setGetValuesForNamedIDHierarchyMsg(com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGetValuesForNamedIDHierarchyMsgTracker = true;
                                       } else {
                                          localGetValuesForNamedIDHierarchyMsgTracker = false;
                                              
                                       }
                                   
                                            this.localGetValuesForNamedIDHierarchyMsg=param;
                                    

                               }
                            

                        /**
                        * field for RunAnalyticsReportMsg
                        */

                        
                                    protected com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg localRunAnalyticsReportMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRunAnalyticsReportMsgTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg
                           */
                           public  com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg getRunAnalyticsReportMsg(){
                               return localRunAnalyticsReportMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RunAnalyticsReportMsg
                               */
                               public void setRunAnalyticsReportMsg(com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg param){
                            
                                clearAllSettingTrackers();
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRunAnalyticsReportMsgTracker = true;
                                       } else {
                                          localRunAnalyticsReportMsgTracker = false;
                                              
                                       }
                                   
                                            this.localRunAnalyticsReportMsg=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       BatchRequestItemChoice_type0.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:messages.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":BatchRequestItemChoice_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BatchRequestItemChoice_type0",
                           xmlWriter);
                   }

               
                   }
                if (localCreateMsgTracker){
                                            if (localCreateMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreateMsg cannot be null!!");
                                            }
                                           localCreateMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","CreateMsg"),
                                               factory,xmlWriter);
                                        } if (localGetMsgTracker){
                                            if (localGetMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMsg cannot be null!!");
                                            }
                                           localGetMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMsg"),
                                               factory,xmlWriter);
                                        } if (localUpdateMsgTracker){
                                            if (localUpdateMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UpdateMsg cannot be null!!");
                                            }
                                           localUpdateMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","UpdateMsg"),
                                               factory,xmlWriter);
                                        } if (localDestroyMsgTracker){
                                            if (localDestroyMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DestroyMsg cannot be null!!");
                                            }
                                           localDestroyMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","DestroyMsg"),
                                               factory,xmlWriter);
                                        } if (localQueryCSVMsgTracker){
                                            if (localQueryCSVMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("QueryCSVMsg cannot be null!!");
                                            }
                                           localQueryCSVMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","QueryCSVMsg"),
                                               factory,xmlWriter);
                                        } if (localQueryObjectsMsgTracker){
                                            if (localQueryObjectsMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("QueryObjectsMsg cannot be null!!");
                                            }
                                           localQueryObjectsMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","QueryObjectsMsg"),
                                               factory,xmlWriter);
                                        } if (localExecuteMarketingFlowMsgTracker){
                                            if (localExecuteMarketingFlowMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExecuteMarketingFlowMsg cannot be null!!");
                                            }
                                           localExecuteMarketingFlowMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","ExecuteMarketingFlowMsg"),
                                               factory,xmlWriter);
                                        } if (localGetFileDataMsgTracker){
                                            if (localGetFileDataMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetFileDataMsg cannot be null!!");
                                            }
                                           localGetFileDataMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetFileDataMsg"),
                                               factory,xmlWriter);
                                        } if (localResetContactPasswordMsgTracker){
                                            if (localResetContactPasswordMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResetContactPasswordMsg cannot be null!!");
                                            }
                                           localResetContactPasswordMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","ResetContactPasswordMsg"),
                                               factory,xmlWriter);
                                        } if (localSendMailingToContactMsgTracker){
                                            if (localSendMailingToContactMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SendMailingToContactMsg cannot be null!!");
                                            }
                                           localSendMailingToContactMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","SendMailingToContactMsg"),
                                               factory,xmlWriter);
                                        } if (localTransferSubObjectsMsgTracker){
                                            if (localTransferSubObjectsMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TransferSubObjectsMsg cannot be null!!");
                                            }
                                           localTransferSubObjectsMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","TransferSubObjectsMsg"),
                                               factory,xmlWriter);
                                        } if (localGetMetaDataMsgTracker){
                                            if (localGetMetaDataMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataMsg cannot be null!!");
                                            }
                                           localGetMetaDataMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataMsg"),
                                               factory,xmlWriter);
                                        } if (localGetMetaDataForClassMsgTracker){
                                            if (localGetMetaDataForClassMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataForClassMsg cannot be null!!");
                                            }
                                           localGetMetaDataForClassMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataForClassMsg"),
                                               factory,xmlWriter);
                                        } if (localGetMetaDataForOperationMsgTracker){
                                            if (localGetMetaDataForOperationMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataForOperationMsg cannot be null!!");
                                            }
                                           localGetMetaDataForOperationMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataForOperationMsg"),
                                               factory,xmlWriter);
                                        } if (localGetMetaDataLastChangeTimeMsgTracker){
                                            if (localGetMetaDataLastChangeTimeMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataLastChangeTimeMsg cannot be null!!");
                                            }
                                           localGetMetaDataLastChangeTimeMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataLastChangeTimeMsg"),
                                               factory,xmlWriter);
                                        } if (localGetPrimaryClassNamesMsgTracker){
                                            if (localGetPrimaryClassNamesMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetPrimaryClassNamesMsg cannot be null!!");
                                            }
                                           localGetPrimaryClassNamesMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetPrimaryClassNamesMsg"),
                                               factory,xmlWriter);
                                        } if (localGetValuesForNamedIDMsgTracker){
                                            if (localGetValuesForNamedIDMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDMsg cannot be null!!");
                                            }
                                           localGetValuesForNamedIDMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetValuesForNamedIDMsg"),
                                               factory,xmlWriter);
                                        } if (localGetValuesForNamedIDHierarchyMsgTracker){
                                            if (localGetValuesForNamedIDHierarchyMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDHierarchyMsg cannot be null!!");
                                            }
                                           localGetValuesForNamedIDHierarchyMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetValuesForNamedIDHierarchyMsg"),
                                               factory,xmlWriter);
                                        } if (localRunAnalyticsReportMsgTracker){
                                            if (localRunAnalyticsReportMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RunAnalyticsReportMsg cannot be null!!");
                                            }
                                           localRunAnalyticsReportMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","RunAnalyticsReportMsg"),
                                               factory,xmlWriter);
                                        }

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCreateMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "CreateMsg"));
                            
                            
                                    if (localCreateMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreateMsg cannot be null!!");
                                    }
                                    elementList.add(localCreateMsg);
                                } if (localGetMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMsg"));
                            
                            
                                    if (localGetMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMsg);
                                } if (localUpdateMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "UpdateMsg"));
                            
                            
                                    if (localUpdateMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("UpdateMsg cannot be null!!");
                                    }
                                    elementList.add(localUpdateMsg);
                                } if (localDestroyMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "DestroyMsg"));
                            
                            
                                    if (localDestroyMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("DestroyMsg cannot be null!!");
                                    }
                                    elementList.add(localDestroyMsg);
                                } if (localQueryCSVMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "QueryCSVMsg"));
                            
                            
                                    if (localQueryCSVMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("QueryCSVMsg cannot be null!!");
                                    }
                                    elementList.add(localQueryCSVMsg);
                                } if (localQueryObjectsMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "QueryObjectsMsg"));
                            
                            
                                    if (localQueryObjectsMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("QueryObjectsMsg cannot be null!!");
                                    }
                                    elementList.add(localQueryObjectsMsg);
                                } if (localExecuteMarketingFlowMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "ExecuteMarketingFlowMsg"));
                            
                            
                                    if (localExecuteMarketingFlowMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExecuteMarketingFlowMsg cannot be null!!");
                                    }
                                    elementList.add(localExecuteMarketingFlowMsg);
                                } if (localGetFileDataMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetFileDataMsg"));
                            
                            
                                    if (localGetFileDataMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetFileDataMsg cannot be null!!");
                                    }
                                    elementList.add(localGetFileDataMsg);
                                } if (localResetContactPasswordMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "ResetContactPasswordMsg"));
                            
                            
                                    if (localResetContactPasswordMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResetContactPasswordMsg cannot be null!!");
                                    }
                                    elementList.add(localResetContactPasswordMsg);
                                } if (localSendMailingToContactMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "SendMailingToContactMsg"));
                            
                            
                                    if (localSendMailingToContactMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("SendMailingToContactMsg cannot be null!!");
                                    }
                                    elementList.add(localSendMailingToContactMsg);
                                } if (localTransferSubObjectsMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "TransferSubObjectsMsg"));
                            
                            
                                    if (localTransferSubObjectsMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("TransferSubObjectsMsg cannot be null!!");
                                    }
                                    elementList.add(localTransferSubObjectsMsg);
                                } if (localGetMetaDataMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMetaDataMsg"));
                            
                            
                                    if (localGetMetaDataMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataMsg);
                                } if (localGetMetaDataForClassMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMetaDataForClassMsg"));
                            
                            
                                    if (localGetMetaDataForClassMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataForClassMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataForClassMsg);
                                } if (localGetMetaDataForOperationMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMetaDataForOperationMsg"));
                            
                            
                                    if (localGetMetaDataForOperationMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataForOperationMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataForOperationMsg);
                                } if (localGetMetaDataLastChangeTimeMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMetaDataLastChangeTimeMsg"));
                            
                            
                                    if (localGetMetaDataLastChangeTimeMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataLastChangeTimeMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataLastChangeTimeMsg);
                                } if (localGetPrimaryClassNamesMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetPrimaryClassNamesMsg"));
                            
                            
                                    if (localGetPrimaryClassNamesMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetPrimaryClassNamesMsg cannot be null!!");
                                    }
                                    elementList.add(localGetPrimaryClassNamesMsg);
                                } if (localGetValuesForNamedIDMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetValuesForNamedIDMsg"));
                            
                            
                                    if (localGetValuesForNamedIDMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDMsg cannot be null!!");
                                    }
                                    elementList.add(localGetValuesForNamedIDMsg);
                                } if (localGetValuesForNamedIDHierarchyMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetValuesForNamedIDHierarchyMsg"));
                            
                            
                                    if (localGetValuesForNamedIDHierarchyMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDHierarchyMsg cannot be null!!");
                                    }
                                    elementList.add(localGetValuesForNamedIDHierarchyMsg);
                                } if (localRunAnalyticsReportMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "RunAnalyticsReportMsg"));
                            
                            
                                    if (localRunAnalyticsReportMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("RunAnalyticsReportMsg cannot be null!!");
                                    }
                                    elementList.add(localRunAnalyticsReportMsg);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static BatchRequestItemChoice_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BatchRequestItemChoice_type0 object =
                new BatchRequestItemChoice_type0();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","CreateMsg").equals(reader.getName())){
                                
                                                object.setCreateMsg(com.rn.supera.ws.typed.messages.CreateMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMsg").equals(reader.getName())){
                                
                                                object.setGetMsg(com.rn.supera.ws.typed.messages.GetMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","UpdateMsg").equals(reader.getName())){
                                
                                                object.setUpdateMsg(com.rn.supera.ws.typed.messages.UpdateMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","DestroyMsg").equals(reader.getName())){
                                
                                                object.setDestroyMsg(com.rn.supera.ws.typed.messages.DestroyMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","QueryCSVMsg").equals(reader.getName())){
                                
                                                object.setQueryCSVMsg(com.rn.supera.ws.typed.messages.QueryMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","QueryObjectsMsg").equals(reader.getName())){
                                
                                                object.setQueryObjectsMsg(com.rn.supera.ws.typed.messages.QueryObjectsMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","ExecuteMarketingFlowMsg").equals(reader.getName())){
                                
                                                object.setExecuteMarketingFlowMsg(com.rn.supera.ws.typed.messages.ExecuteMarketingFlowMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetFileDataMsg").equals(reader.getName())){
                                
                                                object.setGetFileDataMsg(com.rn.supera.ws.typed.messages.GetFileDataMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","ResetContactPasswordMsg").equals(reader.getName())){
                                
                                                object.setResetContactPasswordMsg(com.rn.supera.ws.typed.messages.ResetContactPasswordMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","SendMailingToContactMsg").equals(reader.getName())){
                                
                                                object.setSendMailingToContactMsg(com.rn.supera.ws.typed.messages.SendMailingToContactMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","TransferSubObjectsMsg").equals(reader.getName())){
                                
                                                object.setTransferSubObjectsMsg(com.rn.supera.ws.typed.messages.TransferSubObjectsMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataMsg(com.rn.supera.ws.typed.messages.GetMetaDataMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataForClassMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataForClassMsg(com.rn.supera.ws.typed.messages.GetMetaDataForClassMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataForOperationMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataForOperationMsg(com.rn.supera.ws.typed.messages.GetMetaDataForOperationMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataLastChangeTimeMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataLastChangeTimeMsg(com.rn.supera.ws.typed.messages.GetMetaDataLastChangeTimeMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetPrimaryClassNamesMsg").equals(reader.getName())){
                                
                                                object.setGetPrimaryClassNamesMsg(com.rn.supera.ws.typed.messages.GetPrimaryClassNamesMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetValuesForNamedIDMsg").equals(reader.getName())){
                                
                                                object.setGetValuesForNamedIDMsg(com.rn.supera.ws.typed.messages.GetValuesForNamedIDMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetValuesForNamedIDHierarchyMsg").equals(reader.getName())){
                                
                                                object.setGetValuesForNamedIDHierarchyMsg(com.rn.supera.ws.typed.messages.GetValuesForNamedIDHierarchyMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","RunAnalyticsReportMsg").equals(reader.getName())){
                                
                                                object.setRunAnalyticsReportMsg(com.rn.supera.ws.typed.messages.RunAnalyticsReportMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          