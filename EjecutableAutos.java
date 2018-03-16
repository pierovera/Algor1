import java.util.Scanner;

/* Piero Vera
 * 2018-03-13
 * Ejecutable clase auto
 */

public class EjecutableAutos {
    public static void main(String[] args) {
	Auto a1, a2, a3, a4, a5, auto;
	double cobro1, cobro2;
	String c1, c2;
	int n1, n2, d1, d2, sel, nKm;
	Scanner sc = new Scanner(System.in);

	a1 = new Auto("Subaru", 2012, 281932);
	a2 = new Auto("Ford", 2001, 562365);
	a3 = new Auto("Chevrolet", 2015, 15456);
	a4 = new Auto("Gatoperro", 2018, 1);
	a5 = new Auto("Chrysler", 2006, 451254);

	System.out.printf("Nombre: ");
	c1 = sc.nextLine();

	System.out.printf("Numero de licencia: ");
	n1 = sc.nextInt();

	System.out.printf("Numero de dias de renta: ");
	d1 = sc.nextInt();

	autos(a1, a2, a3, a4, a5);

	System.out.printf("Elegir auto : ");
	sel = sc.nextInt();

	auto = cobro(sel, a1, a2, a3, a4, a5);
	if(!auto.isRentado()) {
	    cobro1 = auto.rentar(c1, n1, d1);
	    System.out.printf("Cliente: %s - Numero de licencia %d\n" +
			      "Cobro del auto %d por %d dias: $%.2f\n\n",
			      c1, n1, auto.getClaveU(), d1, cobro1);
	}
	else
	    System.out.printf("No se pudo realizar la renta\n\n");

	sc.nextLine();
	
	System.out.printf("Nombre: ");
	c2 = sc.nextLine();

	System.out.printf("Numero de licencia: ");
	n2 = sc.nextInt();

	System.out.printf("Numero de dias de renta: ");
	d2 = sc.nextInt();

	autos(a1, a2, a3, a4, a5);

	System.out.printf("Elegir auto : ");
	sel = sc.nextInt();

	auto = cobro(sel, a1, a2, a3, a4, a5);
	if(!auto.isRentado()) {
	    cobro2 = auto.rentar(c2, n2, d2);
	    System.out.printf("Cliente: %s - Numero de licencia %d\n" +
			      "Cobro del auto %d por %d dias: $%.2f\n\n",
			      c2, n2, auto.getClaveU(), d2, cobro2);
	}
	else
	    System.out.printf("No se pudo realizar la renta\n\n");

	System.out.printf("Devolver auto: (clave unica) ");
	sel = sc.nextInt();
	System.out.printf("KM adicionales: ");
	nKm = sc.nextInt();
	auto = devolucion(sel, a1, a2, a3, a4, a5);
	if(auto.isRentado())
	    auto.devolver(nKm);
	else
	    System.out.printf("No se realizo la devolucion\n");
    }
    private static void autos(Auto a1, Auto a2, Auto a3, Auto a4, Auto a5) {
	String div = "---------------\n";
	System.out.printf("\nAutos:\n1) %s\n%s2) %s\n%s3) %s\n%s4) %s\n%s5) %s\n\n", a1.toString(),
			  div, a2.toString(), div, a3.toString(), div, a4.toString(),
			  div, a5.toString());
    }
    private static Auto cobro(int sel, Auto a1, Auto a2, Auto a3, Auto a4, Auto a5) {
	Auto auto;
	
	switch (sel) {
	case 1:
	    auto = a1;
	    break;
	case 2:
	    auto = a2;
	    break;
	case 3:
	    auto = a3;
	    break;
	case 4:
	    auto = a4;
	    break;
	case 5:
	    auto = a5;
	    break;
	default:
	    auto = null;
	    break;
	}
	return auto;
    }
    private static Auto devolucion(int sel, Auto a1, Auto a2, Auto a3, Auto a4, Auto a5) {
	Auto auto;
	
	switch (sel) {
	case 100:
	    auto = a1;
	    break;
	case 101:
	    auto = a2;
	    break;
	case 102:
	    auto = a3;
	    break;
	case 103:
	    auto = a4;
	    break;
	case 104:
	    auto = a5;
	    break;
	default:
	    auto = null;
	    break;
	}
	return auto;
    }
}
