public class EjemploOcultacionTres {
    //VACIOS
    public EjemploOcultacionTres() {
        super();
    }
    // No Vacio

    public EjemploOcultacionTres(int z) {
        super(); // Crear un objeto
        this.z = z;
    }

    private int z=2; //atributo

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void metodo(){
        double z;  //variable local
        z = 6.2;
        System.out.println("Ocultación Tres metodo con this: " + this.z);
    }
}
