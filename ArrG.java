import java.util.ArrayList;

/* Piero Vera
 * 2018-04-28
 * Manejador generico de arreglos
 */

public class ArrG {
    public static <T extends Comparable <T>> int posMax(T[] arr, int sz) {
	T max;
	int pos = 0;

	if (sz < 1) 
	    pos = -1;
	else {
	    max = arr[pos];

	    for(int i = 1; i < sz; i++) {
		if (arr[i].compareTo(max) > 0) {
		    max = arr[i];
		    pos = i;
		}
	    }
	}

	return pos;
    }

    public static <T extends Comparable <T>> int posMin(T[] arr, int sz) {
	T min;
	int pos = 0;

	if (sz < 1) 
	    pos = -1;
	else {
	    min = arr[pos];

	    for(int i = 1; i < sz; i++) {
		if (arr[i].compareTo(min) < 0) {
		    min = arr[i];
		    pos = i;
		}
	    }
	}

	return pos;
    }
    
    public static <T extends Comparable <T>> int countMaxA(T[] arr,
							   int sz, T a) {
	int count = 0;

	for(int i = 0; i < sz; i++) {
	    if (arr[i].compareTo(a) > 0)
		count++;
	}

	return count;
    }

    public static <T extends Comparable<T>> int countMinA(T[] arr,
							  int sz, T a) {
	int count = 0;

	for(int i = 0; i < sz; i++) {
	    if (arr[i].compareTo(a) < 0)
		count++;
	}

	return count;
    }

    public static <T extends Comparable<T>> ArrayList<Integer> 
	posMaxA(T[] arr, int sz, T a) {

	ArrayList<Integer> pos = new ArrayList<Integer> ();

	for(int i = 0; i < sz; i++) {
	    if(arr[i].compareTo(a) > 0)
		pos.add(i);
	}

	return pos;
    }

    public static <T extends Comparable<T>> ArrayList<Integer>
	posMinA(T[] arr, int sz, T a) {

	ArrayList<Integer> pos = new ArrayList<Integer> ();

	for(int i = 0; i < sz; i++) {
	    if(arr[i].compareTo(a) < 0)
		pos.add(i);
	}

	return pos;
    }

    public static <T> void swap(T[] arr, int sz, int a, int b) {
	if (a >= 0 && b >= 0 && a < sz && b < sz) {
	    T tmp = arr[a];
	    arr[a] = arr[b];
	    arr[b] = tmp;
	}
    }

    public static <T> void invert(T[] arr, int sz) {
	for(int i = 0; i < (sz/2); i++) {
	    swap(arr, sz, i, (sz - i - 1));
	}
    }

    public static <T extends Comparable<T>> int binarySearch(T[] arr, int n, T x) {
	int min = 0;
	int max = n - 1;
	int pos = 0;
	
	while (min <= max) {
	    pos = (min + max) / 2;

	    if(arr[pos].compareTo(x) > 0) 
		max = pos - 1;
	    else if (arr[pos].compareTo(x) < 0) {
		min = pos + 1;
		pos++;
	    }
	    else
		return pos;
	}

	return -(pos + 1);
    }

    public static <T> int unCorrDer(T[] arr, int n, int pos) {
	if (n >= arr.length)
	    return n;
	
	for(int i = n; i > pos; i--) 
	    arr[i] = arr[i - 1];

	n++;
	return n;
    }


    public static <T> int unCorrIzq(T[] arr, int n, int pos) {
	for(int i = pos; i < (n - 1); i++)
	    arr[i] = arr[i + 1];
	n--;
	return n;
    }
}
