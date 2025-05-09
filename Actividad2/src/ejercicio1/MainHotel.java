package ejercicio1;
/*

Asociación: La clase Reserva tiene una asociación con las clases Persona y Habitación, ya que una reserva está asociada a un cliente y una habitación.
Agregación: La clase Hotel tiene una agregación con las clases Habitación y Reserva, ya que un hotel contiene habitaciones y reservas, pero las habitaciones y reservas pueden existir independientemente del hotel.
Composición: La clase Reserva contiene una instancia de la clase Pago, la cual se crea en el constructor de reserva. La clase pago no tiene sentido fuera del contexto de una reserva, por lo que es una composición.

*/
import java.time.LocalDate;
import java.util.List;

//... (Clases Persona, Habitacion, HabitacionVIP, Pago, Reserva, Hotel - como en la respuesta anterior)

public class MainHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Paraiso", "Calle Principal 123");

        Habitacion habitacion1 = new Habitacion(101, "Doble", 100.0);
        HabitacionVIP habitacionVIP = new HabitacionVIP(201, 200.0, List.of("Jacuzzi", "Vista al mar"));

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacionVIP);

        Persona cliente = new Persona("Juan", "Perez", "12345678A");
        Reserva reserva = new Reserva(cliente, habitacion1, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 5));

        hotel.realizarReserva(reserva);

        System.out.println("Reservas de " + cliente.getNombre() + ": " + hotel.obtenerReservasPorCliente(cliente));
    }
}