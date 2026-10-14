package edu.programacion.ejercicio2404;

/**
 * Representa un triángulo.
 *
 * @author Gisela Acosta
 * @version 1.0
 */
public class Triangulo extends Figura {

    /**
     * Base del triángulo.
     */
    private double base;

    /**
     * Altura del triángulo.
     */
    private double altura;

    /**
     * Crea un triángulo.
     *
     * @param color color del triángulo
     * @param base base del triángulo
     * @param altura altura del triángulo
     */
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene la base.
     *
     * @return base del triángulo
     */
    public double getBase() {
        return base;
    }

    /**
     * Modifica la base.
     *
     * @param base nueva base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Obtiene la altura.
     *
     * @return altura del triángulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Modifica la altura.
     *
     * @param altura nueva altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área del triángulo.
     *
     * @return área del triángulo
     */
    @Override
    public double getArea() {
        return base * altura / 2;
    }
}