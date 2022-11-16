package ed2009;

public class proyecto {

	public static void main(String[] args) {
		
		//imprimir por pantalla
		
		System.out.print("Hola Mundo \n");
		System.out.printf("%.3f %.1f %n", 12.3698, 5.83)
		System.out.println("Hola Mundo");
		
		//Declaraciones de variables
		
		int edad; //Numeros enteros cortos
		long distacia; //Numeros enteros largos
		
		float peso; //Numeros decimales cortos
		double tamaño; //Numeros decimales laroos
		
		boolean esPrimo; //Verdadero falso
		
		String tuNombre; // Cadena de caracteres
		
		char tuLetraFavorita; //Caracter o letra
		
		//Void --> Tipo de dato que no devuelve nada
		Void var;
		
		long variableEnteraLarga;
		Long variableEnteraLarga1;
		
		//Inicializar o asignar valores a variables
		
		edad=25; // Le hemos asignado a la variable edad (tipo int) el valor 25
		tamaño=45.78; // Le hemos asignado a la variable tamaño el valor 45,78
		esPrimo=false; // He puesto que no es primo
		tuNombre="Me llamo Pepe"; // Le hemos asignado a la variable nombre un valor
		tuLetraFavorita='&'; //Le hemos asignado a la variable un simbolo, con comillas simples
		
		//Expresiones
		
		int a;
		a=3*4; //Si pusiesemon división entro 0, No genera error de compilación pero si de ejecución
		//a=3.4*3.8 Genera un error de compilación
		System.out.println(a);
		
		int b,c,d;
		b=5;
		c=6+b;
		d=b+c;
		
		//CLASE
		
		int numero1;
		numero1=700;
		System.out.println(numero1+50);
		
		String saludo = "Hola";
		String despedida = "Bye";
		System.out.println(saludo+"/t"+despedida+ "\n");
		
		
		//Ejercicio 1
		
		String holaMundo; // creamos la variable saludo tipo String ya que será un outprint
		
		holaMundo="hola mundo"; //le asignamos el valor
		
		System.out.println(holaMundo); //creamos un print con la variable
		
		long numeroGrande=5000000000L;
		System.out.println(numeroGrande);
	}

}
