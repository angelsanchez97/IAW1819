package ejercicios_semanales;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio04 {

	public static class EjercicioTablaDos {

		private static Scanner sc = new Scanner(System.in);

		private static int[] numeros = new int[20];

		private static int veces = 0, posicion = -1;

		public static void main(String[] args) {
			rellenarTabla();
			mostrarTabla();
			int num = 0;
			do {
				System.out.println("Nº: ");
				num = sc.nextInt();

				if (num > 0) {
					calcularVecesPosicion(num);
					System.out.println("Veces: " + veces);
					System.out.println("Posicion: " + posicion);
					veces = 0;
					posicion = -1;
				}
			} while (num != 0);

			System.out.println("Fin");

		}

		private static void mostrarTabla() {
			System.out.println(Arrays.toString(numeros));
		}

		private static void rellenarTabla() {
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = new Random().nextInt(50) + 1;
			}

		}

		private static void calcularVecesPosicion(int num) {
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] == num) {
					veces++;
					if (veces == 1) {
						posicion = i;
					}
				}
			}

		}

	}
}
