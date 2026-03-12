import java.util.ArrayList;
import java.util.List;

class Material {
    private String titulo;
    public Material(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
}

class CursoAcademico {
    private String nombre;
    private List<Material> materiales;

    public CursoAcademico(String nombre) {
        this.nombre = nombre;
        this.materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material m) {
        this.materiales.add(m);
    }

    public void mostrarCurso() {
        System.out.println("Curso: " + nombre);
        for (Material m : materiales) {
            System.out.println(" - Material: " + m.getTitulo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Material v1 = new Material("Video: Introducción a UML");
        Material d1 = new Material("PDF: Guía de Agregación");

        CursoAcademico curso = new CursoAcademico("Diseño de Software");
        curso.agregarMaterial(v1);
        curso.agregarMaterial(d1);

        curso.mostrarCurso();
    }
}
