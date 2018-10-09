package ejercicios_semanales;

import java.util.Scanner;

public class Ejercicio01 {
	
	// Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Numero: ");
		int num1 = sc.nextInt();
		
		if (num1 <= 0)
			System.out.println("El numero no es correcto");
		
		else if (num1 >= 1 && num1 < 10)
			System.out.println("El numero tiene 1 cifra y menos de 2");
		
		else if (num1 >= 10 && num1 < 100)
			System.out.println("El numero tiene 2 cifra y menos de 3");
		
		else if (num1 >= 100 && num1 < 1000)
			System.out.println("El numero tiene 3 cifra y menos de 4");
		
		else if (num1 >= 1000 && num1 < 10000)
			System.out.println("El numero tiene 4 cifras");
		
		else
			System.out.println("Te has equivocado de numero");
	}
}
