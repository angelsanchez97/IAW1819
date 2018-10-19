package es.cj.datos;

public class EjercicioWhileSeis {

	// Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. Además, solicite al usuario que tabla quiere mostrar
	
	public static void main(String[] args) {
		
		for(int i=1; i <= 10; i++ ) {
			System.out.println("Tabla del: " + i);
			for(int a=1; a <= 10; a++) {
				int multiplicacion = i * a;
				System.out.println(i + " * " + a + " = " + multiplicacion);  			}
			
		}
		
	}

}
