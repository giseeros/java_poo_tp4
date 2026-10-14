package edu.programacion.ejercicio2404;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un editor que administra diferentes figuras.
 *
 * <p>El editor permite agregar, eliminar, pintar y calcular
 * el área total de las figuras.</p>
 *
 * @author Gisela Acosta
 * @version 1.0
 */
public class EditorFiguras {

    /**
     * Lista de figuras administradas por el editor.
     */
    private final List<Figura> figuras;

    /**
     * Crea un editor vacío.
     */
    public EditorFiguras() {
        figuras = new ArrayList<>();
    }

    /**
     * Agrega una figura al editor.
     *
     * @param figura figura que se desea agregar
     */
    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    /**
     * Elimina una figura del editor.
     *
     * @param figura figura que se desea eliminar
     */
    public void eliminarFigura(Figura figura) {
        figuras.remove(figura);
    }

    /**
     * Pinta todas las figuras del editor.
     */
    public void pintar() {
        for (Figura figura : figuras) {
            figura.pintar();
        }
    }

    /**
     * Calcula el área total de todas las figuras.
     *
     * @return suma de las áreas
     */
    public double calcularArea() {
        double total = 0;

        for (Figura figura : figuras) {
            total += figura.getArea();
        }

        return total;
    }

    /**
     * Obtiene la cantidad de figuras.
     *
     * @return cantidad de figuras
     */
    public int cantidadDeFiguras() {
        return figuras.size();
    }
}