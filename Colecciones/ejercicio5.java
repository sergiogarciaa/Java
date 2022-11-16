package Colecciones;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		int [] array = new int[10];
		Scanner sc = new Scanner(System.in);
			
		// Rellenar Array 
		for(int i = 0; i<10; i++) {
			 array[i] = (int)(Math.random() * 21);
		}
		// Preguntar
		System.out.println("Dime un número a ver si está dentro del array");
		int n = sc.nextInt();
		
		for(int i = 0; n<array.length; i++) {
			if(n==array[i]) {
				System.out.println("Enhorabuena número acertado");
			}
			else {
				System.err.println("Has perdido");
				
			}
			
			sc.close();
		}
	}

}
