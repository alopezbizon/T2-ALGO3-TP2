package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class BloqueInversor extends BloqueComplejo{
	
	@Override
	public void accion(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.accionInversa(personaje, dibujo);
		});
		
	}

}
