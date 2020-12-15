package edu.fiuba.algo3.modelo.personaje;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PersonajeTest {

    @Test
    public void testCrearPersonaje_deberiaTenerElLapizArriba() {
        Personaje personaje = new Personaje();
        assertFalse(personaje.dibujar());
    }

    @Test
    public void testCrearPersonaje_cuandoSubeElLapiz_deberiaMantenerElLapizArriba() {
        Personaje personaje = new Personaje();
        personaje.subirLapiz();
        assertFalse(personaje.dibujar());
    }

    @Test
    public void testPersonaje_cuandoBajaElLapiz_deberiaTenerElLapizAbajo() {
        Personaje personaje = new Personaje();
        personaje.bajarLapiz();
        assertTrue(personaje.dibujar());
    }

    @Test
    public void testPersonaje_cuandoBajaElLapizYLoVuelveASubir_deberiaTenerElLapizArriba() {
        Personaje personaje = new Personaje();
        personaje.bajarLapiz();
        personaje.subirLapiz();
        assertFalse(personaje.dibujar());
    }
}
