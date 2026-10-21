
package edu.programacion.ejercicio2405;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un libro de la librería.
 *
 */
public class Libro {

    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private List<String> personajes;
    private int cantidadCopias;

    /**
     * Crea un libro con sus datos.
     *
     * @param titulo título del libro
     * @param autor autor del libro
     * @param fechaPublicacion fecha de publicación
     * @param cantidadCopias cantidad de copias disponibles
     */
    public Libro(String titulo, String autor,
                 LocalDate fechaPublicacion, int cantidadCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.cantidadCopias = cantidadCopias;
        this.personajes = new ArrayList<>();
    }

    /**
     * Obtiene el título del libro.
     *
     * @return título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Obtiene la fecha de publicación.
     *
     * @return fecha de publicación
     */
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Obtiene la lista de personajes.
     *
     * @return copia de la lista de personajes
     */
    public List<String> getPersonajes() {
        return new ArrayList<>(personajes);
    }

    /**
     * Agrega un personaje al libro.
     *
     * @param personaje nombre del personaje
     */
    public void agregarPersonaje(String personaje) {
        if (personaje != null && !personaje.isBlank()) {
            personajes.add(personaje);
        }
    }

    /**
     * Obtiene la cantidad de copias disponibles.
     *
     * @return cantidad de copias
     */
    public int getCantidadCopias() {
        return cantidadCopias;
    }

    /**
     * Modifica la cantidad de copias disponibles.
     *
     * @param cantidadCopias nueva cantidad de copias
     */
    public void setCantidadCopias(int cantidadCopias) {
        if (cantidadCopias >= 0) {
            this.cantidadCopias = cantidadCopias;
        }
    }

    /**
     * Representa el libro como texto.
     *
     * @return título, autor y stock
     */
    @Override
    public String toString() {
        return titulo + " - " + autor
                + " (copias: " + cantidadCopias + ")";
    }
}
