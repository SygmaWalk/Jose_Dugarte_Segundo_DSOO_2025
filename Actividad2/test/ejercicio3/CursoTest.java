package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    @Test
    public void testCurso() {
        // Crear instructor
        Instructor instructor = new Instructor("Carlos Pérez", "Java");

        // Crear curso
        Curso curso = new Curso("Curso de Java", instructor);

        // Crear módulos y agregar al curso
        Modulo modulo1 = new Modulo("Módulo 1", 10, new Recurso("Recurso 1", "Descripción"));
        Modulo modulo2 = new Modulo("Módulo 2", 15, new Recurso("Recurso 2", "Descripción"));
        curso.agregarModulo(modulo1);
        curso.agregarModulo(modulo2);

        // Verificar duración total
        assertEquals(25, curso.calcularDuracionTotal(), "La duración total del curso no es correcta.");
    }
}
