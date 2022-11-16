package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
/*Para DO While*/ int numero;		
//Para While.- int numero = 1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			if(numero<0) {
				System.out.println("El número " + numero + " es negativo");
			}
			else if(numero>0){
				System.out.println("El número " + numero + " es positivo");
			}
			
		}while (numero!=0);
		
		/* VERSION CON WHILE 
		 
		while (numero!=0) {
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			if(numero<0) {
				System.out.println("El número " + numero + " es negativo");
			}
			else if(numero>0){
				System.out.println("El número " + numero + " es positivo");
			}
			
		}
		
		*/
		System.out.println("Fin del Programa");
		sc.close(); 
	}
}