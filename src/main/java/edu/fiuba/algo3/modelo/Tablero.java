package edu.fiuba.algo3.modelo;


public class Tablero {

    private static Tablero tablero;
    private Integer dimension = 15;

    public Tablero() {}

    public boolean validarPosicion(Posicion nuevaPosicion) {
        return nuevaPosicion.esMenor(new Posicion(this.dimension, this.dimension));
    }
}
