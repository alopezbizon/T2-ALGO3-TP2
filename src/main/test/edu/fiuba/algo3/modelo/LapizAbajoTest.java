package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LapizAbajoTest {

    @Test
    public void testLapizAbajo_deberiaPintar() throws Exception {
        Posicion inicio = new Posicion(0, 0);
        Posicion fin = new Posicion(1, 0);
        Tramo tramo = new Tramo(inicio, fin);
        Dibujo dibujo = new Dibujo();
        LapizAbajo lapiz = new LapizAbajo();

        lapiz.pintar(inicio, fin, dibujo);

        assertTrue(dibujo.contieneTramo(tramo));
    }
}
