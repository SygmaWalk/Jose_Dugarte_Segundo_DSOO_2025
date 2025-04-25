package ejercicio3;
// Un Instructor está asociado a los Cursos que imparte. Es decir, un Instructor puede
// estar relacionado con varios Cursos, pero el Instructor puede existir sin estar
// asociado a un Curso específico. Esto es una relación de Asociación entre Instructor y Curso.


class Instructor {
    private String nombre;
    private String especialidad;

    public Instructor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}