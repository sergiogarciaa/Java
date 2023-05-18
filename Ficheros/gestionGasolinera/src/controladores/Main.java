package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Usuarios;
import entidades.Propietarios;
import entidades.Veterinarios;
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
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:

            }
        }

    }

}