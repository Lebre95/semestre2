package EjerciciosAccesoADatos;

import java.sql.SQLException;

public class Ej13_ConexionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ej13_ConnectDB connect = new Ej13_ConnectDB();
		
		//Try-catch para intentar establecer la conexion o que nos comunique el error:
		try {
			connect.connectToDB();
		} catch (SQLException ex) {
			System.err.println("ERROR: NO SE HA PODIDO CONECTAR AL SERVIDOR SQL");
			ex.printStackTrace();
		}
	}

}
