package ejercicio3;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class InscripcionTest {

    @Test
    public void testInscripcion() {
        // Crear estudiante y curso
        Estudiante estudiante = new Estudiante(1, "Juan Gómez", "juan@example.com");
        Instructor instructor = new Instructor("Carlos Pérez", "Java");
        Curso curso = new Curso("Curso de Java", instructor);

        // Crear inscripción
        LocalDate fechaInscripcion = LocalDate.of(2025, 4, 20);
        Inscripcion inscripcion = new Inscripcion(estudiante, curso, fechaInscripcion);

        // Verificar los valores
        assertEquals(estudiante, inscripcion.getEstudiante(), "El estudiante de la inscripción no es correcto.");
        assertEquals(curso, inscripcion.getCurso(), "El curso de la inscripción no es correcto.");
        assertEquals(fechaInscripcion, inscripcion.getFechaInscripcion(), "La fecha de inscripción no es correcta.");
    }
}
