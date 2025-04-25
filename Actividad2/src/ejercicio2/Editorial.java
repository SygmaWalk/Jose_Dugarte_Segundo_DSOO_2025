package ejercicio2;
class Editorial{
    private String nombre;
    private String dirección;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.dirección = direccion;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDirección() {
        return dirección;
    }
}