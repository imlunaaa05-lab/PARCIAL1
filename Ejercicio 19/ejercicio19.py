class Pagina:
    def __init__(self, contenido):
        self.contenido = contenido

class Documento:
    def __init__(self, titulo):
        self.titulo = titulo
        self.paginas = []

    def añadir_pagina(self, texto):
        # Composición: Se instancia la clase Pagina aquí dentro
        nueva_pagina = Pagina(texto)
        self.paginas.append(nueva_pagina)

    def mostrar_documento(self):
        print(f"Documento: {self.titulo}")
        for i, p in enumerate(self.paginas, 1):
            print(f"Página {i}: {p.contenido}")

# Prueba
doc = Documento("Manual de UML")
doc.añadir_pagina("Introducción a las relaciones.")
doc.añadir_pagina("Detalles de la composición.")
doc.mostrar_documento()
