package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Usuarios;
import servicios.*;
import servicios.InterfazMenu;

public class Main {

    public static void main(String[] args) {

        //Inicializa la interfaz de repostaje y menu
        InterfazUsuario intUsu = new ImplementacionUsuario();
        InterfazMenu intM = new ImplementacionMenu();
        //Listado de repostajes (BD)
        List<Usuarios> listaUsuarios = new ArrayList<>();

        // Imprimir el menú por consola
        // Scanner con la opción del usuario
        Scanner entradaOpcion = new Scanner(System.in);
        Boolean cerrarMenu = false;
        int opcion;
        while(!cerrarMenu) {
            //Mostramos el menú
            intM.mostrarMenu();
            System.out.println("Introduza la opción deseada: ");
            opcion = entradaOpcion.nextInt();
            System.out.println("[INFO] - Has seleccionado la opcion " + opcion);

            switch (opcion) {
                case 0:
                    cerrarMenu = true;
                    break;
                case 1:
                    System.out.println(intUsu.usuarios(listaUsuarios));
                case 2:
                    FileWriter fichero = null;
                    PrintWriter pw = null;
                    try
                    {
                        fichero = new FileWriter("C:\\Users\\sergi\\Desktop\\fichero.txt");
                        pw = new PrintWriter(fichero);
                        pw.println("Nombre \t Apellidos \t Veterinario \t NºColegiado \t Numero Mascotas");
                        for (Usuarios u: listaUsuarios) {
                            if(u.getesVeterinario() == true){
                                    pw.println(u.getNombre() + " \t " + u.getApellidos() + " \t " + u.getesVeterinario() + " \t\t " + u.getNumeroColegiado() + "\t\t NULL");
                            }
                            else{
                                        pw.println(u.getNombre() + " \t " + u.getApellidos() + " \t" + u.getesVeterinario() + "\t\t NULL \t\t " + u.getnumeroMascotas());
                                }
                            }
                        }
                    catch (IOException ioe) {
                        System.out.print("[ERROR] - FICHERO NO ENCONTRARO: " + fichero + "\n" + ioe);
                    } finally {
                        try {
                            if (null != fichero)
                                fichero.close();
                        }catch (IOException ioe2){
                            System.out.print("[ERROR] - ERROR AL CERRAR FICHERO: " + fichero + "\n" + ioe2);
                        }
                    }
                    break;
                case 3:

                    break;
                default:

            }
        }


        /**
         * Escritura en fichero
         */

        /**
         * FIN
         */




    }

}