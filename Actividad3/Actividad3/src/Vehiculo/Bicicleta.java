package Vehiculo;
public class Bicicleta extends Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("La bicicleta acelera cuando el ciclista pedalea más rápido.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta frena usando las manetas de freno.");
    }
}
