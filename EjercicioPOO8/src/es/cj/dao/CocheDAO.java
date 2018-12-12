package es.cj.dao;

import es.cj.beam.Coche;

public interface CocheDAO {
	public void insertar(Coche c);
	public void actualizad(Coche oldcar, Coche newcar);
	public void velocidad(Coche c, int velocidad);
	public boolean borrar(String nombre, String marca);
	public boolean borrartodos();
	public void buscarCochesPrecio(double precio);
	public void buscarCochesAnyosFabric(int anyo_in, int anyo_fin);
	public void listar();
}
