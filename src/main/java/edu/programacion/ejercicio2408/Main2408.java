package edu.programacion.ejercicio2408;

/**
 * Clase principal para probar la jerarquía de empleados.
 *
 */
public class Main2408 {

    /**
     * Ejecuta las pruebas del ejercicio.
     *
     * @param args argumentos de ejecución
     */
    public static void main(String[] args) {

        // Creamos la empresa.
        Empresa empresa = new Empresa();

        // Creamos un empleado administrativo.
        Administrativo administrativo = new Administrativo(
                "Ana Pérez",
                "100",
                "Rojas",
                1990,
                "F",
                3,
                5
        );

        // Creamos un empleado técnico.
        Tecnico tecnico = new Tecnico(
                "Luis Gómez",
                "200",
                "Rojas",
                1985,
                "M",
                "Técnico en sistemas",
                500000
        );

        // Agregamos los empleados a la empresa.
        empresa.agregarEmpleado(administrativo);
        empresa.agregarEmpleado(tecnico);

        // Mostramos los sueldos individuales.
        System.out.println("Sueldo administrativo: "
                + administrativo.calcularSueldo());

        System.out.println("Sueldo técnico: "
                + tecnico.calcularSueldo());

        // Mostramos el monto total.
        System.out.println("Monto total de la empresa: "
                + empresa.montoTotal());

        // Mostramos la cantidad de empleados.
        System.out.println("Cantidad de empleados: "
                + empresa.cantidadDeEmpleados());
    }
}