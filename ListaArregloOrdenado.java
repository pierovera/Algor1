/* Piero Vera
 * 2018-05-03
 * Lista Arreglo Ordenado c/Generico
 */

public class ListaArregloOrdenado <T extends Comparable <T>> {
    private T[] arr;
    private int n;
    private final int MAX = 50;

    public ListaArregloOrdenado() {
	arr = (T[]) new Comparable[MAX];
	n = 0;
    }

    public ListaArregloOrdenado(int max) {
	arr = (T[]) new Comparable[max];
	n = 0;
    }

    public ListaArregloOrdenado(T[] b) {
	int sz = b.length;
	arr = (T[]) new Comparable[2 * sz];
	
	for(int i = 0; i < (sz); i++) 
	    add(b[i]);
    }
    
    public String toString() {
	StringBuilder str = new StringBuilder();

	for(int i = 0; i < n; i++)
	    str.append(arr[i].toString()).append('\n');

	str.append("\nSize: ").append(n);

	return str.toString();
    }

    public boolean add(T x) {
	int i = 0;
	boolean res = false;
	
	if (n >= arr.length)
	    expandCapacity();
	
	i = ArrG.binarySearch(arr, n, x);
	
	if(i < 0) {
	    i = -(i + 1);
	    n = ArrG.unCorrDer(arr, n, i);
	    arr[i] = x;
	    res = true;
	}

	return res;
    }

    public T remove(int i) {	
	T res = null;

	if (i < n) {
	    res = arr[i];
	    n = ArrG.unCorrIzq(arr, n, i);
	}

	return res;
    }

    public T remove(T x) {
	T res = null;
	int i = indexOf(x);

	if (i >= 0) {
	    res = arr[i];
	    n = ArrG.unCorrIzq(arr, n, i);
	}

	return res;
    }

    public int size() {
	return n;
    }

    public boolean contains(T x) {
	return (ArrG.binarySearch(arr, n, x) >= 0);
    }

    public int indexOf(T x) {
	return ArrG.binarySearch(arr, n, x);
    }

    public void clear() {
	arr = (T[]) new Comparable[MAX];
	n = 0;
    }

    private void expandCapacity() {
	T[] tmp = (T[]) new Comparable[n*2];
	System.arraycopy(arr, 0, tmp, 0, n);
	arr = tmp;
    }

    public boolean isEmpty() {
	return (n == 0);
    }

    public T get(int i) {
	T res = null;

	if(i < n && i >= 0)
	    res = arr[i];

	return res;
    }
}
