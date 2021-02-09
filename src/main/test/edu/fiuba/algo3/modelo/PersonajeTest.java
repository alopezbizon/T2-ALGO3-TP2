package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class PersonajeTest {

    @Test
    public void testPersonajeCreacion_deberiaTenerElLapizArriba() {
        Posicion posicionInicial = new Posicion(0,0);
        Personaje personaje = new Personaje(posicionInicial);

        // TODO: Verificar que el lápiz está arriba.
    }

    @Test
    public void testPersonajeSubirElLapiz_deberiaMantenerElLapizArriba() {
        Personaje personajeMock = mock(Personaje.class);

        personajeMock.subirLapiz();

        // TODO: ¿Realmente verifica que el lápiz está arriba?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,never()).bajarLapiz();
    }

    @Test
    public void testPersonajeBajarLapiz_deberiaTenerElLapizAbajo() {
        Personaje personajeMock = mock(Personaje.class);

        personajeMock.bajarLapiz();

        // TODO: ¿Realmente verifica que el lápiz está abajo?
        verify(personajeMock,never()).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }

    @Test
    public void testPersonajeBajarYSubirLapiz_deberiaTenerElLapizArriba() {
        Personaje personajeMock = mock(Personaje.class);

        personajeMock.bajarLapiz();
        verify(personajeMock,never()).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
        personajeMock.subirLapiz();

        // TODO: ¿Realmente verifica que el lápiz está arriba?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveALaDerecha_deberiaActualizarSuPosicionUnaPosicionHaciaLaDerecha() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(6,5);
        Posicion posicionParaMovimiento = new Posicion(1,0);
        Personaje personaje = new Personaje(posicionInicial);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveALaIzquierda_deberiaActualizarSuPosicionUnaPosicionHaciaLaIzquierda() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(4,5);
        Posicion posicionParaMovimiento = new Posicion(-1,0);
        Personaje personaje = new Personaje(posicionInicial);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveArriba_deberiaActualizarSuPosicionUnaPosicionHaciaArriba() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(5,6);
        Posicion posicionParaMovimiento = new Posicion(0,1);
        Personaje personaje = new Personaje(posicionInicial);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveAbajo_deberiaActualizarSuPosicionUnaPosicionHaciaAbajo() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(5,4);
        Posicion posicionParaMovimiento = new Posicion(0,-1);
        Personaje personaje = new Personaje(posicionInicial);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeInicializarPosicion_deberiaTenerLaPosicionEnviada() {
        Posicion posicionInicial = new Posicion(5,5);
        Personaje personaje = new Personaje(posicionInicial);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
    }

    @Test
    public void testPersonajeObtenerPosicion_deberiaDevolverLaPosicionActualDelPersonaje() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(7,7);
        Personaje personaje = new Personaje(posicionInicial);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(new Posicion(1,0));
        personaje.mover(new Posicion(1,0));
        personaje.mover(new Posicion(0,1));
        personaje.mover(new Posicion(0,1));

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }
}
