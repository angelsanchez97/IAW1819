package src.ejercicios.cadenas;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Escriba un método que, dada una cadena de caracteres, de la suma de 
		// todos los dígitos que hay en ella. Por ejemplo, si la cadena es abc12de3f4, 
		// dará como resultado 10.
		
		String cadena1 = "abc12de3f4";
		
		int suma = 0;
		
		char[] tabla = cadena1.toCharArray();
		
		System.out.println(Arrays.toString(tabla));
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] >= 48 && tabla[i] <= 59) {
				String prueba = String.valueOf(tabla[i]);
				suma = suma + Integer.parseInt(prueba);
			}
		}
		
		System.out.println(suma);
	}

}
