package org.efajardo.abstractas.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "el campo es requerido";

    @Override
    public boolean esValido(String valor) {
        return (valor != null && valor.length() > 0);
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
