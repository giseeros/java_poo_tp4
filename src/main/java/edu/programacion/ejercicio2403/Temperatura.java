package edu.programacion.ejercicio2403;

    /**
     * Representa una temperatura utilizando Celsius
     * como representación interna.
     *
     * La clase permite obtener y modificar una temperatura
     * utilizando las escalas Celsius, Fahrenheit, Kelvin,
     * Rankine y Réaumur.
     *
     */
    public class Temperatura {

        /**
         * Valor interno de la temperatura expresado en Celsius.
         */
        private double valorCelsius;

        /**
         * Crea una temperatura a partir de un valor y una escala.
         *
         * @param valor valor de la temperatura
         * @param escala escala en la que se encuentra el valor
         */
        public Temperatura(double valor, Escala escala) {
            this.valorCelsius = convertirACelsius(valor, escala);
        }

        /**
         * Obtiene la temperatura en Celsius.
         *
         * @return temperatura en Celsius
         */
        public double getCelsius() {
            return valorCelsius;
        }

        /**
         * Establece la temperatura utilizando Celsius.
         *
         * @param valor temperatura en Celsius
         */
        public void setCelsius(double valor) {
            valorCelsius = valor;
        }

        /**
         * Obtiene la temperatura en Fahrenheit.
         *
         * @return temperatura en Fahrenheit
         */
        public double getFahrenheit() {
            return convertirTemperatura(
                    valorCelsius,
                    Escala.CELSIUS,
                    Escala.FAHRENHEIT
            );
        }

        /**
         * Establece la temperatura utilizando Fahrenheit.
         *
         * @param valor temperatura en Fahrenheit
         */
        public void setFahrenheit(double valor) {
            valorCelsius = convertirACelsius(
                    valor,
                    Escala.FAHRENHEIT
            );
        }

        /**
         * Obtiene la temperatura en Kelvin.
         *
         * @return temperatura en Kelvin
         */
        public double getKelvin() {
            return convertirTemperatura(
                    valorCelsius,
                    Escala.CELSIUS,
                    Escala.KELVIN
            );
        }

        /**
         * Establece la temperatura utilizando Kelvin.
         *
         * @param valor temperatura en Kelvin
         */
        public void setKelvin(double valor) {
            valorCelsius = convertirACelsius(
                    valor,
                    Escala.KELVIN
            );
        }

        /**
         * Obtiene la temperatura en Rankine.
         *
         * @return temperatura en Rankine
         */
        public double getRankine() {
            return convertirTemperatura(
                    valorCelsius,
                    Escala.CELSIUS,
                    Escala.RANKINE
            );
        }

        /**
         * Establece la temperatura utilizando Rankine.
         *
         * @param valor temperatura en Rankine
         */
        public void setRankine(double valor) {
            valorCelsius = convertirACelsius(
                    valor,
                    Escala.RANKINE
            );
        }

        /**
         * Obtiene la temperatura en Réaumur.
         *
         * @return temperatura en Réaumur
         */
        public double getReaumur() {
            return convertirTemperatura(
                    valorCelsius,
                    Escala.CELSIUS,
                    Escala.REAUMUR
            );
        }

        /**
         * Establece la temperatura utilizando Réaumur.
         *
         * @param valor temperatura en Réaumur
         */
        public void setReaumur(double valor) {
            valorCelsius = convertirACelsius(
                    valor,
                    Escala.REAUMUR
            );
        }

        /**
         * Convierte una temperatura de una escala a otra.
         *
         * @param valor valor de la temperatura
         * @param escala escala original
         * @param escalaObjetivo escala a la que se desea convertir
         * @return temperatura convertida
         */
        public static double convertirTemperatura(
                double valor,
                Escala escala,
                Escala escalaObjetivo) {

            if (escala == escalaObjetivo) {
                return valor;
            }

            double celsius = convertirACelsius(valor, escala);

            return switch (escalaObjetivo) {

                case CELSIUS -> celsius;

                case FAHRENHEIT ->
                        celsius * 1.8 + 32;

                case KELVIN ->
                        celsius + 273.15;

                case RANKINE ->
                        (celsius + 273.15) * 9 / 5;

                case REAUMUR ->
                        celsius * 0.8;
            };
        }

        /**
         * Convierte un valor de cualquier escala a Celsius.
         *
         * @param valor valor de temperatura
         * @param escala escala original
         * @return temperatura expresada en Celsius
         */
        private static double convertirACelsius(
                double valor,
                Escala escala) {

            return switch (escala) {

                case CELSIUS ->
                        valor;

                case FAHRENHEIT ->
                        (valor - 32) / 1.8;

                case KELVIN ->
                        valor - 273.15;

                case RANKINE ->
                        (valor - 491.67) * 5 / 9;

                case REAUMUR ->
                        valor * 1.25;
            };
        }
    }