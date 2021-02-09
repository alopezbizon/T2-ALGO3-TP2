package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class BloqueSubirLapizTest {

    @Test
    public void testBloqueSubirLapiz_deberiaMantenerSubidoElLapizDelPersonajeRecienCreado() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueSubirLapiz();

        bloque.accion(personajeMock);

        // TODO: ¿Realmente verifica que el lápiz está arriba?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,never()).bajarLapiz();
    }

    @Test
    public void testBloqueSubirLapiz_deberiaSubirElLapizDelPersonajeCuandoLoTieneBajo() {
        Personaje personajeMock = mock(Personaje.class);
        Bloque bloque = new BloqueSubirLapiz();

        personajeMock.bajarLapiz();
        verify(personajeMock,never()).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
        bloque.accion(personajeMock);

        // TODO: ¿Realmente verifica que el lápiz está abajo?
        verify(personajeMock,times(1)).subirLapiz();
        verify(personajeMock,times(1)).bajarLapiz();
    }
}
