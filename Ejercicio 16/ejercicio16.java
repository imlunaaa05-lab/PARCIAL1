import java.util.ArrayList;
import java.util.List;

class DetallePedido {
    private String producto;
    private int cantidad;

    public DetallePedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getInfo() {
        return cantidad + "x " + producto;
    }
}

class Pedido {
    private int idPedido;
    private List<DetallePedido> detalles;

    public Pedido(int id) {
        this.idPedido = id;
        this.detalles = new ArrayList<>();
    }

    // Composición: El Pedido crea el Detalle internamente
    public void agregarItem(String nombre, int cant) {
        this.detalles.add(new DetallePedido(nombre, cant));
    }

    public void mostrarPedido() {
        System.out.println("ID Pedido: " + idPedido);
        for (DetallePedido d : detalles) {
            System.out.println(" -> " + d.getInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido miPedido = new Pedido(778);
        
        // No pasamos objetos creados, pasamos datos para que el pedido los cree
        miPedido.agregarItem("Pizza Familiar", 2);
        miPedido.agregarItem("Refresco 2L", 1);

        miPedido.mostrarPedido();
    }
}
