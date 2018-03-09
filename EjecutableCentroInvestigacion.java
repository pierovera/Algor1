public class EjecutableCentroInvestigacion {
    public static void main(String[] args) {
	Cientifico c = new Cientifico("Juan", "Matematico", 43);

	String toString = c.toString();
	System.out.printf("%s\n", toString);

	int a = 2, b = 4;
	boolean ordenCreciente = c.estaOrdenCreciente(a, b);
	System.out.printf("%d, %d creciente? %b\n", a, b, ordenCreciente);

	b = 1;
	ordenCreciente = c.estaOrdenCreciente(a, b);
	System.out.printf("%d, %d creciente? %b\n", a, b, ordenCreciente);

	String ordena = c.ordenaCreciente(a, b);
	System.out.printf("%d, %d ordenados => %s\n", a, b, ordena);

	boolean impar;
	impar = c.esImpar(a);
	System.out.printf("%d impar? %b\n", a, impar);

	impar = c.esImpar(b);
	System.out.printf("%d impar? %b\n", b, impar);

	double func, x = 5;
	func = c.calculaFuncion1(x);
	System.out.printf("f1(%.0f) = %.0f\n", x, func);

	x = 40;
	func = c.calculaFuncion1(x);
	System.out.printf("f1(%.0f) = %.0f\n", x, func);

	x = 30;

	func = c.calculaFuncion1(x);
	System.out.printf("f1(%.0f) = %.0f\n", x, func);

	x = 100;
	func = c.calculaFuncion1(x);
	System.out.printf("f1(%.0f) = %.0f\n", x, func);

	func = c.calculaFuncion2((int)x);
	System.out.printf("f2(%.0f) = %f\n", x, func);

	x = 17;
	func = c.calculaFuncion2((int)x);
	System.out.printf("f2(%.0f) = %f\n", x, func);

	x = 26;
	func = c.calculaFuncion2((int)x);
	System.out.printf("f2(%.0f) = %f\n", x, func);

	x = 43;
	func = c.calculaFuncion2((int)x);
	System.out.printf("f2(%.0f) = %f\n", x, func);

	int n = 1;

	func = c.calculaFuncion3(n, (int)x);
	System.out.printf("f3(%d, %.0f) = %.0f\n", n, x, func);

	n = 2;
	func = c.calculaFuncion3(n, (int)x);
	System.out.printf("f3(%d, %.0f) = %.0f\n", n, x, func);

	n = 3;
	func = c.calculaFuncion3(n, (int)x);
	System.out.printf("f3(%d, %.0f) = %.0f\n", n, x, func);

	n = 4;
	func = c.calculaFuncion3(n, (int)x);
	System.out.printf("f3(%d, %.0f) = %.0f\n", n, x, func);
    }
}
