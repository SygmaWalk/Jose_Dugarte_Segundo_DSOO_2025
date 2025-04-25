package ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase contiene pruebas unitarias para la clase Persona.
 * Verifica que los métodos getter retornen correctamente los valores proporcionados en el constructor.
 */
class PersonaTest {

    @Test
    void testConstructorYGetters() {
        // Arrange: se crean datos de prueba
        String nombre = "José";
        String apellido = "Dugarte";
        String dni = "12345";

        // Act: se crea una instancia de Persona con esos datos
        Persona persona = new Persona(nombre, apellido, dni);

        // Assert: se verifica que los getters devuelvan los valores correctamente
        assertEquals("José", persona.getNombre(), "El nombre no coincide");
        assertEquals("Dugarte", persona.getApellido(), "El apellido no coincide");
        assertEquals("12345", persona.getDni(), "El DNI no coincide");
    }
}
