import java.util.ArrayList;
import java.util.List;

class Asignatura {
    private String nombre;
    private List<Profesor> profesores;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
    }

    public String getNombre() { return nombre; }
    public List<Profesor> getProfesores() { return profesores; }
}

class Profesor {
    private String nombre;
    private List<Asignatura> asignaturas;

    public Profesor(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
    }

    public void asignarAsignatura(Asignatura a) {
        this.asignaturas.add(a);
    }

    public String getNombre() { return nombre; }
}

public class Main {
    public static void main(String[] args) {
     
        Profesor prof1 = new Profesor("Javier Ochoa");
        Profesor prof2 = new Profesor("Ana Milena");

        Asignatura asig1 = new Asignatura("Diseño de Software");
        Asignatura asig2 = new Asignatura("Programación III");

       
        prof1.asignarAsignatura(asig1);
        asig1.agregarProfesor(prof1);

        prof1.asignarAsignatura(asig2);
        asig2.agregarProfesor(prof1);

        prof2.asignarAsignatura(asig1);
        asig1.agregarProfesor(prof2);

      
        System.out.println("Asignatura: " + asig1.getNombre());
        for (Profesor p : asig1.getProfesores()) {
            System.out.println(" -> Dictada por: " + p.getNombre());
        }
    }
}
