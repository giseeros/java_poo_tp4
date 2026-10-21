package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una película.
 *
 */
public class Pelicula {

    private String titulo;
    private int anio;
    private Director director;
    private List<Actor> actores;
    private List<Personaje> personajes;

    /**
     * Crea una película.
     *
     * @param titulo título de la película
     * @param anio año de estreno
     * @param director director de la película
     */
    public Pelicula(String titulo, int anio, Director director) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        this.actores = new ArrayList<>();
        this.personajes = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        if (actor != null) {
            actores.add(actor);
        }
    }

    public void agregarPersonaje(Personaje personaje) {
        if (personaje != null) {
            personajes.add(personaje);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActores() {
        return new ArrayList<>(actores);
    }

    public List<Personaje> getPersonajes() {
        return new ArrayList<>(personajes);
    }

    @Override
    public String toString() {
        return "Película: " + titulo
                + " (" + anio + ")"
                + "\nDirector: " + director
                + "\nActores: " + actores
                + "\nPersonajes: " + personajes;
    }
}