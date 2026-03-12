import java.util.ArrayList;
import java.util.List;

class Reserva {
    private String codigo;
    private String fecha;

    public Reserva(String codigo, String fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public String getDetalles() {
        return "Reserva [Cod: " + codigo + ", Fecha: " + fecha + "]";
    }
}

class Cliente {
    private String nombre;
    private List<Reserva> misReservas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.misReservas = new ArrayList<>();
    }

    public void registrarReserva(Reserva r) {
        this.misReservas.add(r);
    }

    public String getNombre() { return nombre; }
    public List<Reserva> getMisReservas() { return misReservas; }
}

public class Main {
    public static void main(String[] args) {
        // Objetos independientes
        Cliente cliente1 = new Cliente("Sofia Vergara");
        
        Reserva res1 = new Reserva("H-101", "2023-12-24");
        Reserva res2 = new Reserva("H-202", "2024-01-15");

        // Establecer Asociación
        cliente1.registrarReserva(res1);
        cliente1.registrarReserva(res2);

        // Verificación
        System.out.println("Historial de: " + cliente1.getNombre());
        for (Reserva r : cliente1.getMisReservas()) {
            System.out.println(" -> " + r.getDetalles());
        }
    }
}
