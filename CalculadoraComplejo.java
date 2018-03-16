/* Piero Vera
 * 2018-03-15
 * Clase Calculadora de complejos
 */

public class CalculadoraComplejo {
    public static Complejo suma(Complejo a, Complejo b) {
	Complejo res = new Complejo();

	res.setReal(a.getReal() + b.getReal());
	res.setImag(a.getImag() + b.getImag());

	return res;
    }

    public static Complejo resta(Complejo a, Complejo b) {
	Complejo res = new Complejo();

	res.setReal(a.getReal() - b.getReal());
	res.setImag(a.getImag() - b.getImag());

	return res;
    }

    public static Complejo multiplicacion(Complejo a, Complejo b) {
	Complejo res = new Complejo();
	double real, imag;

	real = a.getReal()*b.getReal() - a.getImag()*b.getImag();
	imag = a.getReal()*b.getImag() + a.getImag()*b.getReal();

	res.setReal(real);
	res.setImag(imag);

	return res;
    }

    public static Complejo division(Complejo a, Complejo b) {
	Complejo res = null;
	double real, imag, div;

	div = Math.pow(b.getReal(), 2) + Math.pow(b.getImag(), 2);
	if (div != 0) {
	    res = new Complejo();
	
	    real = (a.getReal()*b.getReal() + a.getImag()*b.getImag()) / div;
	    imag = (a.getImag()*b.getReal() - a.getReal()*b.getImag()) / div;

	    res.setReal(real);
	    res.setImag(imag);
	}
	
	return res;
    }
}
	
	    
