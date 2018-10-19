package es.cj.datos;

import java.util.Scanner;

public class EjercicioWhileCinco {
				
				// Pedir un numero y su factorial
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		int multiplicacion = 1;
		for (int i = 1; i <= numero; i++) {
			 multiplicacion = multiplicacion * i;
		}
		
		System.out.println(multiplicacion);
	}
	
}
