package edu.fiuba.algo3.modelo;


public class BloqueBajarLapiz extends Bloque {

    public void ejecutar(Personaje personaje, Dibujo dibujo) {
        personaje.bajarLapiz();
    }

	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		personaje.subirLapiz();
		
	}
}
