import java.util.Scanner;

/* Piero Vera
 * 2018-03-03
 * Ejercicio tapetes circulares en oficina rectangular
 */

public class EjecutableOficina2 {
    public static void main(String[] args) {
	int i, n, k;
	double b, h, r, areaO = 0, areaT = 0, areaD;
	Scanner scan = new Scanner(System.in);
	Rectangulo oficina = new Rectangulo();
	Circulo tapete = new Circulo();
		
	System.out.printf("Numero de oficinas? ");
	n = scan.nextInt();

	System.out.printf("Numero de tapetes? ");
	k = scan.nextInt();
	
	for (i = 0; i < n; i++) {
	    System.out.printf("Largo de la oficina %d (m)? ", i + 1);
	    b = scan.nextDouble();
	    
	    System.out.printf("Ancho de la oficina %d (m)? ", i + 1);
	    h = scan.nextDouble();

	    oficina.setB(b);
	    oficina.setH(h);

	    areaO += oficina.area();
	
	    if (oficina.getB() > oficina.getH()) 
		r = h / (k * 2.0);
	    else
		r = b / (k * 2.0);

	    tapete.setR(r);

	    areaT += k * tapete.area();
	}
	
	areaD = areaO - areaT;

	System.out.printf("Area descubierta: %f m^2\n", areaD);
    }
}
