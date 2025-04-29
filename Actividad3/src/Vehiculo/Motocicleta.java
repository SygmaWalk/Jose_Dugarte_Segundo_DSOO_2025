package Vehiculo;
public class Motocicleta extends Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("La motocicleta acelera rápidamente al girar el acelerador.");
    }

    @Override
    public void frenar() {
        System.out.println("La motocicleta frena utilizando el freno delantero y trasero.");
    }
}
