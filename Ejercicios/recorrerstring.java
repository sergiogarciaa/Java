package Ejercicios;

import java.util.Scanner;

public class recorrerstring {

	public static void main(String[] args) {
		String palabra = "";
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra, por ejemplo: ave");
		palabra = sc.nextLine();
		
		// Mientras que contador sea distinto a la longitud de la palabra
		while(contador != palabra.length()){
            System.out.println("Letra " + (contador+1) + ": " + palabra.substring(contador,contador+1)); // Muestra "Letra" + el contador y con lo otro la letra concreta
            contador++;
        }

	}

}
