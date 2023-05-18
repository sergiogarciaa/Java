package servicios;
import java.io.*;
import java.util.List;
import java.util.Scanner;

import entidades.Propietarios;
import entidades.Usuarios;
import entidades.Veterinarios;

public class ImplementacionUsuario implements InterfazUsuario {
    public List<Usuarios> usuarios(List<Usuarios> listaUsuario) {
        int contador = 1;

        boolean esVeterinario = true;
        Propietarios propietarios1 = new Propietarios();
        Veterinarios veterinarios1 = new Veterinarios();


        Usuarios usuarios2 = new Usuarios();
        Scanner sc = new Scanner(System.in);
        String comprobacion;

            // TOMA DE DATOS
            System.out.println("--REGISTRO--");
            usuarios2.setCodigoIdentificador(contador);
            System.out.println("Introduzca su nombre");
            usuarios2.setNombre(sc.next());
            System.out.println("Introduzca su apellido");
            usuarios2.setApellidos(sc.next());
            System.out.println("Es veterinario?");
            comprobacion = sc.next();
            if (comprobacion.toLowerCase().equals("si")) {
                esVeterinario = true;
                usuarios2.setEsVeterinario(esVeterinario);
                System.out.println("Introduzca su numero de colegiado");
                veterinarios1.setNumeroColegiado(sc.next());
            } else if (comprobacion.toLowerCase().equals("no")) {
                esVeterinario = false;
                usuarios2.setEsVeterinario(esVeterinario);
                System.out.println("Cuántas mascotas tiene?");
                propietarios1.setnumeroMascotas(sc.nextInt());
            }
            else{
                System.err.println("Es veterinario no ha sido respondido");
            }
            listaUsuario.add(usuarios2);


        contador++;

        /**
         * Escritura en fichero
         */
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("/home/jonygarcia/Escritorio/fichero.txt", true);
            pw = new PrintWriter(fichero);
            pw.println("Nombre \t Apellidos \t Veterinario \t NºColegiado \t Numero Mascotas");
            for (Usuarios element: listaUsuario) {
                if(esVeterinario == true){
                    pw.println(element.getNombre() + " \t " + element.getApellidos() + " \t " + element.getesVeterinario() + " \t\t " + veterinarios1.getNumeroColegiado() + "\t\t NULL");
                }
                else if(esVeterinario == false){
                    pw.println(element.getNombre() + " \t " + element.getApellidos() + " \t" + element.getesVeterinario() +  "\t\t NULL \t\t " + propietarios1.getnumeroMascotas());
                }
            }

        } catch (IOException ioe) {
            System.out.print("[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" + ioe);
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            }catch (IOException ioe2){
                System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
            }
        }
        /**
         * FIN
         */
        return listaUsuario;
    }

}