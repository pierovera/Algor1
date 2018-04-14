import java.util.Objects;

/* Piero Vera
 * 2018-04-14
 * Clase de Escuela de Natacion
 */

public class EscuelaNatacion {
    private String nombre;
    private String domicilio;
    private int totAlbercas;
    private final int MAX_ALBERCAS = 10;
    private Rectangulo[] albercas;

    public EscuelaNatacion() {
	albercas = new Rectangulo[MAX_ALBERCAS];
	totAlbercas = 0;
    }

    public EscuelaNatacion(String nombre, String domicilio) {
	this();
	this.nombre = nombre;
	this.domicilio = domicilio;
    }

    public String getNombre() {
	return nombre;
    }

    public String getDomicilio() {
	return domicilio;
    }

    public int getTotAlbercas() {
	return totAlbercas;
    }

    public Rectangulo getAlberca(int i) {
	Rectangulo res = null;
	
	if(i < totAlbercas)
	    res = albercas[i];

	return res;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	str.append("Nombre: ").append(nombre)
	    .append("\nDomicilio: ").append(domicilio)
	    .append("\nTotal de albercas: ").append(totAlbercas);

	for(int i = 0; i < (totAlbercas); i++) {
	    str.append("\nAlberca ").append(i + 1)
		.append(":\n").append(albercas[i].toString());
	}

	return str.toString();
    }

    public boolean equals(Object o) {	
	if (this == o)
	    return true;
	if (o == null)
	    return false;
	if (getClass() != o.getClass())
	    return false;
	EscuelaNatacion escuela = (EscuelaNatacion) o;
	return Objects.equals(nombre, escuela.nombre);
    }

    public int compareTo(EscuelaNatacion e) {
	return nombre.compareTo(e.nombre);
    }
    
    public boolean altaAlberca(double w, double h) {
	boolean res = false;

	if(totAlbercas < 12) {
	    albercas[totAlbercas] = new Rectangulo(w, h);
	    totAlbercas++;
	    res = true;
	}

	return res;
    }

    public double areaTotalAlb() {
	double sum = 0;
	
	for(int i = 0; i < (totAlbercas); i++) 
	    sum += albercas[i].area();

	return sum;
    }
}
    
