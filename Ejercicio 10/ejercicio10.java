import java.util.ArrayList;
import java.util.List;

class Vehiculo {
    private String placa;
    private String modelo;

    public Vehiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getInfo() {
        return "Vehículo [Placa: " + placa + ", Modelo: " + modelo + "]";
    }
}

class EmpresaTransporte {
    private String nombre;
    private List<Vehiculo> flota;

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
        this.flota = new ArrayList<>();
    }

    // Agregación: El vehículo se pasa como parámetro (ya existe)
    public void agregarAFlota(Vehiculo v) {
        this.flota.add(v);
    }

    public void mostrarFlota() {
        System.out.println("Flota de la empresa: " + nombre);
        for (Vehiculo v : flota) {
            System.out.println(" - " + v.getInfo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Crear vehículos de forma independiente
        Vehiculo v1 = new Vehiculo("XYZ-123", "Bus Mercedes");
        Vehiculo v2 = new Vehiculo("ABC-456", "Camión Volvo");

        // 2. Crear la empresa
        EmpresaTransporte miEmpresa = new EmpresaTransporte("TransLogística S.A.");

        // 3. Vincular (Agregación)
        miEmpresa.agregarAFlota(v1);
        miEmpresa.agregarAFlota(v2);

        // 4. Corroborar
        miEmpresa.mostrarFlota();
    }
}
