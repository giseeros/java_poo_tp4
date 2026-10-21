package edu.programacion.ejercicio2406;

/**
 * Representa un capítulo de una serie.
 *
 */
public class Capitulo {

    private String titulo;
    private int numero;

    /**
     * Crea un capítulo.
     *
     * @param titulo título del capítulo
     * @param numero número del capítulo
     */
    public Capitulo(String titulo, int numero) {
        this.titulo = titulo;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + ". " + titulo;
    }
}