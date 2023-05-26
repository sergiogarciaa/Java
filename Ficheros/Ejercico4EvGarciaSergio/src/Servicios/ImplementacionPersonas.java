// Sergio García Barrera
// Creado con Intellij IDEA JetBrains

package Servicios;

import java.util.List;
import Entidades.Personas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ImplementacionPersonas implements InterfazPersonas {
    public List<Personas> lecturaFichero(List<Personas> Persona) {
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;


        try {
            // Ruta del archivo
            fichero = new File("C:\\Users\\sergi\\Desktop\\ejercicio4.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            // Dentro del bucle se leerá linea a linea el txt
            while ((linea = br.readLine()) != null) {
                // El ; sirve para que pase al siguiente cuando encuentre un ; en el fichero
                String[] partes = linea.split(";");
                String nombre = partes[0];
                String apellidos = partes[1];
                String edad = partes[2];

                //  creo un objeto Usuario y lo agrego a la lista
                metPersona(nombre, apellidos, Integer.parseInt(edad), Persona);
            }

        } catch (FileNotFoundException ficheroNoEncontrado) {
            System.out.print("[ERROR] - FICHERO NO ENCONTRADO: " + fichero + "\n" + ficheroNoEncontrado);
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
        // devuelvo la lista
        return Persona;
    }

    // Crear objetos tipo usuario y almacenar en la lista

    private List<Personas> metPersona(String Nombre, String Apellido, int edad, List<Personas> Persona) {

        Persona.add(new Personas(Nombre,Apellido, edad));

        return Persona;
    }

}


