package ejercicio2;
// Relación con Libro:
// La biblioteca tiene varios libros, pero los libros pueden existir independientemente de la biblioteca.
// Esto indica una relación de Agregación entre Biblioteca y Libro, donde la biblioteca tiene una colección de libros.

// Relación con Lector:
// La biblioteca registra varios lectores, pero los lectores también pueden existir independientemente de la biblioteca.
// Esta es una relación de Agregación, ya que la biblioteca solo mantiene una lista de lectores.

// Relación con Prestamo:
// La biblioteca registra los préstamos realizados por los lectores, pero los préstamos pueden existir sin una biblioteca.
// Esta es una relación de Agregación, ya que la biblioteca mantiene una lista de préstamos realizados por sus lectores.

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libro> libros;
    private List<Lector> lectores;
    private List<Prestamo> prestamos;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
        this.lectores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarLector(Lector lector) {
        lectores.add(lector);
    }

    public void realizarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Prestamo> obtenerPrestamosPorLector(Lector lector) {
        List<Prestamo> prestamosLector = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            int a = prestamo.getLector().getNumeroSocio();
            if (a==lector.getNumeroSocio())
                prestamosLector.add(prestamo);
            }
        return prestamosLector;
    }
}