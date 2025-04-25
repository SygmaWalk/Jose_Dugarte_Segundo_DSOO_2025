package ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibroElectronicoTest {

    @Test
    public void testLibroElectronicoCreacionYAcceso() {
        System.out.println("📘 Creando autor y editorial...");
        Autor autor = new Autor("Isaac Asimov", "Rusia");
        Editorial editorial = new Editorial("Galaxia Gutenberg", "Barcelona");

        System.out.println("💻 Creando libro electrónico...");
        LibroElectronico ebook = new LibroElectronico(
                "Fundación",
                "978-84-9065-123-1",
                autor,
                editorial,
                "PDF"
        );

        System.out.println("✅ Verificando título...");
        assertEquals("Fundación", ebook.getTitulo(), "❌ El título del libro electrónico no coincide.");
        System.out.println("✔️ Título verificado: " + ebook.getTitulo());

        System.out.println("✅ Verificando ISBN...");
        assertEquals("978-84-9065-123-1", ebook.getIsbn(), "❌ El ISBN del libro electrónico no coincide.");
        System.out.println("✔️ ISBN verificado: " + ebook.getIsbn());

        System.out.println("✅ Verificando autor...");
        assertEquals("Isaac Asimov", ebook.getAutor().getNombre(), "❌ El autor del libro electrónico no coincide.");
        System.out.println("✔️ Autor verificado: " + ebook.getAutor().getNombre());

        System.out.println("✅ Verificando editorial...");
        assertEquals("Galaxia Gutenberg", ebook.getEditorial().getNombre(), "❌ La editorial del libro electrónico no coincide.");
        System.out.println("✔️ Editorial verificada: " + ebook.getEditorial().getNombre());

        System.out.println("✅ Verificando formato...");
        assertEquals("PDF", ebook.getFormato(), "❌ El formato del libro electrónico no coincide.");
        System.out.println("✔️ Formato verificado: " + ebook.getFormato());

        System.out.println("🎉 Prueba completada con éxito para LibroElectronico.");
    }
}
