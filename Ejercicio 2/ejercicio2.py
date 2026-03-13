class Paciente:
    def _init_(self, nombre):
        self.nombre = nombre

class Doctor:
    def _init_(self, nombre):
        self.nombre = nombre
        self.pacientes = []

    def atender_paciente(self, paciente):
        self.pacientes.append(paciente)

if _name_ == "_main_":
   
    doc_a = Doctor("Dr. Garcia")
    doc_b = Doctor("Dra. Blanco")

  
    p1 = Paciente("Elena Nito")
    p2 = Paciente("Alan Brito")
    p3 = Paciente("Susana Oria")

    doc_a.atender_paciente(p1)
    doc_a.atender_paciente(p2)
    doc_b.atender_paciente(p3)
    doc_b.atender_paciente(p1) # Elena (p1) tiene cita con ambos doctores

   
    doctores = [doc_a, doc_b]
    for d in doctores:
        print(f"Lista de atención del {d.nombre}:")
        for p in d.pacientes:
            print(f"  * {p.nombre}")
        print("-" * 30)
