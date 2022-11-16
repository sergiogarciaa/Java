package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		String fraseUsuario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Itroduce una frase");
		fraseUsuario = sc.next();
		
		char[]fraseUsuarioChar;
		fraseUsuarioChar = fraseUsuario.toCharArray();
		
		int cont = 0;
		while (cont<fraseUsuarioChar.length) {
			System.out.println(fraseUsuarioChar[cont]);
			cont ++;
		}
	
		sc.close();
	}

}
