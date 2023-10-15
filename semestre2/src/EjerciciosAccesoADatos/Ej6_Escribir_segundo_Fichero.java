package EjerciciosAccesoADatos;

import java.io.*;

public class Ej6_Escribir_segundo_Fichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fichero = new File("FicheroNuevoTexto2.txt"); //Este fichero lo crea en la carpeta SRC actual en la que estamos trabajando.
		FileWriter fw = new FileWriter(fichero);
		
		String [] nombres = {"Pablo", "Pepe", "Jose", "Mireia", "Maria", "Daniel", "Juan Manuel"};
		
		//Para recorrer el array:
		for(int i=0; i< nombres.length; i++) {
			fw.write(nombres[i]); //Esto es para que escriba todos los nombres.
			fw.write("\n"); //Los escribe con saltos de linea.
		}
		
		//Añadimos el caracter * para indicar el fin de la cadena:
		fw.append('*');
		//Para limpiar y cerrar el flujo:
		fw.flush();
		fw.close();
	}
}

