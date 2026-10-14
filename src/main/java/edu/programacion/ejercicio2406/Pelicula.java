
public class Pelicula extends ContenidoAudiovisual {

    private int duracion;

    public Pelicula(String titulo, int anio, int duracion) {
        super(titulo, anio);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
