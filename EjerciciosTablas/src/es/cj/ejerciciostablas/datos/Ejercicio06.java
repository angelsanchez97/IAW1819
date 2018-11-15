package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	// Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1.
	// Eliminar el valor de esa posición y desplazar todos los elementos para no
	// dejar el hueco vacío

	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Cantidad de numeros de las tablas: ");
		int cuantos = sc.nextInt();
		int tabla1[] = new int[cuantos];
		int tabla2[] = new int[cuantos - 1];

		for (int i = 0; i < cuantos; i++) {
			tabla1[i] = new Random().nextInt(10) + 1;
		}
		System.out.println(Arrays.toString(tabla1));

		System.out
				.println("Posicion que quieres borrar: ");
		int posicion = sc.nextInt();

		for (int i = 0; i < cuantos; i++) {
			if (i < posicion) {
				tabla2[i] = tabla1[i];
			} else if (i > posicion) {
				tabla2[i - 1] = tabla1[i];
			}
		}

		System.out.println(Arrays.toString(tabla2));
	}
}
