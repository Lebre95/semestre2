package EjerciciosAccesoADatosExcepciones;

import java.io.*;

public class Ej10_ManejoDeArchivosException {

	public void leerArchivo(String nombreArchivo) throws Ej10_ArchivoNoEncontradoException{
		//Hacemos un try-catch para que intente leer el archivo si existiese:
		try {
			BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo)); //Creamos el nuevo flujo de lectura.
			String linea;
			while((linea = reader.readLine()) != null) { //Mientras que haya texto leerá.
				System.out.println(linea);
			}
			reader.close(); //Para cerrar el flujo de lectura.
			
			//Para introducir la nueva excepcion que hemos creado en la otra clase java:
		} catch(FileNotFoundException e) { 
			throw new Ej10_ArchivoNoEncontradoException("El archivo " + nombreArchivo + ", no se ha encontrado, lo sentimos mucho...");
		}catch (IOException e) {
			// TODO: handle exception
			System.err.println("HA OCURRIDO UN ERROR AL INTENTAR LEER EL ARCHIVO.");
		}
	}
}
