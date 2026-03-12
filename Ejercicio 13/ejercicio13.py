class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

class Tienda:
    def __init__(self, nombre):
        self.nombre = nombre
        self.productos = []

    # Agregación: Recibe el objeto producto ya instanciado
    def registrar_producto(self, producto):
        self.productos.append(producto)

# --- PRUEBA DE FUNCIONAMIENTO ---
if __name__ == "__main__":
    # Productos independientes
    prod1 = Producto("Monitor 4K", 400)
    prod2 = Producto("Teclado Mecánico", 80)

    tienda_gamer = Tienda("GamerZone")
    
    # Agregación
    tienda_gamer.registrar_producto(prod1)
    tienda_gamer.registrar_producto(prod2)

    # Verificación
    print(f"Tienda: {tienda_gamer.nombre}")
    for p in tienda_gamer.productos:
        print(f" - {p.nombre}: ${p.precio}")
