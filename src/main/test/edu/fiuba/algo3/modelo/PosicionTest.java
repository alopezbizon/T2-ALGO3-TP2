package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PosicionTest {

    @Test
    public void testPosicionEsIgualAOtraPosicion_deberiaDevolverTrueSiSonIguales() {
        Posicion posicion = new Posicion(1,1);
        Posicion otraPosicion = new Posicion(1,1);

        assertTrue(posicion.esIgual(otraPosicion));
        assertTrue(otraPosicion.esIgual(posicion));
    }

    @Test
    public void testPosicionEsIgualAOtraPosicion_deberiaDevolverFalseSiNoSonIguales() {
        Posicion posicion = new Posicion(1,1);
        Posicion otraPosicion = new Posicion(0,1);

        assertFalse(posicion.esIgual(otraPosicion));
        assertFalse(otraPosicion.esIgual(posicion));
    }

    @Test
    public void testPosicionSumarOtraPosicion_deberiaSumarXconXeYconY() {
        Posicion posicion = new Posicion(1,2);
        Posicion otraPosicion = new Posicion(1,-1);
        Posicion sumaPosiciones = new Posicion(2, 1);

        posicion.sumar(otraPosicion);

        assertTrue(posicion.esIgual(sumaPosiciones));
    }

    @Test
    public void testPosicionCopiar_deberiaSumarXconXeYconY() {
        Posicion posicion = new Posicion(1,1);

        Posicion otraPosicion = posicion.copiar();

        assertTrue(posicion.esIgual(otraPosicion));
        assertFalse(posicion == otraPosicion);
    }
}
