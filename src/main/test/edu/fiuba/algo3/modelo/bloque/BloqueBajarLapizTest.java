package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class BloqueBajarLapizTest {

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonajeRecienCreado() {
        Personaje personaje = Personaje.darPersonaje();
        Bloque bloque = new BloqueBajarLapiz();

        bloque.accion();

        assertTrue(personaje.dibujar());
    }

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonajeCuandoLoTieneArriba() {
        Personaje personaje = Personaje.darPersonaje();
        Bloque bloque = new BloqueBajarLapiz();

        personaje.subirLapiz();
        assertFalse(personaje.dibujar());
        bloque.accion();

        assertTrue(personaje.dibujar());
    }
}
