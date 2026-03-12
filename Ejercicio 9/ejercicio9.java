import java.util.ArrayList;
import java.util.List;

class Facultad {
    private String nombre;

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
}

class Universidad {
    private String nombreUni;
    private List<Facultad> facultades;

    public Universidad(String nombre) {
        this.nombreUni = nombre;
        this.facultades = new ArrayList<>();
    }

    // Agregación: La facultad se crea fuera y se añade aquí
    public void agregarFacultad(Facultad f) {
        this.facultades.add(f);
    }

    public void mostrarEstructura() {
        System.out.println("Universidad: " + nombreUni);
        for (Facultad f : facultades) {
            System.out.println(" -> Facultad de " + f.getNombre());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Crear las partes primero (Facultades)
        Facultad f1 = new Facultad("Ingeniería");
        Facultad f2 = new Facultad("Ciencias de la Salud");

        // 2. Crear el todo (Universidad)
        Universidad miUni = new Universidad("Universidad Nacional");

        // 3. Establecer Agregación
        miUni.agregarFacultad(f1);
        miUni.agregarFacultad(f2);

        // 4. Corroborar
        miUni.mostrarEstructura();
    }
}
