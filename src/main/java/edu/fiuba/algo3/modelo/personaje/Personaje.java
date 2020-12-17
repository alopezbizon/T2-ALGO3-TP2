package edu.fiuba.algo3.modelo.personaje;

import edu.fiuba.algo3.modelo.tablero.Posicion;
import edu.fiuba.algo3.modelo.tablero.Tablero;


public class Personaje {

    private static Personaje personaje;
    private Posicion posicion = new Posicion(0,0);
    private Lapiz lapiz = new LapizArriba();

    public static Personaje darPersonaje() {
        if (personaje == null) {
            personaje = new Personaje();
        }
        return personaje;
    }

    public void subirLapiz() {
        this.lapiz = new LapizArriba();
    }

    public void bajarLapiz() {
        this.lapiz = new LapizAbajo();
    }

    public void moverDerecha() {
        Tablero tablero = Tablero.darTablero();
        Posicion otraPosicion = new Posicion(1,0);
        otraPosicion.sumar(this.posicion);

        if (tablero.validarPosicion(otraPosicion)) {
            this.posicion = otraPosicion;
            this.lapiz.pintar();
        }
    }

    public void moverIzquierda(){
        Tablero tablero = Tablero.darTablero();
        Posicion otraPosicion = new Posicion(-1,0);
        otraPosicion.sumar(this.posicion);

        if (tablero.validarPosicion(otraPosicion)) {
            this.posicion = otraPosicion;
            this.lapiz.pintar();
        }
    }

    public void moverArriba(){
        Tablero tablero = Tablero.darTablero();
        Posicion otraPosicion = new Posicion(0,1);
        otraPosicion.sumar(this.posicion);

        if (tablero.validarPosicion(otraPosicion)) {
            this.posicion = otraPosicion;
            this.lapiz.pintar();
        }
    }

    public void moverAbajo(){
        Tablero tablero = Tablero.darTablero();
        Posicion otraPosicion = new Posicion(0,-1);
        otraPosicion.sumar(this.posicion);

        if (tablero.validarPosicion(otraPosicion)) {
            this.posicion = otraPosicion;
            this.lapiz.pintar();
        }
    }

    public boolean dibujar() {
        // TODO: ver si es necesario este return.
        return lapiz.pintar();
    }
}