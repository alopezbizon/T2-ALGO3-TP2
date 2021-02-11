package edu.fiuba.algo3.modelo;


public class BloqueMovAbajo extends Bloque {

    public void accion(Personaje personaje, Dibujo dibujo) {
        personaje.mover(new Posicion(0,-1), dibujo);
    }
}
