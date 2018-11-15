package src.ejercicios.cadenas;

import java.util.Random;
import java.util.Arrays;

public class Ejercicio05 {
	// Dada una cadena y un código entero aleatorio. Generar una cadena cifrada
	// donde cada carácter se
	// sustituye por el carácter situado n posiciones después del mismo.
	// Debe empezar por la letra A si la suma del carácter con el codigo es
	// mayor que Z

	public static void main(String[] args) {
		String cadena1 = "HiJo de Puta EL PepE ave";
		// String cadena2 =cadena1.replaceAll(" ", "");

		int numero = new Random().nextInt(10) + 1;
		System.out.println(numero);
		int suma = 0;

		char[] tabla = cadena1.toCharArray();

		System.out.println(Arrays.toString(tabla));

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] >= 65 && tabla[i] <= 90 || tabla[i] >= 97
					&& tabla[i] <= 122) {
				String prueba = String.valueOf(tabla[i]);
				int prueba2 = prueba.charAt(0);

				int prueba3 = prueba2 + numero;

				if (prueba3 > 90 && prueba3 <= 96) {
					suma = 65 + numero;
				}

				else if (prueba3 > 122) {
					suma = 97 + numero;
				}

				else {
					suma = prueba2 + numero;
				}

				char letra = (char) suma;
				System.out.print(letra);
				suma = 0;
			} 
		}
	}

}
