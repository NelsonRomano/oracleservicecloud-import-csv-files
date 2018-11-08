
/**
 * MetaDataAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.rn.supera.ws.typed.metadata;
            

            /**
            *  MetaDataAttribute bean class
            */
        
        public  class MetaDataAttribute
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MetaDataAttribute
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
                        * field for DataType
                        */

                        
                                    protected com.rn.supera.ws.typed.generic.DataTypeEnum localDataType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.generic.DataTypeEnum
                           */
                           public  com.rn.supera.ws.typed.generic.DataTypeEnum getDataType(){
                               return localDataType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DataType
                               */
                               public void setDataType(com.rn.supera.ws.typed.generic.DataTypeEnum param){
                            
                                            this.localDataType=param;
                                    

                               }
                            

                        /**
                        * field for DataTypeName
                        */

                        
                                    protected java.lang.String localDataTypeName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDataTypeNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDataTypeName(){
                               return localDataTypeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DataTypeName
                               */
                               public void setDataTypeName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDataTypeNameTracker = true;
                                       } else {
                                          localDataTypeNameTracker = false;
                                              
                                       }
                                   
                                            this.localDataTypeName=param;
                                    

                               }
                            

                        /**
                        * field for MetaDataLink
                        */

                        
                                    protected java.lang.String localMetaDataLink ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMetaDataLinkTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMetaDataLink(){
                               return localMetaDataLink;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MetaDataLink
                               */
                               public void setMetaDataLink(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMetaDataLinkTracker = true;
                                       } else {
                                          localMetaDataLinkTracker = false;
                                              
                                       }
                                   
                                            this.localMetaDataLink=param;
                                    

                               }
                            

                        /**
                        * field for InputMask
                        */

                        
                                    protected java.lang.String localInputMask ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInputMaskTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInputMask(){
                               return localInputMask;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InputMask
                               */
                               public void setInputMask(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localInputMaskTracker = true;
                                       } else {
                                          localInputMaskTracker = false;
                                              
                                       }
                                   
                                            this.localInputMask=param;
                                    

                               }
                            

                        /**
                        * field for IsDeprecated
                        */

                        
                                    protected boolean localIsDeprecated ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsDeprecated(){
                               return localIsDeprecated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsDeprecated
                               */
                               public void setIsDeprecated(boolean param){
                            
                                            this.localIsDeprecated=param;
                                    

                               }
                            

                        /**
                        * field for IsEnumerable
                        */

                        
                                    protected boolean localIsEnumerable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsEnumerableTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsEnumerable(){
                               return localIsEnumerable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsEnumerable
                               */
                               public void setIsEnumerable(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localIsEnumerableTracker = false;
                                              
                                       } else {
                                          localIsEnumerableTracker = true;
                                       }
                                   
                                            this.localIsEnumerable=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for Label
                        */

                        
                                    protected java.lang.String localLabel ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLabel(){
                               return localLabel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Label
                               */
                               public void setLabel(java.lang.String param){
                            
                                            this.localLabel=param;
                                    

                               }
                            

                        /**
                        * field for MaxBytes
                        */

                        
                                    protected long localMaxBytes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxBytesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMaxBytes(){
                               return localMaxBytes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxBytes
                               */
                               public void setMaxBytes(long param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Long.MIN_VALUE) {
                                           localMaxBytesTracker = false;
                                              
                                       } else {
                                          localMaxBytesTracker = true;
                                       }
                                   
                                            this.localMaxBytes=param;
                                    

                               }
                            

                        /**
                        * field for MaxDepth
                        */

                        
                                    protected int localMaxDepth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxDepthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMaxDepth(){
                               return localMaxDepth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxDepth
                               */
                               public void setMaxDepth(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localMaxDepthTracker = false;
                                              
                                       } else {
                                          localMaxDepthTracker = true;
                                       }
                                   
                                            this.localMaxDepth=param;
                                    

                               }
                            

                        /**
                        * field for MaxLength
                        */

                        
                                    protected long localMaxLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMaxLength(){
                               return localMaxLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxLength
                               */
                               public void setMaxLength(long param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Long.MIN_VALUE) {
                                           localMaxLengthTracker = false;
                                              
                                       } else {
                                          localMaxLengthTracker = true;
                                       }
                                   
                                            this.localMaxLength=param;
                                    

                               }
                            

                        /**
                        * field for MaxValue
                        */

                        
                                    protected long localMaxValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMaxValue(){
                               return localMaxValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxValue
                               */
                               public void setMaxValue(long param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Long.MIN_VALUE) {
                                           localMaxValueTracker = false;
                                              
                                       } else {
                                          localMaxValueTracker = true;
                                       }
                                   
                                            this.localMaxValue=param;
                                    

                               }
                            

                        /**
                        * field for MinLength
                        */

                        
                                    protected long localMinLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinLengthTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMinLength(){
                               return localMinLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinLength
                               */
                               public void setMinLength(long param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Long.MIN_VALUE) {
                                           localMinLengthTracker = false;
                                              
                                       } else {
                                          localMinLengthTracker = true;
                                       }
                                   
                                            this.localMinLength=param;
                                    

                               }
                            

                        /**
                        * field for MinValue
                        */

                        
                                    protected long localMinValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinValueTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMinValue(){
                               return localMinValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinValue
                               */
                               public void setMinValue(long param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Long.MIN_VALUE) {
                                           localMinValueTracker = false;
                                              
                                       } else {
                                          localMinValueTracker = true;
                                       }
                                   
                                            this.localMinValue=param;
                                    

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
                        * field for Nullable
                        */

                        
                                    protected boolean localNullable ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNullable(){
                               return localNullable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Nullable
                               */
                               public void setNullable(boolean param){
                            
                                            this.localNullable=param;
                                    

                               }
                            

                        /**
                        * field for PasswordExpirationInterval
                        */

                        
                                    protected int localPasswordExpirationInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordExpirationIntervalTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordExpirationInterval(){
                               return localPasswordExpirationInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordExpirationInterval
                               */
                               public void setPasswordExpirationInterval(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordExpirationIntervalTracker = false;
                                              
                                       } else {
                                          localPasswordExpirationIntervalTracker = true;
                                       }
                                   
                                            this.localPasswordExpirationInterval=param;
                                    

                               }
                            

                        /**
                        * field for PasswordGracePeriod
                        */

                        
                                    protected int localPasswordGracePeriod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordGracePeriodTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordGracePeriod(){
                               return localPasswordGracePeriod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordGracePeriod
                               */
                               public void setPasswordGracePeriod(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordGracePeriodTracker = false;
                                              
                                       } else {
                                          localPasswordGracePeriodTracker = true;
                                       }
                                   
                                            this.localPasswordGracePeriod=param;
                                    

                               }
                            

                        /**
                        * field for PasswordMaxOccurrence
                        */

                        
                                    protected int localPasswordMaxOccurrence ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordMaxOccurrenceTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordMaxOccurrence(){
                               return localPasswordMaxOccurrence;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordMaxOccurrence
                               */
                               public void setPasswordMaxOccurrence(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordMaxOccurrenceTracker = false;
                                              
                                       } else {
                                          localPasswordMaxOccurrenceTracker = true;
                                       }
                                   
                                            this.localPasswordMaxOccurrence=param;
                                    

                               }
                            

                        /**
                        * field for PasswordMaxOldPasswords
                        */

                        
                                    protected int localPasswordMaxOldPasswords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordMaxOldPasswordsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordMaxOldPasswords(){
                               return localPasswordMaxOldPasswords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordMaxOldPasswords
                               */
                               public void setPasswordMaxOldPasswords(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordMaxOldPasswordsTracker = false;
                                              
                                       } else {
                                          localPasswordMaxOldPasswordsTracker = true;
                                       }
                                   
                                            this.localPasswordMaxOldPasswords=param;
                                    

                               }
                            

                        /**
                        * field for PasswordMaxRepetitions
                        */

                        
                                    protected int localPasswordMaxRepetitions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordMaxRepetitionsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordMaxRepetitions(){
                               return localPasswordMaxRepetitions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordMaxRepetitions
                               */
                               public void setPasswordMaxRepetitions(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordMaxRepetitionsTracker = false;
                                              
                                       } else {
                                          localPasswordMaxRepetitionsTracker = true;
                                       }
                                   
                                            this.localPasswordMaxRepetitions=param;
                                    

                               }
                            

                        /**
                        * field for PasswordMinLowerCase
                        */

                        
                                    protected int localPasswordMinLowerCase ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordMinLowerCaseTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordMinLowerCase(){
                               return localPasswordMinLowerCase;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordMinLowerCase
                               */
                               public void setPasswordMinLowerCase(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordMinLowerCaseTracker = false;
                                              
                                       } else {
                                          localPasswordMinLowerCaseTracker = true;
                                       }
                                   
                                            this.localPasswordMinLowerCase=param;
                                    

                               }
                            

                        /**
                        * field for PasswordMinNumericSpecial
                        */

                        
                                    protected int localPasswordMinNumericSpecial ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordMinNumericSpecialTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordMinNumericSpecial(){
                               return localPasswordMinNumericSpecial;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordMinNumericSpecial
                               */
                               public void setPasswordMinNumericSpecial(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordMinNumericSpecialTracker = false;
                                              
                                       } else {
                                          localPasswordMinNumericSpecialTracker = true;
                                       }
                                   
                                            this.localPasswordMinNumericSpecial=param;
                                    

                               }
                            

                        /**
                        * field for PasswordMinSpecial
                        */

                        
                                    protected int localPasswordMinSpecial ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordMinSpecialTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordMinSpecial(){
                               return localPasswordMinSpecial;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordMinSpecial
                               */
                               public void setPasswordMinSpecial(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordMinSpecialTracker = false;
                                              
                                       } else {
                                          localPasswordMinSpecialTracker = true;
                                       }
                                   
                                            this.localPasswordMinSpecial=param;
                                    

                               }
                            

                        /**
                        * field for PasswordMinUpperCase
                        */

                        
                                    protected int localPasswordMinUpperCase ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordMinUpperCaseTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordMinUpperCase(){
                               return localPasswordMinUpperCase;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordMinUpperCase
                               */
                               public void setPasswordMinUpperCase(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordMinUpperCaseTracker = false;
                                              
                                       } else {
                                          localPasswordMinUpperCaseTracker = true;
                                       }
                                   
                                            this.localPasswordMinUpperCase=param;
                                    

                               }
                            

                        /**
                        * field for PasswordWarningPeriod
                        */

                        
                                    protected int localPasswordWarningPeriod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordWarningPeriodTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPasswordWarningPeriod(){
                               return localPasswordWarningPeriod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordWarningPeriod
                               */
                               public void setPasswordWarningPeriod(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localPasswordWarningPeriodTracker = false;
                                              
                                       } else {
                                          localPasswordWarningPeriodTracker = true;
                                       }
                                   
                                            this.localPasswordWarningPeriod=param;
                                    

                               }
                            

                        /**
                        * field for Pattern
                        */

                        
                                    protected java.lang.String localPattern ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPatternTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPattern(){
                               return localPattern;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Pattern
                               */
                               public void setPattern(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPatternTracker = true;
                                       } else {
                                          localPatternTracker = false;
                                              
                                       }
                                   
                                            this.localPattern=param;
                                    

                               }
                            

                        /**
                        * field for UsageOnCreate
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataUsageEnum localUsageOnCreate ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataUsageEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataUsageEnum getUsageOnCreate(){
                               return localUsageOnCreate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageOnCreate
                               */
                               public void setUsageOnCreate(com.rn.supera.ws.typed.metadata.MetaDataUsageEnum param){
                            
                                            this.localUsageOnCreate=param;
                                    

                               }
                            

                        /**
                        * field for UsageOnDestroy
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataUsageEnum localUsageOnDestroy ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataUsageEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataUsageEnum getUsageOnDestroy(){
                               return localUsageOnDestroy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageOnDestroy
                               */
                               public void setUsageOnDestroy(com.rn.supera.ws.typed.metadata.MetaDataUsageEnum param){
                            
                                            this.localUsageOnDestroy=param;
                                    

                               }
                            

                        /**
                        * field for UsageOnGet
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataUsageEnum localUsageOnGet ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataUsageEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataUsageEnum getUsageOnGet(){
                               return localUsageOnGet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageOnGet
                               */
                               public void setUsageOnGet(com.rn.supera.ws.typed.metadata.MetaDataUsageEnum param){
                            
                                            this.localUsageOnGet=param;
                                    

                               }
                            

                        /**
                        * field for UsageOnUpdate
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.MetaDataUsageEnum localUsageOnUpdate ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.MetaDataUsageEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.MetaDataUsageEnum getUsageOnUpdate(){
                               return localUsageOnUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageOnUpdate
                               */
                               public void setUsageOnUpdate(com.rn.supera.ws.typed.metadata.MetaDataUsageEnum param){
                            
                                            this.localUsageOnUpdate=param;
                                    

                               }
                            

                        /**
                        * field for UsageType
                        */

                        
                                    protected com.rn.supera.ws.typed.metadata.UsageTypeEnum localUsageType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsageTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.rn.supera.ws.typed.metadata.UsageTypeEnum
                           */
                           public  com.rn.supera.ws.typed.metadata.UsageTypeEnum getUsageType(){
                               return localUsageType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsageType
                               */
                               public void setUsageType(com.rn.supera.ws.typed.metadata.UsageTypeEnum param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsageTypeTracker = true;
                                       } else {
                                          localUsageTypeTracker = false;
                                              
                                       }
                                   
                                            this.localUsageType=param;
                                    

                               }
                            

                        /**
                        * field for UsedAsName
                        */

                        
                                    protected boolean localUsedAsName ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUsedAsName(){
                               return localUsedAsName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsedAsName
                               */
                               public void setUsedAsName(boolean param){
                            
                                            this.localUsedAsName=param;
                                    

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
                       MetaDataAttribute.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":MetaDataAttribute",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MetaDataAttribute",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localDataType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DataType cannot be null!!");
                                            }
                                           localDataType.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","DataType"),
                                               factory,xmlWriter);
                                         if (localDataTypeNameTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"DataTypeName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DataTypeName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DataTypeName");
                                    }
                                

                                          if (localDataTypeName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DataTypeName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDataTypeName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMetaDataLinkTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MetaDataLink", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MetaDataLink");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MetaDataLink");
                                    }
                                

                                          if (localMetaDataLink==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MetaDataLink cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMetaDataLink);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInputMaskTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"InputMask", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"InputMask");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("InputMask");
                                    }
                                

                                          if (localInputMask==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("InputMask cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInputMask);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"IsDeprecated", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"IsDeprecated");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("IsDeprecated");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("IsDeprecated cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsDeprecated));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localIsEnumerableTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"IsEnumerable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"IsEnumerable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("IsEnumerable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("IsEnumerable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsEnumerable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Description", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Description");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Description");
                                    }
                                

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Label", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Label");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Label");
                                    }
                                

                                          if (localLabel==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Label cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLabel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localMaxBytesTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MaxBytes", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MaxBytes");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MaxBytes");
                                    }
                                
                                               if (localMaxBytes==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaxBytes cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxBytes));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxDepthTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MaxDepth", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MaxDepth");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MaxDepth");
                                    }
                                
                                               if (localMaxDepth==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaxDepth cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxDepth));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxLengthTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MaxLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MaxLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MaxLength");
                                    }
                                
                                               if (localMaxLength==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaxLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxValueTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MaxValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MaxValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MaxValue");
                                    }
                                
                                               if (localMaxValue==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MaxValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMinLengthTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MinLength", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MinLength");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MinLength");
                                    }
                                
                                               if (localMinLength==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MinLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMinValueTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MinValue", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MinValue");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MinValue");
                                    }
                                
                                               if (localMinValue==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MinValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
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
                             
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Nullable", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Nullable");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Nullable");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Nullable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNullable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localPasswordExpirationIntervalTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordExpirationInterval", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordExpirationInterval");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordExpirationInterval");
                                    }
                                
                                               if (localPasswordExpirationInterval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordExpirationInterval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordExpirationInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordGracePeriodTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordGracePeriod", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordGracePeriod");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordGracePeriod");
                                    }
                                
                                               if (localPasswordGracePeriod==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordGracePeriod cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordGracePeriod));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordMaxOccurrenceTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordMaxOccurrence", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordMaxOccurrence");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordMaxOccurrence");
                                    }
                                
                                               if (localPasswordMaxOccurrence==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordMaxOccurrence cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMaxOccurrence));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordMaxOldPasswordsTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordMaxOldPasswords", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordMaxOldPasswords");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordMaxOldPasswords");
                                    }
                                
                                               if (localPasswordMaxOldPasswords==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordMaxOldPasswords cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMaxOldPasswords));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordMaxRepetitionsTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordMaxRepetitions", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordMaxRepetitions");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordMaxRepetitions");
                                    }
                                
                                               if (localPasswordMaxRepetitions==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordMaxRepetitions cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMaxRepetitions));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordMinLowerCaseTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordMinLowerCase", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordMinLowerCase");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordMinLowerCase");
                                    }
                                
                                               if (localPasswordMinLowerCase==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordMinLowerCase cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMinLowerCase));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordMinNumericSpecialTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordMinNumericSpecial", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordMinNumericSpecial");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordMinNumericSpecial");
                                    }
                                
                                               if (localPasswordMinNumericSpecial==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordMinNumericSpecial cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMinNumericSpecial));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordMinSpecialTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordMinSpecial", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordMinSpecial");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordMinSpecial");
                                    }
                                
                                               if (localPasswordMinSpecial==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordMinSpecial cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMinSpecial));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordMinUpperCaseTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordMinUpperCase", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordMinUpperCase");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordMinUpperCase");
                                    }
                                
                                               if (localPasswordMinUpperCase==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordMinUpperCase cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMinUpperCase));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordWarningPeriodTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PasswordWarningPeriod", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PasswordWarningPeriod");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PasswordWarningPeriod");
                                    }
                                
                                               if (localPasswordWarningPeriod==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PasswordWarningPeriod cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordWarningPeriod));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPatternTracker){
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Pattern", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Pattern");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Pattern");
                                    }
                                

                                          if (localPattern==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Pattern cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPattern);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localUsageOnCreate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageOnCreate cannot be null!!");
                                            }
                                           localUsageOnCreate.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageOnCreate"),
                                               factory,xmlWriter);
                                        
                                            if (localUsageOnDestroy==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageOnDestroy cannot be null!!");
                                            }
                                           localUsageOnDestroy.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageOnDestroy"),
                                               factory,xmlWriter);
                                        
                                            if (localUsageOnGet==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageOnGet cannot be null!!");
                                            }
                                           localUsageOnGet.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageOnGet"),
                                               factory,xmlWriter);
                                        
                                            if (localUsageOnUpdate==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageOnUpdate cannot be null!!");
                                            }
                                           localUsageOnUpdate.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageOnUpdate"),
                                               factory,xmlWriter);
                                         if (localUsageTypeTracker){
                                            if (localUsageType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UsageType cannot be null!!");
                                            }
                                           localUsageType.serialize(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageType"),
                                               factory,xmlWriter);
                                        }
                                    namespace = "urn:metadata.ws.rightnow.com/v1_3";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"UsedAsName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"UsedAsName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("UsedAsName");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("UsedAsName cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsedAsName));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
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
                                                                      "DataType"));
                            
                            
                                    if (localDataType==null){
                                         throw new org.apache.axis2.databinding.ADBException("DataType cannot be null!!");
                                    }
                                    elementList.add(localDataType);
                                 if (localDataTypeNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "DataTypeName"));
                                 
                                        if (localDataTypeName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataTypeName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DataTypeName cannot be null!!");
                                        }
                                    } if (localMetaDataLinkTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MetaDataLink"));
                                 
                                        if (localMetaDataLink != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMetaDataLink));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MetaDataLink cannot be null!!");
                                        }
                                    } if (localInputMaskTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "InputMask"));
                                 
                                        if (localInputMask != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInputMask));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("InputMask cannot be null!!");
                                        }
                                    }
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "IsDeprecated"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsDeprecated));
                             if (localIsEnumerableTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "IsEnumerable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsEnumerable));
                            }
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "Description"));
                                 
                                        if (localDescription != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "Label"));
                                 
                                        if (localLabel != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLabel));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Label cannot be null!!");
                                        }
                                     if (localMaxBytesTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MaxBytes"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxBytes));
                            } if (localMaxDepthTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MaxDepth"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxDepth));
                            } if (localMaxLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MaxLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxLength));
                            } if (localMaxValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MaxValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxValue));
                            } if (localMinLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MinLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinLength));
                            } if (localMinValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "MinValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinValue));
                            }
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "Name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "Nullable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNullable));
                             if (localPasswordExpirationIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordExpirationInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordExpirationInterval));
                            } if (localPasswordGracePeriodTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordGracePeriod"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordGracePeriod));
                            } if (localPasswordMaxOccurrenceTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordMaxOccurrence"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMaxOccurrence));
                            } if (localPasswordMaxOldPasswordsTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordMaxOldPasswords"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMaxOldPasswords));
                            } if (localPasswordMaxRepetitionsTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordMaxRepetitions"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMaxRepetitions));
                            } if (localPasswordMinLowerCaseTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordMinLowerCase"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMinLowerCase));
                            } if (localPasswordMinNumericSpecialTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordMinNumericSpecial"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMinNumericSpecial));
                            } if (localPasswordMinSpecialTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordMinSpecial"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMinSpecial));
                            } if (localPasswordMinUpperCaseTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordMinUpperCase"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordMinUpperCase));
                            } if (localPasswordWarningPeriodTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "PasswordWarningPeriod"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPasswordWarningPeriod));
                            } if (localPatternTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "Pattern"));
                                 
                                        if (localPattern != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPattern));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Pattern cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "UsageOnCreate"));
                            
                            
                                    if (localUsageOnCreate==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageOnCreate cannot be null!!");
                                    }
                                    elementList.add(localUsageOnCreate);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "UsageOnDestroy"));
                            
                            
                                    if (localUsageOnDestroy==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageOnDestroy cannot be null!!");
                                    }
                                    elementList.add(localUsageOnDestroy);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "UsageOnGet"));
                            
                            
                                    if (localUsageOnGet==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageOnGet cannot be null!!");
                                    }
                                    elementList.add(localUsageOnGet);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "UsageOnUpdate"));
                            
                            
                                    if (localUsageOnUpdate==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageOnUpdate cannot be null!!");
                                    }
                                    elementList.add(localUsageOnUpdate);
                                 if (localUsageTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "UsageType"));
                            
                            
                                    if (localUsageType==null){
                                         throw new org.apache.axis2.databinding.ADBException("UsageType cannot be null!!");
                                    }
                                    elementList.add(localUsageType);
                                }
                                      elementList.add(new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3",
                                                                      "UsedAsName"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsedAsName));
                            

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
        public static MetaDataAttribute parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MetaDataAttribute object =
                new MetaDataAttribute();

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
                    
                            if (!"MetaDataAttribute".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MetaDataAttribute)com.rn.supera.ws.typed.base.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","DataType").equals(reader.getName())){
                                
                                                object.setDataType(com.rn.supera.ws.typed.generic.DataTypeEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","DataTypeName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDataTypeName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MetaDataLink").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMetaDataLink(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","InputMask").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInputMask(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","IsDeprecated").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsDeprecated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","IsEnumerable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsEnumerable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","Description").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","Label").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLabel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MaxBytes").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxBytes(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxBytes(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MaxDepth").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxDepth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxDepth(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MaxLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxLength(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MaxValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxValue(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MinLength").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMinLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMinLength(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","MinValue").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMinValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMinValue(java.lang.Long.MIN_VALUE);
                                           
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","Nullable").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNullable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordExpirationInterval").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordExpirationInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordExpirationInterval(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordGracePeriod").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordGracePeriod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordGracePeriod(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordMaxOccurrence").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordMaxOccurrence(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordMaxOccurrence(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordMaxOldPasswords").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordMaxOldPasswords(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordMaxOldPasswords(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordMaxRepetitions").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordMaxRepetitions(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordMaxRepetitions(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordMinLowerCase").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordMinLowerCase(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordMinLowerCase(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordMinNumericSpecial").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordMinNumericSpecial(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordMinNumericSpecial(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordMinSpecial").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordMinSpecial(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordMinSpecial(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordMinUpperCase").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordMinUpperCase(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordMinUpperCase(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","PasswordWarningPeriod").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPasswordWarningPeriod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPasswordWarningPeriod(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","Pattern").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPattern(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageOnCreate").equals(reader.getName())){
                                
                                                object.setUsageOnCreate(com.rn.supera.ws.typed.metadata.MetaDataUsageEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageOnDestroy").equals(reader.getName())){
                                
                                                object.setUsageOnDestroy(com.rn.supera.ws.typed.metadata.MetaDataUsageEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageOnGet").equals(reader.getName())){
                                
                                                object.setUsageOnGet(com.rn.supera.ws.typed.metadata.MetaDataUsageEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageOnUpdate").equals(reader.getName())){
                                
                                                object.setUsageOnUpdate(com.rn.supera.ws.typed.metadata.MetaDataUsageEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsageType").equals(reader.getName())){
                                
                                                object.setUsageType(com.rn.supera.ws.typed.metadata.UsageTypeEnum.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:metadata.ws.rightnow.com/v1_3","UsedAsName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsedAsName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
           
          