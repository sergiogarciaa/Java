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
        Propietarios propietarios1 = new Propietarios();
        Veterinarios veterinarios1 = new Veterinarios();

        boolean esVeterinario;
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


        /**
         * Escritura en fichero
         */
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("/home/jonygarcia/Escritorio/fichero.txt");

            pw = new PrintWriter(fichero);
            pw.println("Nombre \t Apellidos \t\t Veterinario \t\t NºColegiado \t Numero Mascotas");
            for (int i = 0; i < listaUsuario.size(); i++) {
                if(esVeterinario = true){
                    pw.println(usuarios2.getNombre() + " \t " + usuarios2.getApellidos() + " \t\t " + usuarios2.getesVeterinario() + " \t\t " + veterinarios1.getNumeroColegiado() + "\t\t NULL");
                }
                else {
                    pw.println(usuarios2.getNombre() + " \t " + usuarios2.getApellidos() + " \t\t " + usuarios2.getesVeterinario() + " \t\t NULL \t\t " + propietarios1.getnumeroMascotas());
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