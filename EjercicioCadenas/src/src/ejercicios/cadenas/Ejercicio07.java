package src.ejercicios.cadenas;

public class Ejercicio07 {

	public static void main(String[] args) {
		String cadena1 = "amor";
		// String cadena2 =cadena1.replaceAll(" ", "");

		int letraanterior = 0;
		
		boolean comprueba = true;

		char[] tabla = cadena1.toCharArray();

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] >= 97 && tabla[i] <= 122) {
				String prueba = String.valueOf(tabla[i]);
				int prueba2 = prueba.charAt(0);
				
				if (prueba2 < letraanterior) {
					comprueba = false;
				}
				
				letraanterior = prueba2;
			} 
		}
		
		if (comprueba == true) {
			System.out.println("Verdadero");
		}
		else {
			System.out.println("Falso");
		}

	}

}
