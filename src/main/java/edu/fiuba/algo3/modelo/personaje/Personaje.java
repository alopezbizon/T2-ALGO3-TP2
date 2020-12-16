package edu.fiuba.algo3.modelo.personaje;

import edu.fiuba.algo3.modelo.Tablero;


public class Personaje {

    private static Personaje personaje;
    Lapiz lapiz;
    int posicionX;
    int posicionY;

    private Personaje(){
        posicionX = 0;
        posicionY = 0;
        lapiz = new LapizArriba();
    }

    public static Personaje darPersonaje(){
        if(personaje == null){
            personaje = new Personaje();
        }

        return personaje;
    }

    public void subirLapiz(){
        lapiz = new LapizArriba();
    }
    public void bajarLapiz(){
        lapiz = new LapizAbajo();
    }
    public void moverDerecha(){
        lapiz.pintar();
        Tablero tablero = Tablero.darTablero();
        if(tablero.validarPosicion(posicionX+1)){
            posicionX++;
            lapiz.pintar();
        }
    }
    public void moverIzquierda(){
        lapiz.pintar();
        Tablero tablero = Tablero.darTablero();
        if(tablero.validarPosicion(posicionX-1)){
            posicionX--;
            lapiz.pintar();
        }
    }
    public void moverArriba(){
        lapiz.pintar();
        Tablero tablero = Tablero.darTablero();
        if(tablero.validarPosicion(posicionY-1)){
            posicionY--;
            lapiz.pintar();
        }
    }
    public void moverAbajo(){
        lapiz.pintar();
        Tablero tablero = Tablero.darTablero();
        if(tablero.validarPosicion(posicionY+1)){
            posicionY++;
            lapiz.pintar();
        }
    }

    public boolean dibujar() {
        // TODO: ver si es necesario este return.
        return lapiz.pintar();
    }
}