package edu.fiuba.algo3.modelo.bloque;

public class BloqueMovArriba extends Bloque {
    public void accion{
        Personaje personaje = Personaje.darPersonaje();

        personaje.moverArriba();
    }
}
