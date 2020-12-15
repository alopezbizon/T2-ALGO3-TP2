package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;


public class BloqueMovDerecha extends Bloque{

    public void accion() {
        Personaje personaje = Personaje.darPersonaje();
        personaje.moverDerecha();
    }
}
