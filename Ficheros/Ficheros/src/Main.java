import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // LECTURA DE LA PRIMERA LINEA
        /*
        File archivo = new File ("C:\\Users\\sergi\\Desktop\\Fichero.txt");

        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String linea;
        linea = br.readLine();
        System.out.println(linea);
        fr.close();
        */
        // Escritura de una Linea
        File archivo = new File ("C:\\Users\\sergi\\Desktop\\nuevo.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(archivo));
        bf.write("ASFDASFJIASJIFHSJKAGHSMBGSA");
        bf.close();

    }
}