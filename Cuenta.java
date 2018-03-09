/* Piero Vera
 * 2018-03-08
 * Clase de cuenta de banco
 */

public class Cuenta {
    private int numCuenta;
    private double saldo;
    private String titular;

    public Cuenta() {}

    public Cuenta(int n, double s, String t) {
	numCuenta = n;
	saldo = s;
	titular = t;
    }

    public int getNumCuenta() {
	return numCuenta;
    }

    public double getSaldo() {
	return saldo;
    }

    public String getTitular() {
	return titular;
    }

    public void setNumCuenta(int num) {
	numCuenta = num;
    }

    public void setTitular(String nom) {
	titular = nom;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	return str.append("Numero de cuenta: ").append(numCuenta)
	    .append("\nSaldo: $").append(String.format("%.2f", saldo))
	    .append("\nTitular: ").append(titular)
	    .toString();
    }

    public boolean equals(Cuenta c) {
	if(numCuenta == c.getNumCuenta())
	    return true;
	return false;
    }

    public int compareTo(Cuenta c) {
	return numCuenta - c.getNumCuenta();
    }

    public boolean deposita(double cant) {
	boolean s = false;

	if(cant > 0) {
	    saldo += cant;
	    s = true;
	}

	return s;
    }

    public boolean retira(double cant) {
	boolean s = false;
	
	if (cant <= saldo && cant > 0) {
	    saldo -= cant;
	    s = true;
	}

	return s;
    }

}
    
