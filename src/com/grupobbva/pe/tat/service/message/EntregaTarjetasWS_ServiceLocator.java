/**
 * EntregaTarjetasWS_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.service.message;

import java.io.IOException;

import com.bbva.test.Proceso;

public class EntregaTarjetasWS_ServiceLocator extends org.apache.axis.client.Service implements com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_Service {

/**
 * Servicio de consulta y activacion de tarjetas fast
 */

    public EntregaTarjetasWS_ServiceLocator() {
    }


    public EntregaTarjetasWS_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EntregaTarjetasWS_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EntregaTarjetasWS

    /**
     * Servicio de consulta y entregas de tarjeta
     */
    Proceso proce = new Proceso();
    private java.lang.String EntregaTarjetasWS_address = null;
    
    public java.lang.String getEntregaTarjetasWSAddress() {
    	try {
			EntregaTarjetasWS_address=proce.getWsdl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return EntregaTarjetasWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EntregaTarjetasWSWSDDServiceName = "EntregaTarjetasWS";

    public java.lang.String getEntregaTarjetasWSWSDDServiceName() {
        return EntregaTarjetasWSWSDDServiceName;
    }

    public void setEntregaTarjetasWSWSDDServiceName(java.lang.String name) {
        EntregaTarjetasWSWSDDServiceName = name;
    }

    public com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType getEntregaTarjetasWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EntregaTarjetasWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEntregaTarjetasWS(endpoint);
    }

    public com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType getEntregaTarjetasWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_HttpBindingStub _stub = new com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_HttpBindingStub(portAddress, this);
            _stub.setPortName(getEntregaTarjetasWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEntregaTarjetasWSEndpointAddress(java.lang.String address) {
        EntregaTarjetasWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_HttpBindingStub _stub = new com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_HttpBindingStub(new java.net.URL(getEntregaTarjetasWSAddress()), this);
                _stub.setPortName(getEntregaTarjetasWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EntregaTarjetasWS".equals(inputPortName)) {
            return getEntregaTarjetasWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "EntregaTarjetasWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "EntregaTarjetasWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EntregaTarjetasWS".equals(portName)) {
            setEntregaTarjetasWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
