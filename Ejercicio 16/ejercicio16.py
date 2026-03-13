class DetallePedido:
    def __init__(self, producto, cantidad):
        self.producto = producto
        self.cantidad = cantidad

class Pedido:
    def __init__(self, id_pedido):
        self.id_pedido = id_pedido
        self.detalles = []

    
    def agregar_producto(self, nombre, cantidad):
        nuevo_detalle = DetallePedido(nombre, cantidad)
        self.detalles.append(nuevo_detalle)


if __name__ == "__main__":
    pedido_app = Pedido(901)
    
    pedido_app.agregar_producto("Hamburguesa Doble", 3)
    pedido_app.agregar_producto("Papas Fritas", 2)

    print(f"Pedido #: {pedido_app.id_pedido}")
    for item in pedido_app.detalles:
        print(f"  - {item.cantidad} unidad(es) de {item.producto}")
