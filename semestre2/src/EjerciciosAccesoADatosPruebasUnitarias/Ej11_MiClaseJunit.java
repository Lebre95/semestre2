package EjerciciosAccesoADatosPruebasUnitarias;

public class Ej11_MiClaseJunit {
	//creamos el objeto numero_mayor para hacer las comparaciones de los numeros:
	public int numero_mayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;
        } else {
            return b;
        }
    }

}
