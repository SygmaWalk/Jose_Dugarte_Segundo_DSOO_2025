package ejercicio2;/*

Asociación: Las clases Libro y Prestamo tienen asociaciones con las clases Autor y Lector, respectivamente.
Agregación: La clase Biblioteca tiene agregación con las clases Libro, Lector y Prestamo.
Composición: La clase Libro contiene una instancia de la clase Editorial, la cual se crea en el constructor de libro. La clase editorial no tiene sentido fuera del contexto de un libro, por lo que es una composición.


*/


import java.time.LocalDate;

//... (Clases Autor, Editorial, Libro, LibroElectronico, Lector, Prestamo, Biblioteca - como en la respuesta anterior)

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Avenida Principal 456");

        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiano");
        Editorial editorial1 = new Editorial("Planeta", "Calle falsa 123");
        Libro libro1 = new Libro("Cien años de soledad", "978-0679729584", autor1, editorial1);
        LibroElectronico libroElectronico = new LibroElectronico("El Aleph", "978-8445076044", autor1, editorial1, "PDF");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libroElectronico);

        Lector lector1 = new Lector(1, "Maria Gomez", "Calle secundaria 789");
        biblioteca.registrarLector(lector1);

        Prestamo prestamo = new Prestamo(lector1, libro1, LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 15));
        biblioteca.realizarPrestamo(prestamo);

        System.out.println("Prestamos de " + lector1.getNombre() + ": " + biblioteca.obtenerPrestamosPorLector(lector1));
    }
}