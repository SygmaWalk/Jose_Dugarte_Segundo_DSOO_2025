package ejercicio2;
// Relación con Lector:
// Un préstamo está relacionado con un lector que realiza el préstamo. La relación es de Asociación,
// ya que un préstamo necesita un lector para registrarse, pero los préstamos pueden existir sin un lector específico.

// Relación con Libro:
// Un préstamo también está relacionado con un libro. Un préstamo tiene un solo libro,
// lo que implica una relación de Asociación entre ambas clases.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private Lector lector;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Lector lector, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.lector = lector;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public long calcularDiasPrestamo() {
        return ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
    }
}