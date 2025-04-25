package ejercicio3;
// Un Estudiante está asociado con las Inscripciones que realiza en los Cursos.
// El Estudiante puede tener varias Inscripciones, pero puede existir sin ninguna inscripción.
// Esto representa una relación de Asociación entre Estudiante e Inscripción.

class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String email;

    public Estudiante(int idEstudiante, String nombre, String email) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.email = email;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}