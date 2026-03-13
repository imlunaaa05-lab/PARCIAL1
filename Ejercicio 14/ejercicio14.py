class Salon:
    def __init__(self, identificador, capacidad):
        self.identificador = identificador
        self.capacidad = capacidad

class Escuela:
    def __init__(self, nombre):
        self.nombre = nombre
        self.salones = []

    
    def registrar_salon(self, salon):
        self.salones.append(salon)


if __name__ == "__main__":
   
    lab1 = Salon("Laboratorio 1", 20)
    aula_max = Salon("Aula Máxima", 100)

    mi_institucion = Escuela("Instituto Técnico")
    
  
    mi_institucion.registrar_salon(lab1)
    mi_institucion.registrar_salon(aula_max)

   
    print(f"Escuela: {mi_institucion.nombre}")
    for s in mi_institucion.salones:
        print(f"  * {s.identificador} - Capacidad: {s.capacidad}")
