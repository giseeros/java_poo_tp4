package edu.programacion.ejercicio2406;

/**
 * Representa una persona del sistema audiovisual.
 *
 */
public class Persona {

    private String nombre;
    private String apellido;

    /**
     * Crea una persona.
     *
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     */
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}