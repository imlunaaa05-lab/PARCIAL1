class Vehiculo:
    def __init__(self, placa, modelo):
        self.placa = placa
        self.modelo = modelo

    def __str__(self):
        return f"Placa: {self.placa}, Modelo: {self.modelo}"

class EmpresaTransporte:
    def __init__(self, nombre):
        self.nombre = nombre
        self.flota = []

    
    def registrar_vehiculo(self, vehiculo):
        self.flota.append(vehiculo)


if __name__ == "__main__":
    # Vehículos independientes
    auto1 = Vehiculo("MNO-789", "Van Toyota")
    auto2 = Vehiculo("PQR-001", "Furgón Chevrolet")

    empresa = EmpresaTransporte("Carga Rápida")
    

    empresa.registrar_vehiculo(auto1)
    empresa.registrar_vehiculo(auto2)

  
    print(f"Empresa: {empresa.nombre}")
    for v in empresa.flota:
        print(f"  * {v}")
      
