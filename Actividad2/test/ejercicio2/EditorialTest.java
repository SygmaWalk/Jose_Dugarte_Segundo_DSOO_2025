package ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EditorialTest {

    @Test
    public void testCreacionYAccesoEditorial() {
        System.out.println("🏢 Creando una nueva editorial...");
        Editorial editorial = new Editorial("Alfaguara", "Av. Corrientes 1234");

        System.out.println("✅ Verificando nombre...");
        assertEquals("Alfaguara", editorial.getNombre(), "❌ El nombre de la editorial no coincide.");
        System.out.println("✔️ Nombre verificado: " + editorial.getNombre());

        System.out.println("✅ Verificando dirección...");
        assertEquals("Av. Corrientes 1234", editorial.getDirección(), "❌ La dirección de la editorial no coincide.");
        System.out.println("✔️ Dirección verificada: " + editorial.getDirección());

        System.out.println("🎉 Prueba completada con éxito para Editorial.");
    }
}
