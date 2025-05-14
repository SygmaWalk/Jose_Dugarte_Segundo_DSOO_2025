package Banco;

public class BancoB extends Banco {

    @Override
    public double calcularInteres(double monto, int plazoEnMeses) {
        double tasaMensual = 0.07 / 12; // 7% anual
        return monto * tasaMensual * plazoEnMeses;
    }
}
