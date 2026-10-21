package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una serie.
 *
 */
public class Serie {

    private String titulo;
    private int anio;
    private Director director;
    private List<Actor> actores;
    private List<Personaje> personajes;
    private List<Capitulo> capitulos;

    /**
     * Crea una serie.
     *
     * @param titulo título de la serie
     * @param anio año de inicio
     * @param director director de la serie
     */
    public Serie(String titulo, int anio, Director director) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        this.actores = new ArrayList<>();
        this.personajes = new ArrayList<>();
        this.capitulos = new ArrayList<>();
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

    public void agregarCapitulo(Capitulo capitulo) {
        if (capitulo != null) {
            capitulos.add(capitulo);
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

    public List<Capitulo> getCapitulos() {
        return new ArrayList<>(capitulos);
    }

    @Override
    public String toString() {
        return "Serie: " + titulo
                + " (" + anio + ")"
                + "\nDirector: " + director
                + "\nActores: " + actores
                + "\nPersonajes: " + personajes
                + "\nCapítulos: " + capitulos;
    }
}