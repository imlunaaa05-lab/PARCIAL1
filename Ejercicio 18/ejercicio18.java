import java.util.ArrayList;
import java.util.List;

class Pregunta {
    private String enunciado;

    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEnunciado() {
        return enunciado;
    }
}

class Examen {
    private String materia;
    private List<Pregunta> preguntas;

    public Examen(String materia) {
        this.materia = materia;
        this.preguntas = new ArrayList<>();
    }

    // Composición: El Examen crea la instancia de Pregunta
    public void añadirPregunta(String texto) {
        this.preguntas.add(new Pregunta(texto));
    }

    public void mostrarExamen() {
        System.out.println("Examen de: " + materia);
        for (int i = 0; i < preguntas.size(); i++) {
            System.out.println((i + 1) + ". " + preguntas.get(i).getEnunciado());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Examen parcial = new Examen("Fundamentos de Software");
        
        // El Examen controla la creación de sus partes
        parcial.añadirPregunta("¿Qué es la composición en POO?");
        parcial.añadirPregunta("Diferencia entre Java y Python en memoria.");

        parcial.mostrarExamen();
    }
}
