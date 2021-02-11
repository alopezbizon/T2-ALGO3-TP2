package edu.fiuba.algo3.modelo;


public class LapizAbajo extends Lapiz {

    public LapizAbajo() {}

    public void pintar(Posicion inicio, Posicion fin, Dibujo dibujo) {
        try {
            dibujo.crearTramo(inicio, fin);
        } catch (TramoInvalidoPosicionDeInicioYFinIgualesException e) {
        }
    }
}
