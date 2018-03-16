/* Piero Vera
 * 2018-03-15
 * Clase Complejo
 */

public class Complejo {
    private double real;
    private double imag;

    public Complejo() {}
    
    public Complejo(double real, double imag) {
	this.real = real;
	this.imag = imag;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	return str.append("Parte real: ").append(real)
	    .append("\nParte imaginaria: ").append(imag)
	    .toString();
    }

    public boolean equals(Complejo c) {
	boolean res = false;

	if(c.magnitud() == this.magnitud()) 
	    res = true;

	return res;
    }

    public int compareTo(Complejo c) {
	int res;
	double diff;
	
	diff = this.magnitud() - c.magnitud();

	if (diff > 0)
	    res = (int)Math.ceil(diff);
	else
	    res = (int)Math.floor(diff);

	return res;
    }

    public double getReal() {
	return real;
    }

    public double getImag() {
	return imag;
    }

    public void setReal(double real) {
	this.real = real;
    }

    public void setImag(double imag) {
	this.imag = imag;
    }
    
    public double magnitud() {
	return Math.sqrt( Math.pow(real,2) * Math.pow(imag,2) );
    }
}

    
    
			  
