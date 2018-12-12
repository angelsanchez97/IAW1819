package es.cj.dao;

import java.util.ArrayList;
import java.util.List;

import es.cj.beam.Coche;

public class CocheDAOLista implements CocheDAO {
	
	private List<Coche> listacoche = new ArrayList<>();
	
	@Override
	public void insertar(Coche c) {
		if (!listacoche.contains(c)) {
			listacoche.add(c);
		}

	}

	@Override
	public void actualizad(Coche oldcar, Coche newcar) {
		int i = 0;
		for (Coche c : listacoche) {
			if (c.equals(oldcar)) {
				listacoche.set(i, newcar);
				i++;
			}
		}
	}

	@Override
	public void velocidad(Coche c, int velocidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean borrar(String nombre, String marca) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean borrartodos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void buscarCochesPrecio(double precio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buscarCochesAnyosFabric(int anyo_in, int anyo_fin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub

	}

}
