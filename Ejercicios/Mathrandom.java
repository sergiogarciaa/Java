package Ejercicios;

import java.util.Scanner;

public class Mathrandom {

	public static void main(String[] args) {
		int n1;
		Scanner sc = new Scanner(System.in);
		int random = (int) (Math.random() * ((20 - -20) + 1)) + -20;
		
		
		do {
			System.out.println("Introduce el número para adivinarlo");
			n1 = sc.nextInt();
				if(n1>random) {
					System.err.println("No, el número introducido es más grande que el que tienes que adivinar");
				}
				else if(n1<random) {
					System.err.println("No, el número introducido es más pequeño que el que tienes que adivinar");
				}
				else if(n1==random) {
					System.out.println("CORRECTO!! El número era " + random);
				}
		}while(n1!=random);
		sc.close();
		

	}

}
