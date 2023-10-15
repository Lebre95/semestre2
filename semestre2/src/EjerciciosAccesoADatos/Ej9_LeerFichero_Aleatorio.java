package EjerciciosAccesoADatos;

import java.io.*;

public class Ej9_LeerFichero_Aleatorio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Creamos el fichero que queremos leer:
		File fichero = new File("FicheroAleatorio1.dat"); 
		
		//Declaramos el fichero de acceso aleatorio:
		RandomAccessFile file = new RandomAccessFile(fichero, "r"); //Con "r" declaramos que será de lectura.
		
		//Declaramos las variables que van a aparecer:
		int id, dep, posicion;
		Double salario;
		char apellido[] = new char[10], aux;
		//Para situarnos al principio iniciamos a 0 la posición:
		posicion=0;
		
		//Para recorrer el fichero:
		for(;;) {
			file.seek(posicion); //Nos posicionamos en la posición.
			id = file.readInt(); //Obtenemos el id del empleado.
		
		
		//Para recorrer uno a uno los caracteres del array apellido:
		for (int i=0; i < apellido.length; i++) {
			aux = file.readChar();
			apellido[i] = aux;  //Para guardarlos en el array.
		}
		
		//Para convertir a String el array:
		String apellidos = new String(apellido);
		dep = file.readInt();			//Para obtener el departamento.
		salario = file.readDouble();	//Para obtener el salario.
		
		if(id>0)
			
			    System.out.printf("ID: %s, Apellidos: %s, Departamento: %d, Salario: %.2f %n", id, apellidos.trim(), dep, salario);

		
		//Posicionamiento para el siguiente empleado, teniendo en cuenta que cada empleado ocupa 36 bytes:
		posicion = posicion +36;
		
		//Si hemos recorrido todos los bytes salgo del for:
		if(file.getFilePointer()== file.length()) break;
		
		} //Fin del bucle for.
		file.close();
	}	

}
