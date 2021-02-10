package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TramoTest {

    @Test
    public void testTramoCreacion_deberiaDevolverErrorSiLaPosicionDeInicioYFinSonIguales() {
        Posicion inicio = new Posicion(0, 0);
        Posicion fin = new Posicion(0, 0);

        try {
            new Tramo(inicio, fin);
            fail("Debería lanzar TramoInvalidoPosicionDeInicioYFinIgualesException");
        } catch (Exception e) {
            assertEquals(TramoInvalidoPosicionDeInicioYFinIgualesException.class, e.getClass());
        }
    }

    @Test
    public void testTramoObtenerInicio_deberiaDevolverLaMismaPosicionConLaQueFueCreado() throws Exception{
        Posicion inicio = new Posicion(0,0);
        Posicion fin = new Posicion(1,0);
        Tramo tramo = new Tramo(inicio, fin);

        assertTrue(tramo.obtenerInicio().esIgual(inicio));
    }

    @Test
    public void testTramoObtenerFin_deberiaDevolverLaMismaPosicionConLaQueFueCreado() throws Exception{
        Posicion inicio = new Posicion(0,0);
        Posicion fin = new Posicion(1,0);
        Tramo tramo = new Tramo(inicio, fin);

        assertTrue(tramo.obtenerFin().esIgual(fin));
    }
}
