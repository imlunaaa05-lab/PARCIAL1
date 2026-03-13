import java.util.ArrayList;
import java.util.List;

class Paciente {
    private String nombre;
    public Paciente(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
}

class Doctor {
    private String nombre;
    private List<Paciente> pacientes;

    public Doctor(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
    }

    public void atenderPaciente(Paciente p) {
        this.pacientes.add(p);
    }

    public String getNombre() { return nombre; }
    public List<Paciente> getPacientes() { return pacientes; }
}

public class Main {
    public static void main(String[] args) {
       
        Doctor doc1 = new Doctor("Dr. Smith (Cardiología)");
        Doctor doc2 = new Doctor("Dra. Quinn (General)");

       
        Paciente p1 = new Paciente("Carlos Ruiz");
        Paciente p2 = new Paciente("Marta Soto");
        Paciente p3 = new Paciente("Luis Peña");

       
        doc1.atenderPaciente(p1); 
        doc1.atenderPaciente(p2);
        doc2.atenderPaciente(p3); 
        doc2.atenderPaciente(p1); 

     
        imprimirReporte(doc1);
        imprimirReporte(doc2);
    }

    public static void imprimirReporte(Doctor d) {
        System.out.println("Reporte del " + d.getNombre() + ":");
        if(d.getPacientes().isEmpty()) {
            System.out.println(" - Sin pacientes asignados.");
        } else {
            for (Paciente p : d.getPacientes()) {
                System.out.println(" -> Paciente: " + p.getNombre());
            }
        }
        System.out.println("---------------------------");
    }
}
