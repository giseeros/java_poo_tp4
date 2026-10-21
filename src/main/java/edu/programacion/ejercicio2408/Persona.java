package edu.programacion.ejercicio2408;

/**
 * Representa una persona.
 *
 */
public class Persona {

    private String nombre;
    private String dni;
    private String direccion;
    private int anioNacimiento;
    private String sexo;

    /**
     * Crea una persona con sus datos.
     *
     * @param nombre nombre de la persona
     * @param dni documento de identidad
     * @param direccion domicilio
     * @param anioNacimiento año de nacimiento
     * @param sexo sexo de la persona
     */
    public Persona(String nombre, String dni, String direccion,
                   int anioNacimiento, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.anioNacimiento = anioNacimiento;
        this.sexo = sexo;
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
     * Obtiene la dirección.
     *
     * @return domicilio
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene el año de nacimiento.
     *
     * @return año de nacimiento
     */
    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    /**
     * Obtiene el sexo.
     *
     * @return sexo de la persona
     */
    public String getSexo() {
        return sexo;
    }
}
