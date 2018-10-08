package es.cj.fundamentos01.datos;

import java.util.Scanner;

public class EjercicioTres {
	// Pedir el radio de un circulo y calcular su area y su longitud
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Radio: ");
		double radio = sc.nextDouble();
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area es " + area);
		double longitud = 2 * radio * Math.PI;
		System.out.println("La longitud es " + longitud);
	}

}
