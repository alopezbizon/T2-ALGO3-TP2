package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;


public class BloqueBajarLapiz extends Bloque {

    public void accion(Personaje personaje) {
        personaje.bajarLapiz();
    }
}
