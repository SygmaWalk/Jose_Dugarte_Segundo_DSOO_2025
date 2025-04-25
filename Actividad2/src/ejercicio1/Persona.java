package ejercicio1;
/**
 * Clase Persona representa una entidad básica que contiene datos personales.
 * En el contexto del sistema, es utilizada por otras clases (como Reserva) mediante una asociación.
 *
 * Tipo de relación esperada: Asociación (Reserva -> Persona).
 */

class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
}