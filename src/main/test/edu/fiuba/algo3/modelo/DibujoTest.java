package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


public class DibujoTest {

    @Test
    public void testDibujoCrearTramo_deberiaDevolverErrorSiLaPosicionDeInicioYFinSonIguales() {
        Posicion inicio = new Posicion(0, 0);
        Posicion fin = new Posicion(0, 0);
        Dibujo dibujo = new Dibujo();

        try {
            dibujo.crearTramo(inicio, fin);
            fail("Debería lanzar TramoInvalidoPosicionDeInicioYFinIgualesException");
        } catch (Exception e) {
            assertEquals(TramoInvalidoPosicionDeInicioYFinIgualesException.class, e.getClass());
        }
    }

    @Test
    public void testDibujoObtenerTramos_deberiaDevolverUnaListaVaciaSiNoSeCrearonTramos() {
        Dibujo dibujo = new Dibujo();

        List<Tramo> tramos = dibujo.obtenerTramos();

        assertTrue(tramos.isEmpty());
    }

    @Test
    public void testDibujoObtenerTramos_deberiaDevolverUnaListaConLosTramosCreados() throws Exception {
        Dibujo dibujo = new Dibujo();
        List<Tramo> otrosTramos = new ArrayList<>(List.of(
                new Tramo(new Posicion(0,0), new Posicion(1,0)),
                new Tramo(new Posicion(0,0), new Posicion(0,1)),
                new Tramo(new Posicion(0,0), new Posicion(-1,0)),
                new Tramo(new Posicion(0,0), new Posicion(0,-1))
        ));

        dibujo.crearTramo(new Posicion(0,0), new Posicion(1,0));
        dibujo.crearTramo(new Posicion(0,0), new Posicion(0,1));
        dibujo.crearTramo(new Posicion(0,0), new Posicion(-1,0));
        dibujo.crearTramo(new Posicion(0,0), new Posicion(0,-1));
        List<Tramo> tramos = dibujo.obtenerTramos();

        tramos.forEach(tramo -> assertTrue(
                otrosTramos.stream().anyMatch(unTramo -> unTramo.esIgual(tramo))));
    }
}
