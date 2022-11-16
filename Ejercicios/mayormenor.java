package Ejercicios;

import java.util.Scanner;

public class mayormenor {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el número que deberá adivinar luego");
		n1 = sc.nextInt();
		
		do {
			System.out.println("Introduce el número para adivinarlo");
			n2 = sc.nextInt();
				if(n2>n1) {
					System.err.println("No, el número introducido es más grande que el que tienes que adivinar");
				}
				else if(n2<n1) {
					System.err.println("No, el número introducido es más pequeño que el que tienes que adivinar");
				}
				else if(n2==n1) {
					System.out.println("CORRECTO!! El número era " + n1);
				}
		}while(n2!=n1);
		sc.close();
		
	}

}
