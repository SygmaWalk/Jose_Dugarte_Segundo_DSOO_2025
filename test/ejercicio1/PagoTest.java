package ejercicio1;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba unitaria para la clase Pago, validada a través de la clase Reserva.
 */
class PagoTest {

    @Test
    void testPagoDesdeReserva() {
        // Arrange: crear los objetos necesarios para la prueba
        Habitacion habitacion = new Habitacion(201, "Suite", 200.0); // Precio de la habitación
        Persona cliente = new Persona("Carlos", "Gómez", "98765432");
        LocalDate inicio = LocalDate.of(2025, 6, 1);
        LocalDate fin = LocalDate.of(2025, 6, 4); // Duración de 3 días
        Reserva reserva = new Reserva(cliente, habitacion, inicio, fin);

        // Cálculo esperado del costo (200.0 * 3 días)
        double costoEsperado = 200.0 * 3;

        // Print para visualizar la duración y el costo
        System.out.println(">>> Se generó una reserva de " + reserva.calcularDuracion() + " días.");
        System.out.println(">>> Costo total calculado para la reserva: $" + reserva.calcularCostoTotal());

        // Assert: verificamos que el monto del pago sea el esperado
        assertEquals(costoEsperado, reserva.calcularCostoTotal(), "El costo total del pago no coincide con lo esperado");
    }
}
