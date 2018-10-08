package es.cj.fundamentos01.datos;

import java.util.Scanner;

public class EjercicioCuatro {
	// Pida al usuario los segundos e improme la cantidad de segundos,
	// minutos y horas
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Segundos: ");
		
		double segundos = sc.nextDouble();
		double horas = segundos / 3600;
		System.out.println("Horas: " + horas);
		
		double minutos = (segundos % 3600) / 60;
		System.out.println("Minutos: " + minutos);
		
		System.out.println("Segundos: " + segundos);
	}

}
