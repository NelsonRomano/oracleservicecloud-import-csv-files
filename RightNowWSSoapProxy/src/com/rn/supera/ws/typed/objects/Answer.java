
/**
 * Answer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rn.supera.ws.typed.objects;
            

            /**
            *  Answer bean class
            */
        
        public  class Answer extends com.rn.supera.ws.typed.base.RNObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Answer
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
                        * field for AccessLevels
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedIDDeltaList localAccessLevels ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccessLevelsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedIDDeltaList
                           */
                           public  com.rn.supera.ws.typed.base.NamedIDDeltaList getAccessLevels(){
                               return localAccessLevels;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccessLevels
                               */
                               public void setAccessLevels(com.rn.supera.ws.typed.base.NamedIDDeltaList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAccessLevelsTracker = true;
                                       } else {
                                          localAccessLevelsTracker = true;
                                              
                                       }
                                   
                                            this.localAccessLevels=param;
                                    

                               }
                            

                        /**
                        * field for AdminLastAccessTime
                        */

                        
                                    protected java.util.Calendar localAdminLastAccessTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdminLastAccessTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getAdminLastAccessTime(){
                               return localAdminLastAccessTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdminLastAccessTime
                               */
                               public void setAdminLastAccessTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAdminLastAccessTimeTracker = true;
                                       } else {
                                          localAdminLastAccessTimeTracker = true;
                                              
                                       }
                                   
                                            this.localAdminLastAccessTime=param;
                                    

                               }
                            

                        /**
                        * field for AnswerType
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localAnswerType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnswerTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getAnswerType(){
                               return localAnswerType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AnswerType
                               */
                               public void setAnswerType(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAnswerTypeTracker = true;
                                       } else {
                                          localAnswerTypeTracker = false;
                                              
                                       }
                                   
                                            this.localAnswerType=param;
                                    

                               }
                            

                        /**
                        * field for AssignedSibling
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localAssignedSibling ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssignedSiblingTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getAssignedSibling(){
                               return localAssignedSibling;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssignedSibling
                               */
                               public void setAssignedSibling(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAssignedSiblingTracker = true;
                                       } else {
                                          localAssignedSiblingTracker = true;
                                              
                                       }
                                   
                                            this.localAssignedSibling=param;
                                    

                               }
                            

                        /**
                        * field for AssignedTo
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.GroupAccount localAssignedTo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssignedToTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.GroupAccount
                           */
                           public  com.rn.supera.ws.typed.objects.GroupAccount getAssignedTo(){
                               return localAssignedTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssignedTo
                               */
                               public void setAssignedTo(com.rn.supera.ws.typed.objects.GroupAccount param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAssignedToTracker = true;
                                       } else {
                                          localAssignedToTracker = false;
                                              
                                       }
                                   
                                            this.localAssignedTo=param;
                                    

                               }
                            

                        /**
                        * field for Banner
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.Banner localBanner ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBannerTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.Banner
                           */
                           public  com.rn.supera.ws.typed.objects.Banner getBanner(){
                               return localBanner;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Banner
                               */
                               public void setBanner(com.rn.supera.ws.typed.objects.Banner param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBannerTracker = true;
                                       } else {
                                          localBannerTracker = true;
                                              
                                       }
                                   
                                            this.localBanner=param;
                                    

                               }
                            

                        /**
                        * field for Categories
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedIDHierarchyList localCategories ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCategoriesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedIDHierarchyList
                           */
                           public  com.rn.supera.ws.typed.base.NamedIDHierarchyList getCategories(){
                               return localCategories;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Categories
                               */
                               public void setCategories(com.rn.supera.ws.typed.base.NamedIDHierarchyList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCategoriesTracker = true;
                                       } else {
                                          localCategoriesTracker = true;
                                              
                                       }
                                   
                                            this.localCategories=param;
                                    

                               }
                            

                        /**
                        * field for CommonAttachments
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.FileAttachmentSharedList localCommonAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommonAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.FileAttachmentSharedList
                           */
                           public  com.rn.supera.ws.typed.objects.FileAttachmentSharedList getCommonAttachments(){
                               return localCommonAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CommonAttachments
                               */
                               public void setCommonAttachments(com.rn.supera.ws.typed.objects.FileAttachmentSharedList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCommonAttachmentsTracker = true;
                                       } else {
                                          localCommonAttachmentsTracker = true;
                                              
                                       }
                                   
                                            this.localCommonAttachments=param;
                                    

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
                        * field for ExpiresDate
                        */

                        
                                    protected java.util.Date localExpiresDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpiresDateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getExpiresDate(){
                               return localExpiresDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpiresDate
                               */
                               public void setExpiresDate(java.util.Date param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localExpiresDateTracker = true;
                                       } else {
                                          localExpiresDateTracker = true;
                                              
                                       }
                                   
                                            this.localExpiresDate=param;
                                    

                               }
                            

                        /**
                        * field for FileAttachments
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.FileAttachmentAnswerList localFileAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.FileAttachmentAnswerList
                           */
                           public  com.rn.supera.ws.typed.objects.FileAttachmentAnswerList getFileAttachments(){
                               return localFileAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileAttachments
                               */
                               public void setFileAttachments(com.rn.supera.ws.typed.objects.FileAttachmentAnswerList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFileAttachmentsTracker = true;
                                       } else {
                                          localFileAttachmentsTracker = true;
                                              
                                       }
                                   
                                            this.localFileAttachments=param;
                                    

                               }
                            

                        /**
                        * field for GuidedAssistance
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localGuidedAssistance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGuidedAssistanceTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getGuidedAssistance(){
                               return localGuidedAssistance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GuidedAssistance
                               */
                               public void setGuidedAssistance(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGuidedAssistanceTracker = true;
                                       } else {
                                          localGuidedAssistanceTracker = true;
                                              
                                       }
                                   
                                            this.localGuidedAssistance=param;
                                    

                               }
                            

                        /**
                        * field for Keywords
                        */

                        
                                    protected java.lang.String localKeywords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeywordsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeywords(){
                               return localKeywords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Keywords
                               */
                               public void setKeywords(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localKeywordsTracker = true;
                                       } else {
                                          localKeywordsTracker = true;
                                              
                                       }
                                   
                                            this.localKeywords=param;
                                    

                               }
                            

                        /**
                        * field for Language
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localLanguage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLanguageTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getLanguage(){
                               return localLanguage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Language
                               */
                               public void setLanguage(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLanguageTracker = true;
                                       } else {
                                          localLanguageTracker = false;
                                              
                                       }
                                   
                                            this.localLanguage=param;
                                    

                               }
                            

                        /**
                        * field for LastAccessTime
                        */

                        
                                    protected java.util.Calendar localLastAccessTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastAccessTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastAccessTime(){
                               return localLastAccessTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastAccessTime
                               */
                               public void setLastAccessTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLastAccessTimeTracker = true;
                                       } else {
                                          localLastAccessTimeTracker = true;
                                              
                                       }
                                   
                                            this.localLastAccessTime=param;
                                    

                               }
                            

                        /**
                        * field for LastNotificationTime
                        */

                        
                                    protected java.util.Calendar localLastNotificationTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastNotificationTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastNotificationTime(){
                               return localLastNotificationTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastNotificationTime
                               */
                               public void setLastNotificationTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localLastNotificationTimeTracker = true;
                                       } else {
                                          localLastNotificationTimeTracker = true;
                                              
                                       }
                                   
                                            this.localLastNotificationTime=param;
                                    

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
                        * field for NextNotificationTime
                        */

                        
                                    protected java.util.Calendar localNextNotificationTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextNotificationTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getNextNotificationTime(){
                               return localNextNotificationTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextNotificationTime
                               */
                               public void setNextNotificationTime(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNextNotificationTimeTracker = true;
                                       } else {
                                          localNextNotificationTimeTracker = true;
                                              
                                       }
                                   
                                            this.localNextNotificationTime=param;
                                    

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
                        * field for OriginalReferenceNumber
                        */

                        
                                    protected java.lang.String localOriginalReferenceNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOriginalReferenceNumberTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOriginalReferenceNumber(){
                               return localOriginalReferenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OriginalReferenceNumber
                               */
                               public void setOriginalReferenceNumber(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOriginalReferenceNumberTracker = true;
                                       } else {
                                          localOriginalReferenceNumberTracker = true;
                                              
                                       }
                                   
                                            this.localOriginalReferenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for PositionInList
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localPositionInList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPositionInListTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getPositionInList(){
                               return localPositionInList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PositionInList
                               */
                               public void setPositionInList(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPositionInListTracker = true;
                                       } else {
                                          localPositionInListTracker = false;
                                              
                                       }
                                   
                                            this.localPositionInList=param;
                                    

                               }
                            

                        /**
                        * field for Products
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedIDHierarchyList localProducts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedIDHierarchyList
                           */
                           public  com.rn.supera.ws.typed.base.NamedIDHierarchyList getProducts(){
                               return localProducts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Products
                               */
                               public void setProducts(com.rn.supera.ws.typed.base.NamedIDHierarchyList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProductsTracker = true;
                                       } else {
                                          localProductsTracker = true;
                                              
                                       }
                                   
                                            this.localProducts=param;
                                    

                               }
                            

                        /**
                        * field for PublishOnDate
                        */

                        
                                    protected java.util.Date localPublishOnDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPublishOnDateTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getPublishOnDate(){
                               return localPublishOnDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PublishOnDate
                               */
                               public void setPublishOnDate(java.util.Date param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPublishOnDateTracker = true;
                                       } else {
                                          localPublishOnDateTracker = true;
                                              
                                       }
                                   
                                            this.localPublishOnDate=param;
                                    

                               }
                            

                        /**
                        * field for Question
                        */

                        
                                    protected java.lang.String localQuestion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuestionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuestion(){
                               return localQuestion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Question
                               */
                               public void setQuestion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localQuestionTracker = true;
                                       } else {
                                          localQuestionTracker = true;
                                              
                                       }
                                   
                                            this.localQuestion=param;
                                    

                               }
                            

                        /**
                        * field for RelatedAnswers
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.AnswerRelatedAnswerList localRelatedAnswers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRelatedAnswersTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.AnswerRelatedAnswerList
                           */
                           public  com.rn.supera.ws.typed.objects.AnswerRelatedAnswerList getRelatedAnswers(){
                               return localRelatedAnswers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RelatedAnswers
                               */
                               public void setRelatedAnswers(com.rn.supera.ws.typed.objects.AnswerRelatedAnswerList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRelatedAnswersTracker = true;
                                       } else {
                                          localRelatedAnswersTracker = true;
                                              
                                       }
                                   
                                            this.localRelatedAnswers=param;
                                    

                               }
                            

                        /**
                        * field for SiblingAnswers
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedIDList localSiblingAnswers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSiblingAnswersTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedIDList
                           */
                           public  com.rn.supera.ws.typed.base.NamedIDList getSiblingAnswers(){
                               return localSiblingAnswers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiblingAnswers
                               */
                               public void setSiblingAnswers(com.rn.supera.ws.typed.base.NamedIDList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSiblingAnswersTracker = true;
                                       } else {
                                          localSiblingAnswersTracker = true;
                                              
                                       }
                                   
                                            this.localSiblingAnswers=param;
                                    

                               }
                            

                        /**
                        * field for Solution
                        */

                        
                                    protected java.lang.String localSolution ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSolutionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSolution(){
                               return localSolution;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Solution
                               */
                               public void setSolution(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSolutionTracker = true;
                                       } else {
                                          localSolutionTracker = true;
                                              
                                       }
                                   
                                            this.localSolution=param;
                                    

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
                        * field for Summary
                        */

                        
                                    protected java.lang.String localSummary ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSummaryTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSummary(){
                               return localSummary;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Summary
                               */
                               public void setSummary(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSummaryTracker = true;
                                       } else {
                                          localSummaryTracker = false;
                                              
                                       }
                                   
                                            this.localSummary=param;
                                    

                               }
                            

                        /**
                        * field for UpdatedByAccount
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localUpdatedByAccount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdatedByAccountTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getUpdatedByAccount(){
                               return localUpdatedByAccount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdatedByAccount
                               */
                               public void setUpdatedByAccount(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUpdatedByAccountTracker = true;
                                       } else {
                                          localUpdatedByAccountTracker = true;
                                              
                                       }
                                   
                                            this.localUpdatedByAccount=param;
                                    

                               }
                            

                        /**
                        * field for URL
                        */

                        
                                    protected java.lang.String localURL ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localURLTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getURL(){
                               return localURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param URL
                               */
                               public void setURL(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localURLTracker = true;
                                       } else {
                                          localURLTracker = true;
                                              
                                       }
                                   
                                            this.localURL=param;
                                    

                               }
                            

                        /**
                        * field for ValidNullFields
                        */

                        
                                    protected com.rn.supera.ws.typed.nullfields.AnswerNullFields localValidNullFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidNullFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.nullfields.AnswerNullFields
                           */
                           public  com.rn.supera.ws.typed.nullfields.AnswerNullFields getValidNullFields(){
                               return localValidNullFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidNullFields
                               */
                               public void setValidNullFields(com.rn.supera.ws.typed.nullfields.AnswerNullFields param){
                            
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
                       Answer.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":Answer",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Answer",
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
                             } if (localAccessLevelsTracker){
                                    if (localAccessLevels==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AccessLevels", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AccessLevels");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AccessLevels");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccessLevels.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AccessLevels"),
                                        factory,xmlWriter);
                                    }
                                } if (localAdminLastAccessTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdminLastAccessTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdminLastAccessTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdminLastAccessTime");
                                    }
                                

                                          if (localAdminLastAccessTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminLastAccessTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAnswerTypeTracker){
                                            if (localAnswerType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AnswerType cannot be null!!");
                                            }
                                           localAnswerType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AnswerType"),
                                               factory,xmlWriter);
                                        } if (localAssignedSiblingTracker){
                                    if (localAssignedSibling==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AssignedSibling", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AssignedSibling");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AssignedSibling");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAssignedSibling.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AssignedSibling"),
                                        factory,xmlWriter);
                                    }
                                } if (localAssignedToTracker){
                                            if (localAssignedTo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AssignedTo cannot be null!!");
                                            }
                                           localAssignedTo.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AssignedTo"),
                                               factory,xmlWriter);
                                        } if (localBannerTracker){
                                    if (localBanner==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Banner", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Banner");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Banner");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBanner.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Banner"),
                                        factory,xmlWriter);
                                    }
                                } if (localCategoriesTracker){
                                    if (localCategories==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Categories", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Categories");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Categories");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCategories.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Categories"),
                                        factory,xmlWriter);
                                    }
                                } if (localCommonAttachmentsTracker){
                                    if (localCommonAttachments==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"CommonAttachments", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"CommonAttachments");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("CommonAttachments");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCommonAttachments.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CommonAttachments"),
                                        factory,xmlWriter);
                                    }
                                } if (localCustomFieldsTracker){
                                            if (localCustomFields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                            }
                                           localCustomFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CustomFields"),
                                               factory,xmlWriter);
                                        } if (localExpiresDateTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ExpiresDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ExpiresDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ExpiresDate");
                                    }
                                

                                          if (localExpiresDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiresDate));
                                            
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
                                } if (localGuidedAssistanceTracker){
                                    if (localGuidedAssistance==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"GuidedAssistance", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"GuidedAssistance");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("GuidedAssistance");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGuidedAssistance.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","GuidedAssistance"),
                                        factory,xmlWriter);
                                    }
                                } if (localKeywordsTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Keywords", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Keywords");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Keywords");
                                    }
                                

                                          if (localKeywords==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localKeywords);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLanguageTracker){
                                            if (localLanguage==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Language cannot be null!!");
                                            }
                                           localLanguage.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Language"),
                                               factory,xmlWriter);
                                        } if (localLastAccessTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"LastAccessTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LastAccessTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LastAccessTime");
                                    }
                                

                                          if (localLastAccessTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastAccessTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastNotificationTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"LastNotificationTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"LastNotificationTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("LastNotificationTime");
                                    }
                                

                                          if (localLastNotificationTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastNotificationTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
                             } if (localNextNotificationTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"NextNotificationTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"NextNotificationTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("NextNotificationTime");
                                    }
                                

                                          if (localNextNotificationTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextNotificationTime));
                                            
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
                                } if (localOriginalReferenceNumberTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"OriginalReferenceNumber", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"OriginalReferenceNumber");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("OriginalReferenceNumber");
                                    }
                                

                                          if (localOriginalReferenceNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOriginalReferenceNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPositionInListTracker){
                                            if (localPositionInList==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PositionInList cannot be null!!");
                                            }
                                           localPositionInList.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","PositionInList"),
                                               factory,xmlWriter);
                                        } if (localProductsTracker){
                                    if (localProducts==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"Products", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"Products");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("Products");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProducts.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Products"),
                                        factory,xmlWriter);
                                    }
                                } if (localPublishOnDateTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PublishOnDate", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PublishOnDate");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PublishOnDate");
                                    }
                                

                                          if (localPublishOnDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPublishOnDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQuestionTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Question", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Question");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Question");
                                    }
                                

                                          if (localQuestion==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQuestion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRelatedAnswersTracker){
                                    if (localRelatedAnswers==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"RelatedAnswers", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"RelatedAnswers");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("RelatedAnswers");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRelatedAnswers.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","RelatedAnswers"),
                                        factory,xmlWriter);
                                    }
                                } if (localSiblingAnswersTracker){
                                    if (localSiblingAnswers==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SiblingAnswers", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SiblingAnswers");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SiblingAnswers");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSiblingAnswers.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","SiblingAnswers"),
                                        factory,xmlWriter);
                                    }
                                } if (localSolutionTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Solution", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Solution");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Solution");
                                    }
                                

                                          if (localSolution==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSolution);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStatusWithTypeTracker){
                                            if (localStatusWithType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                            }
                                           localStatusWithType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","StatusWithType"),
                                               factory,xmlWriter);
                                        } if (localSummaryTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Summary", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Summary");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Summary");
                                    }
                                

                                          if (localSummary==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Summary cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSummary);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdatedByAccountTracker){
                                    if (localUpdatedByAccount==null){

                                            java.lang.String namespace2 = "urn:objects.ws.rightnow.com/v1_3";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"UpdatedByAccount", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"UpdatedByAccount");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("UpdatedByAccount");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUpdatedByAccount.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","UpdatedByAccount"),
                                        factory,xmlWriter);
                                    }
                                } if (localURLTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"URL", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"URL");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("URL");
                                    }
                                

                                          if (localURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
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
                    attribList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Answer"));
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
                                    } if (localAccessLevelsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "AccessLevels"));
                            
                            
                                    elementList.add(localAccessLevels==null?null:
                                    localAccessLevels);
                                } if (localAdminLastAccessTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "AdminLastAccessTime"));
                                 
                                         elementList.add(localAdminLastAccessTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdminLastAccessTime));
                                    } if (localAnswerTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "AnswerType"));
                            
                            
                                    if (localAnswerType==null){
                                         throw new org.apache.axis2.databinding.ADBException("AnswerType cannot be null!!");
                                    }
                                    elementList.add(localAnswerType);
                                } if (localAssignedSiblingTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "AssignedSibling"));
                            
                            
                                    elementList.add(localAssignedSibling==null?null:
                                    localAssignedSibling);
                                } if (localAssignedToTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "AssignedTo"));
                            
                            
                                    if (localAssignedTo==null){
                                         throw new org.apache.axis2.databinding.ADBException("AssignedTo cannot be null!!");
                                    }
                                    elementList.add(localAssignedTo);
                                } if (localBannerTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Banner"));
                            
                            
                                    elementList.add(localBanner==null?null:
                                    localBanner);
                                } if (localCategoriesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Categories"));
                            
                            
                                    elementList.add(localCategories==null?null:
                                    localCategories);
                                } if (localCommonAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "CommonAttachments"));
                            
                            
                                    elementList.add(localCommonAttachments==null?null:
                                    localCommonAttachments);
                                } if (localCustomFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "CustomFields"));
                            
                            
                                    if (localCustomFields==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                    }
                                    elementList.add(localCustomFields);
                                } if (localExpiresDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ExpiresDate"));
                                 
                                         elementList.add(localExpiresDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpiresDate));
                                    } if (localFileAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "FileAttachments"));
                            
                            
                                    elementList.add(localFileAttachments==null?null:
                                    localFileAttachments);
                                } if (localGuidedAssistanceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "GuidedAssistance"));
                            
                            
                                    elementList.add(localGuidedAssistance==null?null:
                                    localGuidedAssistance);
                                } if (localKeywordsTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Keywords"));
                                 
                                         elementList.add(localKeywords==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeywords));
                                    } if (localLanguageTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Language"));
                            
                            
                                    if (localLanguage==null){
                                         throw new org.apache.axis2.databinding.ADBException("Language cannot be null!!");
                                    }
                                    elementList.add(localLanguage);
                                } if (localLastAccessTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "LastAccessTime"));
                                 
                                         elementList.add(localLastAccessTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastAccessTime));
                                    } if (localLastNotificationTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "LastNotificationTime"));
                                 
                                         elementList.add(localLastNotificationTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastNotificationTime));
                                    } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                        }
                                    } if (localNextNotificationTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "NextNotificationTime"));
                                 
                                         elementList.add(localNextNotificationTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextNotificationTime));
                                    } if (localNotesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Notes"));
                            
                            
                                    elementList.add(localNotes==null?null:
                                    localNotes);
                                } if (localOriginalReferenceNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "OriginalReferenceNumber"));
                                 
                                         elementList.add(localOriginalReferenceNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOriginalReferenceNumber));
                                    } if (localPositionInListTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "PositionInList"));
                            
                            
                                    if (localPositionInList==null){
                                         throw new org.apache.axis2.databinding.ADBException("PositionInList cannot be null!!");
                                    }
                                    elementList.add(localPositionInList);
                                } if (localProductsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Products"));
                            
                            
                                    elementList.add(localProducts==null?null:
                                    localProducts);
                                } if (localPublishOnDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "PublishOnDate"));
                                 
                                         elementList.add(localPublishOnDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPublishOnDate));
                                    } if (localQuestionTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Question"));
                                 
                                         elementList.add(localQuestion==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuestion));
                                    } if (localRelatedAnswersTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "RelatedAnswers"));
                            
                            
                                    elementList.add(localRelatedAnswers==null?null:
                                    localRelatedAnswers);
                                } if (localSiblingAnswersTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "SiblingAnswers"));
                            
                            
                                    elementList.add(localSiblingAnswers==null?null:
                                    localSiblingAnswers);
                                } if (localSolutionTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Solution"));
                                 
                                         elementList.add(localSolution==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSolution));
                                    } if (localStatusWithTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "StatusWithType"));
                            
                            
                                    if (localStatusWithType==null){
                                         throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                    }
                                    elementList.add(localStatusWithType);
                                } if (localSummaryTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Summary"));
                                 
                                        if (localSummary != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSummary));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Summary cannot be null!!");
                                        }
                                    } if (localUpdatedByAccountTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "UpdatedByAccount"));
                            
                            
                                    elementList.add(localUpdatedByAccount==null?null:
                                    localUpdatedByAccount);
                                } if (localURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "URL"));
                                 
                                         elementList.add(localURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localURL));
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
        public static Answer parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Answer object =
                new Answer();

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
                    
                            if (!"Answer".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Answer)com.rn.supera.ws.typed.base.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AccessLevels").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAccessLevels(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAccessLevels(com.rn.supera.ws.typed.base.NamedIDDeltaList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AdminLastAccessTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdminLastAccessTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AnswerType").equals(reader.getName())){
                                
                                                object.setAnswerType(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AssignedSibling").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAssignedSibling(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAssignedSibling(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AssignedTo").equals(reader.getName())){
                                
                                                object.setAssignedTo(com.rn.supera.ws.typed.objects.GroupAccount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Banner").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBanner(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBanner(com.rn.supera.ws.typed.objects.Banner.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Categories").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCategories(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCategories(com.rn.supera.ws.typed.base.NamedIDHierarchyList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CommonAttachments").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCommonAttachments(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCommonAttachments(com.rn.supera.ws.typed.objects.FileAttachmentSharedList.Factory.parse(reader));
                                              
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ExpiresDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExpiresDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
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
                                    
                                                object.setFileAttachments(com.rn.supera.ws.typed.objects.FileAttachmentAnswerList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","GuidedAssistance").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGuidedAssistance(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGuidedAssistance(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Keywords").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setKeywords(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Language").equals(reader.getName())){
                                
                                                object.setLanguage(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","LastAccessTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastAccessTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","LastNotificationTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastNotificationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","NextNotificationTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNextNotificationTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","OriginalReferenceNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOriginalReferenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","PositionInList").equals(reader.getName())){
                                
                                                object.setPositionInList(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Products").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProducts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProducts(com.rn.supera.ws.typed.base.NamedIDHierarchyList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","PublishOnDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPublishOnDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Question").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQuestion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","RelatedAnswers").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRelatedAnswers(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRelatedAnswers(com.rn.supera.ws.typed.objects.AnswerRelatedAnswerList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","SiblingAnswers").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSiblingAnswers(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSiblingAnswers(com.rn.supera.ws.typed.base.NamedIDList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Solution").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSolution(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Summary").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSummary(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","UpdatedByAccount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUpdatedByAccount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUpdatedByAccount(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","URL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
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
                                    
                                                object.setValidNullFields(com.rn.supera.ws.typed.nullfields.AnswerNullFields.Factory.parse(reader));
                                              
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
           
          