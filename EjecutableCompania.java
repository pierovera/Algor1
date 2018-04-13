import java.util.Scanner;

public class EjecutableCompania {
    public static void main(String[] args) {
	Compania c = new Compania("Empaques SA de CV", "Av Constitucion 43",
				  "Queretaro", "Juan Perez");
	Scanner sc = new Scanner(System.in);
	double venta, avg, total;
	String max, min;
	int arribaAvg;
	
	for(int i = 0; i < 12; i++) {
	    System.out.printf("Venta para %s: ", c.getMes(i));
	    venta = sc.nextDouble();
	    c.leerVenta(venta);
	}

	System.out.printf("%s\n\n", c.toString());

	avg = c.promedio();
	max = c.getMes( c.mesMayor() );
	min = c.getMes( c.mesMenor() );
	arribaAvg = c.arribaPromedio();
	total = c.totalUnidades();

	System.out.printf("Promedio de ventas: $%.2f\n" +
			  "Mes c/mayor ventas: %s\n" +
			  "Mes c/menor ventas: %s\n" +
			  "Meses arriba del promedio: %d\n" +
			  "Total de venta: $%.2f\n", avg, max, min,
			  arribaAvg, total);
    }
}
			  
			      
