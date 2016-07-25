/**
 * Entrega.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.body.entrega;

public class Entrega  implements java.io.Serializable {
    private com.grupobbva.pe.tat.ents.body.entrega.DatosPersona datosPersona;

    private com.grupobbva.pe.tat.ents.body.entrega.DatosEntrega datosEntrega;

    private com.grupobbva.pe.tat.ents.body.entrega.DatosOferta datosOferta;

    public Entrega() {
    }

    public Entrega(
           com.grupobbva.pe.tat.ents.body.entrega.DatosPersona datosPersona,
           com.grupobbva.pe.tat.ents.body.entrega.DatosEntrega datosEntrega,
           com.grupobbva.pe.tat.ents.body.entrega.DatosOferta datosOferta) {
           this.datosPersona = datosPersona;
           this.datosEntrega = datosEntrega;
           this.datosOferta = datosOferta;
    }


    /**
     * Gets the datosPersona value for this Entrega.
     * 
     * @return datosPersona
     */
    public com.grupobbva.pe.tat.ents.body.entrega.DatosPersona getDatosPersona() {
        return datosPersona;
    }


    /**
     * Sets the datosPersona value for this Entrega.
     * 
     * @param datosPersona
     */
    public void setDatosPersona(com.grupobbva.pe.tat.ents.body.entrega.DatosPersona datosPersona) {
        this.datosPersona = datosPersona;
    }


    /**
     * Gets the datosEntrega value for this Entrega.
     * 
     * @return datosEntrega
     */
    public com.grupobbva.pe.tat.ents.body.entrega.DatosEntrega getDatosEntrega() {
        return datosEntrega;
    }


    /**
     * Sets the datosEntrega value for this Entrega.
     * 
     * @param datosEntrega
     */
    public void setDatosEntrega(com.grupobbva.pe.tat.ents.body.entrega.DatosEntrega datosEntrega) {
        this.datosEntrega = datosEntrega;
    }


    /**
     * Gets the datosOferta value for this Entrega.
     * 
     * @return datosOferta
     */
    public com.grupobbva.pe.tat.ents.body.entrega.DatosOferta getDatosOferta() {
        return datosOferta;
    }


    /**
     * Sets the datosOferta value for this Entrega.
     * 
     * @param datosOferta
     */
    public void setDatosOferta(com.grupobbva.pe.tat.ents.body.entrega.DatosOferta datosOferta) {
        this.datosOferta = datosOferta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrega)) return false;
        Entrega other = (Entrega) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosPersona==null && other.getDatosPersona()==null) || 
             (this.datosPersona!=null &&
              this.datosPersona.equals(other.getDatosPersona()))) &&
            ((this.datosEntrega==null && other.getDatosEntrega()==null) || 
             (this.datosEntrega!=null &&
              this.datosEntrega.equals(other.getDatosEntrega()))) &&
            ((this.datosOferta==null && other.getDatosOferta()==null) || 
             (this.datosOferta!=null &&
              this.datosOferta.equals(other.getDatosOferta())));
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
        if (getDatosPersona() != null) {
            _hashCode += getDatosPersona().hashCode();
        }
        if (getDatosEntrega() != null) {
            _hashCode += getDatosEntrega().hashCode();
        }
        if (getDatosOferta() != null) {
            _hashCode += getDatosOferta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrega.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "Entrega"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "DatosPersona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "DatosEntrega"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosOferta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosOferta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "DatosOferta"));
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
