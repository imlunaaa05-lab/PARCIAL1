import java.util.ArrayList;
import java.util.List;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getDetalles() {
        return nombre + " - $" + precio;
    }
}

class Tienda {
    private String nombreTienda;
    private List<Producto> inventario;

    public Tienda(String nombre) {
        this.nombreTienda = nombre;
        this.inventario = new ArrayList<>();
    }


    public void agregarProducto(Producto p) {
        this.inventario.add(p);
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de " + nombreTienda + ":");
        for (Producto p : inventario) {
            System.out.println(" * " + p.getDetalles());
        }
    }
}

public class Main {
    public static void main(String[] args) {
      
        Producto p1 = new Producto("Laptop", 1200.0);
        Producto p2 = new Producto("Mouse", 25.0);

        Tienda miTienda = new Tienda("TecnoShop");
        
        
        miTienda.agregarProducto(p1);
        miTienda.agregarProducto(p2);

        miTienda.mostrarCatalogo();
    }
}
