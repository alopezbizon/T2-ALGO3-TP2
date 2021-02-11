package edu.fiuba.algo3.modelo;


public class BloqueBajarLapiz extends Bloque {

    public void accion(Personaje personaje, Dibujo dibujo) {
        personaje.bajarLapiz();
    }

	@Override
	public void accionInversa(Personaje personaje, Dibujo dibujo) {
		personaje.subirLapiz();
		
	}
}
