package edu.programacion.ejercicio2402;

import java.util.List;

    /**
     * Clase principal para probar el funcionamiento del álbum de fotografías.
     *
     * Permite comprobar las operaciones de agregar, eliminar y
     * limpiar fotografías del álbum.
     *
     */
    public class Main2402 {

        /**
         * Punto de entrada del programa.
         *
         * @param args argumentos recibidos desde la línea de comandos
         */
        public static void main(String[] args) {

            // Creamos un álbum llamado "Vacaciones".
            Album album = new Album("Vacaciones");

            // Creamos tres fotografías.
            Fotografia foto1 = new Fotografia("playa.jpg");
            Fotografia foto2 = new Fotografia("montaña.jpg");
            Fotografia foto3 = new Fotografia("familia.jpg");

            // Agregamos una fotografía al álbum.
            album.agregarFoto(foto1);

            // Agregamos varias fotografías al mismo tiempo.
            album.agregarFotos(List.of(foto2, foto3));

            // Mostramos el nombre del álbum.
            System.out.println("Álbum: " + album.getNombre());

            // Mostramos la cantidad de fotografías.
            System.out.println(
                    "Cantidad de fotos: " + album.cantidadDeFotos()
            );

            // Eliminamos una fotografía.
            album.eliminarFoto(foto2);

            // Mostramos nuevamente la cantidad.
            System.out.println(
                    "Después de eliminar una foto: "
                            + album.cantidadDeFotos()
            );

            // Eliminamos todas las fotografías del álbum.
            album.limpiar();

            // Comprobamos que el álbum quedó vacío.
            System.out.println(
                    "Después de limpiar el álbum: "
                            + album.cantidadDeFotos()
            );
        }
    }