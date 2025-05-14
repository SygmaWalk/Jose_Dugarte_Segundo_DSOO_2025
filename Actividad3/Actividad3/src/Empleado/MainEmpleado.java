package Empleado;
public class MainEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Ana", 50000, 10000);
        Empleado vendedor = new Vendedor("Carlos", 30000, 5000);
        Empleado desarrollador = new Desarrollador("Lucía", 40000);

        System.out.println(gerente.getNombre() + " - Salario total: $" + gerente.calcularSalario());
        System.out.println(vendedor.getNombre() + " - Salario total: $" + vendedor.calcularSalario());
        System.out.println(desarrollador.getNombre() + " - Salario total: $" + desarrollador.calcularSalario());
    }
}
