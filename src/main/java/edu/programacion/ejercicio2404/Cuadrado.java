package edu.programacion.ejercicio2404;

/**
 * Representa un cuadrado.
 *
 * @author Gisela Acosta
 * @version 1.0
 */
public class Cuadrado extends Figura {

    /**
     * Longitud del lado del cuadrado.
     */
    private double lado;

    /**
     * Crea un cuadrado.
     *
     * @param color color del cuadrado
     * @param lado longitud del lado
     */
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    /**
     * Obtiene el lado.
     *
     * @return longitud del lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * Modifica el lado.
     *
     * @param lado nueva longitud del lado
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área del cuadrado.
     *
     * @return área del cuadrado
     */
    @Override
    public double getArea() {
        return lado * lado;
    }
}
