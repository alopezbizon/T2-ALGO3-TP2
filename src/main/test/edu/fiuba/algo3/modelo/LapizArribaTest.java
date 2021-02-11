package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class LapizArribaTest {

    @Test
    public void testLapizArriba_deberiaNoPintar() throws Exception {
        Posicion inicio = new Posicion(0, 0);
        Posicion fin = new Posicion(1, 0);
        Tramo tramo = new Tramo(inicio, fin);
        Dibujo dibujo = new Dibujo();
        LapizArriba lapiz = new LapizArriba();

        lapiz.pintar(inicio, fin, dibujo);

        assertFalse(dibujo.contieneTramo(tramo));
    }
}
