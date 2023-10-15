package EjerciciosAccesoADatos;

import java.io.*;

public class Ej8_EscribirFichero_Aleatorio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Delcaramos el fichero nuevo:
		File fichero = new File("FicheroAleatorio1.dat");
		
		//Declaramos el acceso del fichero aleatorio:
		RandomAccessFile file = new RandomAccessFile(fichero, "rw"); //Con "rw" declaramos que será de escritura.
		
		//Declaramos los arrays con los datos que queremos:
		
		//Array para nombres:
		String apellido[]= {"Lebrero", "Carcela","Fernandez", "Lopez", "Ramos", "Gallego", "Morillo"};
		
		//Array para departamentos:
		int dep[] = {10, 20, 30, 30, 20, 10, 15};
		
		//Array para salarios:
		Double salario[] = {1000.50, 1390.60, 1100.35, 1500.90, 1800.50, 1435.20, 2001.67 };
		
		//Buffer para almacenar los apellidos:
		StringBuffer buffer = null;
		int n = apellido.length;  //Cuenta el numero de elementos del array.
		
		//Bucle for para recorrer los arrys:
		
		for(int i=0; i<n; i++) {
			file.writeInt(i+1); //i+1 para identificar al empleado.
			buffer = new StringBuffer(apellido[i]);
			buffer.setLength(10); // 10 caracteres para el apellido.
			file.writeChars(buffer.toString()); //Para insertar el apellido.
			file.writeInt(dep[i]);  //Para insertar el departamento.
			file.writeDouble(salario[i]); //Para insertar los salarios.
		}
		file.close(); //Que no se nos olvide cerrar el fichero.
	}

}
