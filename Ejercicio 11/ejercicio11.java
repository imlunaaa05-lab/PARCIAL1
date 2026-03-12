class Motor {
    private String serie;
    private String tipo;

    public Motor(String serie, String tipo) {
        this.serie = serie;
        this.tipo = tipo;
    }

    public String getDetalles() {
        return tipo + " (Serie: " + serie + ")";
    }
}

class Automovil {
    private String marca;
    private Motor motor; // El automóvil "tiene un" motor

    public Automovil(String marca) {
        this.marca = marca;
    }

    // Agregación: Se asigna un motor que ya existe
    public void instalarMotor(Motor m) {
        this.motor = m;
    }

    public void mostrarEspecificaciones() {
        System.out.println("Vehículo: " + marca);
        if (motor != null) {
            System.out.println(" -> Motor: " + motor.getDetalles());
        } else {
            System.out.println(" -> Sin motor instalado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. El motor existe antes que el coche
        Motor motorV8 = new Motor("V8-990", "Gasolina");

        // 2. Se crea el coche
        Automovil miCoche = new Automovil("Ford Mustang");

        // 3. Se agrega el motor (Agregación)
        miCoche.instalarMotor(motorV8);

        // 4. Corroborar
        miCoche.mostrarEspecificaciones();
    }
}
