package servicios;
import java.util.List;
import java.util.Scanner;

import entidades.Usuarios;

public class ImplementacionUsuario implements InterfazUsuario {
    public List<Usuarios> usuarios(List<Usuarios> listaUsuario) {
        int contador = 1;

        boolean esVeterinario = true;


        Usuarios usuarios2 = new Usuarios();
        Scanner sc = new Scanner(System.in);
        String comprobacion;
        boolean continuar = true;
        String seguir;

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
                usuarios2.setNumeroColegiado(sc.next());
            } else if (comprobacion.toLowerCase().equals("no")) {
                esVeterinario = false;
                usuarios2.setEsVeterinario(esVeterinario);
                System.out.println("Cuántas mascotas tiene?");
                usuarios2.setnumeroMascotas(sc.nextInt());
            }
            else {
                System.err.println("Es veterinario no ha sido respondido");
            }

            listaUsuario.add(usuarios2);
        return listaUsuario;
    }

}