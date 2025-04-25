package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    @Test
    public void testEstudiante() {
        // Crear estudiante
        Estudiante estudiante = new Estudiante(1, "Juan Gómez", "juan@example.com");

        // Verificar valores
        assertEquals(1, estudiante.getIdEstudiante(), "El ID del estudiante no es correcto.");
        assertEquals("Juan Gómez", estudiante.getNombre(), "El nombre del estudiante no es correcto.");
        assertEquals("juan@example.com", estudiante.getEmail(), "El email del estudiante no es correcto.");
    }
}
