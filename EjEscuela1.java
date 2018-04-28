Public class EjEscuela1 {
    public static void main(String[] args) {
	Escuela e = new Escuela("ITAM", "RH algo");

	System.out.println(e.toString());

	e.altaAlumno(321332, "Juan1", "Compu", 2, true,
		     "Hombre", 1990);
	e.altaAlumno(321332, "Juan2", "Mat", 5, true,
		     "Hombre", 1995);
	e.altaAlumno(321332, "Juan3", "Der", 1, false,
		     "Hombre", 1997);
	e.altaAlumno(321332, "Juan4", "Eco", 8, false,
		     "Hombre", 1945);
	
	System.out.println(e.toString());

	e.altaCalifAlum("Geo", 8, 0);
	e.altaCalifAlum("Geo", 6, 1);
	e.altaCalifAlum("Mat", 9, 1);
	e.altaCalifAlum("Der", 6, 2);
	e.altaCalifAlum("His", 9, 3);
	e.altaCalifAlum("Red", 7, 3);

	System.out.println(e.toString());
    }
}
