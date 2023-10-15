package EjerciciosAccesoADatos;

import java.sql.*;

//Vamos a crear una conexion con una base de datos MYSQL:
public class Ej13_ConnectDB {

	//Creamos primero las variables que vamos a necesitar que en este caso son: El nombre de la BBDD, el usuario y a contraseña de acceso.
	private final String BBDD;
	private final String USER;
	private final String PASSWORD;
	
	//Constructor por defecto:
	public Ej13_ConnectDB() {
		BBDD = "jdbc:mysql://localhost:3307"; 			 //Localizacion de la bbdd.   ESTO ES MODIFICABLE
		USER = "Lebre95@localhost:3307";				//Usuario.
		PASSWORD = "padajuma1";						   //Contraseña.
	}
	
	//Emparejamos cada valor con su relacion.
	public Ej13_ConnectDB(String BBDD, String USER, String PASSWORD) {
		this.BBDD = BBDD;
		this.USER = USER;
		this.PASSWORD = PASSWORD;
	}
	
	//Con este metodo estableceremos la conexion de dichos datos:
	public void connectToDB() throws SQLException{
		Connection connect = DriverManager.getConnection(BBDD, USER, PASSWORD);
		Statement sentencia = connect.createStatement();
		
		System.out.println("CONEXION CORRECTA");
		
		sentencia.close();
		connect.close();
	}
}
