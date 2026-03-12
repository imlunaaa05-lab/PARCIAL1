class Asignatura:
    def __init__(self, nombre):
        self.nombre = nombre
        self.profesores = []

    def agregar_profesor(self, profesor):
        self.profesores.append(profesor)

class Profesor:
    def __init__(self, nombre):
        self.nombre = nombre
        self.asignaturas = []

    def dictar_asignatura(self, asignatura):
        self.asignaturas.append(asignatura)

# --- PRUEBA DE FUNCIONAMIENTO ---
if __name__ == "__main__":
    # 1. Instancias independientes
    p1 = Profesor("Carlos Rodriguez")
    p2 = Profesor("Martha Gomez")

    a1 = Asignatura("Inteligencia Artificial")
    a2 = Asignatura("Bases de Datos")

    # 2. Crear vínculos de Asociación
    p1.dictar_asignatura(a1)
    a1.agregar_profesor(p1)

    p2.dictar_asignatura(a1)
    a1.agregar_profesor(p2)

    # 3. Corroborar salida
    print(f"La asignatura '{a1.nombre}' tiene los siguientes profesores:")
    for prof in a1.profesores:
        print(f"  - {prof.nombre}")
