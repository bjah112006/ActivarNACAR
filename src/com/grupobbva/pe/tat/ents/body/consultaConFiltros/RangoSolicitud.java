/**
 * RangoSolicitud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.body.consultaConFiltros;

public class RangoSolicitud  implements java.io.Serializable {
    private java.util.Date inicio;

    private java.util.Date fin;

    public RangoSolicitud() {
    }

    public RangoSolicitud(
           java.util.Date inicio,
           java.util.Date fin) {
           this.inicio = inicio;
           this.fin = fin;
    }


    /**
     * Gets the inicio value for this RangoSolicitud.
     * 
     * @return inicio
     */
    public java.util.Date getInicio() {
        return inicio;
    }


    /**
     * Sets the inicio value for this RangoSolicitud.
     * 
     * @param inicio
     */
    public void setInicio(java.util.Date inicio) {
        this.inicio = inicio;
    }


    /**
     * Gets the fin value for this RangoSolicitud.
     * 
     * @return fin
     */
    public java.util.Date getFin() {
        return fin;
    }


    /**
     * Sets the fin value for this RangoSolicitud.
     * 
     * @param fin
     */
    public void setFin(java.util.Date fin) {
        this.fin = fin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RangoSolicitud)) return false;
        RangoSolicitud other = (RangoSolicitud) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inicio==null && other.getInicio()==null) || 
             (this.inicio!=null &&
              this.inicio.equals(other.getInicio()))) &&
            ((this.fin==null && other.getFin()==null) || 
             (this.fin!=null &&
              this.fin.equals(other.getFin())));
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
        if (getInicio() != null) {
            _hashCode += getInicio().hashCode();
        }
        if (getFin() != null) {
            _hashCode += getFin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RangoSolicitud.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "RangoSolicitud"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
