package ejercicio3;
/*

Asociación: Las clases Curso e Inscripcion tienen asociaciones con las clases Instructor y Estudiante, respectivamente.
Agregación: La clase Plataforma tiene agregación con las clases Curso, Estudiante e Inscripcion.
Composición: La clase Modulo contiene una instancia de la clase Recurso, la cual se crea en el constructor de modulo. La clase recurso no tiene sentido fuera del contexto de un módulo, por lo que es una composición.


*/

import java.time.LocalDate;

//... (Clases Instructor, Recurso, Modulo, ModuloConVideo, Curso, Estudiante, Inscripcion, Plataforma - como en la respuesta anterior)

public class MainPlataforma {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma("Platzi");

        Instructor instructor = new Instructor("Andres Perez", "Desarrollo Web");
        Recurso recurso = new Recurso("Introduccion", "www.ejemplo.com");
        Modulo modulo1 = new Modulo("HTML Basico", 2, recurso);
        ModuloConVideo moduloConVideo = new ModuloConVideo("CSS Avanzado", 3, recurso, "www.video.com");
        Curso curso = new Curso("Desarrollo Web", instructor);
        curso.agregarModulo(modulo1);
        curso.agregarModulo(moduloConVideo);

        plataforma.agregarCurso(curso);

        Estudiante estudiante = new Estudiante(1, "Ana Rodriguez", "ana@ejemplo.com");
        plataforma.registrarEstudiante(estudiante);

        Inscripcion inscripcion = new Inscripcion(estudiante, curso, LocalDate.of(2023, 10, 1));
        plataforma.inscribirEstudiante(inscripcion);

        System.out.println("Cursos de " + estudiante.getNombre() + ": " + plataforma.obtenerCursosPorEstudiante(estudiante));
    }
}