public class Inscripcion {
    Alumno alumno;
    Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada() {
        int posicionMateria = this.alumno.materiasAprobadas.indexOf(this.materia);
        return (posicionMateria != -1);
    }
}
