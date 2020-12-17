package edu.fiuba.algo3.modelo.tablero;


public class Posicion {

    private Integer x;
    private Integer y;

    public Posicion(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public boolean esIgual(Posicion posicion) {
        return (this.x.equals(posicion.x) && this.y.equals(posicion.y));
    }

    public boolean esMenor(Posicion posicion) {
        if (this.esPositiva()) {
            return ((this.x < posicion.x) && (this.y < posicion.y));
        }
        return false;
    }

    private boolean esPositiva() {
        return ((this.x > 0) && (this.y > 0));
    }

    public void sumar(Posicion posicion) {
        this.x += posicion.x;
        this.y += posicion.y;
    }
}
