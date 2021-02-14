package edu.fiuba.algo3.modelo;


public class BloqueSubirLapiz extends Bloque {

    public void ejecutar(Personaje personaje, Dibujo dibujo) {
        personaje.subirLapiz();
    }

	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		personaje.bajarLapiz();		
	}
}
