/**
 * EntregaEnOficinaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.body.entregaEnOficina;

public class EntregaEnOficinaRequest  implements java.io.Serializable {
    private java.lang.Integer idEntrega;

    private java.lang.String tipoOperacion;

    private java.lang.String bioIdTxn;

    public EntregaEnOficinaRequest() {
    }

    public EntregaEnOficinaRequest(
           java.lang.Integer idEntrega,
           java.lang.String tipoOperacion,
           java.lang.String bioIdTxn) {
           this.idEntrega = idEntrega;
           this.tipoOperacion = tipoOperacion;
           this.bioIdTxn = bioIdTxn;
    }


    /**
     * Gets the idEntrega value for this EntregaEnOficinaRequest.
     * 
     * @return idEntrega
     */
    public java.lang.Integer getIdEntrega() {
        return idEntrega;
    }


    /**
     * Sets the idEntrega value for this EntregaEnOficinaRequest.
     * 
     * @param idEntrega
     */
    public void setIdEntrega(java.lang.Integer idEntrega) {
        this.idEntrega = idEntrega;
    }


    /**
     * Gets the tipoOperacion value for this EntregaEnOficinaRequest.
     * 
     * @return tipoOperacion
     */
    public java.lang.String getTipoOperacion() {
        return tipoOperacion;
    }


    /**
     * Sets the tipoOperacion value for this EntregaEnOficinaRequest.
     * 
     * @param tipoOperacion
     */
    public void setTipoOperacion(java.lang.String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }


    /**
     * Gets the bioIdTxn value for this EntregaEnOficinaRequest.
     * 
     * @return bioIdTxn
     */
    public java.lang.String getBioIdTxn() {
        return bioIdTxn;
    }


    /**
     * Sets the bioIdTxn value for this EntregaEnOficinaRequest.
     * 
     * @param bioIdTxn
     */
    public void setBioIdTxn(java.lang.String bioIdTxn) {
        this.bioIdTxn = bioIdTxn;
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
            ((this.idEntrega==null && other.getIdEntrega()==null) || 
             (this.idEntrega!=null &&
              this.idEntrega.equals(other.getIdEntrega()))) &&
            ((this.tipoOperacion==null && other.getTipoOperacion()==null) || 
             (this.tipoOperacion!=null &&
              this.tipoOperacion.equals(other.getTipoOperacion()))) &&
            ((this.bioIdTxn==null && other.getBioIdTxn()==null) || 
             (this.bioIdTxn!=null &&
              this.bioIdTxn.equals(other.getBioIdTxn())));
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
        if (getIdEntrega() != null) {
            _hashCode += getIdEntrega().hashCode();
        }
        if (getTipoOperacion() != null) {
            _hashCode += getTipoOperacion().hashCode();
        }
        if (getBioIdTxn() != null) {
            _hashCode += getBioIdTxn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntregaEnOficinaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entregaEnOficina", "EntregaEnOficinaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bioIdTxn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bioIdTxn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
