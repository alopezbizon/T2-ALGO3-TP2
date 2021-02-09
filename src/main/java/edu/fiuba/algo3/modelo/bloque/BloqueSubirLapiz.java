package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;


public class BloqueSubirLapiz extends Bloque {

    public void accion(Personaje personaje) {
        personaje.subirLapiz();
    }
}
