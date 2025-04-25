package ejercicio3;
class Recurso {
    private String nombre;
    private String url;

    public Recurso(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }
}