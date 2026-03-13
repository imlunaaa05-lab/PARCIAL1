import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;
    public Empleado(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
}

class Departamento {
    private String nombreDep;
    private List<Empleado> listaEmpleados;

    public Departamento(String nombre) {
        this.nombreDep = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public void asignarEmpleado(Empleado e) {
        this.listaEmpleados.add(e);
    }

    public String getNombreDep() { return nombreDep; }
    public List<Empleado> getListaEmpleados() { return listaEmpleados; }
}

public class Main {
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Ricardo Gomez");
        Empleado emp2 = new Empleado("Ana Martinez");
        Empleado emp3 = new Empleado("Julian Toro");


        Departamento deptoIT = new Departamento("Sistemas");
        Departamento deptoRRHH = new Departamento("Recursos Humanos");

      
        deptoIT.asignarEmpleado(emp1);
        deptoIT.asignarEmpleado(emp2);
        deptoRRHH.asignarEmpleado(emp3);

       
        mostrarDatos(deptoIT);
        mostrarDatos(deptoRRHH);
    }

    public static void mostrarDatos(Departamento d) {
        System.out.println("Departamento: " + d.getNombreDep());
        for (Empleado e : d.getListaEmpleados()) {
            System.out.println(" -> Empleado: " + e.getNombre());
        }
        System.out.println("---------------------------");
    }
}
