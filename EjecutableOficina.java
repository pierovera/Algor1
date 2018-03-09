import java.util.Scanner;

/* Piero Vera
 * 2018-03-03
 * Ejercicio tapetes circulares en oficina rectangular
 */

public class EjecutableOficina {
    public static void main(String[] args) {
	int i;
	double b, h, r, areaT = 0, areaD;
	Scanner scan = new Scanner(System.in);
	
	System.out.printf("Largo de la oficina (m)? ");
	b = scan.nextDouble();

	System.out.printf("Ancho de la oficina (m)? ");
	h = scan.nextDouble();
	
	Rectangulo oficina = new Rectangulo(b, h);

	if (oficina.getB() > oficina.getH()) 
	    r = h / (3.0 * 2.0);
	else
	    r = b / (3.0 * 2.0);

	Circulo tapete = new Circulo(r);
	
	areaT += 3 * tapete.area();

	areaD = oficina.area() - areaT;

	System.out.printf("Area descubierta: %f m^2\n", areaD);
    }
}
