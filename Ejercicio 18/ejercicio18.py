class Pregunta:
    def __init__(self, enunciado):
        self.enunciado = enunciado

class Examen:
    def __init__(self, materia):
        self.materia = materia
        self.preguntas = []

    # Composición: Instanciación interna
    def agregar_pregunta(self, texto):
        nueva_pregunta = Pregunta(texto)
        self.preguntas.append(nueva_pregunta)

# --- PRUEBA ---
if __name__ == "__main__":
    evaluacion = Examen("Inteligencia Artificial")
    
    evaluacion.agregar_pregunta("Defina Redes Neuronales.")
    evaluacion.agregar_pregunta("Explique el aprendizaje supervisado.")

    print(f"Evaluación: {evaluacion.materia}")
    for idx, p in enumerate(evaluacion.preguntas, 1):
        print(f"{idx}. {p.enunciado}")
