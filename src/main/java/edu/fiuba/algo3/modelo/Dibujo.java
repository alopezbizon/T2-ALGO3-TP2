package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class Dibujo {

    private List<Tramo> tramos = new ArrayList<>();

    public Dibujo() {}

    public void crearTramo(Posicion inicio, Posicion fin) throws TramoInvalidoPosicionDeInicioYFinIgualesException {
        try {
            Tramo tramo = new Tramo(inicio, fin);
            if (!this.contieneTramo(tramo)) {
                this.tramos.add(tramo);
            }
        } catch (TramoInvalidoPosicionDeInicioYFinIgualesException e) {
            throw new TramoInvalidoPosicionDeInicioYFinIgualesException();
        }
    }

    public List<Tramo> obtenerTramos() {
        return this.tramos;
    }

    public boolean contieneTramo(Tramo tramo) {
        return (this.tramos.stream().anyMatch(unTramo -> unTramo.equals(tramo)));
    }
}