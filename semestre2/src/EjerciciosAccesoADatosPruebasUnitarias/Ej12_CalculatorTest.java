package EjerciciosAccesoADatosPruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import EjerciciosAccesoADatosPruebasUnitarias.Ej12_CalculatorJunit;

class Ej12_CalculatorTest {

	Ej12_CalculatorJunit calc;
	
	@BeforeAll
	static void BeforeAll()  {
		System.out.println("Run before all test");
	}
	
	@TestInstance(Lifecycle.PER_CLASS)
	public static class Extension implements BeforeAllCallback, ParameterResolver{ 
 

		@Override
		public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
				throws ParameterResolutionException {
			// TODO Auto-generated method stub
			return new Ej12_CalculatorJunit();
		}

		@Override
		public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
				throws ParameterResolutionException {
			// TODO Auto-generated method stub
			return parameterContext.getParameter().getType()==Ej12_CalculatorJunit.class;
		}

		@Override
		public void beforeAll(ExtensionContext arg0) throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Before all tests");
		}
		
	}

	//Vamos a hacer un metodo para los positivos y otro para los negativos.
	@Test
	@DisplayName("Test add method with positive integers")
	void testAddPositive() {
		calc = new Ej12_CalculatorJunit();
		assertEquals(4, calc.add(2, 2), "2 should equal 4");
		assertEquals(100, calc.add(50, 50), "50 + 50 should equal 100");
	}
	
	@Test
	@DisplayName("Test add method with negative integers")
	void testAddNegative() {
		calc = new Ej12_CalculatorJunit();
		assertEquals(-4, calc.add(-2, -2),  "(-2) + (-2) should equal -4");
		assertEquals(-100, calc.add(-50, -50),  "(-50) + (-50) should equal - 100");
	}

}
