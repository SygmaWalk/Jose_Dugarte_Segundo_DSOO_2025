package Empleado;
public class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salario, double comision) {
        super(nombre, salario);
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salario + comision;
    }
}
