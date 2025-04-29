package Banco;

public class BancoC extends Banco {

    @Override
    public double calcularInteres(double monto, int plazoEnMeses) {
        double tasaMensual = 0.03 / 12; // 3% anual
        return monto * tasaMensual * plazoEnMeses;
    }
}
