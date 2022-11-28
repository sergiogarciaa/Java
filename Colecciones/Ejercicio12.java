// Alumno: García Barrera, Sergio

package Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio12 {

	public static void main(String[] args) {
		int [] array = new int[10];
		List<Integer> al;
		al=new ArrayList<Integer>();
		
		for (int i = 0; i<array.length; i++) {
			array[i] = (int)(Math.random() * ((35 - 20) + 1)) + 20;
		}
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] >= 25) {
				al.add(array[i]);
			}
		}
		
		for (int i = 0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}

}
