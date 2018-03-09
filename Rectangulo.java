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
    
    double getB() {
	return b;
    }

    double getH() {
	return h;
    }

    void setB(double b) {
	this.b = b;
    }

    void setH(double h) {
	this.h = h;
    }

    double area() {
	return b*h;
    }

    double perim(){
	return 2 * (h+b);
    }

}
