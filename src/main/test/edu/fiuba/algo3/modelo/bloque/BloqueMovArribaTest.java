package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.tablero.Posicion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueMovArribaTest {

    @Test
    public void testBloqueMovAbajo_deberiaMoverElPersonajeUnaPosicionHaciaArriba() {
        Bloque bloque = new BloqueMovArriba();
        Personaje personaje = Personaje.darPersonaje();
        Posicion posicionInicial = new Posicion(5, 5);
        Posicion posicionFinal = new Posicion(5,6);

        personaje.inicializarPosicion(posicionInicial);
        bloque.accion();

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }
}
