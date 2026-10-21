package edu.programacion.ejercicio2407;

/**
 * Representa una persona identificada por su DNI.
 *
 */
public class Persona {

    private String nombre;
    private String dni;

    /**
     * Crea una persona.
     *
     * @param nombre nombre de la persona
     * @param dni documento de identidad
     */
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Obtiene el nombre.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el DNI.
     *
     * @return documento de identidad
     */
    public String getDni() {
        return dni;
    }

    /**
     * Compara dos personas por su DNI.
     *
     * @param objeto objeto que se desea comparar
     * @return true si ambas personas tienen el mismo DNI
     */
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (!(objeto instanceof Persona)) {
            return false;
        }

        Persona otra = (Persona) objeto;
        return dni.equals(otra.dni);
    }

    /**
     * Genera el código hash de la persona usando su DNI.
     *
     * @return código hash
     */
    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    /**
     * Devuelve los datos de la persona.
     *
     * @return nombre y DNI
     */
    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
}