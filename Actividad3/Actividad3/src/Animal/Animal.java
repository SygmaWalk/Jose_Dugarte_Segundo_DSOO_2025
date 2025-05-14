package Animal;
public abstract class Animal {

    // Metodo abstracto: obligación de las clases hijas de implementarlo
    public abstract void hacerSonido();

    // Métodos concretos: ya vienen con comportamiento por defecto
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    public void comer() {
        System.out.println("El animal está comiendo.");
    }
}
