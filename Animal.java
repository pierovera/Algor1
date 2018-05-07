/* Piero Vera
 * 2018-05-05
 * Clase Animal Comparable
 */

public class Animal implements Comparable<Animal> {
    private String especie;
    private int num;
    private boolean exotico;

    public Animal(String especie, boolean exotico) {
	this.especie = especie;
	this.exotico = exotico;
	num = 1;       
    }

    public Animal(String especie, boolean exotico, int num) {
	this(especie, exotico);
	this.num = num;
    }

    public int compareTo(Animal a) {
	return especie.compareTo(a.especie);
    }

    public boolean equals(Object o) {   
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Animal a = (Animal) o;
        return (a.especie.equals(especie));
    }

    public String toString() {
	StringBuilder str = new StringBuilder();

	return str.append("Especie: ").append(especie)
	    .append("\nNumero: ").append(num)
	    .append("\nExotico: ").append(exotico)
	    .toString();
    }
    
    public String getEspecie() {
	return especie;
    }

    public int getNum() {
	return num;
    }

    public boolean isExotico() {
	return exotico;
    }

    public void setEdad(int edad) {
	this.edad = edad;
    }

    public void add() {
	num++;
    }

    public void remove() {
	num--;
    }
}
