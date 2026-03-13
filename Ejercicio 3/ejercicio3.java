import java.util.ArrayList;
import java.util.List;

class Pelicula {
    private String titulo;
    public Pelicula(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
}

class Usuario {
    private String username;
    private List<Pelicula> favoritos;

    public Usuario(String username) {
        this.username = username;
        this.favoritos = new ArrayList<>();
    }

    public void agregarAFavoritos(Pelicula p) {
        this.favoritos.add(p);
    }

    public String getUsername() { return username; }
    public List<Pelicula> getFavoritos() { return favoritos; }
}

public class Main {
    public static void main(String[] args) {
      
        Pelicula p1 = new Pelicula("Inception");
        Pelicula p2 = new Pelicula("Interstellar");
        Pelicula p3 = new Pelicula("The Dark Knight");

        
        Usuario user1 = new Usuario("Cinefilo_99");
        Usuario user2 = new Usuario("TechUser");

    
        user1.agregarAFavoritos(p1);
        user1.agregarAFavoritos(p3);
        user2.agregarAFavoritos(p1); // Ambos pueden tener la misma favorita

       
        imprimirFavoritos(user1);
        imprimirFavoritos(user2);
    }

    public static void imprimirFavoritos(Usuario u) {
        System.out.println("Lista de " + u.getUsername() + ":");
        for (Pelicula p : u.getFavoritos()) {
            System.out.println(" - Favoriteada: " + p.getTitulo());
        }
        System.out.println("---------------------------");
    }
}
