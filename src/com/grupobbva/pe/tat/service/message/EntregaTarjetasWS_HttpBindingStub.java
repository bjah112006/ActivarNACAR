/**
 * EntregaTarjetasWS_HttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.tat.service.message;

public class EntregaTarjetasWS_HttpBindingStub extends org.apache.axis.client.Stub implements com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaPorDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaPorDocumentoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaPorDocumentoRequest"), com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaPorDocumentoResponse"));
        oper.setReturnClass(com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaPorDocumentoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaConFiltros");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaConFiltrosRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaConFiltrosRequest"), com.grupobbva.pe.tat.service.message.ConsultaConFiltrosRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaConFiltrosResponse"));
        oper.setReturnClass(com.grupobbva.pe.tat.service.message.ConsultaConFiltrosResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaConFiltrosResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("entregaEnOficina");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "entregaEnOficinaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "entregaEnOficinaRequest"), com.grupobbva.pe.tat.service.message.EntregaEnOficinaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "entregaEnOficinaResponse"));
        oper.setReturnClass(com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "entregaEnOficinaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public EntregaTarjetasWS_HttpBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EntregaTarjetasWS_HttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EntregaTarjetasWS_HttpBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "ConsultaConFiltrosRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.consultaConFiltros.ConsultaConFiltrosRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "ConsultaConFiltrosResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.consultaConFiltros.ConsultaConFiltrosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "ListadoEntregas");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.entrega.Entrega[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "Entrega");
            qName2 = new javax.xml.namespace.QName("", "entrega");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaConFiltros", "RangoSolicitud");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.consultaConFiltros.RangoSolicitud.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaPorDocumento", "ConsultaPorDocumentoRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.consultaPorDocumento.ConsultaPorDocumentoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/consultaPorDocumento", "ConsultaPorDocumentoResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.consultaPorDocumento.ConsultaPorDocumentoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entregaEnOficina", "EntregaEnOficinaRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entregaEnOficina", "EntregaEnOficinaResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "DatosEntrega");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.entrega.DatosEntrega.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "DatosOferta");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.entrega.DatosOferta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "DatosPersona");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.entrega.DatosPersona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/body/entrega", "Entrega");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.body.entrega.Entrega.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/header", "RequestHeader");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.header.RequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/header", "RequestHeaderSegura");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.header.RequestHeaderSegura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/ents/header", "ResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.ents.header.ResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaConFiltrosRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.service.message.ConsultaConFiltrosRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaConFiltrosResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.service.message.ConsultaConFiltrosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaPorDocumentoRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "consultaPorDocumentoResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "entregaEnOficinaRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.service.message.EntregaEnOficinaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/tat/service/message", "entregaEnOficinaResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoResponse consultaPorDocumento(com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoRequest consultaPorDocumentoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://pe.grupobbva.com/tat/service/message");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultaPorDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaPorDocumentoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.grupobbva.pe.tat.service.message.ConsultaConFiltrosResponse consultaConFiltros(com.grupobbva.pe.tat.service.message.ConsultaConFiltrosRequest consultaConFiltrosRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://pe.grupobbva.com/tat/service/message");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultaConFiltros"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaConFiltrosRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.grupobbva.pe.tat.service.message.ConsultaConFiltrosResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.grupobbva.pe.tat.service.message.ConsultaConFiltrosResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.grupobbva.pe.tat.service.message.ConsultaConFiltrosResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse entregaEnOficina(com.grupobbva.pe.tat.service.message.EntregaEnOficinaRequest entregaEnOficinaRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://pe.grupobbva.com/tat/service/message");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "entregaEnOficina"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {entregaEnOficinaRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
