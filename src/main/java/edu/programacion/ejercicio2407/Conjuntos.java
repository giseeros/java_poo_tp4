package edu.programacion.ejercicio2407;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementa operaciones matemáticas entre conjuntos de personas.
 *
 */
public class Conjuntos {

    private Set<Persona> personas;

    /**
     * Crea un conjunto vacío.
     */
    public Conjuntos() {
        personas = new HashSet<>();
    }

    /**
     * Agrega una persona al conjunto.
     *
     * @param persona persona que se desea agregar
     */
    public void add(Persona persona) {
        if (persona != null) {
            personas.add(persona);
        }
    }

    /**
     * Elimina una persona del conjunto.
     *
     * @param persona persona que se desea eliminar
     */
    public void remove(Persona persona) {
        personas.remove(persona);
    }

    /**
     * Calcula la unión con otro conjunto.
     *
     * @param set segundo conjunto
     * @return nuevo conjunto con todos los elementos
     */
    public Conjuntos union(Conjuntos set) {
        Conjuntos resultado = new Conjuntos();

        resultado.personas.addAll(this.personas);
        resultado.personas.addAll(set.personas);

        return resultado;
    }

    /**
     * Calcula la intersección con otro conjunto.
     *
     * @param set segundo conjunto
     * @return conjunto de elementos compartidos
     */
    public Conjuntos interseccion(Conjuntos set) {
        Conjuntos resultado = new Conjuntos();

        resultado.personas.addAll(this.personas);
        resultado.personas.retainAll(set.personas);

        return resultado;
    }

    /**
     * Calcula la diferencia entre dos conjuntos.
     *
     * @param set segundo conjunto
     * @return elementos de este conjunto que no están en el otro
     */
    public Conjuntos diferencia(Conjuntos set) {
        Conjuntos resultado = new Conjuntos();

        resultado.personas.addAll(this.personas);
        resultado.personas.removeAll(set.personas);

        return resultado;
    }

    /**
     * Calcula la diferencia simétrica.
     *
     * @param set segundo conjunto
     * @return elementos que pertenecen a un conjunto, pero no a ambos
     */
    public Conjuntos diferenciaSimetrica(Conjuntos set) {
        Conjuntos resultado = this.union(set);
        Conjuntos comunes = this.interseccion(set);

        resultado.personas.removeAll(comunes.personas);

        return resultado;
    }

    /**
     * Obtiene los elementos del conjunto.
     *
     * @return copia del conjunto de personas
     */
    public Set<Persona> getPersonas() {
        return new HashSet<>(personas);
    }

    /**
     * Representa el conjunto como texto.
     *
     * @return personas del conjunto
     */
    @Override
    public String toString() {
        return personas.toString();
    }
}