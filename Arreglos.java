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

    public static double suma(double[] arr, int sz) {
	double sum = 0;

	for(int i = 0; i < sz; i++)
	    sum += arr[i];

	return sum;
    }

    public static double promedio(double[] arr, int sz) {
	double sum = 0;

	for(int i = 0; i < sz; i++)
	    sum += arr[i];

	// Asumo al menos un elemento
	return sum/sz;
    }

    public static int posMax(double[] arr, int sz) {
	// Asumo minimo 1 elemento
	double max = arr[0];
	int pos = 0;
	
	for(int i = 1; i < sz; i++)
	    if (arr[i] > max) {
		max = arr[i];
		pos = i;
	    }

	return pos;
    }

    public static int posMin(double[] arr, int sz) {
	// Asumo minimo 1 elemento
	double min = arr[0];
	int pos = 0;
	
	for(int i = 1; i < sz; i++)
	    if (arr[i] < min) {
		min = arr[i];
		pos = i;
	    }

	return pos;
    }

    public static int countMaxN(double[] arr, int sz, double n) {
	int count = 0;

	for(int i = 0; i < sz; i++) {
	    if (arr[i] > n)
		count++;
	}

	return count;
    }
    
    public static int countMinN(double[] arr, int sz, double n) {
	int count = 0;

	for(int i = 0; i < sz; i++) {
	    if (arr[i] < n)
		count++;
	}

	return count;
    }

    public static ArrayList<Integer> posMaxN(double[] arr, int sz, double n) {
	ArrayList<Integer> pos = new ArrayList<Integer> ();
	
	for(int i = 0; i < sz; i++) {
	    if (arr[i] > n)
		pos.add(i);
	}

	return pos;
    }

    public static ArrayList<Integer> posMinN(double[] arr, int sz, double n) {
	ArrayList<Integer> pos = new ArrayList<Integer> ();
	
	for(int i = 0; i < sz; i++) {
	    if (arr[i] < n)
		pos.add(i);
	}

	return pos;
    }

    public static void swap(double[] arr, int a, int b) {
	// asumo que existen a,b
	if(a < MAX && b < MAX && a > 0 && b > 0) {
	    double tmp = arr[a];
	    
	    arr[a] = arr[b];
	    arr[b] = tmp;
	}
    }

    public static void invert(double[] arr, int sz) {
	double tmp;

	for(int i = 0; i < (double)sz/2; i++) {
	    tmp = arr[i];
	    arr[i] = arr[sz - i - 1];
	    arr[sz - i - 1] = tmp;
	}
    }
    
    public static void main(String[] args) { 
	double[] arr = new double[MAX];
	int sz, outInt;
	double outF;
	ArrayList<Integer> outList;
	
	sz = leer(arr);
	imprimir(arr, sz);
	
	outF = suma(arr, sz);
	System.out.printf("Suma: %f\n", outF);
	
	outF = promedio(arr, sz);
	System.out.printf("Promedio: %f\n", outF);
	
	outInt = posMax(arr, sz);
	System.out.printf("Pos Max: %d\n", outInt);
		
	outInt = posMin(arr, sz);
	System.out.printf("Pos Min: %d\n", outInt);
	
	outInt = countMaxN(arr, sz, 10.0);
	System.out.printf("Count max 10.0: %d\n", outInt);
	
	outInt = countMinN(arr, sz, 10.0);
	System.out.printf("Count min 10.0: %d\n", outInt);
	
	outList = posMaxN(arr, sz, 10.0);
	System.out.printf("Pos max 10.0: %s\n", outList.toString());
			  	
	outList = posMinN(arr, sz, 10.0);
	System.out.printf("Pos min 10.0: %s\n", outList.toString());
	
	swap(arr, 3, 6);
	imprimir(arr, sz);
	
	invert(arr, sz);
	imprimir(arr, sz);
    }
}


    
