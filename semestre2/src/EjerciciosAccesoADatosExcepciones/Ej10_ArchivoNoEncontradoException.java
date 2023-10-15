package EjerciciosAccesoADatosExcepciones;

public class Ej10_ArchivoNoEncontradoException  extends Exception{
	
	//Aqui creamos la excepcion que lo que hara es mandar un mensaje cuando no encuentre el archivo:
	
	public Ej10_ArchivoNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}
