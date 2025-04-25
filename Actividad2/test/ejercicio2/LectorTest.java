package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LectorTest {

    @Test
    public void testLectorGetters() {
        // Crear un lector de prueba
        Lector lector = new Lector(203,"Ana López","Calle 16");

        // Mostrar en consola lo que se creó
        System.out.println("Lector creado: " + lector.getNombre() + " - " + lector.getNumeroSocio() +  " - " + lector.getDireccion());

        // Verificar que los métodos get devuelvan lo esperado
        assertEquals("Ana López", lector.getNombre(), "El nombre no es el esperado.");
        assertEquals(203, lector.getNumeroSocio(), "El numero de socio no es el esperado.");
        assertEquals("Calle 16", lector.getDireccion(), "La dirección no es la esperada");
    }
}
