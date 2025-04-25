package ejercicio3;
// Un Curso está asociado con un Instructor, ya que cada Curso tiene un Instructor que lo
// imparte. Además, un Curso contiene una lista de Modulos. Los Modulos son agregados al Curso,
// pero pueden existir sin estar asociados a un Curso específico.

import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nombre;
    private Instructor instructor;
    private List<Modulo> modulos;

    public Curso(String nombre, Instructor instructor) {
        this.nombre = nombre;
        this.instructor = instructor;
        this.modulos = new ArrayList<>();
    }

    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public int calcularDuracionTotal() {
        int duracionTotal = 0;
        for (Modulo modulo : modulos) {
            duracionTotal += modulo.getDuracion();
        }
        return duracionTotal;
    }
}