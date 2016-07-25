/**
 * ConsultaPorDocumentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.body.consultaPorDocumento;

public class ConsultaPorDocumentoResponse  implements java.io.Serializable {
    private com.grupobbva.pe.tat.ents.body.entrega.Entrega entrega;

    public ConsultaPorDocumentoResponse() {
    }

    public ConsultaPorDocumentoResponse(
           com.grupobbva.pe.tat.ents.body.entrega.Entrega entrega) {
           this.entrega = entrega;
    }


    /**
     * Gets the entrega value for this ConsultaPorDocumentoResponse.
     * 
     * @return entrega
     */
    public com.grupobbva.pe.tat.ents.body.entrega.Entrega getEntrega() {
        return entrega;
    }


    /**
     * Sets the entrega value for this ConsultaPorDocumentoResponse.
     * 
     * @param entrega
     */
    public void setEntrega(com.grupobbva.pe.tat.ents.body.entrega.Entrega entrega) {
        this.entrega = entrega;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaPorDocumentoResponse)) return false;
        ConsultaPorDocumentoResponse other = (ConsultaPorDocumentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entrega==null && other.getEntrega()==null) || 
             (this.entrega!=null &&
              this.entrega.equals(other.getEntrega())));
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
        if (getEntrega() != null) {
            _hashCode += getEntrega().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorDocumentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaPorDocumento", "ConsultaPorDocumentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "Entrega"));
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
