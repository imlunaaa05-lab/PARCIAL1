class DetalleFactura:
    def __init__(self, producto, precio):
        self.producto = producto
        self.precio = precio

class Factura:
    def __init__(self, numero):
        self.numero = numero
        self.detalles = []


    def agregar_item(self, producto, precio):
        nuevo_item = DetalleFactura(producto, precio)
        self.detalles.append(nuevo_item)


if __name__ == "__main__":
    mi_factura = Factura(505)
    
    mi_factura.agregar_item("Memoria RAM", 80)
    mi_factura.agregar_item("Disco SSD", 120)

    print(f"Factura ID: {mi_factura.numero}")
    for item in mi_factura.detalles:
        print(f" > {item.producto}: ${item.precio}")
