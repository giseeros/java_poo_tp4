package edu.programacion.ejercicio2408;

/**
 * Representa un empleado técnico contratado.
 *
 */
public class Tecnico extends Empleado {

    private String titulo;
    private double montoContrato;

    /**
     * Crea un técnico con sus datos personales y contractuales.
     *
     * @param nombre nombre del técnico
     * @param dni documento de identidad
     * @param direccion domicilio
     * @param anioNacimiento año de nacimiento
     * @param sexo sexo del técnico
     * @param titulo título profesional
     * @param montoContrato monto establecido en el contrato
     */
    public Tecnico(String nombre, String dni, String direccion,
                   int anioNacimiento, String sexo,
                   String titulo, double montoContrato) {

        super(nombre, dni, direccion, anioNacimiento, sexo, "Técnico");

        if (montoContrato < 0) {
            throw new IllegalArgumentException(
                    "El monto del contrato no puede ser negativo.");
        }

        this.titulo = titulo;
        this.montoContrato = montoContrato;
    }

    /**
     * Obtiene el título profesional.
     *
     * @return título del técnico
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el monto del contrato.
     *
     * @return monto contractual
     */
    public double getMontoContrato() {
        return montoContrato;
    }

    /**
     * Calcula el sueldo del técnico.
     *
     * @return monto establecido en el contrato
     */
    @Override
    public double calcularSueldo() {
        return montoContrato;
    }
}