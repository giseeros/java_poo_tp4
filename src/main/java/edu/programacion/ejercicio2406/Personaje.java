package edu.programacion.ejercicio2406;

/**
 * Representa un personaje de una película o serie.
 *
 */
public class Personaje {

    private String nombre;
    private Actor actor;

    /**
     * Crea un personaje.
     *
     * @param nombre nombre del personaje
     * @param actor actor que lo interpreta
     */
    public Personaje(String nombre, Actor actor) {
        this.nombre = nombre;
        this.actor = actor;
    }

    public String getNombre() {
        return nombre;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return nombre + " (interpretado por " + actor + ")";
    }
}