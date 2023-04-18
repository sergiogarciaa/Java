// Sergio García Barrera
// Creado con Intellij IDEA JetBrains

package controladores;

import java.util.ArrayList;
import java.util.List;
import entidades.Usuarios;
import servicios.ImplementacionUsuario;
import servicios.IntUsu;

public class Main {
    public static void main(String[] args) {

        List<Usuarios>listaUsuarios = new ArrayList<Usuarios>();
        IntUsu intUsuario = new ImplementacionUsuario();

        intUsuario.lecturaFichero(listaUsuarios);

        //To String
        for(Usuarios tUsu : listaUsuarios) {
            System.out.println(tUsu.toString());
        }


    }
}