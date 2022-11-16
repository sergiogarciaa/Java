package EjerciciosT2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<Integer> l1;
		l1=new ArrayList<Integer>();
		
		l1.add(7);
		l1.add(3);
		l1.add(10);
		l1.add(24);
		l1.add(27);
		l1.add(19);
		//imprime cada el emento de la lista
		int i=0;
		while(i<l1.size()) {
			System.out.print(l1.get(i) + " ");
			i++;
		}

	}

}
