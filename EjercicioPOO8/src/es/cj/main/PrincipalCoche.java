package es.cj.main;

import es.cj.beam.Coche;
import es.cj.dao.CocheDAO;
import es.cj.dao.CocheDAOLista;

public class PrincipalCoche {

	public static void main(String[] args) {
		CocheDAO Coches = new CocheDAOLista();
		
		Coche c1 = new Coche(2010, 100, 15000.00, "Sarai", "yes i do");
		Coche c2 = new Coche(2014, 300, 20000, "pepe", "Mercedes");
		Coche c3 = new Coche(2017, 350, 25000, "Clase A", "Mercedes");
		
		Coches.insertar(c1);
		Coches.insertar(c2);
		
		
		Coches.listar();
		//Coches.borrartodos();
		//Coches.listar();
		//Coches.buscarCochesPrecio(15000);
		//Coches.buscarCochesAnyosFabric(2000, 2010);
		//Coches.velocidad(c1, 200);
		Coches.actualizad(c2, c3);
		Coches.listar();
		
	}

}
