package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueSubirLapizTest {

    @Test
    public void testBloqueSubirLapiz_deberiaMantenerSubidoElLapizDelPersonajeRecienCreado() {
        Personaje personaje = Personaje.darPersonaje();
        Bloque bloque = new BloqueSubirLapiz();

        bloque.accion();

        assertFalse(personaje.dibujar());
    }

    @Test
    public void testBloqueSubirLapiz_deberiaSubirElLapizDelPersonajeCuandoLoTieneBajo() {
        Personaje personaje = Personaje.darPersonaje();
        Bloque bloque = new BloqueSubirLapiz();

        personaje.bajarLapiz();
        assertTrue(personaje.dibujar());
        bloque.accion();

        assertFalse(personaje.dibujar());
    }
}
