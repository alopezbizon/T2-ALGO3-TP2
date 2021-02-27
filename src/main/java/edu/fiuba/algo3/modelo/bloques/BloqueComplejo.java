package edu.fiuba.algo3.modelo.bloques;

import java.util.ArrayList;
import java.util.Collection;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;


public abstract class BloqueComplejo extends Bloque{

	protected Collection<Bloque> bloques = new ArrayList<>();

	public void agregarBloque(Bloque unBloque) {
		bloques.add(unBloque);
	}
	
	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		this.ejecutar(personaje, dibujo);
	}
}
