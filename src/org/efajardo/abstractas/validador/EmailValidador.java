package org.efajardo.abstractas.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "el formato del email es invalido";

    final private static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
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
