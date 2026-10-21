package edu.programacion.ejercicio2408;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una empresa que administra empleados.
 *
 */
public class Empresa {

    private List<Empleado> empleados;

    /**
     * Crea una empresa sin empleados.
     */
    public Empresa() {
        empleados = new ArrayList<>();
    }

    /**
     * Agrega un empleado a la empresa.
     *
     * @param empleado empleado que se desea agregar
     */
    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            empleados.add(empleado);
        }
    }

    /**
     * Calcula el monto total de los sueldos.
     *
     * @return suma de los sueldos de todos los empleados
     */
    public double montoTotal() {
        double total = 0;

        for (Empleado empleado : empleados) {
            total += empleado.calcularSueldo();
        }

        return total;
    }

    /**
     * Obtiene la cantidad de empleados registrados.
     *
     * @return cantidad de empleados
     */
    public int cantidadDeEmpleados() {
        return empleados.size();
    }
}