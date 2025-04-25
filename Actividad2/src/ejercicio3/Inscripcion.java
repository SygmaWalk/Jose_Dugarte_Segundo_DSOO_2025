package ejercicio3;
// Una Inscripción está asociada tanto a un Estudiante como a un Curso. Un Estudiante puede
// inscribirse en varios Cursos, y un Curso puede tener múltiples Inscripciones. Esto es una
// relación de Asociación entre Estudiante, Inscripción y Curso.

import java.time.LocalDate;

class Inscripcion {
    private Estudiante estudiante;
    private Curso curso;
    private LocalDate fechaInscripcion;

    public Inscripcion(Estudiante estudiante, Curso curso, LocalDate fechaInscripcion) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fechaInscripcion = fechaInscripcion;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}