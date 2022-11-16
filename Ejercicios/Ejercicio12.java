package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			if(numero<0) {
				System.out.println("El número" + numero + "es negativo");
			}
			else if(numero>0){
				System.out.println("El número" + numero + "es positivo");
			}
			else {
				break;
			}
			
		}while (numero>0 || numero<0);
		sc.close();

	}

}
