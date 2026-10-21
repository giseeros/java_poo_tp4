package edu.programacion.ejercicio2408;

/**
 * Representa un empleado administrativo.
 *
 */
public class Administrativo extends Empleado {

    private int categoria;
    private int antiguedad;

    /**
     * Crea un empleado administrativo.
     *
     * @param nombre nombre del empleado
     * @param dni documento de identidad
     * @param direccion domicilio
     * @param anioNacimiento año de nacimiento
     * @param sexo sexo del empleado
     * @param categoria categoría del empleado
     * @param antiguedad años de antigüedad
     */
    public Administrativo(String nombre, String dni, String direccion,
                          int anioNacimiento, String sexo,
                          int categoria, int antiguedad) {

        super(nombre, dni, direccion, anioNacimiento, sexo,
                "Administrativo");

        if (categoria < 1 || categoria > 4) {
            throw new IllegalArgumentException(
                    "La categoría debe estar entre 1 y 4.");
        }

        if (antiguedad < 0) {
            throw new IllegalArgumentException(
                    "La antigüedad no puede ser negativa.");
        }

        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }

    /**
     * Obtiene la categoría del empleado.
     *
     * @return categoría
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * Obtiene la antigüedad del empleado.
     *
     * @return años de antigüedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Calcula el sueldo del administrativo.
     *
     * @return antigüedad multiplicada por categoría
     */
    @Override
    public double calcularSueldo() {
        return (double) antiguedad * categoria;
    }
}