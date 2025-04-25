package ejercicio2;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PrestamoTest {

    @Test
    public void testCalcularDiasPrestamo() {
        // Creamos un lector y un libro de prueba
        Lector lector = new Lector(203, "Carlos Ramírez", "Calle 16");
        Autor autor = new Autor("Gabriel García Márquez", "Colombia");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Cien Años de Soledad", "223-320", autor, editorial);

        // Fechas del préstamo y devolución
        LocalDate fechaPrestamo = LocalDate.of(2025, 4, 1);
        LocalDate fechaDevolucion = LocalDate.of(2025, 4, 10);

        // Crear el préstamo
        Prestamo prestamo = new Prestamo(lector, libro, fechaPrestamo, fechaDevolucion);

        // Imprimir detalles para verificar visualmente
        System.out.println("Lector del préstamo: " + prestamo.getLector().getNombre());
        System.out.println("Libro prestado: " + libro.getTitulo());
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Fecha de devolución: " + fechaDevolucion);
        System.out.println("Días de préstamo calculados: " + prestamo.calcularDiasPrestamo());

        // Verificar si los días de préstamo son los esperados (del 1 al 10 son 9 días)
        assertEquals(9, prestamo.calcularDiasPrestamo(), "Los días de préstamo no son correctos.");
    }
}
