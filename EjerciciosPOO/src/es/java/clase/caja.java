package es.java.clase;

public class caja {

	// Atributos
	private double ancho;
	private double alto;
	private double largo;
	
	
	// Constructores
	public caja() {
		// Siempre.
	}
	
//	public caja(double an, double al, double la) {
//		ancho = an;
//		alto = al;
//		largo = la;
//	}
//	
//	public caja(double an, double al) {
//		ancho = an;
//		alto = al;
//	}

	public caja(double ancho, double alto, double largo) {
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}

	
	// GET y SET
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	// Metodos
	public double obtenervolumen() {
		return ancho * alto * largo;
		
	}
	
	public double obtenervolumen(double valor) {
		return ancho * alto * largo * valor;
		
	}

	@Override
	public String toString() {
		return "caja [ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(alto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ancho);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(largo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		caja other = (caja) obj;
		if (Double.doubleToLongBits(alto) != Double.doubleToLongBits(other.alto))
			return false;
		if (Double.doubleToLongBits(ancho) != Double.doubleToLongBits(other.ancho))
			return false;
		if (Double.doubleToLongBits(largo) != Double.doubleToLongBits(other.largo))
			return false;
		return true;
	}
	
//	public boolean equals(caja aux) {
//		if (this.ancho == aux.ancho &&
//				this.alto == aux.alto &&
//					this.largo == aux.largo) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	
	
}
