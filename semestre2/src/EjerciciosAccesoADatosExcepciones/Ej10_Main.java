package EjerciciosAccesoADatosExcepciones;

public class Ej10_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ej10_ManejoDeArchivosException lectura = new Ej10_ManejoDeArchivosException();
		
		//Try-catch para intentar leer el archivo:
		try {
			lectura.leerArchivo("HOLA ESTO VA HA HACER QUE SALTE LA EXCEPCION QUERIENDO, PERO AQUI IRIA EL NOMBRE DEL ARCHIVO CORRESPONDIENTE"); //Aqui pondriamos el nombre del archivo correspondiente que qerriamos leer.
		} catch (Ej10_ArchivoNoEncontradoException e) {
			e.printStackTrace();
		}
		
	}

}
