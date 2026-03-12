import java.util.ArrayList;
import java.util.List;

class Ciudad {
    private String nombre;
    private int poblacion;

    public Ciudad(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getInfo() {
        return nombre + " (Población: " + poblacion + ")";
    }
}

class Pais {
    private String nombre;
    private List<Ciudad> ciudades;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    // Agregación: Se añade una ciudad que ya existe
    public void agregarCiudad(Ciudad c) {
        this.ciudades.add(c);
    }

    public void mostrarTerritorio() {
        System.out.println("País: " + nombre);
        for (Ciudad c : ciudades) {
            System.out.println(" -> " + c.getInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Las ciudades existen antes de ser asignadas a un país
        Ciudad c1 = new Ciudad("Bogotá", 8000000);
        Ciudad c2 = new Ciudad("Medellín", 2500000);

        // 2. Se crea el país
        Pais colombia = new Pais("Colombia");

        // 3. Agregación
        colombia.agregarCiudad(c1);
        colombia.agregarCiudad(c2);

        // 4. Corroborar
        colombia.mostrarTerritorio();
    }
}
