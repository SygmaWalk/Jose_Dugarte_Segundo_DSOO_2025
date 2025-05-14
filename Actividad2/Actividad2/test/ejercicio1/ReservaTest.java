package ejercicio1;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    // Test para verificar que se calcula correctamente la duración en días de una reserva
    @Test
    void testCalcularDuracion() {
        // Creamos los objetos necesarios: cliente, habitación y fechas
        Persona cliente = new Persona("Juan", "Pérez", "12345678");
        Habitacion habitacion = new Habitacion(101, "Simple", 100.0);
        LocalDate inicio = LocalDate.of(2023, 1, 1);
        LocalDate fin = LocalDate.of(2023, 1, 5);

        // Creamos la reserva
        Reserva reserva = new Reserva(cliente, habitacion, inicio, fin);

        // Verificamos que la duración sea de 4 días
        assertEquals(4, reserva.calcularDuracion());
    }

    // Test para verificar que el cálculo del costo total es correcto
    @Test
    void testCalcularCostoTotal() {
        // Datos de prueba: habitación cuesta 150 por noche y la estadía dura 3 días
        Persona cliente = new Persona("Ana", "Gómez", "87654321");
        Habitacion habitacion = new Habitacion(102, "Doble", 150.0);
        LocalDate inicio = LocalDate.of(2023, 2, 1);
        LocalDate fin = LocalDate.of(2023, 2, 4);

        // Creamos la reserva
        Reserva reserva = new Reserva(cliente, habitacion, inicio, fin);

        // Verificamos que el costo total sea 150 * 3 = 450.0
        assertEquals(450.0, reserva.calcularCostoTotal());
    }
}
