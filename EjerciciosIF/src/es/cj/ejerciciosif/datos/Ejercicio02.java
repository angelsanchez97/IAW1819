package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio02 {
	
	// Pedir al usuario dia, mes y año y comprobar que la fecha es correcta
	// incluidos bisiestos.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Anio: ");
		int anio = sc.nextInt();
		
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Dia: ");
		int dia = sc.nextInt();
		
		boolean condicion = false;
		
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)
			condicion = true;
		
		if (anio <= 0)
			System.out.println("El año es incorrecto");
		
		else if (mes < 1 || mes > 13)
			System.out.println("El mes es incorrecto");
		
		else if (condicion = false)
			switch ((int)mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
			case 11:	
				if (dia > 0 && dia < 32) {
					System.out.println("La fecha es correcta");
				break;}
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
			case 12:	
				if (dia > 0 && dia < 31) {
					System.out.println("La fecha es correcta");
				break;}
			default:
				System.out.println("La fecha es incorrecta");
				break;
				
			}
		else {
				switch ((int)mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 9:
				case 11:	
					if (dia > 0 && dia < 32)
						System.out.println("La fecha es correcta y es bisiesto");
					break;
				case 4:
				case 6:
				case 8:
				case 10:
				case 12:	
					if (dia > 0 && dia < 31) {
						System.out.println("La fecha es correcta y es bisiesto");
					break;}
				case 2:
					if (dia > 0 && dia < 30) {
						System.out.println("La fecha es correcta y es bisiesto");
					break;}
				default:
					System.out.println("La fecha es incorrecta");
					break;
			
			}
		}
	}
}
