package src.ejercicios.cadenas;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Realizar un programa que reciba dos cadenas de caracteres
		// y cuente el número de apariciones de la primera en la segunda

		String cadena1 = "hola";
		String cadena2 = "hola que tal. hola que pasa, hola";

		int cont = 0;
		int pos = cadena2.indexOf(cadena1);

		while (pos != -1) {
			cont++;
			pos = cadena2.indexOf(cadena1, pos + 1);
		}
		System.out.println(cont);
	}
}
