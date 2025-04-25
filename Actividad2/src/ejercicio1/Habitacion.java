    package ejercicio1;
    /**
     * Clase Habitacion representa una unidad del hotel que puede ser reservada.
     * Su relación con otras clases, como Reserva, es de tipo Asociación.
     */

    class Habitacion {
        private int numero;
        private String tipo;
        private double precio;

        public Habitacion(int numero, String tipo, double precio) {
            this.numero = numero;
            this.tipo = tipo;
            this.precio = precio;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getNumero() {
            return numero;
        }

        public String getTipo() {
            return tipo;
        }

        public double getPrecio() {
            return precio;
        }
    }