public class Escuela {
    private String nombre;
    private String direccion;
    private Alumno[] alumnos;
    private int numAlumnos;
    private final int MAX_ALUMNOS = 100;

    public Escuela(String nombre, String direccion) {
	this.nombre = nombre;
	this.direccion = direccion;

	alumnos = new Alumno[MAX_ALUMNOS];
	numAlumnos = 0;
    }

    public String getNombre() {
	return nombre;
    }

    public String getDireccion() {
	return direccion;
    }

    public int getNumAlumnos() {
	return numAlumnos;
    }

    public String getAlumno(int i) {
	String res = null;

	if(i < MAX_ALUMNOS) 
	    res = alumnos[i].toString();

	return res;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	str.append("Nombre: ").append(nombre)
	    .append("\nDireccion: ").append(direccion)
	    .append("\nNum Alumnos: ").append(numAlumnos)
	    .append("\n\n");

	for(int i = 0; i < (numAlumnos); i++) 
	    str.append(alumnos[i].toString()).append("\n");

	return str.toString();
    }
    
    public boolean equals(Object o) {	
	if (this == o)
	    return true;
	if (o == null)
	    return false;
	if (getClass() != o.getClass())
	    return false;
	Escuela es = (Escuela) o;
	return (nombre.equals(es.nombre));
    }

    public int compareTo(Escuela e) {
	return nombre.compareTo(e.nombre);
    }
    
    public boolean altaAlumno(int claveU, String nombre, String genero,
			   int anoNac) {
	boolean res = false;

	if(numAlumnos < MAX_ALUMNOS) {
	    alumnos[numAlumnos] = new Alumno(claveU, nombre, genero, anoNac);
	    numAlumnos++;
	    res = true;
	}

	return res;
    }

    public boolean altaAlumno(int claveU, String nombre, String carrera,
			   int semestre, boolean beca, String genero,
			   int anoNac) {
	boolean res = false;

	if(numAlumnos < MAX_ALUMNOS) {
	    alumnos[numAlumnos] = new Alumno(claveU, nombre, carrera, semestre,
					    beca, genero, anoNac);
	    numAlumnos++;
	    res = true;
	}

	return res;
    }

    public void altaCalifAlum(String materia, double calif, int i) {
	alumnos[i].altaCalif(materia, calif);
    }

    public double promedioEdad() {
	double sum = 0;

	for(int i = 0; i < (numAlumnos); i++) 
	    sum += alumnos[i].calculaEdad();

	return sum/numAlumnos;
    }

    public String alumnoMasJoven() {
	int ed = 9999;
	int tmp;
	int res = 0;
	
	for(int i = 0; i < (numAlumnos); i++) {
	    tmp = alumnos[i].calculaEdad();

	    if(tmp < ed) {
		res = i;
		ed = tmp;
	    }
	}

	return alumnos[res].getNombre();
    }

    public String alumnoMasViejo() {
	int ed = -1;
	int tmp;
	int res = 0;
	
	for(int i = 0; i < (numAlumnos); i++) {
	    tmp = alumnos[i].calculaEdad();

	    if(tmp > ed) {
		res = i;
		ed = tmp;
	    }
	}

	return alumnos[res].getNombre();
    }

    public double promedioGral() {
	double sum = 0;

	for(int i = 0; i < (numAlumnos); i++) 
	    sum += alumnos[i].promedio();

	return sum/numAlumnos;
    }

    public int cuantosGen(String genero) {
	int res = 0;
	
	for(int i = 0; i < (numAlumnos); i++) {
	    if(genero.equals( alumnos[i].getGenero() ))
		res++;
	}

	return res;
    }

    public int cuantosCarr(String carrera) {
	int res = 0;
	
	for(int i = 0; i < (numAlumnos); i++) {
	    if(carrera.equals( alumnos[i].getCarrera() ))
		res++;
	}

	return res;
    }

    public int buscarClave(int claveU) {
	int i = 0;

	while (i < MAX_ALUMNOS && (alumnos[i].getClaveU() != claveU)) {
	    i++;
	}

	if(alumnos[i].getClaveU() != claveU)
	    i = -1;

	return i;
    }

    public int buscarNombre(String nombre) {
	int i = 0;
	
	while (i < MAX_ALUMNOS && !nombre.equals( alumnos[i].getNombre() )) {
	    i++;
	}

	if(!nombre.equals( alumnos[i].getNombre() ))
	    i = -1;

	return i;
    }
}
