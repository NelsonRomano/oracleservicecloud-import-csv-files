
/**
 * MetaDataRelationship.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rn.supera.ws.typed.metadata;
            

            /**
            *  MetaDataRelationship bean class
            */
        
        public  class MetaDataRelationship
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MetaDataRelationship
                Namespace URI = urn:metadata.ws.rightnow.com/v1_3
                Namespace Prefix = ns5
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:metadata.ws.rightnow.com/v1_3")){
                return "ns5";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for MyCardinality
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum localMyCardinality ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum getMyCardinality(){
                               return localMyCardinality;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MyCardinality
                               */
                               public void setMyCardinality(com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum param){
                            
                                            this.localMyCardinality=param;
                                    

                               }
                            

                        /**
                        * field for MyKeyAttributes
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localMyKeyAttributes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMyKeyAttributesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getMyKeyAttributes(){
                               return localMyKeyAttributes;
                           }

                           
                        


                               
                              /**
                               * validate the array for MyKeyAttributes
                               */
                              protected void validateMyKeyAttributes(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MyKeyAttributes
                              */
                              public void setMyKeyAttributes(java.lang.String[] param){
                              
                                   validateMyKeyAttributes(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localMyKeyAttributesTracker = true;
                                          } else {
                                             localMyKeyAttributesTracker = false;
                                                 
                                          }
                                      
                                      this.localMyKeyAttributes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addMyKeyAttributes(java.lang.String param){
                                   if (localMyKeyAttributes == null){
                                   localMyKeyAttributes = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localMyKeyAttributesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMyKeyAttributes);
                               list.add(param);
                               this.localMyKeyAttributes =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for MyKeyType
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum localMyKeyType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum getMyKeyType(){
                               return localMyKeyType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MyKeyType
                               */
                               public void setMyKeyType(com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum param){
                            
                                            this.localMyKeyType=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                

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
                            
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Navigability
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataNavigabilityEnum localNavigability ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataNavigabilityEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataNavigabilityEnum getNavigability(){
                               return localNavigability;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Navigability
                               */
                               public void setNavigability(com.rn.supera.ws.typed.metadata.MetaDataNavigabilityEnum param){
                            
                                            this.localNavigability=param;
                                    

                               }
                            

                        /**
                        * field for OtherClassCardinality
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum localOtherClassCardinality ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum getOtherClassCardinality(){
                               return localOtherClassCardinality;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherClassCardinality
                               */
                               public void setOtherClassCardinality(com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum param){
                            
                                            this.localOtherClassCardinality=param;
                                    

                               }
                            

                        /**
                        * field for OtherClassKeyAttributes
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localOtherClassKeyAttributes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOtherClassKeyAttributesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getOtherClassKeyAttributes(){
                               return localOtherClassKeyAttributes;
                           }

                           
                        


                               
                              /**
                               * validate the array for OtherClassKeyAttributes
                               */
                              protected void validateOtherClassKeyAttributes(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param OtherClassKeyAttributes
                              */
                              public void setOtherClassKeyAttributes(java.lang.String[] param){
                              
                                   validateOtherClassKeyAttributes(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localOtherClassKeyAttributesTracker = true;
                                          } else {
                                             localOtherClassKeyAttributesTracker = false;
                                                 
                                          }
                                      
                                      this.localOtherClassKeyAttributes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addOtherClassKeyAttributes(java.lang.String param){
                                   if (localOtherClassKeyAttributes == null){
                                   localOtherClassKeyAttributes = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localOtherClassKeyAttributesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localOtherClassKeyAttributes);
                               list.add(param);
                               this.localOtherClassKeyAttributes =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for OtherClassKeyType
                        * This was an Array!
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[] localOtherClassKeyType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOtherClassKeyTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[]
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[] getOtherClassKeyType(){
                               return localOtherClassKeyType;
                           }

                           
                        


                               
                              /**
                               * validate the array for OtherClassKeyType
                               */
                              protected void validateOtherClassKeyType(com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param OtherClassKeyType
                              */
                              public void setOtherClassKeyType(com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[] param){
                              
                                   validateOtherClassKeyType(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localOtherClassKeyTypeTracker = true;
                                          } else {
                                             localOtherClassKeyTypeTracker = false;
                                                 
                                          }
                                      
                                      this.localOtherClassKeyType=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum
                             */
                             public void addOtherClassKeyType(com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum param){
                                   if (localOtherClassKeyType == null){
                                   localOtherClassKeyType = new com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[]{};
                                   }

                            
                                 //update the setting tracker
                                localOtherClassKeyTypeTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localOtherClassKeyType);
                               list.add(param);
                               this.localOtherClassKeyType =
                             (com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[])list.toArray(
                            new com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[list.size()]);

                             }
                             

                        /**
                        * field for OtherClassName
                        */

                        
                                    protected com.rn.supera.ws.typed.generic.RNObjectType localOtherClassName ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.generic.RNObjectType
                           */
                           public  com.rn.supera.ws.typed.generic.RNObjectType getOtherClassName(){
                               return localOtherClassName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherClassName
                               */
                               public void setOtherClassName(com.rn.supera.ws.typed.generic.RNObjectType param){
                            
                                            this.localOtherClassName=param;
                                    

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
                       MetaDataRelationship.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:metadata.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":MetaDataRelationship",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MetaDataRelationship",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localMyCardinality==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MyCardinality cannot be null!!");
                                            }
                                           localMyCardinality.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MyCardinality"),
                                               factory,xmlWriter);
                                         if (localMyKeyAttributesTracker){
                             if (localMyKeyAttributes!=null) {
                                   namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localMyKeyAttributes.length;i++){
                                        
                                            if (localMyKeyAttributes[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"MyKeyAttributes", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"MyKeyAttributes");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("MyKeyAttributes");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMyKeyAttributes[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("MyKeyAttributes cannot be null!!");
                                    
                             }

                        }
                                            if (localMyKeyType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MyKeyType cannot be null!!");
                                            }
                                           localMyKeyType.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MyKeyType"),
                                               factory,xmlWriter);
                                        
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
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
                             
                                            if (localNavigability==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Navigability cannot be null!!");
                                            }
                                           localNavigability.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","Navigability"),
                                               factory,xmlWriter);
                                        
                                            if (localOtherClassCardinality==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OtherClassCardinality cannot be null!!");
                                            }
                                           localOtherClassCardinality.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassCardinality"),
                                               factory,xmlWriter);
                                         if (localOtherClassKeyAttributesTracker){
                             if (localOtherClassKeyAttributes!=null) {
                                   namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                   boolean emptyNamespace = namespace == null || namespace.length() == 0;
                                   prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
                                   for (int i = 0;i < localOtherClassKeyAttributes.length;i++){
                                        
                                            if (localOtherClassKeyAttributes[i] != null){
                                        
                                                if (!emptyNamespace) {
                                                    if (prefix == null) {
                                                        java.lang.String prefix2 = generatePrefix(namespace);

                                                        xmlWriter.writeStartElement(prefix2,"OtherClassKeyAttributes", namespace);
                                                        xmlWriter.writeNamespace(prefix2, namespace);
                                                        xmlWriter.setPrefix(prefix2, namespace);

                                                    } else {
                                                        xmlWriter.writeStartElement(namespace,"OtherClassKeyAttributes");
                                                    }

                                                } else {
                                                    xmlWriter.writeStartElement("OtherClassKeyAttributes");
                                                }

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherClassKeyAttributes[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("OtherClassKeyAttributes cannot be null!!");
                                    
                             }

                        } if (localOtherClassKeyTypeTracker){
                                       if (localOtherClassKeyType!=null){
                                            for (int i = 0;i < localOtherClassKeyType.length;i++){
                                                if (localOtherClassKeyType[i] != null){
                                                 localOtherClassKeyType[i].serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassKeyType"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("OtherClassKeyType cannot be null!!");
                                        
                                    }
                                 }
                                            if (localOtherClassName==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OtherClassName cannot be null!!");
                                            }
                                           localOtherClassName.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassName"),
                                               factory,xmlWriter);
                                        
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

                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MyCardinality"));
                            
                            
                                    if (localMyCardinality==null){
                                         throw new org.apache.axis2.databinding.ADBException("MyCardinality cannot be null!!");
                                    }
                                    elementList.add(localMyCardinality);
                                 if (localMyKeyAttributesTracker){
                            if (localMyKeyAttributes!=null){
                                  for (int i = 0;i < localMyKeyAttributes.length;i++){
                                      
                                         if (localMyKeyAttributes[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                              "MyKeyAttributes"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMyKeyAttributes[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("MyKeyAttributes cannot be null!!");
                                
                            }

                        }
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MyKeyType"));
                            
                            
                                    if (localMyKeyType==null){
                                         throw new org.apache.axis2.databinding.ADBException("MyKeyType cannot be null!!");
                                    }
                                    elementList.add(localMyKeyType);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "Name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                        }
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "Navigability"));
                            
                            
                                    if (localNavigability==null){
                                         throw new org.apache.axis2.databinding.ADBException("Navigability cannot be null!!");
                                    }
                                    elementList.add(localNavigability);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "OtherClassCardinality"));
                            
                            
                                    if (localOtherClassCardinality==null){
                                         throw new org.apache.axis2.databinding.ADBException("OtherClassCardinality cannot be null!!");
                                    }
                                    elementList.add(localOtherClassCardinality);
                                 if (localOtherClassKeyAttributesTracker){
                            if (localOtherClassKeyAttributes!=null){
                                  for (int i = 0;i < localOtherClassKeyAttributes.length;i++){
                                      
                                         if (localOtherClassKeyAttributes[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                              "OtherClassKeyAttributes"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOtherClassKeyAttributes[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("OtherClassKeyAttributes cannot be null!!");
                                
                            }

                        } if (localOtherClassKeyTypeTracker){
                             if (localOtherClassKeyType!=null) {
                                 for (int i = 0;i < localOtherClassKeyType.length;i++){

                                    if (localOtherClassKeyType[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                          "OtherClassKeyType"));
                                         elementList.add(localOtherClassKeyType[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("OtherClassKeyType cannot be null!!");
                                    
                             }

                        }
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "OtherClassName"));
                            
                            
                                    if (localOtherClassName==null){
                                         throw new org.apache.axis2.databinding.ADBException("OtherClassName cannot be null!!");
                                    }
                                    elementList.add(localOtherClassName);
                                

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
        public static MetaDataRelationship parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MetaDataRelationship object =
                new MetaDataRelationship();

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
                    
                            if (!"MetaDataRelationship".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MetaDataRelationship)com.rn.supera.ws.typed.base.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MyCardinality").equals(reader.getName())){
                                
                                                object.setMyCardinality(com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MyKeyAttributes").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list2.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone2 = false;
                                            while(!loopDone2){
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
                                                    loopDone2 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MyKeyAttributes").equals(reader.getName())){
                                                         list2.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone2 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setMyKeyAttributes((java.lang.String[])
                                                        list2.toArray(new java.lang.String[list2.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MyKeyType").equals(reader.getName())){
                                
                                                object.setMyKeyType(com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","Name").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","Navigability").equals(reader.getName())){
                                
                                                object.setNavigability(com.rn.supera.ws.typed.metadata.MetaDataNavigabilityEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassCardinality").equals(reader.getName())){
                                
                                                object.setOtherClassCardinality(com.rn.supera.ws.typed.metadata.MetaDataCardinalityEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassKeyAttributes").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassKeyAttributes").equals(reader.getName())){
                                                         list7.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setOtherClassKeyAttributes((java.lang.String[])
                                                        list7.toArray(new java.lang.String[list7.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassKeyType").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list8.add(com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassKeyType").equals(reader.getName())){
                                                                    list8.add(com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setOtherClassKeyType((com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rn.supera.ws.typed.metadata.MetaDataKeyTypeEnum.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","OtherClassName").equals(reader.getName())){
                                
                                                object.setOtherClassName(com.rn.supera.ws.typed.generic.RNObjectType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
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
           
          