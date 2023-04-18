// Sergio García Barrera
// Creado con Intellij IDEA JetBrains

package servicios;

import java.util.List;
import entidades.Usuarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ImplementacionUsuario implements IntUsu {
    public List<Usuarios> lecturaFichero(List<Usuarios>listaUsuario) {
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;


        try {
            fichero = new File("C:\\Users\\sergi\\Desktop\\Fichero.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                String nombre = partes[0];
                String apellidos = partes[1];
                String edad = partes[2];

               crearUsuario(nombre, apellidos, Integer.parseInt(edad),listaUsuario);
            }

        } catch (FileNotFoundException ficheroNoEncontrado) {
            System.out.print("[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" + ficheroNoEncontrado);
        } catch (IOException errorLinea) {
            System.out.print("[ERROR] - ERROR AL LEER LINEA: " + errorLinea);
        } finally { //Siempre va a ejecutarse, aunque se ejecute lo de dentro de un catch o lo de dentro del try
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException errorCFichero) {
                System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + errorCFichero);
            }
        }
        return listaUsuario;
    }

    // Crear objetos tipo usuario y almacenar en la lista

    private List<Usuarios> crearUsuario(String Nombre, String Apellido, int edad, List<Usuarios> listaUsuario) {

        listaUsuario.add(new Usuarios(Nombre,Apellido, edad));

        return listaUsuario;
    }

}


