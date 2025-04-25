package ejercicio2;
import ejercicio2.Autor;
import ejercicio2.Editorial;

// Relación con Autor:
// Un libro tiene un autor, y esta relación es de Composición porque el autor es una parte fundamental del libro.

// Relación con Editorial:
// Un libro tiene una editorial asociada que se crea en el constructor del libro.
// Esta es una relación de Composición, ya que el libro es responsable de la existencia de la editorial y no puede existir sin ella.
// La editorial está completamente contenida dentro del libro.

class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
}
