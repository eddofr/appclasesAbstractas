import org.efajardo.abstractas.ElementoForm;
import org.efajardo.abstractas.InputForm;
import org.efajardo.abstractas.SelectForm;
import org.efajardo.abstractas.TextAreaForm;
import org.efajardo.abstractas.select.Opcion;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave","password");
        InputForm email = new InputForm("email","email");
        InputForm edad = new InputForm("edad","number");

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje")
        .addOpcion(new Opcion("1", "Java"))
        .addOpcion(new Opcion("2", "JavaScript").setSelected())
        .addOpcion(new Opcion("4", "TypeScript"))
        .addOpcion(new Opcion("4", "Phyton"))
        .addOpcion(new Opcion("5", "Php"));

        username.setValor("Edson Orlando");
        password.setValor("vegeta");
        email.setValor("eddofr@gmail.com");
        edad.setValor("39");
        experiencia.setValor("El mejor programador y economista del mundo");

        List<ElementoForm> elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje);

        //for (ElementoForm e : elementos){
        //    System.out.println(e.dibujarHtml());
        //    System.out.println("<br>");
        //}

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

    }
}