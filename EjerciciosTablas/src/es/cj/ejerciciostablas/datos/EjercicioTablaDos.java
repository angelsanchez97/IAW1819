package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Leer n n�meros ordenados crecientemente. Pedir al usuario un n�mero y buscarlo en la 
// tabla. Se debe mostrar la posici�n en la que se encuentra. Si no est�, indicarlo con 
// un mensaje


public class EjercicioTablaDos {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Cantidad de numeros: ");
		int cuantos = sc.nextInt();
		
		int tabla [] = new int [cuantos];
		
		
		for (int i = 0; i < cuantos; i++) {
			tabla[i] = new Random().nextInt(10);
		}
		
		Arrays.sort(tabla);
		
		
		
		
		
	}

}
