package edu.fiuba.algo3.modelo;


public class Personaje {

    private Posicion posicion;
    private Pintable pintable = new LapizArriba();

    public Personaje(Posicion posicion) {
        this.posicion = posicion;
    }

    public void subirLapiz() {
        this.pintable = new LapizArriba();
    }

    public void bajarLapiz() {
        this.pintable = new LapizAbajo();
    }

    public void mover(Posicion posicion, Dibujo dibujo) {
        Posicion unaPosicion = this.posicion.copy();
        this.posicion.sumar(posicion);
        Posicion otraPosicion = this.posicion.copy();
        this.pintable.pintar(unaPosicion, otraPosicion, dibujo);
    }

    public Posicion obtenerPosicion() {
        return this.posicion;
    }
}