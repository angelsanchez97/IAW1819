package es.cj.datos;

import java.util.Scanner;

public class EjercicioWhileUno {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Programa que muestre y calcule el producto de los n primeros números impares

		System.out.println("Numero: ");
		double numero = sc.nextDouble();

		if (numero > 0) {
			double multiplicacion = 1;
			for (int i = 1; i <= numero; i += 2) {
				multiplicacion = multiplicacion * i;
			}
			System.out.println(multiplicacion);
		} else {
			System.out.println("Te has equivocado de numero.");
		}

	}

}