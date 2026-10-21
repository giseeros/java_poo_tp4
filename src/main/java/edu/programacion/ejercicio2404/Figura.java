package edu.programacion.ejercicio2404;

/**
 * Clase abstracta que representa una figura geométrica.
 *
 * <p>Define las características y comportamientos
 * comunes a todas las figuras.</p>
 *
 * @author Gisela Acosta
 * @version 1.0
 */
public abstract class Figura {

    /**
     * Color de la figura.
     */
    private String color;

    /**
     * Crea una figura con el color indicado.
     *
     * @param color color de la figura
     */
    public Figura(String color) {
        this.color = color;
    }

    /**
     * Obtiene el color de la figura.
     *
     * @return color de la figura
     */
    public String getColor() {
        return color;
    }

    /**
     * Modifica el color de la figura.
     *
     * @param color nuevo color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Calcula el área de la figura.
     *
     * @return área de la figura
     */
    public abstract double getArea();

    /**
     * Pinta la figura mostrando su color.
     */
    public void pintar() {
        System.out.println("Pintando FIGURA " + color);
    }
}