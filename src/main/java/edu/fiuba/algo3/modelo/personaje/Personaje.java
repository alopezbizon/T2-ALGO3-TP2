package edu.fiuba.algo3.modelo.personaje;

import edu.fiuba.algo3.modelo.tablero.Posicion;


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

    public boolean dibujar() {
        // TODO: ver si es necesario este return.
        return lapiz.pintar();
    }

    public Posicion obtenerPosicion() {
        return this.posicion;
    }
}