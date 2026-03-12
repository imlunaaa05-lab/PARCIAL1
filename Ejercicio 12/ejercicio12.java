import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String nombre;
    public Doctor(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
}

class Hospital {
    private String nombreHospital;
    private List<Doctor> personalMedico;

    public Hospital(String nombre) {
        this.nombreHospital = nombre;
        this.personalMedico = new ArrayList<>();
    }

    public void contratarDoctor(Doctor d) {
        this.personalMedico.add(d);
    }

    public void mostrarStaff() {
        System.out.println("Hospital: " + nombreHospital);
        for (Doctor d : personalMedico) {
            System.out.println(" -> Dr. " + d.getNombre());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("García");
        Doctor doc2 = new Doctor("Rodríguez");

        Hospital hosp = new Hospital("Hospital Central");
        hosp.contratarDoctor(doc1);
        hosp.contratarDoctor(doc2);

        hosp.mostrarStaff();
    }
}
