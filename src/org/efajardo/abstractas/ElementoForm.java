package org.efajardo.abstractas;

abstract public class ElementoForm {

    protected String nombre;
    protected String valor;

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    abstract public String dibujarHtml();
}
