/* Piero Vera
 * 2018-03-03
 * Clase de circulo
 */

public class Circulo {
    private double r;

    public Circulo() {}

    public Circulo(double r) {
	this.r = r;
    }
    
    double getR() {
	return r;
    }

    void setR(double r) {
	this.r = r;
    }

    double area() {
	return Math.PI * r*r;
    }

    double perim() {
	return Math.PI * 2 * r;
    }
}
