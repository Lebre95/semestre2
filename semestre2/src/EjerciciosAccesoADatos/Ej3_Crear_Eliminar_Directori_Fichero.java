package EjerciciosAccesoADatos;

import java.io.*;
import java.util.Scanner;

public class Ej3_Crear_Eliminar_Directori_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos esto para poder seleccionar después las distintas opciones que vamos a crear.
		int opcion; 
		
		//Importamos el Scanner para poder seleccionar desde la pantalla:	
		Scanner sc = new Scanner(System.in);  
		
		//Creamos los archivos-carpeta y le añadimos sus rutas donde queremos que se almacenen:
		
		File miNewDirectorioEj3 = new File("C:\\Users\\pabli\\OneDrive\\Escritorio\\java proyectos\\PruebaNuevaRutaC\\miNewDirectorioEj3");
		File miFichero = new File("C:\\Users\\pabli\\OneDrive\\Escritorio\\java proyectos\\PruebaNuevaRutaC\\miFicheroTexto1.txt");
		File miFichero2 = new File("C:\\Users\\pabli\\OneDrive\\Escritorio\\java proyectos\\PruebaNuevaRutaC\\miNewDirectorioEj3\\miFicheroTexto2.txt");
		
		//Hacemos un try-catch para poder crear los archivos en su respectiva ruta y si hay algun fallo que la excepcion nos lo indique:
		
		try {
			if (miFichero.createNewFile())
				System.out.println("Fichero creado correctamente...");
			else System.err.println("ERROR: No se ha podido crear el fichero...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Creamos las opciones que van a salir por pantalla:
		do {
			System.out.println("___________CREAR UN NUEVO FICHERO DE TEXTO__________");
			System.out.println("                  MENÚ DE OCIONES                   ");
			System.out.println("1. Crear directorio miNewDirectorioEj3 ");
			System.out.println("2. Crear fichero miFicheroTexto2.txt en el nuevo directorio.");
			System.out.println("3. Eliminar fichero miFicheroTexto1.txt ");
			System.out.println("4. Eliminar directorio miNewDirectorioEj3 ");
			System.out.println("0. Salir ");
			System.out.println("              ELIGE UNA OPCION                       ");
			opcion = sc.nextInt(); //Para poder seleccionar por teclado.
			
			//Para poder hacer los casos de selección utilizaremos un switch-case:
		switch(opcion) {
		case 1: //Crear el directorio miNewDirectorioEj3.
			if(miNewDirectorioEj3.mkdir())
				System.out.println("Directorio creado correctamente");
			else 
				System.err.println("ERROR: No se ha podido crear el directorio correctamente...");
			break;
			
		case 2: //Crear fichero miFicheroTexto2.txt en el nuevo directorio
			try { //Para capturar excepcion si fallase.
				if(miFichero2.createNewFile())
					System.out.println("Fichero creado correctamente en su ubicación...");
				else 
					System.err.println("ERROR: No se ha podido crear el nuevo fichero de texto...");
			}catch(IOException e) {
				e.printStackTrace();
			}
			break;
		
		case 3: //Eliminar fichero miFicheroTexto2.txt que se supone que creariamos al seleccionar al opción 2.
			if(miFichero2.delete())
				System.out.println("Fichero eliminado correctamente... ");
			else 
				System.err.println("ERROR: No se ha podido eliminar el fichero de texto...");		
			
			break;
			
		case 4://Eliminar directorio miNewDirectorioEj3.
		
			miNewDirectorioEj3.delete();
			System.out.println("Directorio eliminado correctamente...");
			break;
		
		case 0: //Salir
			System.out.println("Gracias por usar este programa :) ");
			break;
			
			default: //Opción incorrecta.
			System.err.println("OPCIÓN INCORRECTA, INTÉNTELO DE NUEVO...");
		} 
		} while (opcion !=0);
		System.out.println("FIN DEL PROGRAMA");
	
	}

}
