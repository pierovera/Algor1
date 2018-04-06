import java.util.Scanner;

/* Piero Vera
 * 2018-04-05
 * Lectura e impresion de arreglos
 */

public class Arreglos {
    public static void main(String[] args) {
	int[] arr = {1, 2, 3, 5, 6, 2, 1};

	leer(arr);
	imprimir(arr);
    }
    
    private static void imprimir(int[] arr) {
	Scanner sc = new Scanner(System.in);
	int n;
	
	System.out.printf("Cuantos elementos imprimo? (max %d): ", arr.length);
	n = sc.nextInt();
	
	System.out.printf("[");
	for(int i = 0; i < n; i++) 
	    System.out.printf("%d ", arr[i]);
	System.out.printf("]\n");
    }
    
    private static int leer(int[] arr) {
	Scanner sc = new Scanner(System.in);
	int n;

	System.out.printf("Cuantos elementos leo? (max %d): ", arr.length);
	n = sc.nextInt();
	
	for(int i = 0; i < n; i++) {
	    System.out.printf("Numero %d: ", i + 1);
	    arr[i] = sc.nextInt();
	}

	return n;
    }
}


    
