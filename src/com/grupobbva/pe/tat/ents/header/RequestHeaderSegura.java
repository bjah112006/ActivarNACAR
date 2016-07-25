/**
 * RequestHeaderSegura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.header;

public class RequestHeaderSegura  implements java.io.Serializable {
    private java.lang.String usuario;

    private java.lang.String oficina;

    private java.lang.String llave;

    public RequestHeaderSegura() {
    }

    public RequestHeaderSegura(
           java.lang.String usuario,
           java.lang.String oficina,
           java.lang.String llave) {
           this.usuario = usuario;
           this.oficina = oficina;
           this.llave = llave;
    }


    /**
     * Gets the usuario value for this RequestHeaderSegura.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this RequestHeaderSegura.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the oficina value for this RequestHeaderSegura.
     * 
     * @return oficina
     */
    public java.lang.String getOficina() {
        return oficina;
    }


    /**
     * Sets the oficina value for this RequestHeaderSegura.
     * 
     * @param oficina
     */
    public void setOficina(java.lang.String oficina) {
        this.oficina = oficina;
    }


    /**
     * Gets the llave value for this RequestHeaderSegura.
     * 
     * @return llave
     */
    public java.lang.String getLlave() {
        return llave;
    }


    /**
     * Sets the llave value for this RequestHeaderSegura.
     * 
     * @param llave
     */
    public void setLlave(java.lang.String llave) {
        this.llave = llave;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHeaderSegura)) return false;
        RequestHeaderSegura other = (RequestHeaderSegura) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.oficina==null && other.getOficina()==null) || 
             (this.oficina!=null &&
              this.oficina.equals(other.getOficina()))) &&
            ((this.llave==null && other.getLlave()==null) || 
             (this.llave!=null &&
              this.llave.equals(other.getLlave())));
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
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getOficina() != null) {
            _hashCode += getOficina().hashCode();
        }
        if (getLlave() != null) {
            _hashCode += getLlave().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeaderSegura.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/header", "RequestHeaderSegura"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oficina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oficina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("llave");
        elemField.setXmlName(new javax.xml.namespace.QName("", "llave"));
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
