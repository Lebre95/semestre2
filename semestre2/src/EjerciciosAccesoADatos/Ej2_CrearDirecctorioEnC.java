package EjerciciosAccesoADatos;

import java.io.File; //Importamos este para el manejo de ficheros.
import java.io.IOException; // Y este para el tratamiento de excepciones.

public class Ej2_CrearDirecctorioEnC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definir la ruta del directorio y su fichero:
		
		File miNewDirectorio = new File("C:\\Users\\pabli\\OneDrive\\Escritorio\\java proyectos\\PruebaNuevaRutaC");
		File miNewFichero = new File("C:\\Users\\pabli\\OneDrive\\Escritorio\\java proyectos\\PruebaNuevaRutaC\\miFichero.txt");
		
		//Hacemos un try-catch para poder crear los archivos en su respectiva ruta y si hay algun fallo que la excepcion nos lo indique:
		
				try {
					miNewDirectorio.mkdir(); //.mkdir para crear el nuevo directorio.
					System.out.println("Directorio creado correctamente...");
					if (miNewFichero.createNewFile())
						System.out.println("Fichero creado correctamente...");
					else System.err.println("ERROR: No se ha podido crear el fichero...");
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("FIN DEL PROGRAMA");

		
	}

}
