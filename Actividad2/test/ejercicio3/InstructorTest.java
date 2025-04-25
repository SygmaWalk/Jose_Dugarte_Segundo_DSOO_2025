package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InstructorTest {

    @Test
    public void testInstructor() {
        // Crear un instructor
        Instructor instructor = new Instructor("Carlos Pérez", "Java");

        // Verificar los valores
        assertEquals("Carlos Pérez", instructor.getNombre(), "El nombre del instructor no es correcto.");
        assertEquals("Java", instructor.getEspecialidad(), "La especialidad del instructor no es correcta.");
    }
}
