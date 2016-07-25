package com.bbva.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.grupobbva.pe.tat.ents.body.entrega.Entrega;
import com.grupobbva.pe.tat.service.message.EntregaEnOficinaResponse;

public class Principal {
	

	public static void main(String[] args) throws IOException {
		
		Principal princ = new Principal();
		
		String raiz = null;
		String ruta = null;
		String rutaifile = null;
		String rutaofile = null;
		String[] datosentrada = null;
		int tiporesultado;
		int cod_mensaje;
		
		
		Entrada ent = new Entrada();
		Salida sal = new Salida();
		
		raiz = ent.getRaiz();
		
		ruta = ent.getRuta(args, raiz);
		
		rutaifile = ent.getRutaInputFile(ruta);
		
		rutaofile=sal.getRutaOutputFile(ruta);
		
		sal.createOutputFile(rutaofile);
		
		datosentrada = ent.leerDatos(rutaifile);
		
		if (datosentrada==null){
			System.out.println("ERROR: No se encontró archivo de input");
			sal.saveInputNotFound(rutaofile);
		}else{
				if (datosentrada[3].toString().equals("Campos Incorrectos")){
					System.out.println("ERROR: Faltan Campos en el archivo de input");
					sal.saveInputNotValid(rutaofile);
				}else{
					
					EntregaEnOficinaResponse entr = new EntregaEnOficinaResponse();
					Proceso proc = new Proceso();
					entr=proc.getResultados(datosentrada);
					
					tiporesultado = proc.gettiporesult();
					
					if(tiporesultado==1){
						System.out.println("ERROR: Incorrect WS Address..");
						sal.saveErrorWS(rutaofile);
					}else{
						cod_mensaje=Integer.parseInt(entr.getRefResponseHeader().getCodigoRespuesta());
						
						switch (cod_mensaje){
						
						case 0:
							System.out.println("Se empezara a guardar");
							sal.saveData(rutaofile, entr);
							System.out.println("Se guardó en la ruta: "+rutaofile);
							break;
						case 1:
							sal.saveErrorInesperado(rutaofile, entr);
							System.out.println("Error Inesperado");
							break;
						case 2:
							sal.saveCabeceraNotValid(rutaofile, entr);
							System.out.println("Error de cabecera");
							break;
						case 3:
							sal.saveCabeceraNotValid(rutaofile, entr);
							System.out.println("Error de cabecera");
							break;
						case 4:
							sal.saveCabeceraNotValid(rutaofile, entr);
							System.out.println("Error de cabecera");
							break;
						case 5:
							sal.saveInvalidParameters(rutaofile, entr);
							System.out.println("Error de parámetros");
							break;
						case 8:
							sal.saveEntregaNotFound(rutaofile, entr);
							System.out.println("Sin datos");
							break;
						case 10:
							sal.saveCabeceraNotValid(rutaofile, entr);
							System.out.println("Error. Sin llave");
							break;
						case 11:
							sal.saveInvalidParameters(rutaofile, entr);
							System.out.println("Error. Sin id de entrega");
							break;
						case 12:
							sal.saveInvalidParameters(rutaofile, entr);
							System.out.println("Error. Sin tipo de operacion");
							break;
						case 13:
							sal.saveInvalidState(rutaofile, entr);
							System.out.println("Estado de la entrega diferente a <Entregado a Oficina>");
							break;
						case 14:
							sal.saveInvalidKey(rutaofile, entr);
							System.out.println("Error. Llave no válida");
							break;
						case 15:
							sal.saveInvalidParameters(rutaofile, entr);
							System.out.println("Error. Tipo de Operación incorrecta");
							break;
						case 16:
							sal.saveErrorServicio(rutaofile, entr);
							System.out.println("Error. Error en el servicio de activación");
							break;
						case 18:
							sal.saveInvalidParameters(rutaofile, entr);
							System.out.println("Error. Sin bioIdTxn");
							break;
						case 19:
							sal.saveErrorServicio(rutaofile, entr);
							System.out.println("Error. Error en el servcio de huella");
							break;
						case 20:
							sal.saveErrorServicio(rutaofile, entr);
							System.out.println("Error. Error en el servcio de huella. Sin indice especificado");
							break;
						case 21:
							sal.saveErrorServicio(rutaofile, entr);
							System.out.println("Error. Error en el servcio de huella. Indice no especificado.");
							break;
						case 22:
							sal.saveErrorServicio(rutaofile, entr);
							System.out.println("Error. Error en el servcio de huella. Registro no encontrado.");
							break;
						case 23:
							sal.saveErrHuellaMinucia(rutaofile, entr);
							System.out.println("Huella Invalida");
							break;
						case 24:
							sal.saveErrHuellaMinucia(rutaofile, entr);
							System.out.println("Minucia Invalida");
							break;
						}
					}
					
				}
				
			
						
		}
		
		//Si la búsqueda es por Documento, datosentrada[0]="1"
		
		/////////Salida de datos///////////
		

	}

}
