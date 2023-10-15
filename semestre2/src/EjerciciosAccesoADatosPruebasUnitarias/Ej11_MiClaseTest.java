package EjerciciosAccesoADatosPruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;
import EjerciciosAccesoADatosPruebasUnitarias.Ej11_MiClaseJunit;
import org.junit.jupiter.api.Test;

class Ej11_MiClaseTest {

	@Test
	void testNumero_mayor() {
		System.out.println("numero_mayor");
		//Le damos un valor a cada una de las variables:
		int a = 0;
		int b = 0;
		int c = 0;
		//Creamos un objeto llamado instancia:
		Ej11_MiClaseJunit instance = new Ej11_MiClaseJunit(); 
		//El resultado esperado es 0, si fuese distinto daria error la prueba unitaria:
		int expResult = 0; 
		int result = instance.numero_mayor(a, b, c);
		//Comparamos si el resultado esperado es igual al real:
		assertEquals(expResult, result);
		
	}

}
