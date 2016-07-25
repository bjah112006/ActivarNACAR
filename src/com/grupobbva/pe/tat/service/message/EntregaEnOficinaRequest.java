/**
 * EntregaEnOficinaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.service.message;

public class EntregaEnOficinaRequest  implements java.io.Serializable {
    private com.grupobbva.pe.tat.ents.header.RequestHeaderSegura refRequestHeader;

    private com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaRequest refEntregaEnOficinaRequest;

    public EntregaEnOficinaRequest() {
    }

    public EntregaEnOficinaRequest(
           com.grupobbva.pe.tat.ents.header.RequestHeaderSegura refRequestHeader,
           com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaRequest refEntregaEnOficinaRequest) {
           this.refRequestHeader = refRequestHeader;
           this.refEntregaEnOficinaRequest = refEntregaEnOficinaRequest;
    }


    /**
     * Gets the refRequestHeader value for this EntregaEnOficinaRequest.
     * 
     * @return refRequestHeader
     */
    public com.grupobbva.pe.tat.ents.header.RequestHeaderSegura getRefRequestHeader() {
        return refRequestHeader;
    }


    /**
     * Sets the refRequestHeader value for this EntregaEnOficinaRequest.
     * 
     * @param refRequestHeader
     */
    public void setRefRequestHeader(com.grupobbva.pe.tat.ents.header.RequestHeaderSegura refRequestHeader) {
        this.refRequestHeader = refRequestHeader;
    }


    /**
     * Gets the refEntregaEnOficinaRequest value for this EntregaEnOficinaRequest.
     * 
     * @return refEntregaEnOficinaRequest
     */
    public com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaRequest getRefEntregaEnOficinaRequest() {
        return refEntregaEnOficinaRequest;
    }


    /**
     * Sets the refEntregaEnOficinaRequest value for this EntregaEnOficinaRequest.
     * 
     * @param refEntregaEnOficinaRequest
     */
    public void setRefEntregaEnOficinaRequest(com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaRequest refEntregaEnOficinaRequest) {
        this.refEntregaEnOficinaRequest = refEntregaEnOficinaRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntregaEnOficinaRequest)) return false;
        EntregaEnOficinaRequest other = (EntregaEnOficinaRequest) obj;
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
            ((this.refEntregaEnOficinaRequest==null && other.getRefEntregaEnOficinaRequest()==null) || 
             (this.refEntregaEnOficinaRequest!=null &&
              this.refEntregaEnOficinaRequest.equals(other.getRefEntregaEnOficinaRequest())));
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
        if (getRefEntregaEnOficinaRequest() != null) {
            _hashCode += getRefEntregaEnOficinaRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntregaEnOficinaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "entregaEnOficinaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refRequestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refRequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/header", "RequestHeaderSegura"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refEntregaEnOficinaRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refEntregaEnOficinaRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entregaEnOficina", "EntregaEnOficinaRequest"));
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
