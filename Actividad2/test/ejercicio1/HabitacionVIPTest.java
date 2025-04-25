package ejercicio1;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba unitaria para la clase HabitacionVIP.
 * Se valida que herede correctamente los atributos de Habitacion
 * y que almacene correctamente la lista de servicios extra.
 */
class HabitacionVIPTest {

    @Test
    void testConstructorYGetServiciosExtra() {
        // Arrange: datos de prueba
        int numeroEsperado = 201;
        double precioEsperado = 300.0;
        List<String> servicios = List.of("Jacuzzi", "Desayuno buffet", "Vista al mar");

        // Act: creación de la instancia
        HabitacionVIP habitacionVIP = new HabitacionVIP(numeroEsperado, precioEsperado, servicios);

        // Assert: verificación de atributos heredados
        assertEquals(numeroEsperado, habitacionVIP.getNumero(), "El número de habitación no coincide");
        assertEquals("VIP", habitacionVIP.getTipo(), "El tipo de habitación debería ser 'VIP'");
        assertEquals(precioEsperado, habitacionVIP.getPrecio(), "El precio no coincide");

        // Assert: verificación de los servicios extra
        assertEquals(servicios, habitacionVIP.getServiciosExtra(), "Los servicios extra no coinciden");
        //Muestra los servicios extras
        System.out.println(habitacionVIP.getServiciosExtra());

    }
}
