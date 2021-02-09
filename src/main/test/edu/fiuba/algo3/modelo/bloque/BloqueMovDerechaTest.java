package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.tablero.Posicion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueMovDerechaTest {

    @Test
    public void testBloqueMovDerecha_deberiaMoverElPersonajeUnaPosicionHaciaLaDerecha() {
        Posicion posicionInicial = new Posicion(5, 5);
        Posicion posicionFinal = new Posicion(6,5);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueMovDerecha();

        bloque.accion(personaje);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }
}
