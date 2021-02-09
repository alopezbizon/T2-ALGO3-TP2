package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;

import edu.fiuba.algo3.modelo.tablero.Posicion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class BloqueBajarLapizTest {

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonajeRecienCreado() {
        Posicion posicionInicial = new Posicion(0,0);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueBajarLapiz();

        bloque.accion(personaje);

        assertTrue(personaje.dibujar());
    }

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonajeCuandoLoTieneArriba() {
        Posicion posicionInicial = new Posicion(0,0);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueBajarLapiz();

        personaje.subirLapiz();
        assertFalse(personaje.dibujar());
        bloque.accion(personaje);

        assertTrue(personaje.dibujar());
    }
}
