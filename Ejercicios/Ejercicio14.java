package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Dame un numero");
            num = sc.nextInt();

            if (num % 2 == 0 && num > 0 || num < 0)
                System.out.println("El numero "+num+" es par");
            else if(num % 2 != 0 && num < 0 || num > 0)
                System.out.println("El numero "+num+" es impar");

        }while(num!=0);
        System.out.println("El numero "+num+" no es una opcion correcta");
        System.out.println("Pulsa para salir");
	}

}
