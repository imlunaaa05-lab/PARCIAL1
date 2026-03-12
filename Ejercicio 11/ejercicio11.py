class Motor:
    def __init__(self, serie, tipo):
        self.serie = serie
        self.tipo = tipo

    def __str__(self):
        return f"{self.tipo} (Serie: {self.serie})"

class Automovil:
    def __init__(self, marca):
        self.marca = marca
        self.motor = None # Inicia sin motor

    # Agregación: Recibe el objeto motor externo
    def instalar_motor(self, motor):
        self.motor = motor

# --- PRUEBA ---
if __name__ == "__main__":
    # Motor independiente
    motor_electrico = Motor("E-500", "Eléctrico")

    tesla = Automovil("Tesla Model S")
    
    # Se agrega la parte al todo
    tesla.instalar_motor(motor_electrico)

    # Verificación
    print(f"Coche: {tesla.marca}")
    print(f"Estado del motor: {tesla.motor}")
