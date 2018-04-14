/* Piero Vera
 * 2018-03-03
 * Clase de rectangulo
 */

public class Rectangulo {
    private double b, h;

    public Rectangulo() {}

    public Rectangulo(double b, double h) {
	this.b = b;
	this.h = h;
    }
    
    public double getB() {
	return b;
    }

    public double getH() {
	return h;
    }

    public void setB(double b) {
	this.b = b;
    }

    public void setH(double h) {
	this.h = h;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	return str.append("Base: ").append(b)
	    .append("\nAltura: ").append(h)
	    .toString();
    }
    
    public double area() {
	return b*h;
    }

    public double perim(){
	return 2 * (h+b);
    }

}
