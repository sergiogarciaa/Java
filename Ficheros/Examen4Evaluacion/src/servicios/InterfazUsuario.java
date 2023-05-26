package servicios;
import entidades.Propietarios;
import entidades.Usuarios;
import entidades.Veterinarios;

import  java.util.List;

public interface InterfazUsuario {
    List<Usuarios> usuarios(List<Usuarios>listaUsuario , List<Veterinarios>listaVeterinarios, List<Propietarios>listaPropietarios);

}
