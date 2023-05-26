// Sergio García Barrera
// Creado con Intellij IDEA JetBrains

package Controladores;

import java.util.ArrayList;
import java.util.List;
import Entidades.Personas;
import Servicios.ImplementacionPersonas;
import Servicios.InterfazPersonas;

public class Main {
    public static void main(String[] args) {

        List<Personas>Personas = new ArrayList<>();
        InterfazPersonas intUsuario = new ImplementacionPersonas();

        // Llamada al método
        intUsuario.lecturaFichero(Personas);

        //To String
        for(Entidades.Personas persona : Personas) {
            System.out.println(persona.toString());
        }


    }
}