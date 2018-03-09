/* Piero Vera
 * 2018-03-03
 * Calculo con clase Rectangulo
 */

public class EjecutableMesas {
    public static void main(String[] args) {
	double area = 0;

	Rectangulo mesa1 = new Rectangulo(2, 1.8);
	Rectangulo mesa2 = new Rectangulo(1, 1.5);
	Rectangulo mesa3 = new Rectangulo(3, 2);

	area += mesa1.area();
	area += mesa2.area();
	area += mesa3.area();

	System.out.printf("El area es: %f\n", area);
    }
}
	
