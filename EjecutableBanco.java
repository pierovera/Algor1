import java.util.*;

/* Piero Vera
 * 2018-03-08
 * Ejecutable programa de banco
 */

public class EjecutableBanco {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = 0;
	double saldo = 0;
	String titular;
	boolean done = false;
	
	System.out.printf("Bienvenido al banco. Creando cuenta 1...\n");

	while (!done) {
	    System.out.printf("Numero de cuenta: ");
	    try {
		num = scan.nextInt();
		done = true;
	    }
	    catch(InputMismatchException e) {
		System.out.printf("Error\n");
		scan.nextLine();
	    }
	}

	done = false;
	while (!done) {
	    System.out.printf("Saldo inicial: $");
	    try {
		saldo = scan.nextDouble();
		done = true;
	    }
	    catch(InputMismatchException e) {
		System.out.printf("Error\n");
		scan.nextLine();
	    }
	}
	
	System.out.printf("Nombre del titular: ");
	scan.nextLine();
	titular = scan.nextLine();

	Cuenta c1 = new Cuenta(num, saldo, titular);

	System.out.printf("Cuenta creada.\n\n%s\n\n", c1.toString() );

	done = false;
	while (!done) {
	    System.out.printf("Retirar de la cuenta:\n" +
			      "Cantidad: $");
	    try {
		if (!c1.retira( scan.nextDouble() ))
		    System.out.printf("Error: No se realizo el retiro\n");
		done = true;
	    }
	    catch(InputMismatchException e) {
		System.out.printf("Error\n");
		scan.nextLine();
	    }
	}
       	
	System.out.printf("Creando cuenta 2...\n");
	
	Cuenta c2 = new Cuenta();

	System.out.printf("Cuenta creada.\n");

	done = false;
	while (!done) {
	    System.out.printf("Numero de cuenta: ");
	    try {
		c2.setNumCuenta( scan.nextInt() );
		done = true;
	    }
	    catch(InputMismatchException e) {
		System.out.printf("Error\n");
		scan.nextLine();
	    }
	}


	System.out.printf("Nombre del titular: ");
	scan.nextLine();
	c2.setTitular( scan.nextLine() );

	System.out.printf("Datos de la cuenta:\n\n%s\n\n", c2.toString() );

	done = false;
	while (!done) {
	    System.out.printf("Depositar a la cuenta\n" +
			      "Cantidad: $");
	    try {
	    	if(!c2.deposita( scan.nextDouble() ))
		    System.out.printf("Error: No se realizo el deposito\n");
		done = true;
	    }
	    catch(InputMismatchException e) {
		System.out.printf("Error\n");
		scan.nextLine();
	    }
	}

	System.out.printf("%s \n\n%s\n", c1.toString(), c2.toString());
    }
}
	
	
			  

	
