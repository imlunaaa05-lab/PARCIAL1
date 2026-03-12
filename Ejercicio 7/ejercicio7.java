import java.util.ArrayList;
import java.util.List;

class CursoVirtual {
    private String titulo;
    public CursoVirtual(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
}

class Estudiante {
    private String nombre;
    private List<CursoVirtual> matriculados;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.matriculados = new ArrayList<>();
    }

    public void matricular(CursoVirtual c) {
        this.matriculados.add(c);
    }

    public void abandonar(CursoVirtual c) {
        this.matriculados.remove(c);
        System.out.println(nombre + " ha abandonado el curso: " + c.getTitulo());
    }

    public String getNombre() { return nombre; }
    public List<CursoVirtual> getMatriculados() { return matriculados; }
}

public class Main {
    public static void main(String[] args) {
        // Objetos creados independientemente
        CursoVirtual c1 = new CursoVirtual("Inteligencia Artificial");
        CursoVirtual c2 = new CursoVirtual("Diseño de Software");
        Estudiante est = new Estudiante("Andres");

        // Acción de matricular
        est.matricular(c1);
        est.matricular(c2);

        // Simular abandono (Demuestra Asociación)
        est.abandonar(c1);

        // Verificación
        System.out.println("Cursos activos para " + est.getNombre() + ":");
        for (CursoVirtual c : est.getMatriculados()) {
            System.out.println(" - " + c.getTitulo());
        }
    }
}
