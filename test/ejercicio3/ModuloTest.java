package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModuloTest {

    @Test
    public void testModulo() {
        // Crear recurso (puede ser un objeto mock)
        Recurso recurso = new Recurso("Recurso 1", "Descripción del recurso");

        // Crear un módulo
        Modulo modulo = new Modulo("Módulo de Java", 10, recurso);

        // Verificar valores
        assertEquals("Módulo de Java", modulo.getTitulo(), "El título del módulo no es correcto.");
        assertEquals(10, modulo.getDuracion(), "La duración del módulo no es correcta.");
        assertEquals(recurso, modulo.getRecurso(), "El recurso del módulo no es correcto.");
    }
}
