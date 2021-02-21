package edu.fiuba.algo3.modelo;


public class Posicion {

    private Integer x;
    private Integer y;

    public Posicion(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Posicion posicion) {
        return (this.x.equals(posicion.x) && this.y.equals(posicion.y));
    }

    public void sumar(Posicion posicion) {
        this.x += posicion.x;
        this.y += posicion.y;
    }

    public Posicion copy() {
        return new Posicion(this.x, this.y);
    }

    public Integer obtenerX() {
        return this.x;
    }

    public Integer obtenerY() {
        return this.y;
    }
}
