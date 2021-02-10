package edu.fiuba.algo3.modelo;


public class Tramo {

    private Posicion inicio;
    private Posicion fin;

    public Tramo(Posicion inicio, Posicion fin) throws TramoInvalidoPosicionDeInicioYFinIgualesException {
        if (inicio.esIgual(fin)) {
            throw new TramoInvalidoPosicionDeInicioYFinIgualesException();
        }
        this.inicio = inicio;
        this.fin = fin;
    }

    public Posicion obtenerInicio() {
        return this.inicio;
    }

    public Posicion obtenerFin() {
        return this.fin;
    }
}