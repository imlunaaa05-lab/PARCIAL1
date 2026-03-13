class Doctor:
    def __init__(self, nombre):
        self.nombre = nombre

class Hospital:
    def __init__(self, nombre):
        self.nombre = nombre
        self.staff = []

    def vincular_doctor(self, doctor):
        self.staff.append(doctor)


dr1 = Doctor("Pérez")
dr2 = Doctor("López")
mi_hospital = Hospital("Clínica San José")

mi_hospital.vincular_doctor(dr1)
mi_hospital.vincular_doctor(dr2)

print(f"Staff de {mi_hospital.nombre}:")
for d in mi_hospital.staff:
    print(f" - {d.nombre}")
