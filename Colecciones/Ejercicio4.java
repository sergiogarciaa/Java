package Colecciones;

public class Ejercicio4 {

	public static void main(String[] args) {
		Integer [] array = new Integer[100];
		int cont = 1;
		int suma = 0;
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i] = cont);
			cont ++;
			// mi parte
			//su parte
			suma += i+1;
		}
		//Su parte
		System.out.println("La suma de todos ellos: " + suma);
		System.out.println("La media: " + (double)suma/array.length);
	}

}
