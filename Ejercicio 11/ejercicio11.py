class Material:
    def __init__(self, titulo):
        self.titulo = titulo

class CursoAcademico:
    def __init__(self, nombre):
        self.nombre = nombre
        self.materiales = []

    def agregar_material(self, material):
        self.materiales.append(material)


video = Material("Video Tutorial Python")
doc = Material("Documentación Oficial")
curso = CursoAcademico("Programación II")

curso.agregar_material(video)
curso.agregar_material(doc)

print(f"Curso: {curso.nombre}")
for m in curso.materiales:
    print(f" * {m.titulo}")
