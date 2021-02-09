package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.BloqueBajarLapiz;
import edu.fiuba.algo3.modelo.Personaje;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class BloqueBajarLapizTest {

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonajeRecienCreado() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueBajarLapiz();

        bloque.accion(personajeMock);

        // TODO: ¿Realmente verifica que el lápiz está abajo?
        verify(personajeMock,never()).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }

    @Test
    public void testBloqueBajarLapiz_deberiaBajarElLapizDelPersonajeCuandoLoTieneArriba() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueBajarLapiz();

        personajeMock.subirLapiz();
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,never()).bajarLapiz();
        bloque.accion(personajeMock);

        // TODO: ¿Realmente verifica que el lápiz está abajo?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }
}
