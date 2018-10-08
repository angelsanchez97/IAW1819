package es.cj.fundamentos01.datos;

import java.util.Scanner;

public class EjercicioUno {
	
	
	// Programa que realice la conversion de grados Celsius a Farenhait.
	// Los grados Celsius debe introducirlo el usuario
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Grados Celius: ");
		double grados = sc.nextDouble();
		double fahrenheit = (grados * 1.8) +32;
		
		System.out.println(grados + " grados celsius son " + fahrenheit + " grados farenheit");
		
		
	}

}
