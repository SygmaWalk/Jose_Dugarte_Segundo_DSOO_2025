package Empleado;
public class Desarrollador extends Empleado {

    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return salario; // No hay bono ni comisión
    }
}
