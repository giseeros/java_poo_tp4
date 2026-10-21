package edu.programacion.ejercicio2403;

    /**
     * Clase principal para probar las conversiones
     * de temperatura.
     *
     */
    public class Main2403 {

        /**
         * Punto de entrada del programa.
         *
         * @param args argumentos recibidos desde la línea de comandos
         */
        public static void main(String[] args) {

            // Creamos una temperatura de 25 grados Celsius.
            Temperatura temperatura =
                    new Temperatura(25, Escala.CELSIUS);

            // Mostramos la temperatura en Celsius.
            System.out.println(
                    "Celsius: "
                            + temperatura.getCelsius()
            );

            // Mostramos la temperatura en Fahrenheit.
            System.out.println(
                    "Fahrenheit: "
                            + temperatura.getFahrenheit()
            );

            // Mostramos la temperatura en Kelvin.
            System.out.println(
                    "Kelvin: "
                            + temperatura.getKelvin()
            );

            // Mostramos la temperatura en Rankine.
            System.out.println(
                    "Rankine: "
                            + temperatura.getRankine()
            );

            // Mostramos la temperatura en Réaumur.
            System.out.println(
                    "Réaumur: "
                            + temperatura.getReaumur()
            );

            // Modificamos la temperatura utilizando Fahrenheit.
            temperatura.setFahrenheit(68);

            System.out.println(
                    "Después de establecer 68 °F:"
            );

            System.out.println(
                    "Celsius: "
                            + temperatura.getCelsius()
            );

            // Probamos el método general de conversión.
            double resultado =
                    Temperatura.convertirTemperatura(
                            100,
                            Escala.CELSIUS,
                            Escala.FAHRENHEIT
                    );

            System.out.println(
                    "100 °C a Fahrenheit: "
                            + resultado
            );
        }
    }