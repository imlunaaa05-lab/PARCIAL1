import java.util.ArrayList;
import java.util.List;

class Movimiento {
    private String tipo;
    private double monto;

    public Movimiento(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getInfo() {
        return tipo + ": $" + monto;
    }
}

class CuentaBancaria {
    private String numeroCuenta;
    private List<Movimiento> historial;

    public CuentaBancaria(String numero) {
        this.numeroCuenta = numero;
        this.historial = new ArrayList<>();
    }

    public void registrarMovimiento(String tipo, double monto) {
      
        this.historial.add(new Movimiento(tipo, monto));
    }

    public void verExtracto() {
        System.out.println("Extracto Cuenta: " + numeroCuenta);
        for (Movimiento m : historial) {
            System.out.println(" - " + m.getInfo());
        }
    }
}
