package servicios;

public class ImplementacionMenu implements InterfazMenu {
    public void mostrarMenu() {
        System.out.println("0. Salir");
        System.out.println("1. Registro");
        System.out.println("2. Crear fichero");
    }

}