/**
 * ConsultaConFiltrosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.service.message;

public class ConsultaConFiltrosResponse  implements java.io.Serializable {
    private com.grupobbva.pe.tat.ents.header.ResponseHeader refResponseHeader;

    private com.grupobbva.pe.tat.ents.body.consultaConFiltros.ConsultaConFiltrosResponse refConsultaConFiltrosResponse;

    public ConsultaConFiltrosResponse() {
    }

    public ConsultaConFiltrosResponse(
           com.grupobbva.pe.tat.ents.header.ResponseHeader refResponseHeader,
           com.grupobbva.pe.tat.ents.body.consultaConFiltros.ConsultaConFiltrosResponse refConsultaConFiltrosResponse) {
           this.refResponseHeader = refResponseHeader;
           this.refConsultaConFiltrosResponse = refConsultaConFiltrosResponse;
    }


    /**
     * Gets the refResponseHeader value for this ConsultaConFiltrosResponse.
     * 
     * @return refResponseHeader
     */
    public com.grupobbva.pe.tat.ents.header.ResponseHeader getRefResponseHeader() {
        return refResponseHeader;
    }


    /**
     * Sets the refResponseHeader value for this ConsultaConFiltrosResponse.
     * 
     * @param refResponseHeader
     */
    public void setRefResponseHeader(com.grupobbva.pe.tat.ents.header.ResponseHeader refResponseHeader) {
        this.refResponseHeader = refResponseHeader;
    }


    /**
     * Gets the refConsultaConFiltrosResponse value for this ConsultaConFiltrosResponse.
     * 
     * @return refConsultaConFiltrosResponse
     */
    public com.grupobbva.pe.tat.ents.body.consultaConFiltros.ConsultaConFiltrosResponse getRefConsultaConFiltrosResponse() {
        return refConsultaConFiltrosResponse;
    }


    /**
     * Sets the refConsultaConFiltrosResponse value for this ConsultaConFiltrosResponse.
     * 
     * @param refConsultaConFiltrosResponse
     */
    public void setRefConsultaConFiltrosResponse(com.grupobbva.pe.tat.ents.body.consultaConFiltros.ConsultaConFiltrosResponse refConsultaConFiltrosResponse) {
        this.refConsultaConFiltrosResponse = refConsultaConFiltrosResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaConFiltrosResponse)) return false;
        ConsultaConFiltrosResponse other = (ConsultaConFiltrosResponse) obj;
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
            ((this.refConsultaConFiltrosResponse==null && other.getRefConsultaConFiltrosResponse()==null) || 
             (this.refConsultaConFiltrosResponse!=null &&
              this.refConsultaConFiltrosResponse.equals(other.getRefConsultaConFiltrosResponse())));
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
        if (getRefConsultaConFiltrosResponse() != null) {
            _hashCode += getRefConsultaConFiltrosResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaConFiltrosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaConFiltrosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refResponseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/header", "ResponseHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refConsultaConFiltrosResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refConsultaConFiltrosResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "ConsultaConFiltrosResponse"));
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
