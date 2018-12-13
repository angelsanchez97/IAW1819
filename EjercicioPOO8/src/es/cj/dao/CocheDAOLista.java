package es.cj.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
				
			}i++;
		}
	}

	@Override
	public void velocidad(Coche c, int velocidad) {
		for (Coche v_coche : listacoche) {
			if (v_coche.equals(c)) {
				v_coche.setVelocidad(velocidad);
			}
		}
	}

	@Override
	public boolean borrar(String nombre, String marca) {
		for (Coche v_coche : listacoche) {
			if (v_coche.getNombre().equals(nombre) && v_coche.getMarca().equals(marca)) {
				listacoche.remove(v_coche);
			}
		}
		return false;
	}

	@Override
	public boolean borrartodos() {
		return listacoche.removeAll(listacoche);
	}

	@Override
	public void buscarCochesPrecio(double precio) {
		for (Coche v_coche : listacoche) {
			if (v_coche.getPrecio() == precio) {
				System.out.println(v_coche);
			}
			else{
				System.out.println("No hay coches que tengan ese precio.");
			}
		}

	}

	@Override
	public void buscarCochesAnyosFabric(int anyo_in, int anyo_fin) {
		for (Coche v_coche : listacoche) {
			if (anyo_in < v_coche.getAnyo_fabricacion() && v_coche.getAnyo_fabricacion() < anyo_fin) {
				System.out.println(v_coche);
			}
			else{
				System.out.println("No hay coches entre esa fecha.");
			}
		}

	}

	@Override
	public void listar() {
		for (Coche v_coche : listacoche) {
				System.out.println(v_coche);
		}

	}

}
