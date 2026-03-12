import java.util.ArrayList;
import java.util.List;

class Salon {
    private String idSalon;
    private int capacidad;

    public Salon(String id, int cap) {
        this.idSalon = id;
        this.capacidad = cap;
    }

    public String getInfo() {
        return "Salón " + idSalon + " (Capacidad: " + capacidad + " estudiantes)";
    }
}

class Escuela {
    private String nombre;
    private List<Salon> salones;

    public Escuela(String nombre) {
        this.nombre = nombre;
        this.salones = new ArrayList<>();
    }

    // Agregación: Recibe el salón ya creado
    public void agregarSalon(Salon s) {
        this.salones.add(s);
    }

    public void mostrarInstalaciones() {
        System.out.println("Institución: " + nombre);
        for (Salon s : salones) {
            System.out.println(" -> " + s.getInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Los salones existen independientemente
        Salon s101 = new Salon("101-A", 30);
        Salon s202 = new Salon("202-B", 25);

        Escuela miEscuela = new Escuela("Colegio Mayor");
        
        // Se agregan a la escuela
        miEscuela.agregarSalon(s101);
        miEscuela.agregarSalon(s202);

        miEscuela.mostrarInstalaciones();
    }
}
