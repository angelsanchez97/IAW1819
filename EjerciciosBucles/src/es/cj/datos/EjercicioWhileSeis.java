package es.cj.datos;
import java.util.Scanner;
public class EjercicioWhileSeis {
	private static Scanner sc = new Scanner(System.in);
	// Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. Además, solicite al usuario que tabla quiere mostrar
	
	public static void main(String[] args) {
		
		for(int i=1; i <= 10; i++ ) {
			System.out.println("Tabla del: " + i);
			for(int a=1; a <= 10; a++) {
				int multiplicacion = i * a;
				System.out.println(i + " * " + a + " = " + multiplicacion);  			
			}
			
		}
		System.out.println("Que tabla desea mostrar: ");
		int numero = sc.nextInt();
		for(int i=0; i <= 10; i++ ) {
			int multiplicacion = i * numero;
			System.out.println(i + " * " + numero + " = " + multiplicacion);
		}
		
	}

}
