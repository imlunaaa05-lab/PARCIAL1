class Empleado:
    def __init__(self, nombre):
        self.nombre = nombre

class Departamento:
    def __init__(self, nombre_dep):
        self.nombre_dep = nombre_dep
        self.empleados = []

    def asignar_empleado(self, empleado):
        self.empleados.append(empleado)


if __name__ == "__main__":
    
    e1 = Empleado("Laura Casallas")
    e2 = e1 
    
    it = Departamento("IT")
    ventas = Departamento("Ventas")

 
    it.asignar_empleado(e1)
    
 
    print(f"Departamento: {it.nombre_dep}")
    for emp in it.empleados:
        print(f"  - Trabajador: {emp.nombre}")
    print("-" * 25)
