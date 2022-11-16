//Alumno: Garcia Barrera, Sergio

package Colecciones;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un tamaño");
		int tamañoArray = sc.nextInt();
		int [] array1 = new int[tamañoArray];
		
		
		array1=NumRandom(0,9,array1);
		
		ShowArray(array1);
		
		SumarArray(array1);
		
		sc.close();
		
	}

	public static int[] NumRandom(int min, int max, int[]array) {
		int n ;
		int contador=0;
		while(contador<array.length) {
			n= (int) (Math.random() * (max+1 - min) + min);
			array[contador]=n;
			contador++;
		}
		return array;
	}
	public static void ShowArray(int[] array) {
		int contador=0;
		while (contador<array.length) {
			System.out.println((contador+1)+ ". " +array[contador]+"  ");
			contador++;
		}
	}
	public static void SumarArray(int[]array) {
		int suma=0;
		for(int i=0;i<array.length;i++) {
			suma=suma+array[i];
		}
		System.out.println("La suma de todos los numeros es: " +suma);
	}

}
