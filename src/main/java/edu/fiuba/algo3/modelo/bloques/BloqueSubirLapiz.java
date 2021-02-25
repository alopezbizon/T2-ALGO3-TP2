package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueSubirLapiz extends Bloque {

	public BloqueSubirLapiz() {
		nombre="bloque_subir_lapiz";
	}
	
    public void ejecutar(Personaje personaje, Dibujo dibujo) {
        personaje.subirLapiz();
    }

	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		personaje.bajarLapiz();		
	}
}
