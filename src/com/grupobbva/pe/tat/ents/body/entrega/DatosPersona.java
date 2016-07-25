/**
 * DatosPersona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.body.entrega;

public class DatosPersona  implements java.io.Serializable {
    private java.lang.String tipoDocumento;

    private java.lang.String numeroDocumento;

    private java.lang.String nombreCompletoCliente;

    private java.lang.String telefono;

    private java.lang.String direccion;

    private java.lang.Boolean exonerarVerifDomicilio;

    public DatosPersona() {
    }

    public DatosPersona(
           java.lang.String tipoDocumento,
           java.lang.String numeroDocumento,
           java.lang.String nombreCompletoCliente,
           java.lang.String telefono,
           java.lang.String direccion,
           java.lang.Boolean exonerarVerifDomicilio) {
           this.tipoDocumento = tipoDocumento;
           this.numeroDocumento = numeroDocumento;
           this.nombreCompletoCliente = nombreCompletoCliente;
           this.telefono = telefono;
           this.direccion = direccion;
           this.exonerarVerifDomicilio = exonerarVerifDomicilio;
    }


    /**
     * Gets the tipoDocumento value for this DatosPersona.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this DatosPersona.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the numeroDocumento value for this DatosPersona.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this DatosPersona.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the nombreCompletoCliente value for this DatosPersona.
     * 
     * @return nombreCompletoCliente
     */
    public java.lang.String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }


    /**
     * Sets the nombreCompletoCliente value for this DatosPersona.
     * 
     * @param nombreCompletoCliente
     */
    public void setNombreCompletoCliente(java.lang.String nombreCompletoCliente) {
        this.nombreCompletoCliente = nombreCompletoCliente;
    }


    /**
     * Gets the telefono value for this DatosPersona.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this DatosPersona.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the direccion value for this DatosPersona.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this DatosPersona.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the exonerarVerifDomicilio value for this DatosPersona.
     * 
     * @return exonerarVerifDomicilio
     */
    public java.lang.Boolean getExonerarVerifDomicilio() {
        return exonerarVerifDomicilio;
    }


    /**
     * Sets the exonerarVerifDomicilio value for this DatosPersona.
     * 
     * @param exonerarVerifDomicilio
     */
    public void setExonerarVerifDomicilio(java.lang.Boolean exonerarVerifDomicilio) {
        this.exonerarVerifDomicilio = exonerarVerifDomicilio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosPersona)) return false;
        DatosPersona other = (DatosPersona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.nombreCompletoCliente==null && other.getNombreCompletoCliente()==null) || 
             (this.nombreCompletoCliente!=null &&
              this.nombreCompletoCliente.equals(other.getNombreCompletoCliente()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.exonerarVerifDomicilio==null && other.getExonerarVerifDomicilio()==null) || 
             (this.exonerarVerifDomicilio!=null &&
              this.exonerarVerifDomicilio.equals(other.getExonerarVerifDomicilio())));
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
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getNombreCompletoCliente() != null) {
            _hashCode += getNombreCompletoCliente().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getExonerarVerifDomicilio() != null) {
            _hashCode += getExonerarVerifDomicilio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosPersona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "DatosPersona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCompletoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreCompletoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exonerarVerifDomicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exonerarVerifDomicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
