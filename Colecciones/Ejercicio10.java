package Ejercicios;

/* cree una lista de 10 posiciones con valores pedidos por teclado.
 *  Muestra por consola el índice y el valor al que corresponde. 
 *  Haz dos métodos uno para rellenar valores y otro para mostrar.*/

import java.util.Scanner;
public class Ejercicio10 {

	static int array[];
	
	
	public static void main(String[] args) {
		array = new int [10];
		Scanner sc = new Scanner(System.in);
		RellenarArray();
		MostrarArray();
		
		sc.close();
	}

	public static void MostrarArray() {
		for(int i = 0; i<array.length; i++) {
			System.out.println(i + 1 + ") " + array[i]);
		}
	}

	public static void RellenarArray() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<array.length; i++) {	
			System.out.println("Introduce valores para rellenar el array, un total de 10 números");
			array[i] = sc.nextInt();
		}
		sc.close();
	}

}
