package es.cj.datos;

import java.util.Random;
import java.util.Scanner;

public class EjercicioNueve {

	// Leer por teclado una serie de n n�meros. La aplicaci�n debe indicarnos si 
	//los n�meros est�n ordenados de forma creciente, decreciente o si no est�n ordenados

		private static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		int cantidad = 0;
		do {
			System.out.println("Cantidad de Numeros: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);
		
		// 1:Creciente
		// -1:Decreciente
		// 0:Desordenado
		int orden = comprobarOrden(cantidad);
		
		switch (orden) {
		case 1:
			System.out.println("CRECIENTE");
			break;
		case -1:
			System.out.println("DECRECIENTE");
			break;
		default:
			System.out.println("DESORDENADOS");
			break;
		}
		
		
		sc.close();
	}

	private static int comprobarOrden(int cant) {
		int orden = 0;
		
		boolean creciente = false, decreciente = false;
		int numero = 0, auxiliar = 0;
		
		for (int i = 0; i < cant; i++) {
			numero = new Random().nextInt(100);
			System.out.print(numero + " ");
			
			if (i ==0) {
				auxiliar = numero;
			} else {
				if (numero > auxiliar) {
					creciente = true;
				} else if (numero < auxiliar) {
					decreciente = true;
				}
				auxiliar = numero;
			}
		}
		
		if (creciente && !decreciente)
			orden = 1;
		else if (!creciente && decreciente)
			orden = -1;
		
		return orden;
	}

}
