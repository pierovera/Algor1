/* Piero Vera
 * 2018-03-13
 * Clase de auto
 */   

public class Auto {
    private int claveU;
    private static int seedCU = 100;
    private String marca;
    private int year;
    private int nKm;
    private String nombreCliente;
    private int numLicCliente;
    private boolean enRenta;

    public Auto(String marca, int year, int nKm) {
	enRenta = false;
	this.marca = marca;
	this.year = year;
	this.nKm = nKm;
	claveU = seedCU;
	seedCU++;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	str.append("Clave Unica: ").append(claveU)
	    .append("\nMarca: ").append(marca)
	    .append("\nYear: ").append(year)
	    .append("\nNumero Kilometros: ").append(nKm)
	    .append("\nRentado: ").append(enRenta);

	if(enRenta) {
	    str.append("\nNombre Cliente: ").append(nombreCliente)
		.append("\nNumero de Licencia: ").append(numLicCliente);
	}

	return str.toString();
    }

    public boolean equals(Auto a) {
	boolean b;
	if (claveU == a.claveU)
	    b = true;
	b = false;

	return b;
    }

    public int compareTo(Auto a) {
	return claveU - a.claveU;
    }
	    
    public int getClaveU() {
	return claveU;
    }

    public String getMarca() {
	return marca;
    }

    public int getYear() {
	return year;
    }

    public int getnKm() {
	return nKm;
    }

    public boolean isRentado() {
	return enRenta;
    }

    public double rentar(String nombreCliente, int numLicCliente,
			  int dias) {
	double cobro;
	
	if (!enRenta) {
	    this.nombreCliente = nombreCliente;
	    this.numLicCliente = numLicCliente;
	    enRenta = true;
	    
	    if (year > 2005) 
		cobro = 300*dias;
	    else
		cobro = 200*dias;

	    if(nKm < 20000)
		cobro += 20*dias;
	}
	else
	    cobro = -1;

	return cobro;
    }

    public void devolver(int nKm) {
	if (enRenta) {
	    nombreCliente = "";
	    numLicCliente = 0;
	    this.nKm += nKm;
	    enRenta = false;
	}
    }
    
}
