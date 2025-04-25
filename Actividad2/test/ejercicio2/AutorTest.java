package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AutorTest {

    @Test
    void testGetNombre() {
        // Creamos una instancia de Autor con nombre "Gabriel García Márquez" y nacionalidad "Colombiano"
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");

        // Imprimimos el resultado para verificar
        System.out.println("Probando getNombre(): " + autor.getNombre());

        // Verificamos que el valor devuelto por getNombre() sea "Gabriel García Márquez"
        assertEquals("Gabriel García Márquez", autor.getNombre(), "El nombre del autor no es correcto");
    }

    @Test
    void testGetNacionalidad() {
        // Creamos una instancia de Autor
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");

        // Imprimimos el resultado para verificar
        System.out.println("Probando getNacionalidad(): " + autor.getNacionalidad());

        // Verificamos que el valor devuelto por getNacionalidad() sea "Colombiano"
        assertEquals("Colombiano", autor.getNacionalidad(), "La nacionalidad del autor no es correcta");
    }
}
