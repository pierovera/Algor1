import java.time.LocalDateTime;

public class Alumno {
    private int claveU;
    private String nombre;
    private String carrera;
    private int semestre;
    private boolean beca;
    private String genero;
    private int anoNac;
    private int numMat;
    private double[] califs;
    private String[] nomMat;
    private final int MAX_MATERIAS = 10;

    public Alumno(int claveU, String nombre, String genero,
		  int anoNac) {
	califs = new double[MAX_MATERIAS];
	nomMat = new String[MAX_MATERIAS];

	this.claveU = claveU;
	this.nombre = nombre;
	this.genero = genero;
	this.anoNac = anoNac;
	semestre = 0;
	beca = false;
	numMat = 0;
    }

    public Alumno(int claveU, String nombre, String carrera,
		  int semestre, boolean beca, String genero,
		  int anoNac) {
	this(claveU, nombre, genero, anoNac);
	this.carrera = carrera;
	this.semestre = semestre;
	this.beca = beca;
    }

    public int getClaveU() {
	return claveU;
    }

    public String getNombre() {
	return nombre;
    }

    public String getCarrera() {
	return carrera;
    }

    public int getSemestre() {
	return semestre;
    }

    public boolean hasBeca() {
	return beca;
    }

    public String getGenero() {
	return genero;
    }

    public int getAnoNac() {
	return anoNac;
    }

    public int getNumMat() {
	return numMat;
    }

    public double getCalif(int i) {
	return califs[i];
    }

    public String getNomMat(int i) {
	return nomMat[i];
    }

    public void setCarrera(String carrera) {
	this.carrera = carrera;
    }

    public void setBeca(boolean beca) {
	this.beca = beca;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	str.append("CU: ").append(claveU)
	    .append("\nNombre: ").append(nombre)
	    .append("\nCarrera: ").append(carrera)
	    .append("\nSemestre: ").append(semestre)
	    .append("\nBeca: ").append(beca)
	    .append("\nGenero: ").append(genero)
	    .append("\nAño nacimiento: ").append(anoNac)
	    .append("\nNumero de materias: ").append(numMat);

	for(int i = 0; i < (numMat); i++) {
	    str.append("\nMateria ").append(i + 1).append(": ")
		.append(nomMat[i]).append(" - ").append(califs[i]);
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
	Alumno a = (Alumno) o;
	return (a.claveU == claveU);
    }
    
    public int compareTo(Alumno a) {
	return claveU - a.claveU;
    }
		    
    public int calculaEdad() {
	LocalDateTime t = LocalDateTime.now();

	return t.getYear() - anoNac;
    }

    public boolean altaCalif(String materia, double calif) {
	boolean res = false;

	if (numMat < MAX_MATERIAS) {
	    califs[numMat] = calif;
	    nomMat[numMat] = materia;
	    numMat++;
	    res = true;
	}

	return res;
    }

    public double promedio() {
	return ManejadorArreglos.promedio(califs, numMat);
    }

    public void nextSemestre() {
	for(int i = 0; i < (numMat); i++) {
	    califs[i] = 0;
	    nomMat[i] = "";
	}

	numMat = 0;
	semestre++;
    }
	
}
