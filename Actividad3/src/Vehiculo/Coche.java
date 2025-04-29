package Vehiculo;
public class Coche extends Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("El coche acelera aumentando la velocidad gradualmente.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche frena utilizando los frenos hidráulicos.");
    }
}
