import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public String getNombre() { return nombre; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
}

class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
}

public class Main {
    public static void main(String[] args) {
        // Crear objetos independientes
        Curso curso1 = new Curso("Programación Orientada a Objetos");
        Estudiante est1 = new Estudiante("Juan Perez");
        Estudiante est2 = new Estudiante("Maria Lopez");

        // Crear la relación (Asociación)
        curso1.inscribirEstudiante(est1);
        curso1.inscribirEstudiante(est2);

        // Corroborar funcionamiento
        System.out.println("Curso: " + curso1.getNombre());
        for (Estudiante e : curso1.getEstudiantes()) {
            System.out.println(" - Estudiante inscrito: " + e.getNombre());
        }
    }
