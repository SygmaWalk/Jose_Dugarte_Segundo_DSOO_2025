package ejercicio2;

// Relación con Prestamo:
// Un lector puede realizar varios préstamos de libros, y esta relación es de Asociación.
// El lector no depende directamente del préstamo, pero el préstamo necesita un lector para registrarse.

class Lector {
    private int numeroSocio;
    private String nombre;
    private String direccion;

    public Lector(int numeroSocio, String nombre, String direccion) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}