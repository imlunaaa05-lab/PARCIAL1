class Libro:
    def __init__(self, titulo, isbn):
        self.titulo = titulo
        self.isbn = isbn

class Biblioteca:
    def __init__(self, nombre):
        self.nombre = nombre
        self.libros = []

    # Agregación: El libro entra a la biblioteca pero no nace en ella
    def admitir_libro(self, libro):
        self.libros.append(libro)

# --- PRUEBA ---
if __name__ == "__main__":
    # Libros independientes
    l1 = Libro("El Psicoanalista", "12345")
    l2 = Libro("Sapiens", "67890")

    mi_biblio = Biblioteca("Biblioteca Municipal")
    
    # Se agregan
    mi_biblio.admitir_libro(l1)
    mi_biblio.admitir_libro(l2)

    # Verificación
    print(f"Libros en {mi_biblio.nombre}:")
    for b in mi_biblio.libros:
        print(f"  * {b.titulo}")
