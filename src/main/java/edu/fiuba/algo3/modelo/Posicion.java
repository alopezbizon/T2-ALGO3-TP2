package edu.fiuba.algo3.modelo;


public class Posicion {

    private int x;
    private int y;

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Posicion)) {
            return false;
        }
        if (objeto == this) {
            return true;
        }

        Posicion posicion = (Posicion) objeto;
        return ((this.obtenerX() == posicion.obtenerX()) &&
                (this.obtenerY() == posicion.obtenerY()));
    }

    public void sumar(Posicion posicion) {
        this.x += posicion.x;
        this.y += posicion.y;
    }

    public Posicion copy() {
        return new Posicion(this.x, this.y);
    }

    public int obtenerX() {
        return this.x;
    }

    public int obtenerY() {
        return this.y;
    }
}
