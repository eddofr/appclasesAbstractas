package org.efajardo.abstractas;

import org.efajardo.abstractas.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public void addOpcion(Opcion opcion){
        this.opciones.add(opcion);
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='");
        sb.append(this.nombre);
        sb.append(">'");
        for (Opcion opcion : this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){
                sb.append(" selected");
            }
            sb.append(">").append(opcion.getNombre()).append("</option>");
        }
        return sb.toString();
    }
}
