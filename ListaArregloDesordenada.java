/* Piero Vera
 * Clase Lista Arreglo Desordenada
 * 2018-05-08
 */

public class ListaArregloDesordenada<T> {
    private T[] arr;
    private int n;
    private final int MAX = 50;

    public ListaArregloDesordenada() {
	arr = (T[]) new Object[MAX];
	n = 0;
    }

    public ListaArregloDesordenada(int max) {
	arr = (T[]) new Object[max];
	n = 0;
    }

    public ListaArregloDesordenada(T[] b) {
	n = b.length;
	arr = (T[]) new Object[2 * n];
	System.arraycopy(b, 0, arr, 0, n);
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	for(int i = 0; i < n; i++) 
	    str.append(arr[i].toString()).append('\n');

	str.append("\nSize: ").append(n);

	return str.toString();
    }

    public void addFirst(T x) {
	if(n >= arr.length)
	    expandCapacity();

	n = ArrG.unCorrDer(arr, n, 0);
	arr[0] = x;
    }

    public void addLast(T x) {
	if(n >= arr.length)
	    expandCapacity();

	arr[n] = x;
	n++;
    }

    public boolean add(T x, int i) {
	boolean res = false;

	if(i >= 0 && i < n) {
	    if(n >= arr.length)
		expandCapacity();

	    n = ArrG.unCorrDer(arr, n, i);
	    arr[i] = x;
	    res = true;
	}

	return res;
    }

    public T remove(int i) {
	T res = null;

	if(i >= 0 && i < n) {
	    res = arr[i];
	    n = ArrG.unCorrIzq(arr, n, i);
	}

	return res;
    }

    public T remove(T x) {
	int i = indexOf(x);
	T res;

	return remove(i);
    }

    public int indexOf(T x) {
	return ArrG.busquedaLin(arr, n, x);
    }

    public T get(int i) {
	T res = null;

	if(i >= 0 && i < n) 
	    res = arr[i];

	return res;
    }

    public boolean contains(T x) {
	return (indexOf(x) >= 0);	
    }

    public int size() {
	return n;
    }

    public boolean isEmpty() {
	return (n == 0);
    }

    public void clear() {
	arr = (T[]) new Object[MAX];
	n = 0;
    }

    public void expandCapacity() {
	T[] tmp = (T[]) new Object[n * 2];
	System.arraycopy(arr, 0, tmp, 0, n);
	arr = tmp;
    }
}
