package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class Dibujo {

    private List<Tramo> tramos = new ArrayList<>();

    public Dibujo() {}

    public void crearTramo(Posicion inicio, Posicion fin) throws TramoInvalidoPosicionDeInicioYFinIgualesException {
        try {
            Tramo tramo = new Tramo(inicio, fin);
            if (tramos.stream().noneMatch(unTramo -> unTramo.esIgual(tramo))) {
                this.tramos.add(tramo);
            }
        } catch (TramoInvalidoPosicionDeInicioYFinIgualesException e) {
            throw new TramoInvalidoPosicionDeInicioYFinIgualesException();
        }
    }

    public List<Tramo> obtenerTramos() {
        return this.tramos;
    }
}