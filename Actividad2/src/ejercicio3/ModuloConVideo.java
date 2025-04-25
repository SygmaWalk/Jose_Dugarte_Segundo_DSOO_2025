package ejercicio3;
// ModuloConVideo es una clase hija que hereda de Modulo. Esta clase extiende la funcionalidad
// de Modulo añadiendo una URL de video, lo que la convierte en una especialización de Modulo.
// La relación entre Modulo y ModuloConVideo es de Herencia.


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

