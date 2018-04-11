import java.util.*;

/* Piero Vera
 * 2018-04-05
 * Lectura e impresion de arreglos
 */

public class Arreglos {
    private static final int MAX = 100;
    
    private static void imprimir(double[] arr, int sz) {
	System.out.printf("[ ");
	for(int i = 0; i < sz; i++) 
	    System.out.printf("%.2f ", arr[i]);
	System.out.printf("]\n");
    }
    
    private static int leer(double[] arr) {
	Scanner sc = new Scanner(System.in);
	int n;

	System.out.printf("Cuantos elementos leo? (max %d): ", arr.length);
	n = sc.nextInt();

	if( n < 0 || n > MAX)
	    n = 0;
	
	for(int i = 0; i < n; i++) {
	    System.out.printf("Numero %d: ", i + 1);
	    arr[i] = sc.nextDouble();
	}

	return n;
    }
    
    public static void main(String[] args) { 
	double[] arr = new double[MAX];
	int sz, outInt;
	double outF;
	ArrayList<Integer> outList;
	
	sz = leer(arr);
	imprimir(arr, sz);
	
	outF = ManejadorArreglos.suma(arr, sz);
	System.out.printf("Suma: %f\n", outF);
	
	outF = ManejadorArreglos.promedio(arr, sz);
	System.out.printf("Promedio: %f\n", outF);
	
	outInt = ManejadorArreglos.posMax(arr, sz);
	System.out.printf("Pos Max: %d\n", outInt);
		
	outInt = ManejadorArreglos.posMin(arr, sz);
	System.out.printf("Pos Min: %d\n", outInt);
	
	outInt = ManejadorArreglos.countMaxN(arr, sz, 10.0);
	System.out.printf("Count max 10.0: %d\n", outInt);
	
	outInt = ManejadorArreglos.countMinN(arr, sz, 10.0);
	System.out.printf("Count min 10.0: %d\n", outInt);
	
	outList = ManejadorArreglos.posMaxN(arr, sz, 10.0);
	System.out.printf("Pos max 10.0: %s\n", outList.toString());
			  	
	outList = ManejadorArreglos.posMinN(arr, sz, 10.0);
	System.out.printf("Pos min 10.0: %s\n", outList.toString());
	
	ManejadorArreglos.swap(arr, 3, 6);
	imprimir(arr, sz);
	
	ManejadorArreglos.invert(arr, sz);
	imprimir(arr, sz);
    }
}


    
