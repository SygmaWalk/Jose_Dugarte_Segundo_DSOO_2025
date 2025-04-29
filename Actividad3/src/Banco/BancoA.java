package Banco;

public class BancoA extends Banco {

    @Override
    public double calcularInteres(double monto, int plazoEnMeses) {
        double tasaMensual = 0.05 / 12; // 5% anual dividido en 12 meses
        return monto * tasaMensual * plazoEnMeses;
    }
}
