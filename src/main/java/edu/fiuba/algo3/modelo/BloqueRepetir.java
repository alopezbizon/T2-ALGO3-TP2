package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BloqueRepetir extends Bloque {

	private Collection<Bloque> bloques = new ArrayList<Bloque>();
	protected int cantidadRepeticiones;

	public void agregarBloque(Bloque unBloque) {
		bloques.add(unBloque);
	}

	@Override
	public void accion(Personaje personaje, Dibujo dibujo) {
		for (int i = 0; i < cantidadRepeticiones; i++) {

			bloques.forEach(bloque -> {
				bloque.accion(personaje, dibujo);
			});
		}
	}

	@Override
	public void accionInversa(Personaje personaje, Dibujo dibujo) {
		for (int i = 0; i < cantidadRepeticiones; i++) {

			bloques.forEach(bloque -> {
				bloque.accionInversa(personaje, dibujo);
			});
		}

	}
}
