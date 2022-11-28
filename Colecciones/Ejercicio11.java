package EjerciciosED;
// Alumno: García Barrera, Sergio


import java.util.Scanner;

/*con un método o función principal que llame a un método que pasado un día de la semana y el número de días que se quiere avanzar
 (parámetros), nos devuelva el nombre del próximo día de la semana.
El programa termina cuando se introduce el número 0 en el día de la semana.*/

public class Ejercicio11 {

    public static void main(String[] args) {
        boolean bool;
        String dia;
        int nuevoDia;
        Scanner sc = new Scanner(System.in);
    do{
        bool = true;
        dia = "";
        nuevoDia = 0;

        System.out.println();
        System.out.println();
        System.out.println("Introduce un dia de la semana escrito y debe empezar por mayúsculas (Si deseas salir escribe [fin]): ");
        // toLowerCase convierte lo introducido a minusculas y así puedo operar con minusculas
        dia = sc.next().toLowerCase();

        // Si dia=fin
        if(dia.equals("fin")){
            System.out.println("Ha salido del programa");
            bool = false;
        }
        // Comprueba si es un ida de la semana
        else if(dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes") || dia.equals("sabado") || dia.equals("domingo")){
            System.out.println("Introduce cuantos dias quiere avanzar: ");
            nuevoDia = sc.nextInt();

            diaSemana(dia, nuevoDia);
        }

//Mientras que el booleano sea verdadero
	}while (bool);
	        sc.close();
	    }

    public static int diaSemana(String diadelasemana, int avanzar) {
        int convert = -1;
        int sumaDia = 0;
        // Paso el string a un entero
        switch (diadelasemana)
        {
            case "domingo": convert = 0;
                break;
            case "lunes": convert = 1;
                break;
            case "martes": convert = 2;
                break;
            case "miercoles": convert = 3;
                break;
            case "jueves": convert = 4;
                break;
            case "viernes": convert = 5;
                break;
            case "sabado": convert = 6;
                break;
            default: System.err.println("El dia introducido no es válido o no está en formato texto");
                break;
        }
        //Si es un valor entre 0 y 6 ->
    if(convert>=0 && convert<=6){

        sumaDia = (convert + avanzar) % 7;

        System.out.print("Dentro de " + avanzar + " dias será");
        switch (sumaDia) {
            case 0:
                System.out.println(" Domingo");
                break;
            case 1:
                System.out.println(" Lunes");
                break;
            case 2:
                System.out.println(" Martes");
                break;
            case 3:
                System.out.println(" Miercoles");
                break;
            case 4:
                System.out.println(" Jueves");
                break;
            case 5:
                System.out.println(" Viernes");
                break;
            case 6:
                System.out.println(" Sabado");
                break;
        }
    }
    // Si lo anterior no funciona entonces los datos han sido erroneos
    else{
        System.err.println("No se ha podido realizar el cálculo, los datos han sido erróneos");
    }
        return sumaDia;

    }
}