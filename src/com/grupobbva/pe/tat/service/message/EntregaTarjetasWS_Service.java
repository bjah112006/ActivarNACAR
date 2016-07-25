/**
 * EntregaTarjetasWS_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.service.message;

public interface EntregaTarjetasWS_Service extends javax.xml.rpc.Service {

/**
 * Servicio de consulta y activacion de tarjetas fast
 */
    public java.lang.String getEntregaTarjetasWSAddress();

    public com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType getEntregaTarjetasWS() throws javax.xml.rpc.ServiceException;

    public com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType getEntregaTarjetasWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
