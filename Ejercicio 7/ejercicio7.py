class CursoVirtual:
    def __init__(self, titulo):
        self.titulo = titulo

class Estudiante:
    def __init__(self, nombre):
        self.nombre = nombre
        self.cursos = []

    def matricular(self, curso):
        self.cursos.append(curso)
    
    def abandonar(self, curso):
        if curso in self.cursos:
            self.cursos.remove(curso)
            print(f"{self.nombre} se dio de baja de: {curso.titulo}")


if __name__ == "__main__":
  
    ia = CursoVirtual("IA para Negocios")
    ux = CursoVirtual("Diseño UX")
    user = Estudiante("Marta")

    
    user.matricular(ia)
    user.matricular(ux)

    
    user.abandonar(ux)

 
    print(f"Lista final de {user.nombre}:")
    for c in user.cursos:
        print(f"  > {c.titulo}")
