
package edu.programacion.ejercicio2405;

import java.time.LocalDate;

/**
 * Clase principal para probar la librería.
 *
 */
public class Main2405 {

    /**
     * Ejecuta las pruebas del ejercicio.
     *
     * @param args argumentos de ejecución
     */
    public static void main(String[] args) {

        // Creamos la librería.
        Libreria libreria = new Libreria();

        // Creamos dos libros.
        Libro libro1 = new Libro(
                "El Principito",
                "Antoine de Saint-Exupéry",
                LocalDate.of(1943, 4, 6),
                5
        );

        Libro libro2 = new Libro(
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                LocalDate.of(1605, 1, 16),
                3
        );

        // Agregamos personajes al primer libro.
        libro1.agregarPersonaje("El Principito");
        libro1.agregarPersonaje("El zorro");

        // Agregamos los libros a la librería.
        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);

        // Mostramos la cantidad de libros.
        System.out.println("Cantidad de libros: "
                + libreria.cantidadDeLibros());

        // Mostramos el total de copias.
        System.out.println("Cantidad total de copias: "
                + libreria.cantidadTotalDeCopias());

        // Eliminamos el primer libro.
        libreria.eliminarLibro(libro1);

        // Mostramos los resultados después de eliminar.
        System.out.println("Libros después de eliminar: "
                + libreria.cantidadDeLibros());

        System.out.println("Copias después de eliminar: "
                + libreria.cantidadTotalDeCopias());
    }
}