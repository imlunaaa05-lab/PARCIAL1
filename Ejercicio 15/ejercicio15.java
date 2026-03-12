import java.util.ArrayList;
import java.util.List;

class DetalleFactura {
    private String producto;
    private double precio;

    public DetalleFactura(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getInfo() {
        return producto + ": $" + precio;
    }
}

class Factura {
    private int numero;
    private List<DetalleFactura> detalles;

    public Factura(int numero) {
        this.numero = numero;
        this.detalles = new ArrayList<>();
    }

    // Composición: La factura crea el detalle internamente
    public void agregarDetalle(String producto, double precio) {
        DetalleFactura nuevoDetalle = new DetalleFactura(producto, precio);
        this.detalles.add(nuevoDetalle);
    }

    public void mostrarFactura() {
        System.out.println("Factura N°: " + numero);
        for (DetalleFactura d : detalles) {
            System.out.println(" - " + d.getInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura(1001);
        
        // Los datos se pasan para que la factura cree sus propias partes
        f1.agregarDetalle("Monitor LED", 150.0);
        f1.agregarDetalle("Teclado", 30.0);

        f1.mostrarFactura();
    }
}
