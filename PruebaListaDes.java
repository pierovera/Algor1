import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Piero Vera
 * 2018-05-07
 * Prueba de Lista Desordenada
 */

public class PruebaListaDes {
    public static void main(String[] args) {
	ListaArregloDesordenada<String> lst = new ListaArregloDesordenada<String>();
	File fp = new File("strings.txt");
	String tmp = null;
	
	try (Scanner sc = new Scanner(fp)) {
	    while (sc.hasNext()) 
		lst.addLast(sc.next());

	    sc.close();
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	    System.exit(-1);
	}

	System.out.println(lst.toString());

	for(int i = 0; i < lst.size(); i += 5) {
	    tmp = lst.remove(i);
	    System.out.printf("Elemento removido: %s\n", tmp);
	}

	System.out.println(lst.toString());

	if (lst.contains(tmp))
	    System.out.printf("Contiene %s\n", tmp);
	System.out.printf("Donde %s? %d\n", tmp, lst.indexOf(tmp));
	
	tmp = lst.get(5);
	if (lst.contains(tmp))
	    System.out.printf("Contiene %s (elemento %d)\n", tmp,
			      lst.indexOf(tmp));

	try (Scanner sc = new Scanner(fp)) {
	    while (sc.hasNext()) 
		lst.addFirst(sc.next());

	    sc.close();	
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	    System.exit(-1);
	}

	System.out.println("Vacio? " + lst.isEmpty());
	System.out.println(lst.toString());
	lst.clear();
	System.out.println("Vacio? " + lst.isEmpty());
	System.out.println(lst.toString());
    }
}
	
