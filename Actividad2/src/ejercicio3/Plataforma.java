package ejercicio3;
// La Plataforma es responsable de gestionar Cursos, Estudiantes e Inscripciones.
// La relación con los Cursos, Estudiantes e Inscripciones es de Agregación, ya que la Plataforma
// mantiene una lista de estos objetos, pero cada uno puede existir independientemente de la Plataforma.

import java.util.ArrayList;
import java.util.List;

class Plataforma {
    private String nombre;
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;
    private List<Inscripcion> inscripciones;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void inscribirEstudiante(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }

    public List<Curso> obtenerCursosPorEstudiante(Estudiante estudiante) {
        List<Curso> cursosEstudiante = new ArrayList<>();
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getEstudiante().equals(estudiante)) {
                cursosEstudiante.add(inscripcion.getCurso());
            }
        }
        return cursosEstudiante;
    }
}