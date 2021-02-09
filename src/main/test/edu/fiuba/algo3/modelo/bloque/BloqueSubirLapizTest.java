package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.tablero.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueSubirLapizTest {

    @Test
    public void testBloqueSubirLapiz_deberiaMantenerSubidoElLapizDelPersonajeRecienCreado() {
        Posicion posicionInicial = new Posicion(0,0);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueSubirLapiz();

        bloque.accion(personaje);

        assertFalse(personaje.dibujar());
    }

    @Test
    public void testBloqueSubirLapiz_deberiaSubirElLapizDelPersonajeCuandoLoTieneBajo() {
        Posicion posicionInicial = new Posicion(0,0);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueSubirLapiz();

        personaje.bajarLapiz();
        assertTrue(personaje.dibujar());
        bloque.accion(personaje);

        assertFalse(personaje.dibujar());
    }
}
