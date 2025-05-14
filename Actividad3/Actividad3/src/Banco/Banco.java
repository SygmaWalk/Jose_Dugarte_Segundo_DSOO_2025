package Banco;

public abstract class Banco {

    // Metodo abstracto: todas las clases hijas estarán obligadas a implementarlo
    public abstract double calcularInteres(double monto, int plazoEnMeses);

}
