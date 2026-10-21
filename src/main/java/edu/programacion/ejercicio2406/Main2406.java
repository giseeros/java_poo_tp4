package edu.programacion.ejercicio2406;

/**
 * Clase principal para probar películas y series.
 *
 */
public class Main2406 {

    /**
     * Ejecuta el programa.
     *
     * @param args argumentos de ejecución
     */
    public static void main(String[] args) {

        // Creamos un director y un actor.
        Director director = new Director("Steven", "Spielberg");
        Actor actor = new Actor("Tom", "Hanks");

        // Creamos una película.
        Pelicula pelicula = new Pelicula(
                "Rescatando al soldado Ryan", 1998, director);

        pelicula.agregarActor(actor);

        // Creamos un personaje para la película.
        Personaje personaje = new Personaje("Capitán Miller", actor);
        pelicula.agregarPersonaje(personaje);

        // Creamos una serie.
        Serie serie = new Serie("Serie de ejemplo", 2024, director);

        serie.agregarActor(actor);
        serie.agregarPersonaje(personaje);

        // Agregamos un capítulo.
        Capitulo capitulo = new Capitulo("Primer episodio", 1);
        serie.agregarCapitulo(capitulo);

        // Mostramos los resultados.
        System.out.println(pelicula);
        System.out.println();
        System.out.println(serie);
    }
}