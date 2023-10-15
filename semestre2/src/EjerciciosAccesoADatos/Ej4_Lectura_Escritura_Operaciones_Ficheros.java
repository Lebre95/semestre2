package EjerciciosAccesoADatos;

import java.io.*;

public class Ej4_Lectura_Escritura_Operaciones_Ficheros {

	// Creamos un metodo para escribir ficheros y luego crearemos otro para leerlos:
	
	//Metodo de escritura:
	public void escribe(File fichero) throws IOException{
		FileWriter objetoEscritor = new FileWriter(fichero);
		objetoEscritor.write("Estoy escribiendo esta linea en el fichero...");
		objetoEscritor.flush();  //Sirve para volcar todos los datos que han podido quedar del metodo write y asi luego se puede proceder al cerrado del archivo con el .close().
		objetoEscritor.close();
	}
	
	//Metodo de lectura:
	public void lee(File fichero) throws IOException{
		FileReader objetoLector = new FileReader(fichero); //Abre el archivo para lectura.
		int valor = objetoLector.read(); // Lee el primer byte del archivo y lo almacenará en "valor".  .read() devuleve valores enteros.
		
		//Bucle para leer y mostrar el contenido del archivo:
		while(valor !=-1) {
			System.out.println("Char: "+(char)valor + "\t\tascii: " + valor);  // Muestra el carácter y su valor ASCII
			valor = objetoLector.read(); // Lee el siguiente byte del archivo
		}
		objetoLector.close(); //Cerramos el flujo.		
	}
}
