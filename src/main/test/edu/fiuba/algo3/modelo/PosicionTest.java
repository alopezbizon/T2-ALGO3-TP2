package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PosicionTest {

    @Test
    public void testPosicionEsIgualAOtraPosicion_deberiaDevolverTrueSiSonIguales() {
        Posicion posicion = new Posicion(1,1);
        Posicion otraPosicion = new Posicion(1,1);

        assertTrue(posicion.equals(otraPosicion));
        assertTrue(otraPosicion.equals(posicion));
    }

    @Test
    public void testPosicionEsIgualAOtraPosicion_deberiaDevolverFalseSiNoSonIguales() {
        Posicion posicion = new Posicion(1,1);
        Posicion otraPosicion = new Posicion(0,1);

        assertFalse(posicion.equals(otraPosicion));
        assertFalse(otraPosicion.equals(posicion));
    }

    @Test
    public void testPosicionSumarOtraPosicion_deberiaSumarXconXeYconY() {
        Posicion posicion = new Posicion(1,2);
        Posicion otraPosicion = new Posicion(1,-1);
        Posicion sumaPosiciones = new Posicion(2, 1);

        posicion.sumar(otraPosicion);

        assertTrue(posicion.equals(sumaPosiciones));
    }

    @Test
    public void testPosicionCopiar_deberiaSumarXconXeYconY() {
        Posicion posicion = new Posicion(1,1);

        Posicion otraPosicion = posicion.copy();

        assertTrue(posicion.equals(otraPosicion));
        assertFalse(posicion == otraPosicion);
    }

    @Test
    public void testPosicionObtenerX_deberiaDevolverSuValorEnX() {
        Posicion posicion = new Posicion(1,1);

        assertEquals(posicion.obtenerX(),1);
    }

    @Test
    public void testPosicionObtenerY_deberiaDevolverSuValorEnY() {
        Posicion posicion = new Posicion(1,1);

        assertEquals(posicion.obtenerY(),1);
    }
}
