package org.efajardo.abstractas;

import org.efajardo.abstractas.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String nombre;
    protected String valor;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores(){
        return this.errores;
    }

    public boolean isValid(){
        for (Validador v : this.validadores){
            if (!v.esValido(this.valor)){
                this.errores.add(v.getMensaje());
            }
        }
        return this.getErrores().isEmpty();
    }

    abstract public String dibujarHtml();
}
