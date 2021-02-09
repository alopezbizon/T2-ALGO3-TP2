package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class LapizArribaTest {

    @Test
    public void testLapizAbajo_deberiaNoPintar() {
        LapizArriba lapiz = new LapizArriba();
        assertFalse(lapiz.pintar());
    }
}
