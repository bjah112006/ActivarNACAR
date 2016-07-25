package com.bbva.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import com.grupobbva.pe.tat.ents.body.entrega.Entrega;
import com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse;

public class Salida {

	public String getRutaOutputFile(String ruta) throws IOException{
		String rutaofile = null;
	    String ofile = null;

	    //to load application's properties, we use this class
	    Properties configProperties = new Properties();

	    FileInputStream file;

	    //the base folder is ./, the root of the main.properties file  
	    String path = "./config.properties";

	    //load the file handle for main.properties
	    file = new FileInputStream(path);

	    //load all the properties from this file
	    configProperties.load(file);

	    //we have loaded the properties, so close the file handle
	    file.close();

	    //retrieve the property we are intrested, the app.version
	    ofile = configProperties.getProperty("ofileentrega");
	    
	    rutaofile = ruta+ofile;
	    
	    return rutaofile;
	}
	
	public void createOutputFile(String rutaofile){
		
		File archivo = new File(rutaofile);
		
		try {
			  // A partir del objeto File creamos el fichero físicamente
			  if (archivo.createNewFile()){
			    System.out.println("El fichero se ha creado correctamente");
			  }else{
			    archivo.delete();
			  	archivo.createNewFile();
				System.out.println("fichero Output existía. Se borró y creó uno nuevo");}
			} catch (IOException ioe) {
			  ioe.printStackTrace();
			}
		
	}
	
	public void saveData(String rutaofile, EntregaEnOficinaResponse resultado) throws IOException{
		
		FileWriter fichero = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Proceso proces = new Proceso();
		Properties configProperties = new Properties();
		FileInputStream file;
	    String path = "./config.properties";
	    file = new FileInputStream(path);
	    configProperties.load(file);
	    file.close();
	    String mensaje = null;
		
		try {

			fichero = new FileWriter(rutaofile);
			
			fichero.write(resultado.getRefResponseHeader().getCodigoRespuesta() + "\r\n");
			if(resultado.getRefEntregaEnOficinaResponse().getEntrega().getDatosEntrega().getCodEstadoEntrega().equals("17")){
				mensaje=configProperties.getProperty("activacionhuella");
			}
			if(resultado.getRefEntregaEnOficinaResponse().getEntrega().getDatosEntrega().getCodEstadoEntrega().equals("18")){
				mensaje=configProperties.getProperty("errorenentrega");
			}
			if(resultado.getRefEntregaEnOficinaResponse().getEntrega().getDatosEntrega().getCodEstadoEntrega().equals("19")){
				mensaje=configProperties.getProperty("activaciondocu");
			}
			fichero.write(mensaje + "\r\n");
			
			fichero.write(resultado.getRefEntregaEnOficinaResponse().getEntrega().getDatosEntrega().getIdEntrega().toString() + "\r\n");
			fichero.write(resultado.getRefEntregaEnOficinaResponse().getEntrega().getDatosEntrega().getDescEstadoEntrega() + "\r\n");
			fichero.write(resultado.getRefEntregaEnOficinaResponse().getEntrega().getDatosEntrega().getDescEstadoAnterior() + "\r\n");
			
			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
		System.out.println("Se guardaron los datos en el archivo cuya ruta es: \r\n"+rutaofile);
	}
	
	public void saveErrorWS(String rutaofile){
		
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("99");
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void saveInputNotFound(String rutaofile){
		
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("98");
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void saveInputNotValid(String rutaofile){
		
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("97");
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void saveCabeceraNotValid(String rutaofile, EntregaEnOficinaResponse entreg){
		
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("96" + "\r\n");
			fichero.write(entreg.getRefResponseHeader().getMensajeRespuesta());
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void saveErrorInesperado(String rutaofile, EntregaEnOficinaResponse entreg){
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("95" + "\r\n");
			fichero.write(entreg.getRefResponseHeader().getMensajeRespuesta());
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveInvalidParameters(String rutaofile, EntregaEnOficinaResponse entreg){
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("94" + "\r\n");
			fichero.write(entreg.getRefResponseHeader().getMensajeRespuesta());
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveInvalidState(String rutaofile, EntregaEnOficinaResponse entreg){
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("93" + "\r\n");
			fichero.write(entreg.getRefResponseHeader().getMensajeRespuesta());
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveEntregaNotFound(String rutaofile, EntregaEnOficinaResponse entreg){
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("92" + "\r\n");
			fichero.write(entreg.getRefResponseHeader().getMensajeRespuesta());
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveInvalidKey(String rutaofile, EntregaEnOficinaResponse entreg){
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("91" + "\r\n");
			fichero.write(entreg.getRefResponseHeader().getMensajeRespuesta());
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveErrorServicio(String rutaofile, EntregaEnOficinaResponse entreg){
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("90" + "\r\n");
			fichero.write(entreg.getRefResponseHeader().getMensajeRespuesta());
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveErrHuellaMinucia(String rutaofile, EntregaEnOficinaResponse entreg){
		FileWriter fichero=null;
		
		try {
			fichero = new FileWriter(rutaofile);
			fichero.write("89" + "\r\n");
			fichero.write(entreg.getRefResponseHeader().getMensajeRespuesta());
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
