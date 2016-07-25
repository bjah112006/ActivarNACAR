/**
 * DatosOferta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.body.entrega;

public class DatosOferta  implements java.io.Serializable {
    private java.lang.String tarjeta;

    private java.lang.String tipoProducto;

    private java.lang.String descProducto;

    private java.lang.String primeros4Digitos;

    private java.lang.String ultimos4Digitos;

    private java.lang.String contrato;

    private java.lang.Float monto;

    private java.lang.String diaPago;

    private java.lang.Boolean flagAcptoTratDat;

    public DatosOferta() {
    }

    public DatosOferta(
           java.lang.String tarjeta,
           java.lang.String tipoProducto,
           java.lang.String descProducto,
           java.lang.String primeros4Digitos,
           java.lang.String ultimos4Digitos,
           java.lang.String contrato,
           java.lang.Float monto,
           java.lang.String diaPago,
           java.lang.Boolean flagAcptoTratDat) {
           this.tarjeta = tarjeta;
           this.tipoProducto = tipoProducto;
           this.descProducto = descProducto;
           this.primeros4Digitos = primeros4Digitos;
           this.ultimos4Digitos = ultimos4Digitos;
           this.contrato = contrato;
           this.monto = monto;
           this.diaPago = diaPago;
           this.flagAcptoTratDat = flagAcptoTratDat;
    }


    /**
     * Gets the tarjeta value for this DatosOferta.
     * 
     * @return tarjeta
     */
    public java.lang.String getTarjeta() {
        return tarjeta;
    }


    /**
     * Sets the tarjeta value for this DatosOferta.
     * 
     * @param tarjeta
     */
    public void setTarjeta(java.lang.String tarjeta) {
        this.tarjeta = tarjeta;
    }


    /**
     * Gets the tipoProducto value for this DatosOferta.
     * 
     * @return tipoProducto
     */
    public java.lang.String getTipoProducto() {
        return tipoProducto;
    }


    /**
     * Sets the tipoProducto value for this DatosOferta.
     * 
     * @param tipoProducto
     */
    public void setTipoProducto(java.lang.String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }


    /**
     * Gets the descProducto value for this DatosOferta.
     * 
     * @return descProducto
     */
    public java.lang.String getDescProducto() {
        return descProducto;
    }


    /**
     * Sets the descProducto value for this DatosOferta.
     * 
     * @param descProducto
     */
    public void setDescProducto(java.lang.String descProducto) {
        this.descProducto = descProducto;
    }


    /**
     * Gets the primeros4Digitos value for this DatosOferta.
     * 
     * @return primeros4Digitos
     */
    public java.lang.String getPrimeros4Digitos() {
        return primeros4Digitos;
    }


    /**
     * Sets the primeros4Digitos value for this DatosOferta.
     * 
     * @param primeros4Digitos
     */
    public void setPrimeros4Digitos(java.lang.String primeros4Digitos) {
        this.primeros4Digitos = primeros4Digitos;
    }


    /**
     * Gets the ultimos4Digitos value for this DatosOferta.
     * 
     * @return ultimos4Digitos
     */
    public java.lang.String getUltimos4Digitos() {
        return ultimos4Digitos;
    }


    /**
     * Sets the ultimos4Digitos value for this DatosOferta.
     * 
     * @param ultimos4Digitos
     */
    public void setUltimos4Digitos(java.lang.String ultimos4Digitos) {
        this.ultimos4Digitos = ultimos4Digitos;
    }


    /**
     * Gets the contrato value for this DatosOferta.
     * 
     * @return contrato
     */
    public java.lang.String getContrato() {
        return contrato;
    }


    /**
     * Sets the contrato value for this DatosOferta.
     * 
     * @param contrato
     */
    public void setContrato(java.lang.String contrato) {
        this.contrato = contrato;
    }


    /**
     * Gets the monto value for this DatosOferta.
     * 
     * @return monto
     */
    public java.lang.Float getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this DatosOferta.
     * 
     * @param monto
     */
    public void setMonto(java.lang.Float monto) {
        this.monto = monto;
    }


    /**
     * Gets the diaPago value for this DatosOferta.
     * 
     * @return diaPago
     */
    public java.lang.String getDiaPago() {
        return diaPago;
    }


    /**
     * Sets the diaPago value for this DatosOferta.
     * 
     * @param diaPago
     */
    public void setDiaPago(java.lang.String diaPago) {
        this.diaPago = diaPago;
    }


    /**
     * Gets the flagAcptoTratDat value for this DatosOferta.
     * 
     * @return flagAcptoTratDat
     */
    public java.lang.Boolean getFlagAcptoTratDat() {
        return flagAcptoTratDat;
    }


    /**
     * Sets the flagAcptoTratDat value for this DatosOferta.
     * 
     * @param flagAcptoTratDat
     */
    public void setFlagAcptoTratDat(java.lang.Boolean flagAcptoTratDat) {
        this.flagAcptoTratDat = flagAcptoTratDat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosOferta)) return false;
        DatosOferta other = (DatosOferta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tarjeta==null && other.getTarjeta()==null) || 
             (this.tarjeta!=null &&
              this.tarjeta.equals(other.getTarjeta()))) &&
            ((this.tipoProducto==null && other.getTipoProducto()==null) || 
             (this.tipoProducto!=null &&
              this.tipoProducto.equals(other.getTipoProducto()))) &&
            ((this.descProducto==null && other.getDescProducto()==null) || 
             (this.descProducto!=null &&
              this.descProducto.equals(other.getDescProducto()))) &&
            ((this.primeros4Digitos==null && other.getPrimeros4Digitos()==null) || 
             (this.primeros4Digitos!=null &&
              this.primeros4Digitos.equals(other.getPrimeros4Digitos()))) &&
            ((this.ultimos4Digitos==null && other.getUltimos4Digitos()==null) || 
             (this.ultimos4Digitos!=null &&
              this.ultimos4Digitos.equals(other.getUltimos4Digitos()))) &&
            ((this.contrato==null && other.getContrato()==null) || 
             (this.contrato!=null &&
              this.contrato.equals(other.getContrato()))) &&
            ((this.monto==null && other.getMonto()==null) || 
             (this.monto!=null &&
              this.monto.equals(other.getMonto()))) &&
            ((this.diaPago==null && other.getDiaPago()==null) || 
             (this.diaPago!=null &&
              this.diaPago.equals(other.getDiaPago()))) &&
            ((this.flagAcptoTratDat==null && other.getFlagAcptoTratDat()==null) || 
             (this.flagAcptoTratDat!=null &&
              this.flagAcptoTratDat.equals(other.getFlagAcptoTratDat())));
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
        if (getTarjeta() != null) {
            _hashCode += getTarjeta().hashCode();
        }
        if (getTipoProducto() != null) {
            _hashCode += getTipoProducto().hashCode();
        }
        if (getDescProducto() != null) {
            _hashCode += getDescProducto().hashCode();
        }
        if (getPrimeros4Digitos() != null) {
            _hashCode += getPrimeros4Digitos().hashCode();
        }
        if (getUltimos4Digitos() != null) {
            _hashCode += getUltimos4Digitos().hashCode();
        }
        if (getContrato() != null) {
            _hashCode += getContrato().hashCode();
        }
        if (getMonto() != null) {
            _hashCode += getMonto().hashCode();
        }
        if (getDiaPago() != null) {
            _hashCode += getDiaPago().hashCode();
        }
        if (getFlagAcptoTratDat() != null) {
            _hashCode += getFlagAcptoTratDat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosOferta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "DatosOferta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primeros4Digitos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primeros4Digitos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimos4Digitos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ultimos4Digitos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaPago");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diaPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAcptoTratDat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flagAcptoTratDat"));
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
