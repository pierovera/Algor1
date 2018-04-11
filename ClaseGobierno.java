import java.util.Scanner;

/* Piero Vera
 * 2018-04-10
 * Ejecutable OfnaGob
 */

public class ClaseGobierno {
    public static void main(String[] args) {
	OficinaGobierno ofn = new OficinaGobierno("Lic. Martin Cuenta");
	Scanner sc = new Scanner(System.in);
	String edo;
	double pob, avg;
	int tot;
	
	for(int i = 0; i < 10; i++) {
	    System.out.printf("Nombre Edo. %2d: ", i + 1);
	    edo = sc.nextLine();

	    System.out.printf("Poblacion Edo. %2d: ", i + 1);
	    pob = sc.nextDouble();

	    sc.nextLine();
	    
	    ofn.altaInfo(edo, pob);
	}

	edo = ofn.nomEdoMax();
	System.out.printf("Estado con mayor poblacion: %s\n", edo);

	avg = ofn.promedioHab();
	System.out.printf("Promedio de habitantes: %.2f\n", avg);

	tot = ofn.numMenorPromedio();
	System.out.printf("Num edos debajo del promedio: %d\n", tot);
    }
}
