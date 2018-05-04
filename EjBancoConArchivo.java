import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Piero Vera
 * 2018-04-31
 * Ejecutable con archivos de texto
 */

public class EjBancoConArchivo {
    public static void main(String args[]) {
	final int MAX_CUENTAS = 100;
	Cuenta[] c = new Cuenta[MAX_CUENTAS];
	int n = 0;
	int numCuenta;
	double saldo;
	String titular;
	File fp;
	Scanner sc;
	
	try {
	    fp = new File("cuentas.txt");
	    sc = new Scanner(fp);

	    while (n < MAX_CUENTAS && sc.hasNext()) {
		numCuenta = sc.nextInt();
		saldo = sc.nextDouble();
		titular = sc.next();

		c[n] = new Cuenta(numCuenta, saldo, titular);
		n++;
	    }
	
	    for(int i = 0; i < n; i++) 
		System.out.println(c[i].toString());

	    sc.close();	
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	    System.exit(-1);
	}

	
    }
}
