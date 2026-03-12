class Empleado:
    def __init__(self, nombre):
        self.nombre = nombre

class Departamento:
    def __init__(self, nombre_dep):
        self.nombre_dep = nombre_dep
        self.empleados = []

    def asignar_empleado(self, empleado):
        self.empleados.append(empleado)

# --- PRUEBA DE FUNCIONAMIENTO ---
if __name__ == "__main__":
    # 1. Crear objetos por separado (Asociación)
    e1 = Empleado("Laura Casallas")
    e2 = e1 # Referencia al mismo objeto
    
    it = Departamento("IT")
    ventas = Departamento("Ventas")

    # 2. Asignar
    it.asignar_empleado(e1)
    
    # 3. Corroborar
    print(f"Departamento: {it.nombre_dep}")
    for emp in it.empleados:
        print(f"  - Trabajador: {emp.nombre}")
    print("-" * 25)
