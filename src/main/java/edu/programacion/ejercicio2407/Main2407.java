package edu.programacion.ejercicio2407;

/**
 * Clase principal para probar las operaciones entre conjuntos.
 *
 */
public class Main2407 {

    /**
     * Ejecuta las pruebas del ejercicio.
     *
     * @param args argumentos de ejecución
     */
    public static void main(String[] args) {

        // Creamos cuatro personas.
        Persona ana = new Persona("Ana", "100");
        Persona luis = new Persona("Luis", "200");
        Persona maria = new Persona("Maria", "300");
        Persona juan = new Persona("Juan", "400");

        // Creamos el conjunto A.
        Conjuntos A = new Conjuntos();
        A.add(ana);
        A.add(luis);
        A.add(maria);

        // Creamos el conjunto B.
        Conjuntos B = new Conjuntos();
        B.add(luis);
        B.add(maria);
        B.add(juan);

        // Mostramos los conjuntos originales.
        System.out.println("Conjunto A: " + A);
        System.out.println("Conjunto B: " + B);

        // Probamos la unión.
        System.out.println("Union A y B: " + A.union(B));

        // Probamos la intersección.
        System.out.println("Interseccion A y B: "
                + A.interseccion(B));

        // Probamos la diferencia.
        System.out.println("Diferencia A - B: "
                + A.diferencia(B));

        // Probamos la diferencia simétrica.
        System.out.println("Diferencia simetrica A y B: "
                + A.diferenciaSimetrica(B));

        // Probamos eliminar una persona.
        A.remove(ana);

        System.out.println("Conjunto A despues de eliminar a Ana: " + A);
    }
}