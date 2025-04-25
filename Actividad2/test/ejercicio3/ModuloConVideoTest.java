package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModuloConVideoTest {

    @Test
    public void testModuloConVideo() {
        // Crear recurso
        Recurso recurso = new Recurso("Recurso 1", "Descripción del recurso");

        // Crear módulo con video
        ModuloConVideo moduloConVideo = new ModuloConVideo("Módulo de Video", 10, recurso, "https://video.url");

        // Verificar valores
        assertEquals("Módulo de Video", moduloConVideo.getTitulo(), "El título del módulo no es correcto.");
        assertEquals(10, moduloConVideo.getDuracion(), "La duración del módulo no es correcta.");
        assertEquals(recurso, moduloConVideo.getRecurso(), "El recurso del módulo no es correcto.");
        assertEquals("https://video.url", moduloConVideo.getUrlVideo(), "La URL del video no es correcta.");
    }
}
