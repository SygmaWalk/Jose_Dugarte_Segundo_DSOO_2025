package Animal;
public class MainAnimal {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal caballo = new Caballo();

        perro.hacerSonido();
        perro.dormir();
        perro.comer();

        System.out.println(); // Línea en blanco para separar

        gato.hacerSonido();
        gato.dormir();
        gato.comer();

        System.out.println(); // Línea en blanco para separar

        caballo.hacerSonido();
        caballo.dormir();
        caballo.comer();
    }
}
