
package edu.programacion.ejercicio2405;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una librería que administra libros.
 *
 */
public class Libreria {

    private List<Libro> libros;

    /**
     * Crea una librería vacía.
     */
    public Libreria() {
        libros = new ArrayList<>();
    }

    /**
     * Agrega un libro a la colección.
     *
     * @param unLibro libro que se desea agregar
     */
    public void agregarLibro(Libro unLibro) {
        if (unLibro != null) {
            libros.add(unLibro);
        }
    }

    /**
     * Elimina un libro de la colección.
     *
     * @param unLibro libro que se desea eliminar
     */
    public void eliminarLibro(Libro unLibro) {
        libros.remove(unLibro);
    }

    /**
     * Cuenta los libros registrados en la librería.
     *
     * @return cantidad de libros
     */
    public int cantidadDeLibros() {
        return libros.size();
    }

    /**
     * Suma las copias disponibles de todos los libros.
     *
     * @return cantidad total de copias
     */
    public int cantidadTotalDeCopias() {
        int total = 0;

        for (Libro libro : libros) {
            total += libro.getCantidadCopias();
        }

        return total;
    }
}