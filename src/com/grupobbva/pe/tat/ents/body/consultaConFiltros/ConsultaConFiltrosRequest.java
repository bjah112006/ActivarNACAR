/**
 * ConsultaConFiltrosRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.body.consultaConFiltros;

public class ConsultaConFiltrosRequest  implements java.io.Serializable {
    private java.lang.String codigoOficina;

    private java.lang.String codigoEstado;

    private com.grupobbva.pe.tat.ents.body.consultaConFiltros.RangoSolicitud rangoSolicitud;

    public ConsultaConFiltrosRequest() {
    }

    public ConsultaConFiltrosRequest(
           java.lang.String codigoOficina,
           java.lang.String codigoEstado,
           com.grupobbva.pe.tat.ents.body.consultaConFiltros.RangoSolicitud rangoSolicitud) {
           this.codigoOficina = codigoOficina;
           this.codigoEstado = codigoEstado;
           this.rangoSolicitud = rangoSolicitud;
    }


    /**
     * Gets the codigoOficina value for this ConsultaConFiltrosRequest.
     * 
     * @return codigoOficina
     */
    public java.lang.String getCodigoOficina() {
        return codigoOficina;
    }


    /**
     * Sets the codigoOficina value for this ConsultaConFiltrosRequest.
     * 
     * @param codigoOficina
     */
    public void setCodigoOficina(java.lang.String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }


    /**
     * Gets the codigoEstado value for this ConsultaConFiltrosRequest.
     * 
     * @return codigoEstado
     */
    public java.lang.String getCodigoEstado() {
        return codigoEstado;
    }


    /**
     * Sets the codigoEstado value for this ConsultaConFiltrosRequest.
     * 
     * @param codigoEstado
     */
    public void setCodigoEstado(java.lang.String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }


    /**
     * Gets the rangoSolicitud value for this ConsultaConFiltrosRequest.
     * 
     * @return rangoSolicitud
     */
    public com.grupobbva.pe.tat.ents.body.consultaConFiltros.RangoSolicitud getRangoSolicitud() {
        return rangoSolicitud;
    }


    /**
     * Sets the rangoSolicitud value for this ConsultaConFiltrosRequest.
     * 
     * @param rangoSolicitud
     */
    public void setRangoSolicitud(com.grupobbva.pe.tat.ents.body.consultaConFiltros.RangoSolicitud rangoSolicitud) {
        this.rangoSolicitud = rangoSolicitud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaConFiltrosRequest)) return false;
        ConsultaConFiltrosRequest other = (ConsultaConFiltrosRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoOficina==null && other.getCodigoOficina()==null) || 
             (this.codigoOficina!=null &&
              this.codigoOficina.equals(other.getCodigoOficina()))) &&
            ((this.codigoEstado==null && other.getCodigoEstado()==null) || 
             (this.codigoEstado!=null &&
              this.codigoEstado.equals(other.getCodigoEstado()))) &&
            ((this.rangoSolicitud==null && other.getRangoSolicitud()==null) || 
             (this.rangoSolicitud!=null &&
              this.rangoSolicitud.equals(other.getRangoSolicitud())));
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
        if (getCodigoOficina() != null) {
            _hashCode += getCodigoOficina().hashCode();
        }
        if (getCodigoEstado() != null) {
            _hashCode += getCodigoEstado().hashCode();
        }
        if (getRangoSolicitud() != null) {
            _hashCode += getRangoSolicitud().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaConFiltrosRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "ConsultaConFiltrosRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOficina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoOficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "RangoSolicitud"));
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
