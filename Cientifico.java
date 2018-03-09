/* Piero Vera
 * 2018-03-01
 * Clase de cientifico como en Alice
 */

public class Cientifico {
    private String nombre;
    private String especialidad;
    private int edad;

    public Cientifico() {}

    public Cientifico(String nombre, String especialidad, int edad) {
	this.nombre = nombre;
	this.especialidad = especialidad;
	this.edad = edad;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	return str.append("Nombre: ").append(nombre)
	    .append(", Especialidad: ").append(especialidad)
	    .append(", Edad: ").append(edad)
	    .toString();
    }

    public boolean equals(Cientifico cmp) {
	if(edad == cmp.getEdad())
	    return true;
	return false;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }

    public String getNombre() {
	return nombre;
    }

    public String getEspecialidad() {
	return especialidad;
    }

    public int getEdad() {
	return edad;
    }

    public double convCaF(double tempC) {
	double tempF = tempC*1.8 + 32;
	return tempF;
    }

    public double convFaC(double tempF) {
	double tempC = (tempF - 32) * 0.56;
	return tempC;
    }

    public int calcFact(int n) {
	int i, res = 1;
	
	for (i = n; i > 1; i--)
	    res = res * i;
	
	return res;
    }

    public boolean estaOrdenCreciente(int a, int b) {
	if (a > b)
	    return false;
	return true;
    }

    public String ordenaCreciente(int a, int b) {
	StringBuilder str = new StringBuilder();
	
	if (a > b)
	    str.append(b).append("-").append(a);
	else
	    str.append(a).append("-").append(b);

	return str.toString();
    }

    public boolean esImpar(int n) {
	if(n % 2 == 0)
	    return false;
	return true;
    }

    public double calculaFuncion1(double x) {
	double y;
	
	if (x <= 11)
	    y = 3*x + 36;
	else if (x <= 33)
	    y = x*x - 10;
	else if (x <= 64)
	    y = x + 6;
	else
	    y = 0;

	return y;
    }

    public double calculaFuncion2(int x) {
	double y = 0;

	switch (x % 4) {
	case 0:
	    y = x * x;
	    break;
	case 1:
	    y = x / 6;
	    break;
	case 2:
	    y = Math.sqrt(x);
	    break;
	case 3:
	    y = Math.pow(x, 3) + 5;
	    break;
	}
	
	return y;
    }

    public double calculaFuncion3(int n, int v) {
	double y;

	switch(n) {
	case 1:
	    y = 100 * v;
	    break;
	case 2:
	    y = Math.pow(100, v);
	    break;
	case 3:
	    y = 100/v;
	    break;
	default:
	    y = 0;
	    break;
	}

	return y;
    }

    public static int multiplica(int x, int y) {
	int i, res = 0;

	for(i = 0; i < y; i++) 
	    res += x;

	return res;
    }

    public static double potencia(int x, int n) {
	int i, res = 1;
	boolean neg = false;

	if(n < 0) {
	    n = -n;
	    neg = true;
	}

	for(i = 0; i < n; i++)
	    res = Cientifico.multiplica(res, x);

	if(neg)
	    res = 1/res;

	return res;
    }

    public static String calculaUllman(int n) {
	StringBuilder str = new StringBuilder();

	str.append(n).append(" ");

	while(n != 1) {
	    if(n % 2 == 0)
		n = n/2;
	    else
		n = 3*n + 1;

	    str.append(n).append(" ");
	}

	return str.toString();
    }
}
	    
		      
	
	
    
