package edu.fiuba.algo3.modelo;


public class Personaje {

    private Posicion posicion;
    private Lapiz lapiz = new LapizArriba();

    public Personaje(Posicion posicion) {
        this.posicion = posicion;
    }

    public void subirLapiz() {
        this.lapiz = new LapizArriba();
    }

    public void bajarLapiz() {
        this.lapiz = new LapizAbajo();
    }

    public void mover(Posicion unaPosicion) {
        this.posicion.sumar(unaPosicion);
        this.lapiz.pintar();
    }

    public Posicion obtenerPosicion() {
        return this.posicion;
    }
}