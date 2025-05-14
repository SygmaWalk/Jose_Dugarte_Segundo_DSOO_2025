package Empleado;
public abstract class Empleado {
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Metodo abstracto
    public abstract double calcularSalario();

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}
