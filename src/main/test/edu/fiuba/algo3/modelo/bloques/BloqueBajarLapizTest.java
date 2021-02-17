package edu.fiuba.algo3.modelo.bloques;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;

import static org.mockito.Mockito.*;


public class BloqueBajarLapizTest {

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonajeRecienCreado() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueBajarLapiz();
        Dibujo dibujo = new Dibujo();

        bloque.ejecutar(personajeMock, dibujo);

        // TODO: ¿Realmente verifica que el lápiz está abajo?
        verify(personajeMock,never()).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonajeCuandoLoTieneArriba() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueBajarLapiz();
        Dibujo dibujo = new Dibujo();

        personajeMock.subirLapiz();
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,never()).bajarLapiz();
        bloque.ejecutar(personajeMock, dibujo);

        // TODO: ¿Realmente verifica que el lápiz está abajo?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }
}
