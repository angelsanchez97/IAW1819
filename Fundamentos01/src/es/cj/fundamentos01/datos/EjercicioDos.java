package es.cj.fundamentos01.datos;

import java.util.Scanner;

public class EjercicioDos {
	// Define 2 variables de tipo entero para describir las longitudes de los
	// lados de un rectangulo. El programa debe calcular y mostrar las
	// longitudes de los lados, el perimetro y el area del rectangulo.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Alto: ");
		double alto = sc.nextDouble();
		System.out.println("Ancho: ");
		double ancho = sc.nextDouble();
		double perimetro = (alto * 2) + (ancho * 2);
		System.out.println("El perimetro es " + perimetro);
		double area = alto * ancho;
		System.out.println("El area es " + area);
	}

}
