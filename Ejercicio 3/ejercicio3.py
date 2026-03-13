class Pelicula:
    def __init__(self, titulo):
        self.titulo = titulo

class Usuario:
    def __init__(self, username):
        self.username = username
        self.favoritos = []

    def agregar_a_favoritos(self, pelicula):
        self.favoritos.append(pelicula)


if __name__ == "__main__":
   
    p1 = Pelicula("Spider-Man")
    p2 = Pelicula("Batman")
    p3 = Pelicula("Avengers")

  
    u1 = Usuario("Andres_CC")
    u2 = Usuario("Maria_IA")

   
    u1.agregar_a_favoritos(p1)
    u1.agregar_a_favoritos(p2)
    u2.agregar_a_favoritos(p1)

    for user in [u1, u2]:
        print(f"Favoritos de {user.username}:")
        for fav in user.favoritos:
            print(f"  > {fav.titulo}")
        print("-" * 25)
