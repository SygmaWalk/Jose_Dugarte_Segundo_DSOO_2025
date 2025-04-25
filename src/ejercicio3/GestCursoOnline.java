import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



class Recurso {
    private String nombre;
    private String url;

    public Recurso(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }
}

class Modulo {
    private String titulo;
    private int duracion;
    private Recurso recurso;

    public Modulo(String titulo, int duracion, Recurso recurso) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.recurso = recurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public Recurso getRecurso() {
        return recurso;
    }
}

class ModuloConVideo extends Modulo {
    private String urlVideo;

    public ModuloConVideo(String titulo, int duracion, Recurso recurso, String urlVideo) {
        super(titulo, duracion, recurso);
        this.urlVideo = urlVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }
}

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

class Inscripcion {
    private Estudiante estudiante;
    private Curso curso;
    private LocalDate fechaInscripcion;

    public Inscripcion(Estudiante estudiante, Curso curso, LocalDate fechaInscripcion) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fechaInscripcion = fechaInscripcion;
    }
}

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
            if (inscripcion.estudiante.equals(estudiante)) {
                cursosEstudiante.add(inscripcion.curso);
            }
        }
        return cursosEstudiante;
    }
}