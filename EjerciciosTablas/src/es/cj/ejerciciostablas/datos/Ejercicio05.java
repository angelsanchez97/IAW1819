package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
	private static Scanner sc = new Scanner(System.in);

	// Crear una tabla de n números y desplazarla una posición hacia abajo, es
	// decir,
	// el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así
	// sucesivamente.
	// El último pasa a ser el primero

	public static void main(String[] args) {
		System.out.println("Cantidad de numeros de las tablas: ");
		int cuantos = sc.nextInt();
		int tabla1[] = new int[cuantos];
		int tabla2[] = new int[cuantos];

		for (int i = 0; i < cuantos; i++) {
			tabla1[i] = new Random().nextInt(10) + 1;
		}

		for (int i = 0; i < cuantos; i++) {
			if (i == cuantos - 1) {
				tabla2[0] = tabla1[i];
			} else {
				tabla2[i + 1] = tabla1[i];
			}
		}

		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
	}

}
