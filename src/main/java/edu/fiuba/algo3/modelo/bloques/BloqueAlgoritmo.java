package edu.fiuba.algo3.modelo.bloques;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueAlgoritmo extends BloqueComplejo{
		
	@Override
	public void ejecutar(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.ejecutar(personaje, dibujo);
		});
		
	}

	public void agregarBloques(ArrayList<Bloque> bloques) {
		this.bloques.addAll(bloques);
		
	}
}
