package ejercicio1;
/**
 * Clase Reserva representa una reserva en el hotel, asociada a un cliente (Persona),
 * una habitación, una fecha de inicio y fin, y un pago.
 *
 * Relaciones:
 * - Asociación con Persona y Habitacion.
 * - Composición con Pago, ya que se instancia internamente.
 */


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Reserva {
    Persona cliente;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Pago pago;

    public Reserva(Persona cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pago = new Pago(calcularCostoTotal()); // Composición
    }

    public long calcularDuracion() {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }

    public double calcularCostoTotal() {
        return habitacion.getPrecio() * calcularDuracion();
    }
}