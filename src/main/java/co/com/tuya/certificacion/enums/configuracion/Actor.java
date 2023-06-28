package co.com.tuya.certificacion.enums.configuracion;

    public enum Actor {

        CLIENTE("Cliente");

        String nombre;
        Actor(String msj) {
            this.nombre = msj;
        }

        public String getNombre() {
            return nombre;
        }
    }


