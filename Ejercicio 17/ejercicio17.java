import java.util.ArrayList;
import java.util.List;

class Item {
    private String producto;
    private int cantidad;

    public Item(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getResumen() {
        return producto + " (Cant: " + cantidad + ")";
    }
}

class Carrito {
    private List<Item> listaItems;

    public Carrito() {
        this.listaItems = new ArrayList<>();
    }

    // Composición: El Carrito instancia el Item con los datos recibidos
    public void agregarAlCarrito(String nombreProd, int cant) {
        this.listaItems.add(new Item(nombreProd, cant));
    }

    public void mostrarCarrito() {
        System.out.println("--- Contenido del Carrito ---");
        if (listaItems.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Item i : listaItems) {
                System.out.println(" + " + i.getResumen());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Carrito miCarrito = new Carrito();
        
        // La creación del objeto Item ocurre internamente
        miCarrito.agregarAlCarrito("Zapatillas Running", 1);
        miCarrito.agregarAlCarrito("Medias Deportivas", 3);

        miCarrito.mostrarCarrito();
    }
}
