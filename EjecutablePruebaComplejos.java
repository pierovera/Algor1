/* Piero Vera
 * 2018-03-15
 * Ejecutable de prueba de calculadora de complejos
 */

public class EjecutablePruebaComplejos {
    public static void main(String[] args) {
	Complejo c1, c2, c3, c4, c5, c6;

	c1 = new Complejo();
	c1.setReal(5);
	c1.setImag(-2);

	c2 = new Complejo(4.2, 7);

	c3 = CalculadoraComplejo.suma(c1, c2);
	c4 = CalculadoraComplejo.resta(c1, c2);
	c5 = CalculadoraComplejo.multiplicacion(c1, c2);
	c6 = CalculadoraComplejo.division(c1, c2);

	System.out.printf("a = %s\nb = %s\n\n" +
			  "a + b = %s\n\n" +
			  "a - b = %s\n\n" +
			  "a * b = %s\n\n" +
			  "a / b = %s\n\n", c1.toString(), c2.toString(),
			  c3.toString(), c4.toString(), c5.toString(),
			  c6.toString());
    }
}
