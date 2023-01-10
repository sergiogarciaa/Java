public class Principal {
    public static void main(String[] args) {
    ejemploOcultación.metodo();
    EjemploOcultacionDos.metodo();
    EjemploOcultacionTres EOT = new EjemploOcultacionTres();
    EOT.metodo();
    //establece valor 3
    EOT.setZ(3);
    // Asigna el valor de EOT a una variable
    int resultado = EOT.getZ();
        System.out.println(resultado);
    }
}
