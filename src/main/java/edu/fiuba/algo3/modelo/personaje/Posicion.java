package edu.fiuba.algo3.modelo.personaje;

public class Posicion {

    private int x;
    private int y;

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean esIgual(Posicion posicion) {
        return (this.x == posicion.x) && (this.y == posicion.y);
    }
}
