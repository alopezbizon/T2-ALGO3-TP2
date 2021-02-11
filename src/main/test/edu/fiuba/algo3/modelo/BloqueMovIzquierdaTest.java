package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueMovIzquierdaTest {

    @Test
    public void testBloqueMovIzquierda_deberiaMoverElPersonajeUnaPosicionHaciaLaIzquierda() {
        Posicion posicionInicial = new Posicion(5, 5);
        Posicion posicionFinal = new Posicion(4,5);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueMovIzquierda();
        Dibujo dibujo = new Dibujo();

        bloque.accion(personaje, dibujo);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }
}
