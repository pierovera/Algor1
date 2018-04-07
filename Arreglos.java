import java.util.Scanner;

/* Piero Vera
 * 2018-04-05
 * Lectura e impresion de arreglos
 */

public class Arreglos {
    private static final int MAX = 100;
    
    private static void imprimir(double[] arr, int n) {
	System.out.printf("[ ");
	for(int i = 0; i < n; i++) 
	    System.out.printf("%.2f ", arr[i]);
	System.out.printf("]\n");
    }
    
    private static int leer(double[] arr) {
	Scanner sc = new Scanner(System.in);
	int n;

	System.out.printf("Cuantos elementos leo? (max %d): ", arr.length);
	n = sc.nextInt();
	
	for(int i = 0; i < n; i++) {
	    System.out.printf("Numero %d: ", i + 1);
	    arr[i] = sc.nextDouble();
	}

	return n;
    }

    public static void main(String[] args) { 
	double[] arr = new double[MAX];
	int sz;
	
	sz = leer(arr);
	imprimir(arr, sz);
    }
}


    
