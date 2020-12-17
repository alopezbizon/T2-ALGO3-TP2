package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.tablero.Posicion;


public class BloqueMovAbajo extends Bloque {

    public void accion() {
        Personaje personaje = Personaje.darPersonaje();
        personaje.mover(new Posicion(0,-1));
    }
}
