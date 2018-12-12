package es.java.main;

import es.java.clase.caja;

public class Principal {

	public static void main(String[] args) {
		
		caja c = new caja(1,2,3);
		caja c1 = new caja(1,2,3);
		
		//c.setAlto(23);
		
		System.out.println("El alto es: " + c.getAlto());
		System.out.println("Volumen: " + c.obtenervolumen());
		System.out.println("Volumen: " + c.obtenervolumen(3));
		
		
		System.out.println(c);
		
		if (c.equals(c1)) {
			System.out.println("Iguales");
		}
		else {
			System.out.println("Distintos");
		}
	}

}
