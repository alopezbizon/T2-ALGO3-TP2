package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueMovArribaTest {

    @Test
    public void testBloqueMovArriba_deberiaMoverElPersonajeUnaPosicionHaciaArriba() {
        Posicion posicionInicial = new Posicion(5, 5);
        Posicion posicionFinal = new Posicion(5,6);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueMovArriba();
        Dibujo dibujo = new Dibujo();

        bloque.accion(personaje, dibujo);

        assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
    }
}
