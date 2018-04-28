public class EjAlumno {
    public static void main(String[] args) {
	Alumno a = new Alumno(321332, "Juan", "Compu", 2, true,
			      "Hombre", 1995);

	System.out.println(a.toString());
	System.out.printf("Edad: %d\n", a.calculaEdad());

	a.altaCalif("Geo", 8);
	a.altaCalif("Mat", 9);
	a.altaCalif("Alg", 8.5);
	a.altaCalif("Cal", 8.2);

	System.out.printf("Promedio: %f\n", a.promedio());
	System.out.println(a.toString());

	a.nextSemestre();
	System.out.println(a.toString());
    }
}
