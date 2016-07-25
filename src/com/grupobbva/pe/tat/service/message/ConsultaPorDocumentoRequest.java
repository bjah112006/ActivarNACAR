/**
 * ConsultaPorDocumentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.service.message;

public class ConsultaPorDocumentoRequest  implements java.io.Serializable {
    private com.grupobbva.pe.tat.ents.header.RequestHeader refRequestHeader;

    private com.grupobbva.pe.tat.ents.body.consultaPorDocumento.ConsultaPorDocumentoRequest refConsultaPorDocumentoRequest;

    public ConsultaPorDocumentoRequest() {
    }

    public ConsultaPorDocumentoRequest(
           com.grupobbva.pe.tat.ents.header.RequestHeader refRequestHeader,
           com.grupobbva.pe.tat.ents.body.consultaPorDocumento.ConsultaPorDocumentoRequest refConsultaPorDocumentoRequest) {
           this.refRequestHeader = refRequestHeader;
           this.refConsultaPorDocumentoRequest = refConsultaPorDocumentoRequest;
    }


    /**
     * Gets the refRequestHeader value for this ConsultaPorDocumentoRequest.
     * 
     * @return refRequestHeader
     */
    public com.grupobbva.pe.tat.ents.header.RequestHeader getRefRequestHeader() {
        return refRequestHeader;
    }


    /**
     * Sets the refRequestHeader value for this ConsultaPorDocumentoRequest.
     * 
     * @param refRequestHeader
     */
    public void setRefRequestHeader(com.grupobbva.pe.tat.ents.header.RequestHeader refRequestHeader) {
        this.refRequestHeader = refRequestHeader;
    }


    /**
     * Gets the refConsultaPorDocumentoRequest value for this ConsultaPorDocumentoRequest.
     * 
     * @return refConsultaPorDocumentoRequest
     */
    public com.grupobbva.pe.tat.ents.body.consultaPorDocumento.ConsultaPorDocumentoRequest getRefConsultaPorDocumentoRequest() {
        return refConsultaPorDocumentoRequest;
    }


    /**
     * Sets the refConsultaPorDocumentoRequest value for this ConsultaPorDocumentoRequest.
     * 
     * @param refConsultaPorDocumentoRequest
     */
    public void setRefConsultaPorDocumentoRequest(com.grupobbva.pe.tat.ents.body.consultaPorDocumento.ConsultaPorDocumentoRequest refConsultaPorDocumentoRequest) {
        this.refConsultaPorDocumentoRequest = refConsultaPorDocumentoRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaPorDocumentoRequest)) return false;
        ConsultaPorDocumentoRequest other = (ConsultaPorDocumentoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refRequestHeader==null && other.getRefRequestHeader()==null) || 
             (this.refRequestHeader!=null &&
              this.refRequestHeader.equals(other.getRefRequestHeader()))) &&
            ((this.refConsultaPorDocumentoRequest==null && other.getRefConsultaPorDocumentoRequest()==null) || 
             (this.refConsultaPorDocumentoRequest!=null &&
              this.refConsultaPorDocumentoRequest.equals(other.getRefConsultaPorDocumentoRequest())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRefRequestHeader() != null) {
            _hashCode += getRefRequestHeader().hashCode();
        }
        if (getRefConsultaPorDocumentoRequest() != null) {
            _hashCode += getRefConsultaPorDocumentoRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorDocumentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaPorDocumentoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refRequestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refRequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/header", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refConsultaPorDocumentoRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refConsultaPorDocumentoRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaPorDocumento", "ConsultaPorDocumentoRequest"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
