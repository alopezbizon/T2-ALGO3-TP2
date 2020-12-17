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

    public void mover(Posicion unaPosicion) {
        Tablero tablero = Tablero.darTablero();
        unaPosicion.sumar(this.posicion);

        if (tablero.validarPosicion(unaPosicion)) {
            this.posicion = unaPosicion;
            this.lapiz.pintar();
        }
    }

    public boolean dibujar() {
        // TODO: ver si es necesario este return.
        return lapiz.pintar();
    }

    public void inicializarPosicion(Posicion unaPosicion) {
        this.posicion = unaPosicion;
    }

    public Posicion obtenerPosicion() {
        return this.posicion;
    }
}