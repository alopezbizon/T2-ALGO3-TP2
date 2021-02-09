package edu.fiuba.algo3.modelo;


public class BloqueMovIzquierda extends Bloque {

    public void accion(Personaje personaje) {
        personaje.mover(new Posicion(-1,0));
    }
}
