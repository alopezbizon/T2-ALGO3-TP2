package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class BloqueMovAbajo extends Bloque {

	public BloqueMovAbajo() {
		nombre = "bloque_mov_abajo";
	}
	
    public void ejecutar(Personaje personaje, Dibujo dibujo) {
        personaje.mover(new Posicion(0,-1), dibujo);
    }

	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		personaje.mover(new Posicion(0,1), dibujo);
		
	}
	
}
