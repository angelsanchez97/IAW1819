package ejercicios_semanales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {
	private static int tabla[] = new int[10];
	private static int tabla2[] = new int[7];
	private static int mayor = 0, posicion = 0;

	public static void main(String[] args) {

		iniciarTabla();
		numeroRepite();
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(tabla2));
		muestra();
	}

	private static void muestra() {
		for (int i = 0; i < tabla2.length; i++) {
			if (tabla2[i] > mayor) {
				mayor = tabla2[i];
				posicion = i;
			}
		}
		System.out.println("El numero que mas se repite es el " + posicion);
	}

	private static void iniciarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(6) + 1;
		}
	}

	private static void numeroRepite() {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla2.length; j++) {
				if (tabla[i] == j) {
					tabla2[j]++;
				}
			}
		}

	}
}
