package servicios;

import entidades.Propietarios;
import entidades.Usuarios;
import entidades.Veterinarios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ImplementacionEscritura implements InterfazEscritura{
    @Override
    public void Escritura(List<Usuarios> listaUsuario, List<Veterinarios> listaVeterinarios, List<Propietarios> listaPropietarios) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\sergi\\Desktop\\fichero.txt");
            pw = new PrintWriter(fichero);
            pw.println("Nombre \t Apellidos \t Veterinario \t NºColegiado \t Numero Mascotas");
            for (Usuarios u: listaUsuario) {
                if(u.getesVeterinario() == true){
                    for (Veterinarios v: listaVeterinarios)
                    pw.println(u.getNombre() + " \t " + u.getApellidos() + " \t " + u.getesVeterinario() + " \t\t " + v.getNumeroColegiado() + "\t\t NULL");                }
                else{
                    for (Propietarios p: listaPropietarios)
                    pw.println(u.getNombre() + " \t " + u.getApellidos() + " \t" + u.getesVeterinario() + "\t\t NULL \t\t " + p.getnumeroMascotas());
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
    }
}
