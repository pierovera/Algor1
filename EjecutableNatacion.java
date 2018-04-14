import java.util.Scanner;

/* Piero Vera
 * 2018-04-14
 * Ejecutable Escuela de Natacion
 */

public class EjecutableNatacion {
    public static void main(String[] args) {
	EscuelaNatacion e = new EscuelaNatacion("Escuela", "Calle 1 #2");
	Scanner sc = new Scanner(System.in);
	int n;
	double w, h, area;
	
	System.out.printf("Cuantas albercas? (max %d): ", 10);
	n = sc.nextInt();
	
	for(int i = 0; i < (n); i++) {
	    System.out.printf("\nAlberca %d\nLargo: ", i + 1);
	    h = sc.nextDouble();
	    System.out.printf("Ancho: ");
	    w = sc.nextDouble();

	    e.altaAlberca(w, h);
	}

	area = e.areaTotalAlb();

	System.out.printf("%s\nArea por techar: %f\nCosto: $%.2f\n",
			  e.toString(), area, area*1000);
    }
}
