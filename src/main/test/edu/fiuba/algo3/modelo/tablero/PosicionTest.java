package edu.fiuba.algo3.modelo.tablero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


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
    public void testPosicionEsMenorAOtraPosicion_deberiaDevolverTrueSiXeYsonMenores() {
        Posicion posicion = new Posicion(1,1);
        Posicion otraPosicion = new Posicion(5,5);

        assertTrue(posicion.esMenor(otraPosicion));
    }

    @Test
    public void testPosicionEsMenorAOtraPosicion_deberiaDevolverFalseSiXeYsonIguales() {
        Posicion posicion = new Posicion(5,5);
        Posicion otraPosicion = new Posicion(5,5);

        assertFalse(posicion.esMenor(otraPosicion));
    }

    @Test
    public void testPosicionEsMenorAOtraPosicion_deberiaDevolverFalseSiXeYNoSonMenores() {
        Posicion posicion = new Posicion(5,5);
        Posicion otraPosicion = new Posicion(1,1);

        assertFalse(posicion.esMenor(otraPosicion));
    }

    @Test
    public void testPosicionSumarOtraPosicion_deberiaSumarXconXeYconY() {
        Posicion posicion = new Posicion(1,2);
        Posicion otraPosicion = new Posicion(1,-1);
        Posicion sumaPosiciones = new Posicion(2, 1);

        posicion.sumar(otraPosicion);

        assertTrue(posicion.esIgual(sumaPosiciones));
    }
}
