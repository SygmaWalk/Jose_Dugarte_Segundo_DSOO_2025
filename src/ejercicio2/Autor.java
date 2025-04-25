package ejercicio2;
// Relación con Libro:
// Un autor puede estar asociado a varios libros, pero cada libro tiene solo un autor.
// Esta relación es de tipo Asociación, ya que el autor no depende directamente del libro y viceversa.

class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}