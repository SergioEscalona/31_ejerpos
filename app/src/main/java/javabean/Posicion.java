package javabean;

/**
 * Created by Sergio on 06/04/2017.
 */

public class Posicion {
    String latitud;
    String longitud;

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Posicion(String latitud, String longitud) {
        this.latitud = latitud;
        this.longitud = longitud;


    }
}
