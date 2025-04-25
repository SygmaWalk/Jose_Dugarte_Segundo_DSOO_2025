package ejercicio1;
/**
 * Clase HabitacionVIP extiende a Habitacion, lo que implica una relación de Herencia.
 * Representa una especialización de Habitacion con servicios adicionales.
 */

import java.util.List;

class HabitacionVIP extends Habitacion {
    private List<String> serviciosExtra;

    public HabitacionVIP(int numero, double precio, List<String> serviciosExtra) {
        super(numero, "VIP", precio);
        this.serviciosExtra = serviciosExtra;
    }

    public List<String> getServiciosExtra() {
        return serviciosExtra;
    }
}