package edu.programacion.ejercicio2404;

/**
 * Clase principal para probar el editor de figuras.
 *
 * @author Gisela Acosta
 * @version 1.0
 */
public class Main2404 {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {

        // Creamos el editor.
        EditorFiguras editor = new EditorFiguras();

        // Creamos un cuadrado.
        Cuadrado cuadrado = new Cuadrado("rojo", 5);

        // Creamos un círculo.
        Circulo circulo = new Circulo("azul", 3);

        // Creamos un triángulo.
        Triangulo triangulo = new Triangulo("verde", 4, 6);

        // Creamos una línea.
        Linea linea = new Linea("negro", 10);

        // Agregamos las figuras al editor.
        editor.agregarFigura(cuadrado);
        editor.agregarFigura(circulo);
        editor.agregarFigura(triangulo);
        editor.agregarFigura(linea);

        
        // Pintamos todas las figuras.
        editor.pintar();

        // Mostramos la cantidad de figuras.
        System.out.println(
                "Cantidad de figuras: "
                        + editor.cantidadDeFiguras()
        );

        // Mostramos el área total.
        System.out.println(
                "Área total: "
                        + editor.calcularArea()
        );
    }
}