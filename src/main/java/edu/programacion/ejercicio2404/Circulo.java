package edu.programacion.ejercicio2404;

/**
 * Representa un círculo.
 *
 * @author Gisela Acosta
 * @version 1.0
 */
public class Circulo extends Figura {

    /**
     * Radio del círculo.
     */
    private double radio;

    /**
     * Crea un círculo.
     *
     * @param color color del círculo
     * @param radio radio del círculo
     */
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    /**
     * Obtiene el radio.
     *
     * @return radio del círculo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Modifica el radio.
     *
     * @param radio nuevo radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área del círculo.
     *
     * @return área del círculo
     */
    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
}