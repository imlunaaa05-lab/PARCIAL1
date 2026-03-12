class Reserva:
    def __init__(self, codigo, fecha):
        self.codigo = codigo
        self.fecha = fecha

    def __str__(self):
        return f"Reserva {self.codigo} para el día {self.fecha}"

class Cliente:
    def __init__(self, nombre):
        self.nombre = nombre
        self.reservas = []

    def nueva_reserva(self, reserva):
        self.reservas.append(reserva)

# --- PRUEBA ---
if __name__ == "__main__":
    # Instancias
    c1 = Cliente("Julian Alvarez")
    r1 = Reserva("BK-55", "10/10/2024")
    r2 = Reserva("BK-99", "15/12/2024")

    # Asociar
    c1.nueva_reserva(r1)
    c1.nueva_reserva(r2)

    # Imprimir
    print(f"Cliente: {c1.nombre}")
    for res in c1.reservas:
        print(f"  - {res}")
