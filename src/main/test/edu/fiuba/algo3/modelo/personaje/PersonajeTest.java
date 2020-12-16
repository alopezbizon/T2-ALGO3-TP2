package edu.fiuba.algo3.modelo.personaje;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PersonajeTest {

    @Test
    public void testCrearPersonaje_deberiaTenerElLapizArriba() {
        Personaje personaje = Personaje.darPersonaje();
        assertFalse(personaje.dibujar());
    }

    @Test
    public void testCrearPersonaje_cuandoSubeElLapiz_deberiaMantenerElLapizArriba() {
        Personaje personaje = Personaje.darPersonaje();
        personaje.subirLapiz();
        assertFalse(personaje.dibujar());
    }

    @Test
    public void testPersonaje_cuandoBajaElLapiz_deberiaTenerElLapizAbajo() {
        Personaje personaje = Personaje.darPersonaje();
        personaje.bajarLapiz();
        assertTrue(personaje.dibujar());
    }

    @Test
    public void testPersonaje_cuandoBajaElLapizYLoVuelveASubir_deberiaTenerElLapizArriba() {
        Personaje personaje = Personaje.darPersonaje();
        personaje.bajarLapiz();
        personaje.subirLapiz();
        assertFalse(personaje.dibujar());
    }
}
