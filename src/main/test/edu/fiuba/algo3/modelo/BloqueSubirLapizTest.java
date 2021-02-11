package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class BloqueSubirLapizTest {

    @Test
    public void testBloqueSubirLapiz_deberiaMantenerSubidoElLapizDelPersonajeRecienCreado() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueSubirLapiz();
        Dibujo dibujo = new Dibujo();

        bloque.accion(personajeMock, dibujo);

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
        bloque.accion(personajeMock, dibujo);

        // TODO: ¿Realmente verifica que el lápiz está abajo?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }
}
