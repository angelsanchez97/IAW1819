package es.cj.ejerciciostablas.datos;

// Leer n números enteros, guardarlos en la tabla y mostrar la media de los positivos, 
// media negativos y el número de ceros
import java.util.Scanner;

public class Ejercicio_semanales {
		
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Cantidad de numeros: ");
		int cuantos = sc.nextInt();
		
		int tabla [] = new int [cuantos];
		
		double SumaP = 0, SumaN = 0, Contp = 0, ContN = 0, ContadorC = 0;
		
		for (int i = 0; i < cuantos; i++) {
			
			System.out.println("Numero: " + i);
			tabla[i] =  sc.nextInt();
			if (tabla[i] > 0) {
				SumaP = tabla[i] + SumaP;
				Contp++;
			}
			else if (tabla[i] < 0) {
				SumaN = tabla[i] + SumaN;
				ContN++;
			}
			else {
				ContadorC++;
			}
		}
		
		SumaP = SumaP/Contp;
		
		System.out.println("Media positivos: " + SumaP);
		
		SumaN = SumaN/ContN;
		
		System.out.println("Media negativos: " + SumaN);
		
		System.out.println("Cantidad de ceros: " + ContadorC);
	}
}
