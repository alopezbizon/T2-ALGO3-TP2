package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LapizAbajoTest {

    @Test
    public void testLapizAbajo_deberiaPintar() {
        LapizAbajo lapiz = new LapizAbajo();
        assertTrue(lapiz.pintar());
    }
}
