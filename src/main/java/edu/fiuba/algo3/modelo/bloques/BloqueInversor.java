package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueInversor extends BloqueComplejo{
	
	public BloqueInversor() {
		nombre = "bloque_inversor";
	}
	
	@Override
	public void ejecutar(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.ejecutarInversa(personaje, dibujo);
		});
		
	}

}
