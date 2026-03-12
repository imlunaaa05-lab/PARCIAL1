import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String isbn;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getInfo() {
        return titulo + " (ISBN: " + isbn + ")";
    }
}

class Biblioteca {
    private String nombre;
    private List<Libro> coleccion;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.coleccion = new ArrayList<>();
    }

    // Agregación: Recibe un objeto que ya existe fuera
    public void agregarLibro(Libro l) {
        this.coleccion.add(l);
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de " + nombre + ":");
        for (Libro l : coleccion) {
            System.out.println(" - " + l.getInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Los libros existen antes que la biblioteca
        Libro libro1 = new Libro("Cien años de soledad", "978-3");
        Libro libro2 = new Libro("Don Quijote", "978-8");

        // 2. Se crea la biblioteca
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");

        // 3. Agregación: Se añaden los libros
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);

        // 4. Corroborar
        miBiblioteca.mostrarCatalogo();
    }
}
