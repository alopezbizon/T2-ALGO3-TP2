package edu.fiuba.algo3.modelo.tablero;


public class Tablero {

    private static Tablero tablero;
    private Integer dimension = 15;

    private Tablero() {
    }

    public static Tablero darTablero() {
        if (tablero == null) {
            tablero = new Tablero();
        }
        return tablero;
    }

    public boolean validarPosicion(Posicion nuevaPosicion) {
        return nuevaPosicion.esMenor(new Posicion(this.dimension, this.dimension));
    }
}
