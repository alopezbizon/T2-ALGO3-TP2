package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueBajarLapiz extends Bloque {

    public void ejecutar(Personaje personaje, Dibujo dibujo) {
        personaje.bajarLapiz();
    }

	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		personaje.subirLapiz();
		
	}
}
