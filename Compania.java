/* Piero Vera
 * 2018-04-12
 * Clase de Compania
 */

public class Compania {
    private String nombre;
    private String direccion;
    private String ciudad;
    private String director;
    private double[] ventas;
    private int totalVentas;
    private final String[] meses = {"Enero", "Febrero", "Marzo", "Abril",
				    "Mayo", "Junio", "Julio", "Agosto",
				    "Septiembre", "Octubre", "Noviembre",
				    "Diciembre"};

    public Compania() {
	totalVentas = 0;
	ventas = new double[12];
    }

    public Compania(String nombre, String direccion, String ciudad,
		    String director) {
	this();
	this.nombre = nombre;
	this.direccion = direccion;
	this.ciudad = ciudad;
	this.director = director;
    }

    public String getNombre() {
	return nombre;
    }

    public String getDireccion() {
	return direccion;
    }

    public String getCiudad() {
	return ciudad;
    }

    public String getDirector() {
	return director;
    }

    public int getTotalVentas() {
	return totalVentas;
    }

    public double getVenta(int n) {
	return ventas[n];
    }

    public String getMes(int n) {
	return meses[n];
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
    }

    public void setDirector(String director) {
	this.director = director;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	str.append("Nombre: ").append(nombre)
	    .append("\nDireccion: ").append(direccion)
	    .append("\nCiudad: ").append(ciudad)
	    .append("\nDirector: ").append(director)
	    .append("\nTotal de ventas: ").append(totalVentas)
	    .append("\n");

	for(int i = 0; i < totalVentas; i++) {
	    str.append("\nVenta de ").append(meses[i])
		.append(" - ").append(ventas[i]);
	}

	return str.toString();
    }

    public boolean equals(Compania c) {
	return nombre.equals(c.nombre);
    }

    public int compareTo(Compania c) {
	return nombre.compareTo(c.nombre);
    }

    public boolean leerVenta(double venta) {
	boolean res = false;

	if(totalVentas < 12) {
	    ventas[totalVentas] = venta;
	    totalVentas++;
	    res = true;
	}

	return res;
    }

    public double promedio() {
	return ManejadorArreglos.promedio(ventas, totalVentas);
    }

    public int mesMayor() {
	return ManejadorArreglos.posMax(ventas, totalVentas);
    }

    public int mesMenor() {
	return ManejadorArreglos.posMin(ventas, totalVentas);
    }

    public int arribaPromedio() {
	return ManejadorArreglos.countMaxN(ventas, totalVentas, promedio() );
    }

    public double totalUnidades() {
	return ManejadorArreglos.suma(ventas, totalVentas);
    }

}
	    
	
    
