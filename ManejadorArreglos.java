import java.util.*;

/* Piero Vera
 * 2018-04-09
 * Manejador de arreglos
 */

public class ManejadorArreglos {
    public static double suma(double[] arr, int sz) {
	double sum = 0;

	for(int i = 0; i < sz; i++)
	    sum += arr[i];

	return sum;
    }

    public static double promedio(double[] arr, int sz) {
	double sum = suma(arr, sz);

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
	// asumo que existen a,b y estan en el rango correcto
	    double tmp = arr[a];
	    
	    arr[a] = arr[b];
	    arr[b] = tmp;
    }

    public static void invert(double[] arr, int sz) {
	for(int i = 0; i < (double)sz/2; i++) 
	    swap(arr, i, (sz - i - 1));
    }

    public static void movDer(double[] arr, int sz, int k) {
	for(int i = 0; (i+k) < sz; i++) 
	    arr[sz - i - 1] = arr[sz - k - i - 1];
	for(int i = 0; i < k; i++)
	    arr[i] = 0;
    }

    public static void movIzq(double[] arr, int sz, int k) {
	for(int i = 0; (i+k) < sz; i++)
	    arr[i] = arr[i + k];
	for(int i = 0; i < k; i++)
	    arr[sz - i - 1] = 0;
    }
}
