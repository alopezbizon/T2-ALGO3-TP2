package edu.fiuba.algo3.modelo.personaje;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PosicionTest {

    @Test
    public void testPosicionEsIgualAOtraPosicion_deberiaDevolverTrueSiSonIguales() {
        Posicion posicion = new Posicion(0,0);
        Posicion otraPosicion = new Posicion(0,0);

        assertTrue(posicion.esIgual(otraPosicion));
        assertTrue(otraPosicion.esIgual(posicion));
    }

    @Test
    public void testPosicionEsIgualAOtraPosicion_deberiaDevolverFalseSiNoSonIguales() {
        Posicion posicion = new Posicion(0,0);
        Posicion otraPosicion = new Posicion(0,1);

        assertFalse(posicion.esIgual(otraPosicion));
        assertFalse(otraPosicion.esIgual(posicion));
    }
}
