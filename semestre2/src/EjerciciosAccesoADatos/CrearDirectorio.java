package EjerciciosAccesoADatos;

import java.io.File; //Importamos este para el manejo de ficheros.
import java.io.IOException; // Y este para el tratamiento de excepciones.

public class CrearDirectorio {

	public static void main(String[] args) {
		
		//Creamos el directorio(carpeta) y el fichero para guardarlo dentro de la carperta con sus respectivas rutas relativas:
		
		File miNuevoDirectorio = new File("src/miNuevoDirectorio");
		File miNuevoFichero = new File("src/miNuevoDirectorio/miNuevoDirectorio.txt");
		
		//Hacemos un try-catch para poder crear los archivos y si hay algun fallo que la excepcion nos lo indique:
		
		try {
			miNuevoDirectorio.mkdir(); //.mkdir para crear el nuevo directorio.
			if (miNuevoFichero.createNewFile())
				System.out.println("Fichero creado correctamente...");
			else System.err.println("ERROR: No se ha podido crear el fichero...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("FIN DEL PROGRAMA");
	}
}
