package EjerciciosT2;

import java.util.Scanner;

/*con un método o función principal que llame a un método que pasado un día de la semana y el número de días que se quiere avanzar (parámetros), nos devuelva el nombre del próximo día de la semana. 
El programa termina cuando se introduce el número 0 en el día de la semana.*/

public class Ejercicio11 {

	public static void main(String[] args) {	
		String dia = "";
		int nuevoDia = 0;
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Introduce un dia de la semana escrito y debe empezar por mayúsculas: ");
        dia = sc.next();

        	System.out.println("Introduce cuantos dias quiere avanzar: ");
            nuevoDia = sc.nextInt();
        
        diaSemana(dia, nuevoDia);
        
        sc.close();
	}


	public static int diaSemana(String diadelasemana, int avanzar) {
		int convert = -1;
		switch (diadelasemana)
        {
            case "Domingo": convert = 0;
                break;
            case "Lunes": convert = 1;
                break;
            case "Martes": convert = 2;
                break;
            case "Miercoles": convert = 3;
                break;
            case "Jueves": convert = 4;
                break;
            case "Viernes": convert = 5;
                break;
            case "Sabado": convert = 6;
                break;
            default: System.out.println("El dia introducido no es válido o no está en formato texto");
                break;
        }
		
		int sumaDia = convert + avanzar % 7;
		
		if(convert>0 && convert<6){
			if (sumaDia == 0)
	            System.out.println("Dentro de " + avanzar + " dias sera domingo");
	        else if (sumaDia == 1)
	        	System.out.println("Dentro de " + avanzar + " dias sera lunes");
	        else if (sumaDia == 2)
	        	System.out.println("Dentro de " + avanzar + " dias sera martes");
	        else if (sumaDia == 3)
	        	System.out.println("Dentro de " + avanzar + " dias sera miercoles");
	        else if (sumaDia == 4)
	        	System.out.println("Dentro de " + avanzar + " dias sera jueves");
	        else if (sumaDia == 5)
	        	System.out.println("Dentro de " + avanzar + " dias sera viernes");
	        else if (sumaDia == 6)
	        	System.out.println("Dentro de " + avanzar + " dias sera sabado");
		}
		return sumaDia;
		
	}
}
