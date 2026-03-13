class Item:
    def __init__(self, producto, cantidad):
        self.producto = producto
        self.cantidad = cantidad

class Carrito:
    def __init__(self):
        self.items = []

  
    def agregar_producto(self, nombre, cantidad):
        nuevo_item = Item(nombre, cantidad)
        self.items.append(nuevo_item)


if __name__ == "__main__":
    compra = Carrito()
    
    compra.agregar_producto("Smartphone XYZ", 1)
    compra.agregar_producto("Funda Protectora", 1)

    print("Items en tu carrito actual:")
    for i in compra.items:
        print(f" - {i.producto} x{i.cantidad}")
