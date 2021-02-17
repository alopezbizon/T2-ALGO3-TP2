package edu.fiuba.algo3.modelo.bloques;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;

import static org.mockito.Mockito.*;


public class BloqueSubirLapizTest {

    @Test
    public void testBloqueSubirLapiz_deberiaMantenerSubidoElLapizDelPersonajeRecienCreado() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueSubirLapiz();
        Dibujo dibujo = new Dibujo();

        bloque.ejecutar(personajeMock, dibujo);

        // TODO: ¿Realmente verifica que el lápiz está arriba?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,never()).bajarLapiz();
    }

    @Test
    public void testBloqueSubirLapiz_deberiaSubirElLapizDelPersonajeCuandoLoTieneBajo() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueSubirLapiz();
        Dibujo dibujo = new Dibujo();

        personajeMock.bajarLapiz();
        verify(personajeMock,never()).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
        bloque.ejecutar(personajeMock, dibujo);

        // TODO: ¿Realmente verifica que el lápiz está abajo?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }
}
