public class OficinaGobierno {
    private String encargado;
    private double[] poblacion;
    private String[] nomEdo;
    private int numEdo;
    private final int MAX_EDO = 32;

    public OficinaGobierno() {
	numEdo = 0;
	nomEdo = new String[MAX_EDO];
	poblacion = new double[MAX_EDO];
    }

    public OficinaGobierno(String encargado) {
	this();
	this.encargado = encargado;
    }

    public String getEncargado() {
	return encargado;
    }

    // Asumo indice correcto
    public double getPoblacion(int n) {
	return poblacion[n];
    }

    public String getNomEdo(int n) {
	return nomEdo[n];
    }

    public int getnumEdo() {
	return numEdo;
    }
    
    public void setEncargado(String encargado) {
	this.encargado = encargado;
    }

    public boolean altaInfo(String edo, double pob) {
	boolean res = false;

	if (numEdo < MAX_EDO) {
	    nomEdo[numEdo] = edo;
	    poblacion[numEdo] = pob;
	    
	    numEdo++;
	    res = true;
	}

	return res;
    }

    public String nomEdoMax() {
	int n = ManejadorArreglos.posMax(poblacion, numEdo);

	return nomEdo[n];
    }

    public double promedioHab() {
	return ManejadorArreglos.promedio(poblacion, numEdo);
    }

    public int numMenorPromedio() {
	double avg = promedioHab();
	return ManejadorArreglos.countMinN(poblacion, numEdo, avg);
    }

}
