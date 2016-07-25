package com.bbva.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.axis.AxisFault;

import com.grupobbva.pe.tat.ents.body.consultaConFiltros.RangoSolicitud;
import com.grupobbva.pe.tat.ents.body.entrega.Entrega;
import com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaRequest;
import com.grupobbva.pe.tat.ents.header.RequestHeader;
import com.grupobbva.pe.tat.service.message.ConsultaConFiltrosRequest;
import com.grupobbva.pe.tat.service.message.ConsultaConFiltrosResponse;
import com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoRequest;
import com.grupobbva.pe.tat.service.message.ConsultaPorDocumentoResponse;
import com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse;
import com.grupobbva.pe.tat.service.message.EntregaTarjetasWSProxy;
import com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_HttpBindingStub;
import com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_Service;
import com.grupobbva.pe.tat.service.message.EntregaTarjetasWS_ServiceLocator;

public class Proceso {

	public int tiporesult=0;
	
	public java.lang.String getWsdl() throws java.io.IOException{
    	java.lang.String raiz = null;
    	java.util.Properties configProperties = new java.util.Properties();
    	java.io.FileInputStream file;
	    java.lang.String path = "./config.properties";
	    file = new java.io.FileInputStream(path);
	    configProperties.load(file);
	    file.close();
	    raiz = configProperties.getProperty("wsdl");
    	return raiz;
    }
	
	public EntregaEnOficinaResponse getResultados(String[] datosent) throws AxisFault{
		
		String cod_resp=null;
		
		
			
			com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaRequest bodreqdoc = new com.grupobbva.pe.tat.ents.body.entregaEnOficina.EntregaEnOficinaRequest();
			if(datosent[2]!=null){
				bodreqdoc.setIdEntrega(Integer.valueOf(datosent[2]));
			}
			bodreqdoc.setTipoOperacion(datosent[3].toString());
			bodreqdoc.setBioIdTxn(datosent[4]);
			
			com.grupobbva.pe.tat.ents.header.RequestHeaderSegura reqhead = new com.grupobbva.pe.tat.ents.header.RequestHeaderSegura();
			reqhead.setUsuario(datosent[0].toString());
			reqhead.setOficina(datosent[1].toString());
			
			reqhead.setLlave(datosent[5].toString());
			//System.out.println(datosent[4]);
			com.grupobbva.pe.tat.service.message.EntregaEnOficinaRequest servreq = new com.grupobbva.pe.tat.service.message.EntregaEnOficinaRequest();
			servreq.setRefEntregaEnOficinaRequest(bodreqdoc);
			servreq.setRefRequestHeader(reqhead);
			
			EntregaTarjetasWS_Service serv = new EntregaTarjetasWS_ServiceLocator();
			
			EntregaEnOficinaResponse servres = null;
			
			java.net.URL url;
			try {
				url = new java.net.URL(serv.getEntregaTarjetasWSAddress());
				System.out.println("URI wsdl: "+url.toString());
				EntregaTarjetasWS_HttpBindingStub entregaserv = new EntregaTarjetasWS_HttpBindingStub(url,serv);
				servres = entregaserv.entregaEnOficina(servreq);
				
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				tiporesult=1;
			}
			return servres;
		
	}
	
	public int gettiporesult(){
		return tiporesult;
	}
	
	
	// Método para imprimir los registros teniendo en cuenta la longitud especificada en el archivo properties //
	public String cadena(String nombrecampo, String texto) throws IOException{
		
		String cadena=null;
		int numero;
		Properties configProperties = new Properties();
	    FileInputStream file;
	    String path = "./config.properties";
	    file = new FileInputStream(path);
		configProperties.load(file);
		file.close();
		numero = Integer.parseInt(configProperties.getProperty(nombrecampo));
	    if (texto.length()>numero){
	    	cadena=texto.substring(0,numero);
	    }else{
	    	int a = numero-texto.length();
	    	cadena=texto;
	    	if(a!=0){
	    		for(int i=0;i<a;i++){
	    			cadena=cadena+" ";
	    		}
	    	}	
	    }
		return cadena;
	}
	
	public String leerSinEspacios(String texto){
		
		String textosinespacios = "";
		
		for(int k=0;k<texto.length();k++){
			if(texto.charAt(k)!=32){
				textosinespacios = textosinespacios + texto.charAt(k);
			}
		}
		return textosinespacios;
		
	}
	
}
