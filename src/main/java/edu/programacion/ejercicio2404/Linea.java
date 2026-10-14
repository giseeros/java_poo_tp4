package edu.programacion.ejercicio2404;

/**
 * Representa una línea.
 *
 * <p>Una línea no posee superficie, por lo tanto
 * su área es cero.</p>
 *
 * @author Gisela Acosta
 * @version 1.0
 */
public class Linea extends Figura {

    /**
     * Longitud de la línea.
     */
    private double longitud;

    /**
     * Crea una línea.
     *
     * @param color color de la línea
     * @param longitud longitud de la línea
     */
    public Linea(String color, double longitud) {
        super(color);
        this.longitud = longitud;
    }

    /**
     * Obtiene la longitud.
     *
     * @return longitud de la línea
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Modifica la longitud.
     *
     * @param longitud nueva longitud
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Una línea no tiene área.
     *
     * @return siempre devuelve 0
     */
    @Override
    public double getArea() {
        return 0;
    }
}