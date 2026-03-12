class Facultad:
    def __init__(self, nombre):
        self.nombre = nombre

class Universidad:
    def __init__(self, nombre_uni):
        self.nombre_uni = nombre_uni
        self.facultades = []

    # Agregación: Recibe el objeto Facultad ya instanciado
    def incluir_facultad(self, facultad):
        self.facultades.append(facultad)

# --- PRUEBA DE FUNCIONAMIENTO ---
if __name__ == "__main__":
    # Facultades independientes
    fac_ia = Facultad("Inteligencia Artificial")
    fac_derecho = Facultad("Derecho")

    # Todo
    u_distrital = Universidad("U. Distrital")

    # Agregación
    u_distrital.incluir_facultad(fac_ia)
    u_distrital.incluir_facultad(fac_derecho)

    # Corroborar
    print(f"Estructura de la {u_distrital.nombre_uni}:")
    for f in u_distrital.facultades:
        print(f"  - {f.nombre}")
