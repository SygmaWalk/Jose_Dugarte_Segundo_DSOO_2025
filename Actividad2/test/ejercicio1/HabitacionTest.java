package ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase contiene pruebas unitarias para la clase Habitacion.
 * Se valida que los valores pasados al constructor sean correctamente retornados por los métodos getter.
 */
class HabitacionTest {

    @Test
    void testConstructorYGetters() {
        // Arrange: se preparan los datos de entrada
        int numeroEsperado = 101;
        String tipoEsperado = "Doble";
        double precioEsperado = 150.50;

        // Act: se crea una instancia de Habitacion con esos datos
        Habitacion habitacion = new Habitacion(numeroEsperado, tipoEsperado, precioEsperado);

        // Assert: se verifica que cada getter devuelva el valor correspondiente
        assertEquals(101, habitacion.getNumero(), "El número de habitación no coincide");
        assertEquals("Doble", habitacion.getTipo(), "El tipo de habitación no coincide");
        assertEquals(150.50, habitacion.getPrecio(), "El precio de habitación no coincide");
    }
}
