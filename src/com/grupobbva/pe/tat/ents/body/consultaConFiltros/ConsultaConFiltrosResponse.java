/**
 * ConsultaConFiltrosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.ents.body.consultaConFiltros;

public class ConsultaConFiltrosResponse  implements java.io.Serializable {
    private java.lang.Integer total;

    private com.grupobbva.pe.tat.ents.body.entrega.Entrega[] listadoEntregas;

    public ConsultaConFiltrosResponse() {
    }

    public ConsultaConFiltrosResponse(
           java.lang.Integer total,
           com.grupobbva.pe.tat.ents.body.entrega.Entrega[] listadoEntregas) {
           this.total = total;
           this.listadoEntregas = listadoEntregas;
    }


    /**
     * Gets the total value for this ConsultaConFiltrosResponse.
     * 
     * @return total
     */
    public java.lang.Integer getTotal() {
        return total;
    }


    /**
     * Sets the total value for this ConsultaConFiltrosResponse.
     * 
     * @param total
     */
    public void setTotal(java.lang.Integer total) {
        this.total = total;
    }


    /**
     * Gets the listadoEntregas value for this ConsultaConFiltrosResponse.
     * 
     * @return listadoEntregas
     */
    public com.grupobbva.pe.tat.ents.body.entrega.Entrega[] getListadoEntregas() {
        return listadoEntregas;
    }


    /**
     * Sets the listadoEntregas value for this ConsultaConFiltrosResponse.
     * 
     * @param listadoEntregas
     */
    public void setListadoEntregas(com.grupobbva.pe.tat.ents.body.entrega.Entrega[] listadoEntregas) {
        this.listadoEntregas = listadoEntregas;
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
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.listadoEntregas==null && other.getListadoEntregas()==null) || 
             (this.listadoEntregas!=null &&
              java.util.Arrays.equals(this.listadoEntregas, other.getListadoEntregas())));
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
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getListadoEntregas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListadoEntregas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListadoEntregas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaConFiltrosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "ConsultaConFiltrosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listadoEntregas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listadoEntregas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "Entrega"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entrega"));
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
