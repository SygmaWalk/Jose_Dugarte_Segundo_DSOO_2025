package ejercicio1;
/**
 * Clase Hotel representa un establecimiento con habitaciones y reservas.
 * Tiene una relación de agregación con Habitacion y Reserva, ya que mantiene listas de estas entidades.
 * Las habitaciones y reservas pueden existir independientemente del hotel y se agregan desde fuera.
 */

import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void realizarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> obtenerReservasPorCliente(Persona cliente) {
        List<Reserva> reservasCliente = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.cliente.equals(cliente)) {
                reservasCliente.add(reserva);
            }
        }
        return reservasCliente;
    }
}