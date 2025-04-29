package Figura;
public class MainFigura {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 3);
        Figura circulo = new Circulo(4);
        Figura triangulo = new Triangulo(6, 2);

        System.out.println(rectangulo.getNombre() + " - Área: " + rectangulo.calcularArea());
        System.out.println(circulo.getNombre() + " - Área: " + circulo.calcularArea());
        System.out.println(triangulo.getNombre() + " - Área: " + triangulo.calcularArea());
    }
}
