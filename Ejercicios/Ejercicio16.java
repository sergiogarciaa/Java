package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		String operacion = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨]");
		System.out.println("[ 	S - Suma        ]");
		System.out.println("[ 	R - Resta       ]");
		System.out.println("[ 	M - Multiplicar ]");
		System.out.println("[ 	D - Dividir     ]");
		System.out.println("[ 	C - Resto       ]");
		System.out.println("[ 	F - Finalizar   ]");
		System.out.println("[.......................]");
		System.out.println("Introduzca una opción: ");
		operacion = sc.next();
		
		switch (operacion) {
		case "S", "s", "suma", "Suma": {
				int n, n1;
				
				System.out.println("Introduce un numero para sumarlo con otro que introducirá");
				n = sc.nextInt();
				System.out.println("Introduce el otro numero para sumarlo");
				n1 = sc.nextInt();
				
				int resultado = n+n1;
				System.out.println(n + " + " + n1 + " = " + resultado);
			break;
			}
		case "R", "r", "resta", "Resta": {
			int n, n1;
			
			System.out.println("Introduce un numero para restarlo con otro que introducirá");
			n = sc.nextInt();
			System.out.println("Introduce el otro numero para restarlo");
			n1 = sc.nextInt();
			
			int resultado = n-n1;
			System.out.println(n + " - " + n1 + " = " + resultado);
		break;
		}
		case "M", "m", "Multiplicar", "multiplicar": {
			int n, n1;
			
			System.out.println("Introduce un numero para multiplicarlo con otro que introducirá");
			n = sc.nextInt();
			System.out.println("Introduce el otro numero para multiplicarlo");
			n1 = sc.nextInt();
			
			int resultado = n*n1;
			System.out.println(n + " * " + n1 + " = " + resultado);
		break;
		}
		case "d", "D", "dividir", "Dividir": {
			int n, n1;
			
			System.out.println("Introduce un numero para dividirlo con otro que introducirá");
			n = sc.nextInt();
			System.out.println("Introduce el otro numero para dividirlo");
			n1 = sc.nextInt();
			
			int resultado = n/n1;
			System.out.println(n + " / " + n1 + " = " + resultado);
		break;
		}
		case "c", "C", "Resto", "resto": {
			int n, n1;
			
			System.out.println("Introduce un numero para sacar el resto con otro que introducirá");
			n = sc.nextInt();
			System.out.println("Introduce el otro numero para sacar resto");
			n1 = sc.nextInt();
			
			int resultado = n%n1;
			System.out.println(n + " % " + n1 + " = " + resultado);
		break;
		}
		case "F", "f", "Finalizar", "finalizar": {
			System.out.println("Ha salido del programa");
			break;
		}
		default:
			System.err.println("Opción no Válida");
		}
		sc.close();
	}

}
