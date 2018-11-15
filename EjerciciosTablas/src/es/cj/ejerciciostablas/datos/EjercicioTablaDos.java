package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Leer n números ordenados crecientemente. Pedir al usuario un número y buscarlo en la 
// tabla. Se debe mostrar la posición en la que se encuentra. Si no está, indicarlo con 
// un mensaje

public class EjercicioTablaDos {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Cantidad de numeros: ");
		int cuantos = sc.nextInt();

		int tabla[] = new int[cuantos];

		for (int i = 0; i < cuantos; i++) {
			tabla[i] = new Random().nextInt(10);
		}

		Arrays.sort(tabla);

		System.out.println(Arrays.toString(tabla));

		System.out.println("Numero que que quieres buscar (entre 0 y 9): ");
		int numero = sc.nextInt();
		
		int hola = Arrays.binarySearch(tabla, numero);
		
		if (hola < 0) {
			System.out.println("El numero no esta en la tabla;");
		}
		else {
			System.out.println("El numero se encuentra en la posicion: " + hola);
		}

	}

}
