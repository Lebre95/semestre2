package EjerciciosAccesoADatos;

import java.io.*;

public class Ej4_Escritura_LecturaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ficheroDatos = new File("C:\\Users\\pabli\\OneDrive\\Escritorio\\java proyectos\\PruebaNuevaRutaC\\datos.txt"); //Creamos el nuevo fichero en su ruta.
		if(!ficheroDatos.exists()) {
			try {
				if(ficheroDatos.createNewFile())
					System.out.println("El nuevo fichero se ha creado correctamente...");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//Creamos un objeto que realice las operaciones que queramos realizar con los ficheros:
		Ej4_Lectura_Escritura_Operaciones_Ficheros objetoOperador = new Ej4_Lectura_Escritura_Operaciones_Ficheros();
		try {
			objetoOperador.escribe(ficheroDatos);
			objetoOperador.lee(ficheroDatos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
