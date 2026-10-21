package edu.programacion.ejercicio2402;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

    /**
     * Representa un álbum de fotografías.
     *
     * Un álbum posee un nombre y una colección de fotografías.
     * Permite agregar, eliminar y consultar fotografías.
     *
     */
    public class Album {

        /**
         * Nombre del álbum.
         */
        private String nombre;

        /**
         * Lista de fotografías que contiene el álbum.
         */
        private final List<Fotografia> fotos;

        /**
         * Crea un álbum con el nombre indicado.
         *
         * @param nombre nombre del álbum
         */
        public Album(String nombre) {
            this.nombre = nombre;
            this.fotos = new ArrayList<>();
        }

        /**
         * Obtiene el nombre del álbum.
         *
         * @return nombre del álbum
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Modifica el nombre del álbum.
         *
         * @param nombre nuevo nombre del álbum
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Agrega una fotografía al álbum.
         *
         * @param foto fotografía que se desea agregar
         */
        public void agregarFoto(Fotografia foto) {
            fotos.add(foto);
        }

        /**
         * Agrega varias fotografías al álbum.
         *
         * @param fotos colección de fotografías que se desean agregar
         */
        public void agregarFotos(Collection<Fotografia> fotos) {
            this.fotos.addAll(fotos);
        }

        /**
         * Elimina una fotografía del álbum.
         *
         * @param foto fotografía que se desea eliminar
         */
        public void eliminarFoto(Fotografia foto) {
            fotos.remove(foto);
        }

        /**
         * Elimina todas las fotografías del álbum.
         */
        public void limpiar() {
            fotos.clear();
        }

        /**
         * Obtiene la cantidad de fotografías del álbum.
         *
         * @return cantidad de fotografías
         */
        public int cantidadDeFotos() {
            return fotos.size();
        }

        /**
         * Obtiene una copia de la lista de fotografías.
         *
         * @return lista de fotografías
         */
        public List<Fotografia> getFotos() {
            return new ArrayList<>(fotos);
        }
    }
