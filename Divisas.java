import java.util.Scanner;

/* Piero Vera
 * 2018-03-01
 * Convertidor de MXN a diversas monedas
 */

public class Divisas {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int opt;
	String divisa = new String();
	double in, out = 0;

	printMenu();
	
	opt = scanner.nextInt();

	while(opt != 0) {

	    System.out.printf("Cantidad (MXN) > ");
	    in = scanner.nextDouble();
	    
	    switch (opt) {
	    case 1:
		out = in/18.86;
		divisa = "USD";
		break;
	    case 2:
		out = in/23.14;
		divisa = "EUR";
		break;
	    case 3:
		out = in/25.99;
		divisa = "GBP";
		break;
	    case 4:
		out = in/14.69;
		divisa = "CAD";
		break;
	    case 5:
		out = in*5.62;
		divisa = "JPY";
		break;
	    case 6:
		out = in/14.62;
		divisa = "AUD";
		break;
	    case 7:
		out = in*3.46;
		divisa = "INR";
		break;
	    default:
		System.out.printf("Opcion invalida!\n\n");
		divisa = "Err";
		break;
	    }

	    if(!divisa.equals("Err")) 
		System.out.printf("$%.2f MXN a %s: %.2f\n\n",
				  in, divisa, out);

	    printMenu();

	    opt = scanner.nextInt();
	    
	}
	
    }

    static void printMenu() {
	System.out.printf("Convertidor de MXN a diversas monedas\n" +
			  "1) USD\n" +
			  "2) EUR\n" +
			  "3) GBP\n" +
			  "4) CAD\n" +
			  "5) JPY\n" +
			  "6) AUD\n" +
			  "7) INR\n" +
			  "0) Salir\n\n" +
			  "> ");
    }
	
       
}
