package es.cj.datos;

import java.util.Scanner;

public class EjercicioWhileOnce {
			// Solicite un n�mero y muestre el cuadrado del n�mero. 
			// El cuadrado de un n�mero se obtiene de sumar tantos n�meros 
			// impares como indique el n�mero. El cuadrado de 1 es 1. 
			// El cuadrado de 2 es 4, es decir, 1 + 3. El cuadrado de 3 es 9, 
			// es decir, 1 + 3 + 5
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("N�: ");
		int numero = sc.nextInt();
		int aux = numero;
		int numero2 = 1;
		while (aux >= 0) {
			numero2 = numero2 + 2;
			aux--;
		}
		
		System.out.println(numero2);
	}

}
