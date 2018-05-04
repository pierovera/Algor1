import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Piero Vera
 * 2018-05-03
 * Prueba de ListaOrdenada
 */

public class PruebaLista {
    public static void main(String[] args) {
	ListaArregloOrdenado<String> lst = new ListaArregloOrdenado<String>();
	File fp;
	Scanner sc;
	String tmp = null;
	
	try {
	    fp = new File("strings.txt"); //30 Strings
	    sc = new Scanner(fp);

	    while (sc.hasNext()) 
		lst.add(sc.next());

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

	tmp = lst.get(5);
	if (lst.contains(tmp))
	    System.out.printf("Contiene %s (elemento %d)\n", tmp,
			      lst.indexOf(tmp));

	try {
	    fp = new File("strings.txt"); //30 Strings mas (para expandCapacity())
	    sc = new Scanner(fp);

	    while (sc.hasNext()) 
		lst.add(sc.next());

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
	
