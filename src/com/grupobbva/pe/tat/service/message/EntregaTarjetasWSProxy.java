package com.grupobbva.pe.tat.service.message;

public class EntregaTarjetasWSProxy implements com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType {
  private String _endpoint = null;
  private com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType entregaTarjetasWS_PortType = null;
  
  public EntregaTarjetasWSProxy() {
    _initEntregaTarjetasWSProxy();
  }
  
  public EntregaTarjetasWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initEntregaTarjetasWSProxy();
  }
  
  private void _initEntregaTarjetasWSProxy() {
    try {
      entregaTarjetasWS_PortType = (new com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_ServiceLocator()).getEntregaTarjetasWS();
      if (entregaTarjetasWS_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)entregaTarjetasWS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)entregaTarjetasWS_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (entregaTarjetasWS_PortType != null)
      ((javax.xml.rpc.Stub)entregaTarjetasWS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_PortType getEntregaTarjetasWS_PortType() {
    if (entregaTarjetasWS_PortType == null)
      _initEntregaTarjetasWSProxy();
    return entregaTarjetasWS_PortType;
  }
  
  public com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoResponse consultaPorDocumento(com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoRequest consultaPorDocumentoRequest) throws java.rmi.RemoteException{
    if (entregaTarjetasWS_PortType == null)
      _initEntregaTarjetasWSProxy();
    return entregaTarjetasWS_PortType.consultaPorDocumento(consultaPorDocumentoRequest);
  }
  
  public com.grupobbva.pe.tat.service.message.ConsultaConFiltrosResponse consultaConFiltros(com.grupobbva.pe.tat.service.message.ConsultaConFiltrosRequest consultaConFiltrosRequest) throws java.rmi.RemoteException{
    if (entregaTarjetasWS_PortType == null)
      _initEntregaTarjetasWSProxy();
    return entregaTarjetasWS_PortType.consultaConFiltros(consultaConFiltrosRequest);
  }
  
  public com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse entregaEnOficina(com.grupobbva.pe.tat.service.message.EntregaEnOficinaRequest entregaEnOficinaRequest) throws java.rmi.RemoteException{
    if (entregaTarjetasWS_PortType == null)
      _initEntregaTarjetasWSProxy();
    return entregaTarjetasWS_PortType.entregaEnOficina(entregaEnOficinaRequest);
  }
  
  
}