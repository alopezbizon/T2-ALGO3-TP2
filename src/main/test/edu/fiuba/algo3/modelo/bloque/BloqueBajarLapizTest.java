package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueBajarLapizTest {

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonaje() {
        Personaje personaje = Personaje.darPersonaje();
        Bloque bloque = new BloqueBajarLapiz();
        bloque.accion();
        assertTrue(personaje.dibujar());
    }
}
