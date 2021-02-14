package edu.fiuba.algo3.modelo;


public class Tramo {

    private Posicion inicio;
    private Posicion fin;

    public Tramo(Posicion inicio, Posicion fin) throws TramoInvalidoPosicionDeInicioYFinIgualesException {
        if (inicio.equals(fin)) {
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

    public boolean equals(Tramo tramo) {
        boolean esIgual = this.inicio.equals(tramo.obtenerInicio()) && this.fin.equals(tramo.obtenerFin());
        boolean esLaInversion = this.inicio.equals(tramo.obtenerFin()) && this.fin.equals(tramo.obtenerInicio());
        return (esIgual || esLaInversion);
    }
}