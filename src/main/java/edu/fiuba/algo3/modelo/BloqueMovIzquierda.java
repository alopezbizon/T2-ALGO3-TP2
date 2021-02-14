package edu.fiuba.algo3.modelo;


public class BloqueMovIzquierda extends Bloque {

    public void ejecutar(Personaje personaje, Dibujo dibujo) {
        personaje.mover(new Posicion(-1,0), dibujo);
    }

	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		personaje.mover(new Posicion(1,0), dibujo);
		
	}
}
