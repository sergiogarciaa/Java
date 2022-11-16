// Alumno: García Barrera, Sergio

/*El array contendrá números aleatorios primos entre 1 y 100. Por último, nos indica cual es el mayor de todos.

4 métodos

Crear un método para rellenar el array con los números aleatorios, otro para comprobar si un número es primo
(un número primo es un número natural mayor que 1 que tiene únicamente dos divisores positivos distintos:
él mismo y el 1),
Otro para mostrar por pantalla los valores del array y por último uno que calcule el mayor.*/

public class Ejercicio8 {
    static int array1[];
    public static void main(String[] args) {
        array1 = new int[100];

        array1= RellenarArray(1,101,array1);

        MostrarArray();
    }


    public static void MostrarArray() {
        int cont = 0;
        int mayor = 0;
        for (int i=0; i<array1.length; i++) {
            if (NumPrim(array1[i])) {
                System.out.println("Número primo: " + array1[i]);
                cont++;
                // NO SABÍA SACARLO EN UN MÉTODO APARTE ASÍ QUE LO HICE AQUI QUE FUE MÁS SENCILLO
                if(array1[i] > mayor ){
                    mayor = array1[i];
                }
            }
        }
        System.out.println("El número primo más grande ha sido: " + mayor);
    }

    public static int[] RellenarArray(int min, int max, int[]array) {
        int n ;
        int contador=0;
        while(contador<array.length) {
            n= (int) (Math.random() * (max - min) + min);
            array[contador]=n;
            contador++;
        }
        return array;
    }

    public static boolean NumPrim(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
}