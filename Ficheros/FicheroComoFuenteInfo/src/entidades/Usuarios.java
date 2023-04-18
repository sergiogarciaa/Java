// Sergio García Barrera
// Creado con Intellij IDEA JetBrains

package entidades;

public class Usuarios {
    public Usuarios(String nombre, String apellidos, int edad) {
        super();
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.edad = edad;
    }

    public Usuarios(){
        super();
    }

    private String nombre;
    private String apellidos;
    private int edad;

    // GETTER Y SETTERS -
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // FIN GETTER Y SETTERS -

    //Sobre escritura toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Apellidos: " + apellidos + " | edad: " + edad;
    }

}
