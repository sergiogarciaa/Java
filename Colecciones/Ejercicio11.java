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
        dia = sc.next();

        if(dia.equals("fin")){
            System.out.println("Ha salido del programa");
            bool = false;
        }
        else if(dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || dia.equals("Jueves") || dia.equals("Viernes") || dia.equals("Sabado") || dia.equals("Domingo")){
            System.out.println("Introduce cuantos dias quiere avanzar: ");
            nuevoDia = sc.nextInt();

            diaSemana(dia, nuevoDia);
        }


}while (bool);
        sc.close();
    }

    public static int diaSemana(String diadelasemana, int avanzar) {
        int convert = -1;
        int sumaDia = 0;
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
            default: System.err.println("El dia introducido no es válido o no está en formato texto");
                break;
        }
    if(convert>0 && convert<=6){

        sumaDia = (convert + avanzar) % 7;

        switch (sumaDia) {
            case 0:
                System.out.println("Dentro de " + avanzar + " dias sera Domingo");
                break;
            case 1:
                System.out.println("Dentro de " + avanzar + " dias sera Lunes");
                break;
            case 2:
                System.out.println("Dentro de " + avanzar + " dias sera Martes");
                break;
            case 3:
                System.out.println("Dentro de " + avanzar + " dias sera Miercoles");
                break;
            case 4:
                System.out.println("Dentro de " + avanzar + " dias sera Jueves");
                break;
            case 5:
                System.out.println("Dentro de " + avanzar + " dias sera Viernes");
                break;
            case 6:
                System.out.println("Dentro de " + avanzar + " dias sera Sabado");
                break;
        }
    }
    else{
        System.err.println("No se ha podido realizar el cálculo, los datos han sido erróneos");
    }
        return sumaDia;

    }
}