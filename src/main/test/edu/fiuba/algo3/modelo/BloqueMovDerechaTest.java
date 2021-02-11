package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueMovDerechaTest {

    @Test
    public void testBloqueMovDerecha_deberiaMoverElPersonajeUnaPosicionHaciaLaDerecha() {
        Posicion posicionInicial = new Posicion(5, 5);
        Posicion posicionFinal = new Posicion(6,5);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueMovDerecha();
        Dibujo dibujo = new Dibujo();

        bloque.accion(personaje, dibujo);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }
}
