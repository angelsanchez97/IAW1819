package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
	// Leer 2 tablas de n números y mezclarla en una tercera tabla de la
	// siguiente forma:
	// 1º de A, 1º de B, 2º de A, 2º de B, 3º de A, 3º de B,..
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Cantidad de numeros de las tablas: ");
		int cuantos = sc.nextInt();
		int tabla1[] = new int[cuantos];
		int tabla2[] = new int[cuantos];

		for (int i = 0; i < cuantos; i++) {
			tabla1[i] = new Random().nextInt(10) + 1;
		}
		for (int i = 0; i < cuantos; i++) {
			tabla2[i] = new Random().nextInt(10) + 1;
		}
		int tabla3[] = new int[cuantos * 2];

		for (int i = 0; i < tabla3.length - 1; i += 2) {
			for (int j = 0; j < tabla1.length; j++) {
				if (i == j + j) {
					tabla3[i] = tabla1[j];
				}
			}
		}

		for (int i = 1; i < tabla3.length; i += 2) {
			for (int j = 0; j < tabla1.length; j++) {
				if (i == j + j + 1) {
					tabla3[i] = tabla2[j];
				}
			}
		}

		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
		System.out.println(Arrays.toString(tabla3));
	}

}
