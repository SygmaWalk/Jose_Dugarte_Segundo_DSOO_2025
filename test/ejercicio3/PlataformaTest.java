package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class PlataformaTest {

    @Test
    public void testPlataforma() {
        // Crear plataforma
        Plataforma plataforma = new Plataforma("Plataforma de Cursos Online");

        // Crear estudiante y curso
        Estudiante estudiante = new Estudiante(1, "Juan Gómez", "juan@example.com");
        Instructor instructor = new Instructor("Carlos Pérez", "Java");
        Curso curso = new Curso("Curso de Java", instructor);

        // Crear inscripción
        LocalDate fechaInscripcion = LocalDate.of(2025, 4, 20);
        Inscripcion inscripcion = new Inscripcion(estudiante, curso, fechaInscripcion);

        // Agregar curso, estudiante e inscripción a la plataforma
        plataforma.agregarCurso(curso);
        plataforma.registrarEstudiante(estudiante);
        plataforma.inscribirEstudiante(inscripcion);

        // Verificar que el estudiante esté inscrito en el curso
        assertTrue(plataforma.obtenerCursosPorEstudiante(estudiante).contains(curso), "El estudiante no está inscrito en el curso.");
    }
}
