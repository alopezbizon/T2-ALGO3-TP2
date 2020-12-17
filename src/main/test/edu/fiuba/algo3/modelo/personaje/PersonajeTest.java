package edu.fiuba.algo3.modelo.personaje;

import edu.fiuba.algo3.modelo.tablero.Posicion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PersonajeTest {

    @Test
    public void testPersonajeCreacion_deberiaTenerElLapizArriba() {
        Personaje personaje = Personaje.darPersonaje();

        assertFalse(personaje.dibujar());
    }

    @Test
    public void testPersonajeSubirElLapiz_deberiaMantenerElLapizArriba() {
        Personaje personaje = Personaje.darPersonaje();

        personaje.subirLapiz();

        assertFalse(personaje.dibujar());
    }

    @Test
    public void testPersonajeBajarLapiz_deberiaTenerElLapizAbajo() {
        Personaje personaje = Personaje.darPersonaje();

        personaje.bajarLapiz();

        assertTrue(personaje.dibujar());
    }

    @Test
    public void testPersonajeBajarYSubirLapiz_deberiaTenerElLapizArriba() {
        Personaje personaje = Personaje.darPersonaje();

        personaje.bajarLapiz();
        assertTrue(personaje.dibujar());
        personaje.subirLapiz();

        assertFalse(personaje.dibujar());
    }

    @Test
    public void testPersonajeDibujar_deberiaDevolverTrueCuandoElLapizEstaBajo() {
        Personaje personaje = Personaje.darPersonaje();

        personaje.bajarLapiz();

        assertTrue(personaje.dibujar());
    }

    @Test
    public void testPersonajeDibujar_deberiaDevolverFalseCuandoElLapizEstaArriba() {
        Personaje personaje = Personaje.darPersonaje();

        personaje.subirLapiz();

        assertFalse(personaje.dibujar());
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveALaDerecha_deberiaActualizarSuPosicionUnaPosicionHaciaLaDerecha() {
        Personaje personaje = Personaje.darPersonaje();
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(6,5);
        Posicion posicionParaMovimiento = new Posicion(1,0);

        personaje.inicializarPosicion(posicionInicial);
        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveALaIzquierda_deberiaActualizarSuPosicionUnaPosicionHaciaLaIzquierda() {
        Personaje personaje = Personaje.darPersonaje();
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(4,5);
        Posicion posicionParaMovimiento = new Posicion(-1,0);

        personaje.inicializarPosicion(posicionInicial);
        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveArriba_deberiaActualizarSuPosicionUnaPosicionHaciaArriba() {
        Personaje personaje = Personaje.darPersonaje();
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(5,6);
        Posicion posicionParaMovimiento = new Posicion(0,1);

        personaje.inicializarPosicion(posicionInicial);
        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveAbajo_deberiaActualizarSuPosicionUnaPosicionHaciaAbajo() {
        Personaje personaje = Personaje.darPersonaje();
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(5,4);
        Posicion posicionParaMovimiento = new Posicion(0,-1);

        personaje.inicializarPosicion(posicionInicial);
        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeInicializarPosicion_deberiaTenerLaPosicionEnviada() {
        Personaje personaje = Personaje.darPersonaje();
        Posicion posicionInicial = new Posicion(5,5);

        personaje.inicializarPosicion(posicionInicial);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
    }

    @Test
    public void testPersonajeObtenerPosicion_deberiaDevolverLaPosicionActualDelPersonaje() {
        Personaje personaje = Personaje.darPersonaje();
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(7,7);

        personaje.inicializarPosicion(posicionInicial);
        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(new Posicion(1,0));
        personaje.mover(new Posicion(1,0));
        personaje.mover(new Posicion(0,1));
        personaje.mover(new Posicion(0,1));

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }
}
