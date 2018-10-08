package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Pedir nota de 0 a 10 y mostrarla como insuficiente, suficiente, bien, notable o sobresaliente.
		
		System.out.println("Nota: ");
		double num1 = sc.nextDouble();
		
		if (num1 < 5)
			System.out.println("Insuficiente");
		else if (num1 >= 5 && num1 < 6)
			System.out.println("Suficiente");
		else if (num1 >= 6 && num1 < 7)
			System.out.println("Bien");
		else if (num1 >= 7 && num1 <9)
			System.out.println("Notable");
		else if (num1 >= 9 && num1 <= 10)
			System.out.println("Sobresaliente");
		else
			System.out.println("Tas colao amigo");
		
		
		switch ((int)num1) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("insuficiente");
			break;
		case 5:
			System.out.println("Bien");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;

		default:
			System.out.println("Tas colao amigo");
			break;
		}

	}

}
