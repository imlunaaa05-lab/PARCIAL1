class Salon:
    def __init__(self, identificador, capacidad):
        self.identificador = identificador
        self.capacidad = capacidad

class Escuela:
    def __init__(self, nombre):
        self.nombre = nombre
        self.salones = []

    # Agregación: El objeto salón se pasa como parámetro
    def registrar_salon(self, salon):
        self.salones.append(salon)

# --- PRUEBA DE FUNCIONAMIENTO ---
if __name__ == "__main__":
    # Salones independientes
    lab1 = Salon("Laboratorio 1", 20)
    aula_max = Salon("Aula Máxima", 100)

    mi_institucion = Escuela("Instituto Técnico")
    
    # Agregación
    mi_institucion.registrar_salon(lab1)
    mi_institucion.registrar_salon(aula_max)

    # Verificación
    print(f"Escuela: {mi_institucion.nombre}")
    for s in mi_institucion.salones:
        print(f"  * {s.identificador} - Capacidad: {s.capacidad}")
