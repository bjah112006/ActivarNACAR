package com.bbva.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Entrada {
	
	Proceso proc = new Proceso();

	public static String getRaiz() throws IOException{

	    String raiz = null;

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
	    raiz = configProperties.getProperty("directory");

	    return raiz;
	}
	
	public String getRuta(String[] puesto, String raiz){
		
		String ruta = null;
		
		ruta=raiz+puesto[0]+"/";
		
		return ruta;
	}
	
	public static String getRutaInputFile(String ruta) throws IOException{
		
		String rutaifile = null;
	    String ifile = null;

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
	    ifile = configProperties.getProperty("ifileentrega");
	    
	    rutaifile = ruta+ifile;
	    
	    return rutaifile;
	}
		
	public String[] leerDatos(String rutaifile) throws IOException{
		String cadena=null;
		String[] datos = new String[6];
		int o=0;
		
		FileReader f=null;
		try {
			f = new FileReader(rutaifile);
			System.out.println("Leyendo datos del archivo: \r\n"+rutaifile);
			BufferedReader b = new BufferedReader(f);
		    try {
				while((cadena = b.readLine())!=null || o<6) {
					
					if(o==5){
						Properties configProperties = new Properties();
					    FileInputStream file;
					    String path = "./config.properties";
					    file = new FileInputStream(path);
					    configProperties.load(file);
					    file.close();
					    datos[o] = configProperties.getProperty("token");
					    
					}else{
						if(cadena==null && o==3){
							datos[o]=null;
						}else{
							if(cadena==null && o==4){
								datos[o]="";
							}else{
								if(o==2){
									datos[o]=proc.leerSinEspacios(cadena.toString());
								}else{
									datos[o]=cadena.toString();
								}
								
							}
							
						}
						
					}
					
					o=o+1;
				}		
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		    b.close();
		    
		    if(datos[3]==null){
		    	datos[3]="Campos Incorrectos";
		    }
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			datos=null;
		}
	    
	      return datos;
	}
	
}
