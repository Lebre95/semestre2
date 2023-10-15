package EjerciciosAccesoADatos;

import java.io.*;

public class Ej5_Escribir_leer_ficheros {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fichero = new File("FicheroNuevoTexto.txt"); //Este fichero lo crea en la carpeta SRC actual en la que estamos trabajando.
		FileWriter fw = new FileWriter(fichero);
		
		String cadena = "Esta es la frase que se va a almacernar en el fichero.";
		
		//Convertimos la cadena de texto en un array de chars:
		char[] arrayCadena = cadena.toCharArray();
		
		//Para recorrer el array:
		for(int i=0; i< arrayCadena.length; i++) {
			fw.write(arrayCadena[i]); //Esto es para que escriba uno a uno todos los caracteres.
		}
		
		//Añadimos el caracter * para indicar el fin de la cadena:
		fw.append('*');
		//Para limpiar y cerrar el flujo:
		fw.flush();
		fw.close();
	}

}
