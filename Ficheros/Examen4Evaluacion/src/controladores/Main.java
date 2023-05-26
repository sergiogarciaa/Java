package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Propietarios;
import entidades.Usuarios;
import entidades.Veterinarios;
import servicios.*;
import servicios.InterfazMenu;

public class Main {

    public static void main(String[] args) {

        //Inicializa la interfaz de repostaje y menu
        InterfazUsuario intUsu = new ImplementacionUsuario();
        InterfazEscritura intE = new ImplementacionEscritura();
        InterfazMenu intM = new ImplementacionMenu();
        //Listado de repostajes (BD)
        List<Usuarios> listaUsuarios = new ArrayList<>();
        List<Propietarios> listaPropietarios = new ArrayList<>();
        List<Veterinarios> listaVeterinarios = new ArrayList<>();


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
                    System.out.println(intUsu.usuarios(listaUsuarios, listaVeterinarios, listaPropietarios));
                    intE.Escritura(listaUsuarios, listaVeterinarios, listaPropietarios);
                case 2:

                    break;
                case 3:

                    break;
                default:

            }
        }
    }

}