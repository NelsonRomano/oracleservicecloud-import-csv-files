
/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rn.supera.ws.typed.objects;
            

            /**
            *  Task bean class
            */
        
        public  class Task extends com.rn.supera.ws.typed.base.RNObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Task
                Namespace URI = urn:objects.ws.rightnow.com/v1_3
                Namespace Prefix = ns4
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:objects.ws.rightnow.com/v1_3")){
                return "ns4";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for AssignedToAccount
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedIDHierarchy localAssignedToAccount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssignedToAccountTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedIDHierarchy
                           */
                           public  com.rn.supera.ws.typed.base.NamedIDHierarchy getAssignedToAccount(){
                               return localAssignedToAccount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssignedToAccount
                               */
                               public void setAssignedToAccount(com.rn.supera.ws.typed.base.NamedIDHierarchy param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAssignedToAccountTracker = true;
                                       } else {
                                          localAssignedToAccountTracker = true;
                                              
                                       }
                                   
                                            this.localAssignedToAccount=param;
                                    

                               }
                            

                        /**
                        * field for CompletedTime
                        */

                        
                                    protected java.util.Calendar localCompletedTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCompletedTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCompletedTime(){
                               return localCompletedTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CompletedTime
                               */
                               public void setCompletedTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCompletedTimeTracker = true;
                                       } else {
                                          localCompletedTimeTracker = true;
                                              
                                       }
                                   
                                            this.localCompletedTime=param;
                                    

                               }
                            

                        /**
                        * field for Contact
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localContact ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContactTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getContact(){
                               return localContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Contact
                               */
                               public void setContact(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localContactTracker = true;
                                       } else {
                                          localContactTracker = true;
                                              
                                       }
                                   
                                            this.localContact=param;
                                    

                               }
                            

                        /**
                        * field for CustomFields
                        */

                        
                                    protected com.rn.supera.ws.typed.generic.GenericObject localCustomFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.generic.GenericObject
                           */
                           public  com.rn.supera.ws.typed.generic.GenericObject getCustomFields(){
                               return localCustomFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomFields
                               */
                               public void setCustomFields(com.rn.supera.ws.typed.generic.GenericObject param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCustomFieldsTracker = true;
                                       } else {
                                          localCustomFieldsTracker = false;
                                              
                                       }
                                   
                                            this.localCustomFields=param;
                                    

                               }
                            

                        /**
                        * field for DueTime
                        */

                        
                                    protected java.util.Calendar localDueTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDueTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getDueTime(){
                               return localDueTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DueTime
                               */
                               public void setDueTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDueTimeTracker = true;
                                       } else {
                                          localDueTimeTracker = true;
                                              
                                       }
                                   
                                            this.localDueTime=param;
                                    

                               }
                            

                        /**
                        * field for FileAttachments
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.FileAttachmentCommonList localFileAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.FileAttachmentCommonList
                           */
                           public  com.rn.supera.ws.typed.objects.FileAttachmentCommonList getFileAttachments(){
                               return localFileAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileAttachments
                               */
                               public void setFileAttachments(com.rn.supera.ws.typed.objects.FileAttachmentCommonList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFileAttachmentsTracker = true;
                                       } else {
                                          localFileAttachmentsTracker = true;
                                              
                                       }
                                   
                                            this.localFileAttachments=param;
                                    

                               }
                            

                        /**
                        * field for Inherit
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.InheritOptions localInherit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInheritTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.InheritOptions
                           */
                           public  com.rn.supera.ws.typed.objects.InheritOptions getInherit(){
                               return localInherit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Inherit
                               */
                               public void setInherit(com.rn.supera.ws.typed.objects.InheritOptions param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localInheritTracker = true;
                                       } else {
                                          localInheritTracker = false;
                                              
                                       }
                                   
                                            this.localInherit=param;
                                    

                               }
                            

                        /**
                        * field for MarketingSettings
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.TaskMarketingSettings localMarketingSettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMarketingSettingsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.TaskMarketingSettings
                           */
                           public  com.rn.supera.ws.typed.objects.TaskMarketingSettings getMarketingSettings(){
                               return localMarketingSettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingSettings
                               */
                               public void setMarketingSettings(com.rn.supera.ws.typed.objects.TaskMarketingSettings param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMarketingSettingsTracker = true;
                                       } else {
                                          localMarketingSettingsTracker = false;
                                              
                                       }
                                   
                                            this.localMarketingSettings=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNameTracker = true;
                                       } else {
                                          localNameTracker = false;
                                              
                                       }
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Notes
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.NoteList localNotes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNotesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.NoteList
                           */
                           public  com.rn.supera.ws.typed.objects.NoteList getNotes(){
                               return localNotes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Notes
                               */
                               public void setNotes(com.rn.supera.ws.typed.objects.NoteList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNotesTracker = true;
                                       } else {
                                          localNotesTracker = true;
                                              
                                       }
                                   
                                            this.localNotes=param;
                                    

                               }
                            

                        /**
                        * field for Organization
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localOrganization ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrganizationTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getOrganization(){
                               return localOrganization;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Organization
                               */
                               public void setOrganization(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOrganizationTracker = true;
                                       } else {
                                          localOrganizationTracker = true;
                                              
                                       }
                                   
                                            this.localOrganization=param;
                                    

                               }
                            

                        /**
                        * field for PercentComplete
                        */

                        
                                    protected int localPercentComplete ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPercentCompleteTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPercentComplete(){
                               return localPercentComplete;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PercentComplete
                               */
                               public void setPercentComplete(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPercentCompleteTracker = true;
                                              
                                       } else {
                                          localPercentCompleteTracker = true;
                                       }
                                   
                                            this.localPercentComplete=param;
                                    

                               }
                            

                        /**
                        * field for PlannedCompletionTime
                        */

                        
                                    protected java.util.Calendar localPlannedCompletionTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPlannedCompletionTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getPlannedCompletionTime(){
                               return localPlannedCompletionTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PlannedCompletionTime
                               */
                               public void setPlannedCompletionTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPlannedCompletionTimeTracker = true;
                                       } else {
                                          localPlannedCompletionTimeTracker = true;
                                              
                                       }
                                   
                                            this.localPlannedCompletionTime=param;
                                    

                               }
                            

                        /**
                        * field for Priority
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localPriority ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPriorityTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getPriority(){
                               return localPriority;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Priority
                               */
                               public void setPriority(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPriorityTracker = true;
                                       } else {
                                          localPriorityTracker = true;
                                              
                                       }
                                   
                                            this.localPriority=param;
                                    

                               }
                            

                        /**
                        * field for SalesSettings
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.TaskSalesSettings localSalesSettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSalesSettingsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.TaskSalesSettings
                           */
                           public  com.rn.supera.ws.typed.objects.TaskSalesSettings getSalesSettings(){
                               return localSalesSettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SalesSettings
                               */
                               public void setSalesSettings(com.rn.supera.ws.typed.objects.TaskSalesSettings param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSalesSettingsTracker = true;
                                       } else {
                                          localSalesSettingsTracker = false;
                                              
                                       }
                                   
                                            this.localSalesSettings=param;
                                    

                               }
                            

                        /**
                        * field for ServiceSettings
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.TaskServiceSettings localServiceSettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceSettingsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.TaskServiceSettings
                           */
                           public  com.rn.supera.ws.typed.objects.TaskServiceSettings getServiceSettings(){
                               return localServiceSettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceSettings
                               */
                               public void setServiceSettings(com.rn.supera.ws.typed.objects.TaskServiceSettings param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localServiceSettingsTracker = true;
                                       } else {
                                          localServiceSettingsTracker = false;
                                              
                                       }
                                   
                                            this.localServiceSettings=param;
                                    

                               }
                            

                        /**
                        * field for StartTime
                        */

                        
                                    protected java.util.Calendar localStartTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStartTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getStartTime(){
                               return localStartTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartTime
                               */
                               public void setStartTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStartTimeTracker = true;
                                       } else {
                                          localStartTimeTracker = true;
                                              
                                       }
                                   
                                            this.localStartTime=param;
                                    

                               }
                            

                        /**
                        * field for StatusWithType
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.StatusWithType localStatusWithType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusWithTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.StatusWithType
                           */
                           public  com.rn.supera.ws.typed.objects.StatusWithType getStatusWithType(){
                               return localStatusWithType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusWithType
                               */
                               public void setStatusWithType(com.rn.supera.ws.typed.objects.StatusWithType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStatusWithTypeTracker = true;
                                       } else {
                                          localStatusWithTypeTracker = false;
                                              
                                       }
                                   
                                            this.localStatusWithType=param;
                                    

                               }
                            

                        /**
                        * field for TaskTemplate
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localTaskTemplate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaskTemplateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getTaskTemplate(){
                               return localTaskTemplate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaskTemplate
                               */
                               public void setTaskTemplate(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTaskTemplateTracker = true;
                                       } else {
                                          localTaskTemplateTracker = false;
                                              
                                       }
                                   
                                            this.localTaskTemplate=param;
                                    

                               }
                            

                        /**
                        * field for TaskType
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localTaskType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaskTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getTaskType(){
                               return localTaskType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaskType
                               */
                               public void setTaskType(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTaskTypeTracker = true;
                                       } else {
                                          localTaskTypeTracker = true;
                                              
                                       }
                                   
                                            this.localTaskType=param;
                                    

                               }
                            

                        /**
                        * field for ValidNullFields
                        */

                        
                                    protected com.rn.supera.ws.typed.nullfields.TaskNullFields localValidNullFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidNullFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.nullfields.TaskNullFields
                           */
                           public  com.rn.supera.ws.typed.nullfields.TaskNullFields getValidNullFields(){
                               return localValidNullFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidNullFields
                               */
                               public void setValidNullFields(com.rn.supera.ws.typed.nullfields.TaskNullFields param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localValidNullFieldsTracker = true;
                                       } else {
                                          localValidNullFieldsTracker = true;
                                              
                                       }
                                   
                                            this.localValidNullFields=param;
                                    

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
                       Task.this.serialize(parentQName,factory,xmlWriter);
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
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:objects.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Task",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Task",
                           xmlWriter);
                   }

                if (localIDTracker){
                                            if (localID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                            }
                                           localID.serialize(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","ID"),
                                               factory,xmlWriter);
                                        } if (localLookupNameTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"LookupName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LookupName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LookupName");
                                    }
                                

                                          if (localLookupName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("LookupName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLookupName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreatedTimeTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CreatedTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CreatedTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CreatedTime");
                                    }
                                

                                          if (localCreatedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CreatedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdatedTimeTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"UpdatedTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UpdatedTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UpdatedTime");
                                    }
                                

                                          if (localUpdatedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("UpdatedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdatedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAssignedToAccountTracker){
                                    if (localAssignedToAccount==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AssignedToAccount", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AssignedToAccount");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AssignedToAccount");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAssignedToAccount.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AssignedToAccount"),
                                        factory,xmlWriter);
                                    }
                                } if (localCompletedTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CompletedTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CompletedTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CompletedTime");
                                    }
                                

                                          if (localCompletedTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompletedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localContactTracker){
                                    if (localContact==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Contact", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Contact");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Contact");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localContact.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Contact"),
                                        factory,xmlWriter);
                                    }
                                } if (localCustomFieldsTracker){
                                            if (localCustomFields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                            }
                                           localCustomFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CustomFields"),
                                               factory,xmlWriter);
                                        } if (localDueTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"DueTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DueTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DueTime");
                                    }
                                

                                          if (localDueTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDueTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFileAttachmentsTracker){
                                    if (localFileAttachments==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"FileAttachments", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"FileAttachments");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("FileAttachments");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFileAttachments.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","FileAttachments"),
                                        factory,xmlWriter);
                                    }
                                } if (localInheritTracker){
                                            if (localInherit==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Inherit cannot be null!!");
                                            }
                                           localInherit.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Inherit"),
                                               factory,xmlWriter);
                                        } if (localMarketingSettingsTracker){
                                            if (localMarketingSettings==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MarketingSettings cannot be null!!");
                                            }
                                           localMarketingSettings.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","MarketingSettings"),
                                               factory,xmlWriter);
                                        } if (localNameTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Name", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Name");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Name");
                                    }
                                

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNotesTracker){
                                    if (localNotes==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Notes", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Notes");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Notes");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNotes.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Notes"),
                                        factory,xmlWriter);
                                    }
                                } if (localOrganizationTracker){
                                    if (localOrganization==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Organization", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Organization");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Organization");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOrganization.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Organization"),
                                        factory,xmlWriter);
                                    }
                                } if (localPercentCompleteTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PercentComplete", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PercentComplete");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PercentComplete");
                                    }
                                
                                               if (localPercentComplete==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPercentComplete));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPlannedCompletionTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PlannedCompletionTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PlannedCompletionTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PlannedCompletionTime");
                                    }
                                

                                          if (localPlannedCompletionTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlannedCompletionTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPriorityTracker){
                                    if (localPriority==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Priority", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Priority");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Priority");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPriority.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Priority"),
                                        factory,xmlWriter);
                                    }
                                } if (localSalesSettingsTracker){
                                            if (localSalesSettings==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SalesSettings cannot be null!!");
                                            }
                                           localSalesSettings.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","SalesSettings"),
                                               factory,xmlWriter);
                                        } if (localServiceSettingsTracker){
                                            if (localServiceSettings==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServiceSettings cannot be null!!");
                                            }
                                           localServiceSettings.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ServiceSettings"),
                                               factory,xmlWriter);
                                        } if (localStartTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"StartTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"StartTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("StartTime");
                                    }
                                

                                          if (localStartTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStatusWithTypeTracker){
                                            if (localStatusWithType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                            }
                                           localStatusWithType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","StatusWithType"),
                                               factory,xmlWriter);
                                        } if (localTaskTemplateTracker){
                                            if (localTaskTemplate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TaskTemplate cannot be null!!");
                                            }
                                           localTaskTemplate.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","TaskTemplate"),
                                               factory,xmlWriter);
                                        } if (localTaskTypeTracker){
                                    if (localTaskType==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"TaskType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"TaskType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("TaskType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTaskType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","TaskType"),
                                        factory,xmlWriter);
                                    }
                                } if (localValidNullFieldsTracker){
                                    if (localValidNullFields==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ValidNullFields", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ValidNullFields");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ValidNullFields");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localValidNullFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ValidNullFields"),
                                        factory,xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Task"));
                 if (localIDTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3",
                                                                      "ID"));
                            
                            
                                    if (localID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                    }
                                    elementList.add(localID);
                                } if (localLookupNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3",
                                                                      "LookupName"));
                                 
                                        if (localLookupName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLookupName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("LookupName cannot be null!!");
                                        }
                                    } if (localCreatedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3",
                                                                      "CreatedTime"));
                                 
                                        if (localCreatedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CreatedTime cannot be null!!");
                                        }
                                    } if (localUpdatedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3",
                                                                      "UpdatedTime"));
                                 
                                        if (localUpdatedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdatedTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UpdatedTime cannot be null!!");
                                        }
                                    } if (localAssignedToAccountTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "AssignedToAccount"));
                            
                            
                                    elementList.add(localAssignedToAccount==null?null:
                                    localAssignedToAccount);
                                } if (localCompletedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "CompletedTime"));
                                 
                                         elementList.add(localCompletedTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompletedTime));
                                    } if (localContactTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Contact"));
                            
                            
                                    elementList.add(localContact==null?null:
                                    localContact);
                                } if (localCustomFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "CustomFields"));
                            
                            
                                    if (localCustomFields==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                    }
                                    elementList.add(localCustomFields);
                                } if (localDueTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "DueTime"));
                                 
                                         elementList.add(localDueTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDueTime));
                                    } if (localFileAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "FileAttachments"));
                            
                            
                                    elementList.add(localFileAttachments==null?null:
                                    localFileAttachments);
                                } if (localInheritTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Inherit"));
                            
                            
                                    if (localInherit==null){
                                         throw new org.apache.axis2.databinding.ADBException("Inherit cannot be null!!");
                                    }
                                    elementList.add(localInherit);
                                } if (localMarketingSettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "MarketingSettings"));
                            
                            
                                    if (localMarketingSettings==null){
                                         throw new org.apache.axis2.databinding.ADBException("MarketingSettings cannot be null!!");
                                    }
                                    elementList.add(localMarketingSettings);
                                } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                        }
                                    } if (localNotesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Notes"));
                            
                            
                                    elementList.add(localNotes==null?null:
                                    localNotes);
                                } if (localOrganizationTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Organization"));
                            
                            
                                    elementList.add(localOrganization==null?null:
                                    localOrganization);
                                } if (localPercentCompleteTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "PercentComplete"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPercentComplete));
                            } if (localPlannedCompletionTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "PlannedCompletionTime"));
                                 
                                         elementList.add(localPlannedCompletionTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlannedCompletionTime));
                                    } if (localPriorityTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Priority"));
                            
                            
                                    elementList.add(localPriority==null?null:
                                    localPriority);
                                } if (localSalesSettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "SalesSettings"));
                            
                            
                                    if (localSalesSettings==null){
                                         throw new org.apache.axis2.databinding.ADBException("SalesSettings cannot be null!!");
                                    }
                                    elementList.add(localSalesSettings);
                                } if (localServiceSettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ServiceSettings"));
                            
                            
                                    if (localServiceSettings==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServiceSettings cannot be null!!");
                                    }
                                    elementList.add(localServiceSettings);
                                } if (localStartTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "StartTime"));
                                 
                                         elementList.add(localStartTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                                    } if (localStatusWithTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "StatusWithType"));
                            
                            
                                    if (localStatusWithType==null){
                                         throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                    }
                                    elementList.add(localStatusWithType);
                                } if (localTaskTemplateTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "TaskTemplate"));
                            
                            
                                    if (localTaskTemplate==null){
                                         throw new org.apache.axis2.databinding.ADBException("TaskTemplate cannot be null!!");
                                    }
                                    elementList.add(localTaskTemplate);
                                } if (localTaskTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "TaskType"));
                            
                            
                                    elementList.add(localTaskType==null?null:
                                    localTaskType);
                                } if (localValidNullFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ValidNullFields"));
                            
                            
                                    elementList.add(localValidNullFields==null?null:
                                    localValidNullFields);
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
        public static Task parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Task object =
                new Task();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"Task".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Task)com.rn.supera.ws.typed.base.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","ID").equals(reader.getName())){
                                
                                                object.setID(com.rn.supera.ws.typed.base.ID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","LookupName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLookupName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","CreatedTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","UpdatedTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdatedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AssignedToAccount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAssignedToAccount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAssignedToAccount(com.rn.supera.ws.typed.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CompletedTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCompletedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Contact").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setContact(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setContact(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CustomFields").equals(reader.getName())){
                                
                                                object.setCustomFields(com.rn.supera.ws.typed.generic.GenericObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","DueTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDueTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","FileAttachments").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFileAttachments(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFileAttachments(com.rn.supera.ws.typed.objects.FileAttachmentCommonList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Inherit").equals(reader.getName())){
                                
                                                object.setInherit(com.rn.supera.ws.typed.objects.InheritOptions.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","MarketingSettings").equals(reader.getName())){
                                
                                                object.setMarketingSettings(com.rn.supera.ws.typed.objects.TaskMarketingSettings.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Name").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Notes").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNotes(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNotes(com.rn.supera.ws.typed.objects.NoteList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Organization").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOrganization(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOrganization(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","PercentComplete").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPercentComplete(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setPercentComplete(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPercentComplete(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","PlannedCompletionTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPlannedCompletionTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Priority").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPriority(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPriority(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","SalesSettings").equals(reader.getName())){
                                
                                                object.setSalesSettings(com.rn.supera.ws.typed.objects.TaskSalesSettings.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ServiceSettings").equals(reader.getName())){
                                
                                                object.setServiceSettings(com.rn.supera.ws.typed.objects.TaskServiceSettings.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","StartTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","StatusWithType").equals(reader.getName())){
                                
                                                object.setStatusWithType(com.rn.supera.ws.typed.objects.StatusWithType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","TaskTemplate").equals(reader.getName())){
                                
                                                object.setTaskTemplate(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","TaskType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTaskType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTaskType(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ValidNullFields").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setValidNullFields(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setValidNullFields(com.rn.supera.ws.typed.nullfields.TaskNullFields.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          