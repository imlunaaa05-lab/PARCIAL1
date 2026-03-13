import java.util.ArrayList;
import java.util.List;

class Pagina {
    private String contenido;

    public Pagina(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}

class Documento {
    private String titulo;
    private List<Pagina> paginas;

    public Documento(String titulo) {
        this.titulo = titulo;
        this.paginas = new ArrayList<>();
    }

    
    public void agregarPagina(String texto) {
        this.paginas.add(new Pagina(texto));
    }

    public void imprimirDocumento() {
        System.out.println("Documento: " + titulo);
        for (int i = 0; i < paginas.size(); i++) {
            System.out.println("Página " + (i + 1) + ": " + paginas.get(i).getContenido());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Documento miDoc = new Documento("Proyecto Final");
        miDoc.agregarPagina("Portada del proyecto.");
        miDoc.agregarPagina("Introducción al diseño de software.");
        
        miDoc.imprimirDocumento();
    }
}
