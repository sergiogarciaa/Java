package servicios;
import java.util.List;
import java.util.Scanner;

import entidades.Propietarios;
import entidades.Usuarios;
import entidades.Veterinarios;

public class ImplementacionUsuario implements InterfazUsuario {
    public List<Usuarios> usuarios(List<Usuarios>listaUsuario , List<Veterinarios>listaVeterinarios, List<Propietarios>listaPropietarios) {
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
                llamarV(listaVeterinarios);
            } else if (comprobacion.toLowerCase().equals("no")) {
                esVeterinario = false;
                usuarios2.setEsVeterinario(esVeterinario);
                listaPropietarios(listaPropietarios);

            }
            else {
                System.err.println("Es veterinario no ha sido respondido");
            }

            listaUsuario.add(usuarios2);


        return listaUsuario;

    }

    private void llamarV(List<Veterinarios>listaVeterinarios) {
        Veterinarios veterinario = new Veterinarios();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su numero de colegiado");
        veterinario.setNumeroColegiado(sc.next());
        listaVeterinarios.add(veterinario);
    }
    private void listaPropietarios(List<Propietarios>listaPropietarios) {
        Propietarios propietario = new Propietarios();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de mascotas");
        propietario.setnumeroMascotas(sc.nextInt());
        listaPropietarios.add(propietario);
    }

}