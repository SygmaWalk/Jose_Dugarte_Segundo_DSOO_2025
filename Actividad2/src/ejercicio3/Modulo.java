package ejercicio3;
// Un Modulo contiene un Recurso específico. El Recurso es una parte integral del Modulo,
// lo que indica una relación de Composición. El Modulo no puede existir sin un Recurso.


class Modulo {
    private String titulo;
    private int duracion;
    private Recurso recurso;

    public Modulo(String titulo, int duracion, Recurso recurso) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.recurso = recurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public Recurso getRecurso() {
        return recurso;
    }
}