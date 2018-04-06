import java.util.Scanner;

/* Piero Vera
 * 2018-03-15
 * Ejecutable calculadora complejos
 */

public class EjecutableCalculadoraComplejo {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String in = "";
	char op;
	Complejo c1 = new Complejo(),
	    c2 = new Complejo(),
	    c3;
	
	menu();
	in = sc.nextLine();
	if(in.length() < 1)
	    in = " ";
	
	op = in.charAt(0);
	while (op != 's') {
	    c3 = null;
		
	    switch(op) {
	    case '+':
		read(c1, c2, sc);
		c3 = CalculadoraComplejo.suma(c1, c2);
		break;
	    case '-':
		read(c1, c2, sc);
		c3 = CalculadoraComplejo.resta(c1, c2);
		break;
	    case '*':
		read(c1, c2, sc);
		c3 = CalculadoraComplejo.multiplicacion(c1, c2);
		break;
	    case '/':
		read(c1, c2, sc);
		c3 = CalculadoraComplejo.division(c1, c2);
		break;
	    default:
		break;
	    }

	    if(c3 != null) 
		System.out.printf("\nResultado:\n%s\n\n", c3.toString());
	    else
		System.out.printf("ERROR\n\n");

	    menu();
	    in = sc.nextLine();
	    if(in.length() < 1)
		in = " ";
		
	    op = in.charAt(0);
	}
			
    }
    private static void menu() {
	System.out.printf("Calculadora de complejos:\n" +
			  "+ Suma\n- Resta\n* Multiplicacion\n" +
			  "/ Division\ns Salir\n\n> ");
    }
    private static void read(Complejo c1, Complejo c2, Scanner sc) {
	double buff;

	System.out.printf("Complejo 1:\nParte Real: ");
	buff = sc.nextDouble();
	c1.setReal(buff);
	 
	System.out.printf("Parte Imaginaria: ");
	buff = sc.nextDouble();
	c1.setImag(buff);
	 
	System.out.printf("Complejo 2:\nParte Real: ");
	buff = sc.nextDouble();
	c2.setReal(buff);
	 
	System.out.printf("Parte Imaginaria: ");
	buff = sc.nextDouble();
	c2.setImag(buff);

	sc.nextLine();
    }
}
