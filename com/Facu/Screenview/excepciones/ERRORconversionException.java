package com.Facu.Screenview.excepciones;

public class ERRORconversionException extends RuntimeException {

    private String mensaje;

    public ERRORconversionException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}
