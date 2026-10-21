package edu.programacion.ejercicio2402;

/**
 * Representa una fotografía que puede formar parte de un álbum.
 *
 * Cada fotografía posee un nombre y una descripción.
 *
 *
 */
public class Fotografia {

    /**
     * Nombre de la fotografía.
     */
    private String nombre;

    /**
     * Descripción de la fotografía.
     */
    private String descripcion;

    /**
     * Crea una fotografía indicando solamente su nombre.
     *
     * @param nombre nombre de la fotografía
     */
    public Fotografia(String nombre) {
        this(nombre, "");
    }

    /**
     * Crea una fotografía indicando su nombre y descripción.
     *
     * @param nombre nombre de la fotografía
     * @param descripcion descripción de la fotografía
     */
    public Fotografia(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre de la fotografía.
     *
     * @return nombre de la fotografía
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la fotografía.
     *
     * @param nombre nuevo nombre de la fotografía
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la fotografía.
     *
     * @return descripción de la fotografía
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción de la fotografía.
     *
     * @param descripcion nueva descripción de la fotografía
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el nombre de la fotografía como representación textual.
     *
     * @return nombre de la fotografía
     */
    @Override
    public String toString() {
        return nombre;
    }
}