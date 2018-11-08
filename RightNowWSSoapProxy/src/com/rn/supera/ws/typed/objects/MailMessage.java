
/**
 * MailMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rn.supera.ws.typed.objects;
            

            /**
            *  MailMessage bean class
            */
        
        public  class MailMessage
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MailMessage
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
                        * field for BCC
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.MailMessageRecipients localBCC ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBCCTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.MailMessageRecipients
                           */
                           public  com.rn.supera.ws.typed.objects.MailMessageRecipients getBCC(){
                               return localBCC;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BCC
                               */
                               public void setBCC(com.rn.supera.ws.typed.objects.MailMessageRecipients param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBCCTracker = true;
                                       } else {
                                          localBCCTracker = false;
                                              
                                       }
                                   
                                            this.localBCC=param;
                                    

                               }
                            

                        /**
                        * field for Body
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.MailMessageBody localBody ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBodyTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.MailMessageBody
                           */
                           public  com.rn.supera.ws.typed.objects.MailMessageBody getBody(){
                               return localBody;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Body
                               */
                               public void setBody(com.rn.supera.ws.typed.objects.MailMessageBody param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBodyTracker = true;
                                       } else {
                                          localBodyTracker = false;
                                              
                                       }
                                   
                                            this.localBody=param;
                                    

                               }
                            

                        /**
                        * field for CC
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.MailMessageRecipients localCC ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCCTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.MailMessageRecipients
                           */
                           public  com.rn.supera.ws.typed.objects.MailMessageRecipients getCC(){
                               return localCC;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CC
                               */
                               public void setCC(com.rn.supera.ws.typed.objects.MailMessageRecipients param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCCTracker = true;
                                       } else {
                                          localCCTracker = false;
                                              
                                       }
                                   
                                            this.localCC=param;
                                    

                               }
                            

                        /**
                        * field for FileAttachments
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.FileAttachmentList localFileAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileAttachmentsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.FileAttachmentList
                           */
                           public  com.rn.supera.ws.typed.objects.FileAttachmentList getFileAttachments(){
                               return localFileAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileAttachments
                               */
                               public void setFileAttachments(com.rn.supera.ws.typed.objects.FileAttachmentList param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFileAttachmentsTracker = true;
                                       } else {
                                          localFileAttachmentsTracker = true;
                                              
                                       }
                                   
                                            this.localFileAttachments=param;
                                    

                               }
                            

                        /**
                        * field for FriendlyFromAddress
                        */

                        
                                    protected java.lang.String localFriendlyFromAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFriendlyFromAddressTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFriendlyFromAddress(){
                               return localFriendlyFromAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FriendlyFromAddress
                               */
                               public void setFriendlyFromAddress(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFriendlyFromAddressTracker = true;
                                       } else {
                                          localFriendlyFromAddressTracker = false;
                                              
                                       }
                                   
                                            this.localFriendlyFromAddress=param;
                                    

                               }
                            

                        /**
                        * field for FromMailbox
                        */

                        
                                    protected com.rn.supera.ws.typed.base.NamedID localFromMailbox ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFromMailboxTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.base.NamedID
                           */
                           public  com.rn.supera.ws.typed.base.NamedID getFromMailbox(){
                               return localFromMailbox;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FromMailbox
                               */
                               public void setFromMailbox(com.rn.supera.ws.typed.base.NamedID param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localFromMailboxTracker = true;
                                       } else {
                                          localFromMailboxTracker = false;
                                              
                                       }
                                   
                                            this.localFromMailbox=param;
                                    

                               }
                            

                        /**
                        * field for Headers
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localHeaders ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHeadersTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getHeaders(){
                               return localHeaders;
                           }

                           
                        


                               
                              /**
                               * validate the array for Headers
                               */
                              protected void validateHeaders(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Headers
                              */
                              public void setHeaders(java.lang.String[] param){
                              
                                   validateHeaders(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localHeadersTracker = true;
                                          } else {
                                             localHeadersTracker = false;
                                                 
                                          }
                                      
                                      this.localHeaders=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addHeaders(java.lang.String param){
                                   if (localHeaders == null){
                                   localHeaders = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localHeadersTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localHeaders);
                               list.add(param);
                               this.localHeaders =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Options
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.MailMessageOptions localOptions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOptionsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.MailMessageOptions
                           */
                           public  com.rn.supera.ws.typed.objects.MailMessageOptions getOptions(){
                               return localOptions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Options
                               */
                               public void setOptions(com.rn.supera.ws.typed.objects.MailMessageOptions param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localOptionsTracker = true;
                                       } else {
                                          localOptionsTracker = false;
                                              
                                       }
                                   
                                            this.localOptions=param;
                                    

                               }
                            

                        /**
                        * field for ReplyToAddress
                        */

                        
                                    protected java.lang.String localReplyToAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReplyToAddressTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReplyToAddress(){
                               return localReplyToAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplyToAddress
                               */
                               public void setReplyToAddress(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReplyToAddressTracker = true;
                                       } else {
                                          localReplyToAddressTracker = false;
                                              
                                       }
                                   
                                            this.localReplyToAddress=param;
                                    

                               }
                            

                        /**
                        * field for Status
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.MailMessageStatus localStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.MailMessageStatus
                           */
                           public  com.rn.supera.ws.typed.objects.MailMessageStatus getStatus(){
                               return localStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Status
                               */
                               public void setStatus(com.rn.supera.ws.typed.objects.MailMessageStatus param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStatusTracker = true;
                                       } else {
                                          localStatusTracker = false;
                                              
                                       }
                                   
                                            this.localStatus=param;
                                    

                               }
                            

                        /**
                        * field for Subject
                        */

                        
                                    protected java.lang.String localSubject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubjectTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSubject(){
                               return localSubject;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Subject
                               */
                               public void setSubject(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSubjectTracker = true;
                                       } else {
                                          localSubjectTracker = false;
                                              
                                       }
                                   
                                            this.localSubject=param;
                                    

                               }
                            

                        /**
                        * field for To
                        */

                        
                                    protected com.rn.supera.ws.typed.objects.MailMessageRecipients localTo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localToTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.objects.MailMessageRecipients
                           */
                           public  com.rn.supera.ws.typed.objects.MailMessageRecipients getTo(){
                               return localTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param To
                               */
                               public void setTo(com.rn.supera.ws.typed.objects.MailMessageRecipients param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localToTracker = true;
                                       } else {
                                          localToTracker = false;
                                              
                                       }
                                   
                                            this.localTo=param;
                                    

                               }
                            

                        /**
                        * field for ValidNullFields
                        */

                        
                                    protected com.rn.supera.ws.typed.nullfields.MailMessageNullFields localValidNullFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidNullFieldsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.nullfields.MailMessageNullFields
                           */
                           public  com.rn.supera.ws.typed.nullfields.MailMessageNullFields getValidNullFields(){
                               return localValidNullFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidNullFields
                               */
                               public void setValidNullFields(com.rn.supera.ws.typed.nullfields.MailMessageNullFields param){
                            
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
                       MailMessage.this.serialize(parentQName,factory,xmlWriter);
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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:objects.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":MailMessage",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MailMessage",
                           xmlWriter);
                   }

               
                   }
                if (localBCCTracker){
                                            if (localBCC==null){
                                                 throw new org.apache.axis2.databinding.ADBException("BCC cannot be null!!");
                                            }
                                           localBCC.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","BCC"),
                                               factory,xmlWriter);
                                        } if (localBodyTracker){
                                            if (localBody==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Body cannot be null!!");
                                            }
                                           localBody.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Body"),
                                               factory,xmlWriter);
                                        } if (localCCTracker){
                                            if (localCC==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CC cannot be null!!");
                                            }
                                           localCC.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CC"),
                                               factory,xmlWriter);
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
                                } if (localFriendlyFromAddressTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"FriendlyFromAddress", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"FriendlyFromAddress");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("FriendlyFromAddress");
                                    }
                                

                                          if (localFriendlyFromAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("FriendlyFromAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFriendlyFromAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFromMailboxTracker){
                                            if (localFromMailbox==null){
                                                 throw new org.apache.axis2.databinding.ADBException("FromMailbox cannot be null!!");
                                            }
                                           localFromMailbox.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","FromMailbox"),
                                               factory,xmlWriter);
                                        } if (localHeadersTracker){
                             if (localHeaders!=null) {
                                   namespace = "urn:objects.ws.rightnow.com/v1_3";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localHeaders.length;i++){
                                        
                                            if (localHeaders[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"Headers", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"Headers");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("Headers");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHeaders[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("Headers cannot be null!!");
                                    
                             }

                        } if (localOptionsTracker){
                                            if (localOptions==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Options cannot be null!!");
                                            }
                                           localOptions.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Options"),
                                               factory,xmlWriter);
                                        } if (localReplyToAddressTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReplyToAddress", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReplyToAddress");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReplyToAddress");
                                    }
                                

                                          if (localReplyToAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReplyToAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReplyToAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStatusTracker){
                                            if (localStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                            }
                                           localStatus.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Status"),
                                               factory,xmlWriter);
                                        } if (localSubjectTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Subject", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Subject");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Subject");
                                    }
                                

                                          if (localSubject==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Subject cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubject);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localToTracker){
                                            if (localTo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("To cannot be null!!");
                                            }
                                           localTo.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","To"),
                                               factory,xmlWriter);
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

                 if (localBCCTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "BCC"));
                            
                            
                                    if (localBCC==null){
                                         throw new org.apache.axis2.databinding.ADBException("BCC cannot be null!!");
                                    }
                                    elementList.add(localBCC);
                                } if (localBodyTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Body"));
                            
                            
                                    if (localBody==null){
                                         throw new org.apache.axis2.databinding.ADBException("Body cannot be null!!");
                                    }
                                    elementList.add(localBody);
                                } if (localCCTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "CC"));
                            
                            
                                    if (localCC==null){
                                         throw new org.apache.axis2.databinding.ADBException("CC cannot be null!!");
                                    }
                                    elementList.add(localCC);
                                } if (localFileAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "FileAttachments"));
                            
                            
                                    elementList.add(localFileAttachments==null?null:
                                    localFileAttachments);
                                } if (localFriendlyFromAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "FriendlyFromAddress"));
                                 
                                        if (localFriendlyFromAddress != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFriendlyFromAddress));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("FriendlyFromAddress cannot be null!!");
                                        }
                                    } if (localFromMailboxTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "FromMailbox"));
                            
                            
                                    if (localFromMailbox==null){
                                         throw new org.apache.axis2.databinding.ADBException("FromMailbox cannot be null!!");
                                    }
                                    elementList.add(localFromMailbox);
                                } if (localHeadersTracker){
                            if (localHeaders!=null){
                                  for (int i = 0;i < localHeaders.length;i++){
                                      
                                         if (localHeaders[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                              "Headers"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHeaders[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("Headers cannot be null!!");
                                
                            }

                        } if (localOptionsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Options"));
                            
                            
                                    if (localOptions==null){
                                         throw new org.apache.axis2.databinding.ADBException("Options cannot be null!!");
                                    }
                                    elementList.add(localOptions);
                                } if (localReplyToAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ReplyToAddress"));
                                 
                                        if (localReplyToAddress != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplyToAddress));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReplyToAddress cannot be null!!");
                                        }
                                    } if (localStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Status"));
                            
                            
                                    if (localStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");
                                    }
                                    elementList.add(localStatus);
                                } if (localSubjectTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Subject"));
                                 
                                        if (localSubject != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Subject cannot be null!!");
                                        }
                                    } if (localToTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "To"));
                            
                            
                                    if (localTo==null){
                                         throw new org.apache.axis2.databinding.ADBException("To cannot be null!!");
                                    }
                                    elementList.add(localTo);
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
        public static MailMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MailMessage object =
                new MailMessage();

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
                    
                            if (!"MailMessage".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MailMessage)com.rn.supera.ws.typed.base.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","BCC").equals(reader.getName())){
                                
                                                object.setBCC(com.rn.supera.ws.typed.objects.MailMessageRecipients.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Body").equals(reader.getName())){
                                
                                                object.setBody(com.rn.supera.ws.typed.objects.MailMessageBody.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CC").equals(reader.getName())){
                                
                                                object.setCC(com.rn.supera.ws.typed.objects.MailMessageRecipients.Factory.parse(reader));
                                              
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
                                    
                                                object.setFileAttachments(com.rn.supera.ws.typed.objects.FileAttachmentList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","FriendlyFromAddress").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFriendlyFromAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","FromMailbox").equals(reader.getName())){
                                
                                                object.setFromMailbox(com.rn.supera.ws.typed.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Headers").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list7.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone7 = false;
                                            while(!loopDone7){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone7 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Headers").equals(reader.getName())){
                                                         list7.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setHeaders((java.lang.String[])
                                                        list7.toArray(new java.lang.String[list7.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Options").equals(reader.getName())){
                                
                                                object.setOptions(com.rn.supera.ws.typed.objects.MailMessageOptions.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ReplyToAddress").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReplyToAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Status").equals(reader.getName())){
                                
                                                object.setStatus(com.rn.supera.ws.typed.objects.MailMessageStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Subject").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubject(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","To").equals(reader.getName())){
                                
                                                object.setTo(com.rn.supera.ws.typed.objects.MailMessageRecipients.Factory.parse(reader));
                                              
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
                                    
                                                object.setValidNullFields(com.rn.supera.ws.typed.nullfields.MailMessageNullFields.Factory.parse(reader));
                                              
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
           
          