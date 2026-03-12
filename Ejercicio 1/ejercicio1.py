class Estudiante:
    def __init__(self, nombre):
        self.nombre = nombre

class Curso:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = [] # Lista para manejar la asociación

    def inscribir_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

# Prueba de funcionamiento
if __name__ == "__main__":
    # Crear objetos independientes
    curso_poo = Curso("Fundamentos de Diseño")
    alumno1 = Estudiante("Carlos Gomez")
    alumno2 = Estudiante("Ana Ruiz")

    # Asociar
    curso_poo.inscribir_estudiante(alumno1)
    curso_poo.inscribir_estudiante(alumno2)

    # Corroborar
    print(f"Curso: {curso_poo.nombre}")
    for est in curso_poo.estudiantes:
        print(f" - Estudiante inscrito: {est.nombre}")
