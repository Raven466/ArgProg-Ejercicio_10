import java.util.ArrayList;
import java.util.List;

public class Alumno {
    String nombre;
    String legajo;
    List<Materia> materiasAprobadas;
    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        materiasAprobadas = new ArrayList<>();
    }
}
