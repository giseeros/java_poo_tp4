package edu.programacion.ejercicio2408;

/**
 * Representa un empleado de una empresa.
 *
 * Hereda los datos personales de Persona.
 *
 */
public abstract class Empleado extends Persona {

    private String funcion;

    /**
     * Crea un empleado con sus datos personales y su función.
     *
     * @param nombre nombre del empleado
     * @param dni documento de identidad
     * @param direccion domicilio
     * @param anioNacimiento año de nacimiento
     * @param sexo sexo del empleado
     * @param funcion función dentro de la empresa
     */
    public Empleado(String nombre, String dni, String direccion,
                    int anioNacimiento, String sexo, String funcion) {

        super(nombre, dni, direccion, anioNacimiento, sexo);
        this.funcion = funcion;
    }

    /**
     * Obtiene la función del empleado.
     *
     * @return función desempeñada
     */
    public String getFuncion() {
        return funcion;
    }

    /**
     * Calcula el sueldo del empleado.
     *
     * Cada tipo de empleado implementa su propio cálculo.
     *
     * @return sueldo correspondiente
     */
    public abstract double calcularSueldo();
}