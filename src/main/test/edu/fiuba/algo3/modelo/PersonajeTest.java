package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;


public class PersonajeTest {

    @Test
    public void testPersonajeCreacion_deberiaTenerElLapizArriba() {
        Posicion posicionInicial = new Posicion(0,0);
        Personaje personaje = new Personaje(posicionInicial);

        // TODO: Verificar que el lápiz está arriba.
    }

    @Test
    public void testPersonajeCreacion_deberiaTenerLaPosicionEnviada() {
        Posicion posicionInicial = new Posicion(5,5);
        Personaje personaje = new Personaje(posicionInicial);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
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
        Dibujo dibujo = new Dibujo();

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento, dibujo);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveALaIzquierda_deberiaActualizarSuPosicionUnaPosicionHaciaLaIzquierda() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(4,5);
        Posicion posicionParaMovimiento = new Posicion(-1,0);
        Personaje personaje = new Personaje(posicionInicial);
        Dibujo dibujo = new Dibujo();

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento, dibujo);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveArriba_deberiaActualizarSuPosicionUnaPosicionHaciaArriba() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(5,6);
        Posicion posicionParaMovimiento = new Posicion(0,1);
        Personaje personaje = new Personaje(posicionInicial);
        Dibujo dibujo = new Dibujo();

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento, dibujo);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMover_cuandoSeLoMueveAbajo_deberiaActualizarSuPosicionUnaPosicionHaciaAbajo() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(5,4);
        Posicion posicionParaMovimiento = new Posicion(0,-1);
        Personaje personaje = new Personaje(posicionInicial);
        Dibujo dibujo = new Dibujo();

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(posicionParaMovimiento, dibujo);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }

    @Test
    public void testPersonajeMoverConLapizArriba_deberiaNoPintarElSectorDibujo() {
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion);
        Dibujo dibujo = new Dibujo();

        assertTrue(dibujo.obtenerTramos().isEmpty());
        personaje.mover(new Posicion(1,0), dibujo);
        personaje.mover(new Posicion(0,1), dibujo);
        personaje.mover(new Posicion(-1,0), dibujo);
        personaje.mover(new Posicion(0,-1), dibujo);

        assertTrue(dibujo.obtenerTramos().isEmpty());
    }

    @Test
    public void testPersonajeMoverConLapizAbajo_deberiaPintarElSectorDibujo() throws Exception {
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion);
        Dibujo dibujo = new Dibujo();
        List<Tramo> tramos = new ArrayList<>(List.of(
                new Tramo(new Posicion(0,0), new Posicion(1,0)),
                new Tramo(new Posicion(1,0), new Posicion(1,1)),
                new Tramo(new Posicion(1,1), new Posicion(0,1)),
                new Tramo(new Posicion(0,1), new Posicion(0,0))
        ));

        assertTrue(dibujo.obtenerTramos().isEmpty());
        personaje.bajarLapiz();
        personaje.mover(new Posicion(1,0), dibujo);
        personaje.mover(new Posicion(0,1), dibujo);
        personaje.mover(new Posicion(-1,0), dibujo);
        personaje.mover(new Posicion(0,-1), dibujo);
        assertFalse(dibujo.obtenerTramos().isEmpty());

        List<Tramo> tramosCreados = dibujo.obtenerTramos();
        tramosCreados.forEach(tramoCreado -> assertTrue(
                tramos.stream().anyMatch(unTramo -> unTramo.esIgual(tramoCreado))));
        assertEquals(tramosCreados.size(), tramos.size());
    }

    @Test
    public void testPersonajeMoverConLapizArribaYAbajo_deberiaPintarElSectorDibujoSegunCorresponda() throws Exception {
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion);
        Dibujo dibujo = new Dibujo();
        List<Tramo> tramos = new ArrayList<>(List.of(
                new Tramo(new Posicion(1,0), new Posicion(1,1)),
                new Tramo(new Posicion(0,1), new Posicion(0,0))
        ));

        assertTrue(dibujo.obtenerTramos().isEmpty());
        personaje.mover(new Posicion(1,0), dibujo);
        personaje.bajarLapiz();
        personaje.mover(new Posicion(0,1), dibujo);
        personaje.subirLapiz();
        personaje.mover(new Posicion(-1,0), dibujo);
        personaje.bajarLapiz();
        personaje.mover(new Posicion(0,-1), dibujo);
        assertFalse(dibujo.obtenerTramos().isEmpty());

        List<Tramo> tramosCreados = dibujo.obtenerTramos();
        tramosCreados.forEach(tramoCreado -> assertTrue(
                tramos.stream().anyMatch(unTramo -> unTramo.esIgual(tramoCreado))));
        assertEquals(tramosCreados.size(), tramos.size());
    }

    @Test
    public void testPersonajeObtenerPosicion_deberiaDevolverLaPosicionActualDelPersonaje() {
        Posicion posicionInicial = new Posicion(5,5);
        Posicion posicionFinal = new Posicion(7,7);
        Personaje personaje = new Personaje(posicionInicial);
        Dibujo dibujo = new Dibujo();

        assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
        personaje.mover(new Posicion(1,0), dibujo);
        personaje.mover(new Posicion(1,0), dibujo);
        personaje.mover(new Posicion(0,1), dibujo);
        personaje.mover(new Posicion(0,1), dibujo);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }
}
