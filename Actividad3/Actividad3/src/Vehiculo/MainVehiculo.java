package Vehiculo;
public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        Vehiculo motocicleta = new Motocicleta();
        Vehiculo bicicleta = new Bicicleta();

        coche.acelerar();
        coche.frenar();

        System.out.println(); // Línea en blanco

        motocicleta.acelerar();
        motocicleta.frenar();

        System.out.println(); // Línea en blanco

        bicicleta.acelerar();
        bicicleta.frenar();
    }
}
