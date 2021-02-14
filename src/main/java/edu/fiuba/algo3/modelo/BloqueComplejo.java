package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BloqueComplejo extends Bloque{

	protected Collection<Bloque> bloques = new ArrayList<Bloque>();

	public void agregarBloque(Bloque unBloque) {
		bloques.add(unBloque);
	}
	
	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		this.ejecutar(personaje, dibujo);
		
	}

}
