/**
 * EntregaEnOficinaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.service.message;

public class EntregaEnOficinaResponse  implements java.io.Serializable {
    private com.grupobbva.pe.tat.ents.header.ResponseHeader refResponseHeader;

    private com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaResponse refEntregaEnOficinaResponse;

    public EntregaEnOficinaResponse() {
    }

    public EntregaEnOficinaResponse(
           com.grupobbva.pe.tat.ents.header.ResponseHeader refResponseHeader,
           com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaResponse refEntregaEnOficinaResponse) {
           this.refResponseHeader = refResponseHeader;
           this.refEntregaEnOficinaResponse = refEntregaEnOficinaResponse;
    }


    /**
     * Gets the refResponseHeader value for this EntregaEnOficinaResponse.
     * 
     * @return refResponseHeader
     */
    public com.grupobbva.pe.tat.ents.header.ResponseHeader getRefResponseHeader() {
        return refResponseHeader;
    }


    /**
     * Sets the refResponseHeader value for this EntregaEnOficinaResponse.
     * 
     * @param refResponseHeader
     */
    public void setRefResponseHeader(com.grupobbva.pe.tat.ents.header.ResponseHeader refResponseHeader) {
        this.refResponseHeader = refResponseHeader;
    }


    /**
     * Gets the refEntregaEnOficinaResponse value for this EntregaEnOficinaResponse.
     * 
     * @return refEntregaEnOficinaResponse
     */
    public com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaResponse getRefEntregaEnOficinaResponse() {
        return refEntregaEnOficinaResponse;
    }


    /**
     * Sets the refEntregaEnOficinaResponse value for this EntregaEnOficinaResponse.
     * 
     * @param refEntregaEnOficinaResponse
     */
    public void setRefEntregaEnOficinaResponse(com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaResponse refEntregaEnOficinaResponse) {
        this.refEntregaEnOficinaResponse = refEntregaEnOficinaResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntregaEnOficinaResponse)) return false;
        EntregaEnOficinaResponse other = (EntregaEnOficinaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refResponseHeader==null && other.getRefResponseHeader()==null) || 
             (this.refResponseHeader!=null &&
              this.refResponseHeader.equals(other.getRefResponseHeader()))) &&
            ((this.refEntregaEnOficinaResponse==null && other.getRefEntregaEnOficinaResponse()==null) || 
             (this.refEntregaEnOficinaResponse!=null &&
              this.refEntregaEnOficinaResponse.equals(other.getRefEntregaEnOficinaResponse())));
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
        if (getRefResponseHeader() != null) {
            _hashCode += getRefResponseHeader().hashCode();
        }
        if (getRefEntregaEnOficinaResponse() != null) {
            _hashCode += getRefEntregaEnOficinaResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntregaEnOficinaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "entregaEnOficinaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refResponseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/header", "ResponseHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refEntregaEnOficinaResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refEntregaEnOficinaResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entregaEnOficina", "EntregaEnOficinaResponse"));
        elemField.setMinOccurs(0);
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
