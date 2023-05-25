/**
 * Dentro de los usuarios de la aplicación, habrá dos tipos: veterinarios y propietarios. De ambos tipos de usuarios se guardará la siguiente información:
 *  codigoIdentificador (entero), nombre (texto), apellidos (texto) y esVeterinario (boolean).
 * Por otro lado, sólo para los veterinarios se guardará el campo numeroColegiado (texto) y solo para los propietarios se guardará el campo numeroMascotas (entero).
 */

package entidades;

public class Usuarios {

    public Usuarios(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario, int numeroMascotas, String numeroColegiado) {
        super();
        this.codigoIdentificador = codigoIdentificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.esVeterinario = esVeterinario;
        this.numeroMascotas = numeroMascotas;
        this.numeroColegiado = numeroColegiado;
    }

    public Usuarios(){
        super();
    }

    private int codigoIdentificador;
    private String nombre;
    private String apellidos;
    private boolean esVeterinario;
    private int numeroMascotas;
    private String numeroColegiado;

    // GETTER Y SETTERS -

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
    // ---------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // --------
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    // --------
    public boolean getesVeterinario() {
        return esVeterinario;
    }

    public void setEsVeterinario(boolean esVeterinario) {
        this.esVeterinario = esVeterinario;
    }
    public int getnumeroMascotas() {
        return numeroMascotas;
    }

    public void setnumeroMascotas(int numeroMascotas) {
        this.numeroMascotas = numeroMascotas;
    }
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    // FIN GETTER Y SETTERS -

    //Sobre escritura toString
    @Override
    public String toString() {
        return "Código: " + codigoIdentificador  + "Nombre: " + nombre + " | Apellidos: " + apellidos + " | Veterinario: " + esVeterinario + " | NºColegiado: " + numeroColegiado + " | NºMascotas: " + numeroMascotas;
    }
}
