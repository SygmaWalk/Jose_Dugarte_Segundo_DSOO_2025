package Banco;
    public class MainBanco {
        public static void main(String[] args) {
            Banco bancoA = new BancoA();
            Banco bancoB = new BancoB();
            Banco bancoC = new BancoC();

            double monto = 10000; // 10.000 pesos
            int plazo = 12; // 12 meses

            System.out.println("Interés en Banco A: $" + bancoA.calcularInteres(monto, plazo));
            System.out.println("Interés en Banco B: $" + bancoB.calcularInteres(monto, plazo));
            System.out.println("Interés en Banco C: $" + bancoC.calcularInteres(monto, plazo));
        }
    }
