package edu.fiuba.algo3.modelo;


public class BloqueMovAbajo extends Bloque {

    public void accion(Personaje personaje) {
        personaje.mover(new Posicion(0,-1));
    }
}
