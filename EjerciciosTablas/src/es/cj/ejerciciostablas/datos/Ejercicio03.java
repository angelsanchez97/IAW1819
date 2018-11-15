package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {
	// Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los impares
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca número:");
		int cuantos = sc.nextInt();
		int numeropar = 0, numeroimpar = 0;
		int par = 0, impar = 0;

		int tabla[] = new int[cuantos];

		for (int i = 0; i < cuantos; i++) {
			tabla[i] = new Random().nextInt(10) + 1;
		}
		for (int i = 0; i < cuantos; i++) {
			if (tabla[i] % 2 == 0) {
				numeropar++;
			} else {
				numeroimpar++;
			}
		}
		int tabla2[] = new int[numeropar];
		int tabla3[] = new int[numeroimpar];

		for (int i = 0; i < cuantos; i++) {
			if (tabla[i] % 2 == 0) {
				tabla2[par] = tabla[i];
				par++;
			} else {
				tabla3[impar] = tabla[i];
				impar++;
			}
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(tabla2));
		System.out.println(Arrays.toString(tabla3));
	}

}
