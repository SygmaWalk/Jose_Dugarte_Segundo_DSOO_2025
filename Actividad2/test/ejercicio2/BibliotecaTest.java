package ejercicio2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
    public void testBibliotecaFuncionesBasicas() {
        System.out.println("📚 Creando biblioteca...");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Calle Falsa 123");

        System.out.println("🖊️ Creando autor, editorial y libro...");
        Autor autor = new Autor("Julio Verne", "Francia");
        Editorial editorial = new Editorial("Plutón Ediciones", "Madrid");
        Libro libro = new Libro("Viaje al centro de la Tierra", "2233-4423", autor, editorial);

        System.out.println("📥 Agregando libro a la biblioteca...");
        biblioteca.agregarLibro(libro);

        System.out.println("👤 Creando lector y registrándolo...");
        Lector lector = new Lector(424, "Laura Torres", "Calle Falsa 4");
        biblioteca.registrarLector(lector);

        System.out.println("📖 Creando préstamo...");
        LocalDate fechaPrestamo = LocalDate.of(2025, 4, 20);
        LocalDate fechaDevolucion = LocalDate.of(2025, 4, 25);
        Prestamo prestamo = new Prestamo(lector, libro, fechaPrestamo, fechaDevolucion);

        System.out.println("💾 Registrando préstamo en la biblioteca...");
        biblioteca.realizarPrestamo(prestamo);

        System.out.println("🔎 Buscando préstamos del lector...");
        List<Prestamo> prestamosDelLector = biblioteca.obtenerPrestamosPorLector(lector);

        System.out.println("✅ Verificando cantidad de préstamos...");
        assertEquals(1, prestamosDelLector.size(), "❌ El lector debería tener un préstamo registrado.");
        System.out.println("✔️ Cantidad correcta de préstamos: " + prestamosDelLector.size());

        Prestamo prestamoObtenido = prestamosDelLector.get(0);

        System.out.println("✅ Verificando nombre del lector...");
        assertEquals("Laura Torres", prestamoObtenido.getLector().getNombre(), "❌ El nombre del lector no coincide.");
        System.out.println("✔️ Nombre del lector verificado correctamente: " + prestamoObtenido.getLector().getNombre());

        System.out.println("✅ Verificando título del libro...");
        assertEquals("Viaje al centro de la Tierra", prestamoObtenido.getLibro().getTitulo(), "❌ El libro del préstamo no coincide.");
        System.out.println("✔️ Título del libro verificado correctamente: " + prestamoObtenido.getLibro().getTitulo());

        System.out.println("🎉 Todas las verificaciones pasaron con éxito.");
    }
}
