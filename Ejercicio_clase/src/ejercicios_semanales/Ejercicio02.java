package ejercicios_semanales;

import java.util.Scanner;

public class Ejercicio02 {
	
		// Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		// Si trabaja 40 horas o menos se le paga 16€ por hora 
		// Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.
		private static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			System.out.println("Numero de horas: ");
			double num1 = sc.nextDouble();
			
			if (num1 <= 40) {
				double paga = num1 * 16;
			System.out.println("Cobras: " + paga);
			}
			else if (num1 > 40) {
				double horas = num1 - 40;
				double paga1 = 40 * 16;
				double paga2 = horas * 20;
				double paga = paga1 + paga2;
				System.out.println("Cobras: " + paga);
			}


	}

}
