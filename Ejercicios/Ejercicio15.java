package Ejercicios;

/*
con un método o función principal que visualice por pantalla todos los caracteres 
correspondientes a las letras minúsculas. 
Pista: recuerda que las variables de tipo char tenían un valor entero asociado, 
su código ASCII. El código ASCII de ‘a’ es menor que el de ‘z’.*/

public class Ejercicio15 {

	public static void main(String[] args) {
		for(int i=97;i<=122;i++) {
			System.out.println((char)i + " ");
			if(i==110) {
				System.out.println("ñ ");
			}
		}

	}

}
