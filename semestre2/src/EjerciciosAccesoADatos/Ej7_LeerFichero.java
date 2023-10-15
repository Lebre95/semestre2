package EjerciciosAccesoADatos;

import java.io.*;

public class Ej7_LeerFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fichero = new File("FicheroNuevoTexto.txt");
		FileReader fr = new FileReader(fichero);
		
		//Para almacenar los caracteres
		int i; 
		
		System.out.println("Contenido del fichero: " + fichero.getName());
		
		while((i = fr.read()) !=-1) {
			System.out.println((char)i); //Para convertirlo en char.
		}
		fr.close(); //Para cerrar el flujo.
		
	}

}
