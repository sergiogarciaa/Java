package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int nota;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca una nota ");
			nota = sc.nextInt();
			
			switch (nota) {
			case 0, 1, 2 ,3 ,4 -> System.out.println("Insuficiente");
			case 5 -> System.out.println("Suficiente");
			case 6 -> System.out.println("Bien");
			case 7, 8 -> System.out.println("Notable");
			case 9, 10 -> System.out.println("Sobresaliente");
			default -> System.out.println("FIN DEL PROGRAMA");
			}		
		}while(nota>=0 && nota<=10);
		sc.close();

	}

}
