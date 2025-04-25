package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LibroTest {

    @Test void testLibroGetters() {
        // Paso 1: Crear un Autor
        Autor autor = new Autor("Julio Cortázar", "Argentina");
        System.out.println("Autor creado: " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");

        // Paso 2: Crear una Editorial
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");
        System.out.println("Editorial creada: " + editorial.getNombre() + " - " + editorial.getDirección());

        // Paso 3: Crear un Libro con los datos anteriores
        Libro libro = new Libro("Rayuela", "ISBN-0001", autor, editorial);
        System.out.println("Libro creado: " + libro.getTitulo() + " - " + libro.getIsbn());

        // Paso 4: Verificar getTitulo()
        assertEquals("Rayuela", libro.getTitulo(), "El título no es el esperado.");
        System.out.println("✔ getTitulo() correcto");

        // Paso 5: Verificar getIsbn()
        assertEquals("ISBN-0001", libro.getIsbn(), "El ISBN no es el esperado.");
        System.out.println("✔ getIsbn() correcto");

        // Paso 6: Verificar getAutor()
        assertEquals(autor, libro.getAutor(), "El autor no es el esperado.");
        System.out.println("✔ getAutor() correcto: " + libro.getAutor().getNombre());

        // Paso 7: Verificar getEditorial()
        assertEquals(editorial, libro.getEditorial(), "La editorial no es la esperada.");
        System.out.println("✔ getEditorial() correcto: " + libro.getEditorial().getNombre());
    }
}
