package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class BloqueAlgoritmo extends Bloque{

	private Collection<Bloque> bloques = new ArrayList<Bloque>();

	public void agregarBloque(Bloque unBloque) {
		bloques.add(unBloque);
	}

	@Override
	public void accion(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.accion(personaje, dibujo);
		});
		
	}


}
