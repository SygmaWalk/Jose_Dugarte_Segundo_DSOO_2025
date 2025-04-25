package ejercicio2;
// Relación con Libro:
// La clase `LibroElectronico` extiende de `Libro`, lo que implica una relación de Herencia.
// Un libro electrónico es un tipo especializado de libro, con características adicionales como el formato.

class LibroElectronico extends Libro {
    private String formato;

    public LibroElectronico(String titulo, String isbn, Autor autor, Editorial editorial, String formato) {
        super(titulo, isbn, autor, editorial);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }
}