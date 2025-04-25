package ejercicio1;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba unitaria para la clase Hotel.
 * Incluye prints para visualizar el proceso de prueba.
 */
class HotelTest {

    @Test
    void testAgregarHabitacionYRealizarReserva() {
        // Arrange: se crean las instancias necesarias
        Hotel hotel = new Hotel("Hotel del Lago", "Av. Costanera 123");
        Habitacion habitacion = new Habitacion(101, "Doble", 150.0);
        Persona cliente = new Persona("Ana", "Pérez", "12345678");
        LocalDate inicio = LocalDate.of(2025, 5, 10);
        LocalDate fin = LocalDate.of(2025, 5, 15);
        Reserva reserva = new Reserva(cliente, habitacion, inicio, fin);

        System.out.println(">>> Se creó una habitación: " + habitacion.getNumero() + ", tipo: " + habitacion.getTipo());
        System.out.println(">>> Se creó una reserva del " + inicio + " al " + fin + " para " + cliente.getNombre());

        // Act: se agregan los objetos al hotel
        hotel.agregarHabitacion(habitacion);
        hotel.realizarReserva(reserva);
        List<Reserva> reservasDeAna = hotel.obtenerReservasPorCliente(cliente);

        // Visualizar reservas obtenidas
        System.out.println(">>> Total de reservas encontradas para el cliente: " + reservasDeAna.size());

        // Assert: se verifica el comportamiento
        assertEquals(1, reservasDeAna.size(), "El cliente debería tener una reserva");
        assertEquals(reserva, reservasDeAna.get(0), "La reserva obtenida no coincide");
    }
}
