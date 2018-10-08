package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicios_IF_01 {
	
	// Pedir dos números y decir si son iguales o no
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº1: ");
		int num1 = sc.nextInt();
	
		System.out.println("Nº2: ");
		int num2 = sc.nextInt();
		
	if (num1 == num2)
		System.out.println("Los numeros son iguales");
	else
		System.out.println("No son iguales");
	
	
	// Pedir un número e indicar si es positivo o negativo
	
	System.out.println("Nº3: ");
	int num3 = sc.nextInt();
	
	if (num3 < 0)
		System.out.println("El numero es negativo");
	else if (num3 > 0)
		System.out.println("El numero es positivo");
	else
		System.out.println("El numero es 0");
	
	// Pedir dos números y decir si uno es múltiplo del otro
	
	System.out.println("Nº4: ");
	int num4 = sc.nextInt();
	System.out.println("Nº5: ");
	int num5 = sc.nextInt();
	
	if (num4 % num5 == 1 || num4 % num5 == 2 || num4 % num5 == 3)
		System.out.println("El numero " + num4 + " es multiplo de " + num5);
	else if (num5 % num4 == 1 || num5 % num4 == 2 || num5 % num4 == 3)
		System.out.println("El numero " + num5 + " es multiplo de " + num4);
	else
		System.out.println("No son multiplos");
	
	
	// Pedir dos números e indicar cual es el mayor o si son iguales
		
	System.out.println("Nº6: ");
	int num6 = sc.nextInt();
	System.out.println("Nº7: ");
	int num7 = sc.nextInt();
	
	if (num6 > num7)
		System.out.println(num6 + " Es mayor que " + num7);
	else if (num7 > num6)
		System.out.println(num7 + " Es mayor que " + num6);
	else
		System.out.println("Son iguales.");
	
	// Pedir dos números y mostrarlos ordenados de mayor a menor
	
	

	}
}
