package MiPaquete;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		 char letra;

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Dime un carácter: ");
	        letra = sc.nextLine().charAt(0);

	        if (Character.isUpperCase(letra)){
	            System.out.println("Es una letra mayúscula");
	        }
	        else {
	            System.out.println("Es una letra minúscula");

	        }

	}

}
