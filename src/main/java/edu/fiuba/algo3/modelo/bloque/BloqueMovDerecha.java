package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.tablero.Posicion;


public class BloqueMovDerecha extends Bloque{

    public void accion(Personaje personaje) {
        personaje.mover(new Posicion(1,0));
    }
}
